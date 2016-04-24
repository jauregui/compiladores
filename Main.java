 import java.util.*;
 import java.lang.Math.*;

 class Main{
	public static void main(String[] args){
		// x  y int
		// x = x + (y * 5) 

		for(int i = 0; i<5; i++){
			for(int j=0; j<5; j++){

				//define el cubo
				Cubo.definirCubo(i, j, Math.min(i,j));
			}	
		}


		Local x = new Local("x", 0, new Tipo(Tipo.ENT, false));
		Local y = new Local("y", 1, new Tipo(Tipo.REAL, false));
		Expresion ex = new Asignacion(x, 
			new Operacion(Operadores.suma, x, 
				new Operacion(Operadores.multiplicacion, y, 
					new ConstanteEntero(5))));


		ex.compilar(new Binario());
	}

}
//cubosemantico
class Cubo{

	static int [][] cubo = new int[5][5];

	static void definirCubo(int izq, int der, int resultado){
		cubo[izq][der] = cubo[der][izq] = resultado;
	}

}

class Tipo{
	//indices del cubo semantico
 	public static final int REAL = 0;
 	public static final int ENT = 1;
 	public static final int SON = 2;
 	public static final int CAR = 3;
 	public static final int BUL = 4;

 	int codigo;
 	boolean esArreglo;

 	Tipo(int cod, boolean esArray){
 		codigo = cod;
 		esArreglo = esArray;
 	}
}




 class Operadores{
	//indices del cubo semantico
 	public static final int suma = 0;
 	public static final int resta = 1;
 	public static final int multiplicacion = 2;
 	public static final int division = 3;
 	public static final int modulo = 4;
 	public static final int y = 5;
 	public static final int o = 6;
 	public static final int igual = 7;
 	public static final int igualigual = 8;
 	public static final int mayorigual = 9;
 	public static final int menorigual = 10;
 	public static final int menor = 11;
 	public static final int mayor = 12;
}

 class Asignacion extends Expresion{
	Variable izquierda;
	Expresion derecha;

	Asignacion(Variable i, Expresion d){
		izquierda = i;
		derecha = d;
		if(izquierda.tipo.codigo != derecha.tipo.codigo){
			System.out.println("Truena papu.");
		}


	}
	public int compilar(Binario salida){ 
		derecha.compilar(salida);
		System.out.println("pushlocal " + izquierda.numero);
		return 5;
	}
}

 abstract class Variable extends Expresion{
	//Tipo tipo;
	String nombre;
	int numero;

}

 class Instruccion{

}

 class BloqueInstrucciones extends Instruccion{
	Vector<Instruccion> instrucciones;
	//cada statement de la gramatica se va a agregar aqui
}

 class Local extends Variable{
	Local (String n, int num, Tipo t) {

		nombre = n;
		numero = num;
		tipo = t;


	}
	public int compilar(Binario salida){ 
		System.out.println("pushlocal"+numero);
		return 0; }
}

class Binario{

}

 abstract class Expresion{
	Tipo tipo;
	public abstract int compilar(Binario salida);
}

 abstract class Constante extends Expresion{	

}

 class ConstanteEntero extends Constante{	
	int valor;

	ConstanteEntero(int v){
		valor = v;
		tipo = new Tipo(Tipo.ENT, false);
	}
	public int compilar(Binario salida){ 
		System.out.println("pushcent" + valor);
		return 0; 
	}
}

 class ConstanteReal extends Constante{	
	double valor;
	ConstanteReal(double v){
		valor = v;
	}
	public int compilar(Binario salida){ return 0; }
}


 class ConstanteCaracter extends Constante{	
	char valor;
	ConstanteCaracter(char v){
		valor = v;
	}
	public int compilar(Binario salida){ return 0; }
}

 class ConstanteSonido extends Constante{	
	int valor;
	ConstanteSonido(int v){
		valor = v;
	}
	public int compilar(Binario salida){ return 0; }
}

 class ConstanteBuleano extends Constante{	
	boolean valor;
	ConstanteBuleano(boolean v){
		valor = v;
	}
	public int compilar(Binario salida){return 0;}
}
 
 class Operacion extends Expresion{
	Expresion derecha;
	Expresion izquierda;
	int operacion;

	Operacion(int op, Expresion i, Expresion d){
		derecha = d;
		izquierda = i;
		operacion = op;

		tipo = new Tipo (Cubo.cubo[d.tipo.codigo][i.tipo.codigo], false);
	}

	public int compilar(Binario salida){ 
		izquierda.compilar(salida);
		if(izquierda.tipo.codigo != tipo.codigo){
			System.out.println("cast." + izquierda.tipo.codigo + "." + tipo.codigo);
		}

		derecha.compilar(salida);
		if(derecha.tipo.codigo != tipo.codigo){
			System.out.println("cast" + derecha.tipo.codigo +  "." + tipo.codigo);
		}

		//  	public static final int suma = 0;
	 	// public static final int resta = 1;
	 	// public static final int multiplicacion = 2;
	 	// public static final int division = 3;
	 	// public static final int modulo = 4;
	 	// public static final int y = 5;
	 	// public static final int o = 6;
	 	// public static final int igual = 7;
	 	// public static final int igualigual = 8;
	 	// public static final int mayorigual = 9;
	 	// public static final int menorigual = 10;
	 	// public static final int menor = 11;
	 	// public static final int mayor = 12;

		System.out.println("op." + operacion + "." + tipo.codigo);

		return 0; 
	}


}

public class MyVisitor extends JMLBaseVisitor<JMLNode> {


@Override public JMLNode visitExp(JMLParser.ExpContext ctx)  {
    if ( ctx.lexp().size() == 2) {
        JMLLexp lhs = (JMLLexp) ctx.lexp(0).accept(this);
        JMLLexp rhs = (JMLLexp) ctx.lexp(1).accept(this);
        String op = ctx.op.getText();
        return new JMLExp(lhs,rhs,op);
    } else {
        visitLexp(ctx.lexp(0));
    }


}

@Override public JMLNode visitLexp(JMLParser.LexpContext ctx) {
    if ( ctx.term().size() == 2) {
        JMLTerm lhs = (JMLTerm) ctx.term(0).accept(this);
        JMLTerm rhs = (JMLTerm) ctx.term(1).accept(this);
        String op = ctx.op.getText();
        return new JMLLexp(lhs,rhs,op);
    } else {
        visitTerm(ctx.term(0));
    }


}

@Override public JMLNode visitTerm(JMLParser.TermContext ctx) {
    if (ctx.factor().size() == 2) {
        JMLFactor lhs = (JMLFactor) ctx.factor(0).accept(this);
        JMLFactor rhs = (JMLFactor) ctx.factor(1).accept(this);
        String op = ctx.op.getText();
        return new JMLTerm(lhs,rhs,op);
    } else {
        visitFactor(ctx.factor(0));
    }



}

@Override public JMLNode visitFactor(JMLParser.FactorContext ctx) {
        String fc = ctx.getText();
        return new JMLFactor(fc);
}

