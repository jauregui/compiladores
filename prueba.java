 import java.util.*;
public class prueba(){

}

private class Tipo{
	//indices del cubo semantico
 	public static final int ENT = 0;
 	public static final int REAL = 1;
 	public static final int CAR = 2;
 	public static final int SON = 3;
 	public static final int BUL = 4;

 	int tipoBase;
 	boolean esArreglo;

}




private class Operadores{
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

private class Asignacion extends Expresion{
	Variable izquierda;
	Expresion derecha;

	Asignacion(Variable i, Expresion d){
		izquierda = i;
		derecha = d;
	}
}

private abstract class Variable extends Expresion{
	//Tipo tipo;
	String nombre;

}

private class Instruccion{

}

private class BloqueInstrucciones extends Instruccion{
	Vector<Instruccion> instrucciones;
	//cada statement de la gramatica se va a agregar aqui
}

private class Local extends Variable{
	Local (String n);
}

private abstract class Expresion{
	Tipo tipo;
}

private abstract class Constante extends Expresion{	

}

private class ConstanteEntero extends Constante{	
	int valor;

	ConstanteEntero(int v){
		valor = v;
	}
}

private class ConstanteReal extends Constante{	
	double valor;
	ConstanteReal(int v){
		valor = v;
	}
}


private class ConstanteCaracter extends Constante{	
	char valor;
	ConstanteCaracter(int v){
		valor = v;
	}
}

private class ConstanteSonido extends Constante{	
	int valor;
	ConstanteSonido(int v){
		valor = v;
	}
}

private class ConstanteBuleano extends Constante{	
	boolean valor;
	ConstanteBuleano(int v){
		valor = v;
	}
}

private class Operacion extends Expresion{
	Expresion derecha;
	Expresion izquierda;
	int operacion;

	Operacion(Expresion d, Expresion i, int op){
		derecha = d;
		izquierda = i;
		operacion = op;
	}
}

