public class Matrices{
	
	public static void main(String args[]){
		MatrizInt m1 =new MatrizInt(CapturaEntrada.capturarEntero("\n Ingrese el numero de renglones de la matriz 1"), CapturaEntrada.capturarEntero("\n Ingrese el numero de columnas de la matriz 1"));
		
		MatrizInt m2 =new MatrizInt(CapturaEntrada.capturarEntero("\n Ingrese el numero de renglones de la matriz 2"), CapturaEntrada.capturarEntero("\n Ingrese el numero de renglones de la matriz 2"));
		
		MatrizInt m3;
		MatrizInt m4;
		MatrizInt m5;

		m1.iniciarMatInt();
		System.out.println("\n\n Matriz 1: ");
		m1.imprimirMatInt();
		
		m2.iniciarMatInt();

		System.out.println("\n\n Matriz 2: ");
		m2.imprimirMatInt();	

		m4 = OperacionesMatrices.transponerMatInt(m1);
		System.out.println("\n\n La transpuesta de la Matriz 1 es: ");
		m4.imprimirMatInt();	
		

		if (Validaciones.validarCuadratura(m1,m2)){
			m3 = new MatrizInt(m1.getRenglones(), m1.getColumnas());
			m3 = OperacionesMatrices.sumarMatInt(m1,m2);
			System.out.println("\n\n Matriz 3 = Matriz 1 + Matriz 2");
			m3.imprimirMatInt();

		}
		else System.out.println("\n\n No son cuadradas, no se puede realizar la suma");


		if (Validaciones.validarMultiplicabilidad(m1,m2)){
			m3 = new MatrizInt(m1.getRenglones(), m2.getColumnas());
			m3 = OperacionesMatrices.multiplicarMatInt(m1,m2);
			System.out.println("\n\n Matriz 3 = Matriz 1 * Matriz 2");
			m3.imprimirMatInt();
			m3.imprimirMatIntG();
		}
		else System.out.println("\n\n No son multiplicables");
	}

}