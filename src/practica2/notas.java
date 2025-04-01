package practica2;
import java.util.Scanner;

/**
 * Clase Notas para gestionar el ingreso y el cálculo de las notas de los estudiantes.
 * 
 * @author MonicaJaramillo
 * @version 1.0
 * @since 01-04-2025
 */

public class notas {
	//declaramos la variables que nos hacen falta
	
	/** Nota de la Unidad Formativa 1 */
	double uf1;
	
	/** Nota de la Unidad Formativa 2 */
	double uf2;
	
	/** Nota de la Unidad Formativa 3 */
	double uf3;
	
	/** Acumulado de la nota 1 */
	double acu1;
	
	/** Acumulado de la nota 2 */
	double acu2;
	
	/** Acumulado de la nota 3 */
	double acu3;
	
	/** Nota definitiva */
	double def;
	
	//utilizamos Scanner para poder introducir datos
	
	/** Objeto Scanner para la introducción de datos */
	Scanner entrada = new Scanner(System.in);
	
	//vamos a crear un metodo para ingresar
	
	/**
     * Método para ingresar las notas del estudiante.
     * Solicita al usuario que introduzca las tres notas.
     */

	public void ingresaNotas() {
		//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		uf1= entrada.nextDouble();

		System.out.print("ingrese nota 2: ");
		uf2= entrada.nextDouble();
		
		System.out.print("ingrese nota 3: ");
		uf3= entrada.nextDouble();
	}
	
	// metodo para comprobar bien introduccion de notas
	
	/**
     * Método para comprobar la correcta introducción de las notas.
     * En caso de que alguna nota supere 10, muestra un mensaje de error.
     */
	
	public void comprobacion(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
		}else {
			System.out.println(" nota2 correcta");
		}
		
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
		}else {
			System.out.println(" nota3 correcta");
		}
	}
	
	// metodo para calcular nota
	
	/**
     * Método para calcular la nota definitiva con base en los acumulados.
     */
	
	public void calculoNotas() {
		acu1 = uf1 * 0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
		//hasta aquí la tenemos calculada pero no la mostramos
	}
	
	 /**
     * Método para mostrar las notas introducidas y los acumulados.
     */
	
	public void mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
	}
	
	/**
     * Método para determinar si el estudiante ha aprobado o suspendido.
     */

	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
			}else {
					System.out.println(" error en la notas");
			}
		}
		
	/**
     * Método principal para la ejecución de la aplicación.
     * 
     * @see #ingresaNotas()
     * @see #comprobacion()
     * @see #calculoNotas()
     * @see #mostrar()
     * @see #aprobado()
     */
	
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuera de la clase
		
		notas fc= new notas();
		
		fc.ingresaNotas();
		fc.comprobacion();
		fc.calculoNotas();
		fc.mostrar();
		fc.aprobado();
	}
}