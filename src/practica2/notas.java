package practica2;
import java.util.Scanner;

/**
 * Clase Notas para gestionar el ingreso y el cálculo de las notas de los estudiantes.
 * 
 * @author MonicaPaolaJaramilloDuran
 * @version 1.0
 * @since 01-04-2025
 */

public class notas {
	//declaramos las variables que nos hacen falta
	
	/** Nota de la Unidad Formativa 1 */
	double unidadFormativa1;
	
	/** Nota de la Unidad Formativa 2 */
	double unidadFormativa2;
	
	/** Nota de la Unidad Formativa 3 */
	double unidadFormativa3;
	
	/** Acumulado de la nota 1 */
	double acumuladoNota1;
	
	/** Acumulado de la nota 2 */
	double acumuladoNota2;
	
	/** Acumulado de la nota 3 */
	double acumuladoNota3;
	
	/** Nota definitiva */
	double notaDefinitiva;
	
	//utilizamos Scanner para poder introducir datos
	
	/** Objeto Scanner para la introducción de datos */
	Scanner entrada = new Scanner(System.in);
	
	//creamos un método para ingresar
	
	/**
     * Método para ingresar las notas del estudiante.
     * Solicita al usuario que introduzca las tres notas.
     */

	public void ingresaNotas() {
		//cuando ejeuctamos este método lo primero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		unidadFormativa1= entrada.nextDouble();

		System.out.print("ingrese nota 2: ");
		unidadFormativa2= entrada.nextDouble();
		
		System.out.print("ingrese nota 3: ");
		unidadFormativa3= entrada.nextDouble();
	}
	
	// método para comprobar la correcta introducción de notas
	
	/**
     * Método para comprobar la correcta introducción de las notas.
     * En caso de que alguna nota supere 10, muestra un mensaje de error.
     */
	
	public void comprobacion(){
		
		if (unidadFormativa1>10) {
			System.out.println(" nota1 mal introducida");
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (unidadFormativa2>10) {
			System.out.println(" nota2 mal introducida");
		}else {
			System.out.println(" nota2 correcta");
		}
		
		if (unidadFormativa3>10) {
			System.out.println(" nota3 mal introducida");
		}else {
			System.out.println(" nota3 correcta");
		}
	}
	
	// método para calcular nota
	
	/**
     * Método para calcular la nota definitiva con base en los acumulados.
     */
	
	public void calculoNotas() {
		acumuladoNota1 = unidadFormativa1 * 0.35;
		acumuladoNota2 = unidadFormativa2 * 0.35;
		acumuladoNota3 = unidadFormativa3 * 0.30;
		
		notaDefinitiva = acumuladoNota1 + acumuladoNota2 + acumuladoNota3;
		
		//hasta aquí la tenemos calculada pero no la mostramos
	}
	
	 /**
     * Método para mostrar las notas introducidas y los acumulados.
     */
	
	public void mostrar() {
		
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + unidadFormativa1);
		System.out.println(" nota2 = " + unidadFormativa2);
		System.out.println(" nota3 = " + unidadFormativa3);
		
		System.out.println(" acumuado 1 = "+ acumuladoNota1);
		System.out.println(" acumuado 2 = "+ acumuladoNota2);
		System.out.println(" acumuado 3 = "+ acumuladoNota3);
		
		System.out.println(" nota definitiva es = "+ notaDefinitiva);
	}
	
	/**
     * Método para determinar si el estudiante ha aprobado o suspendido.
     */

	public void aprobado() {
			
			if(notaDefinitiva<5 && notaDefinitiva>=0) {
				System.out.println("suspendio");
			}else if (notaDefinitiva>=5 && notaDefinitiva<=10 ) {
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
		// creamos mecanimos para llamar a cualquier método fuera de la clase
		
		notas fc= new notas();
		
		fc.ingresaNotas();
		fc.comprobacion();
		fc.calculoNotas();
		fc.mostrar();
		fc.aprobado();
	}
}