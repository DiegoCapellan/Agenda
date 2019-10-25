public class Agenda {
	//nuevo
	import java.lang.annotation.Repeatable;
	import java.util.Scanner;

	public static void guardarDatosContacto(int mContactos[][], int numContactos)  {
		
		Scanner leer = new Scanner(System.in);
		
		
		String nombre = "";
		String telefono = "";
		
		for (int i = 0; i < numContactos.length; i++) {
			
			System.out.println("Dime el Nombre del Contacto");
			nombre = leer.nextLine();
			nombre = mContactos[numContactos][1];
			
			System.out.println("Dime el Número de Telefono del Contacto");
			telefono = leer.nextLine();
			º
			
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int fila, opc, numContactos;
		int mContactos[][];
		opc = 0;
		
		System.out.println("Dime el Número de Contactos a Introducir");
		numContactos = leer.nextInt();
		
		mContactos = new int[numContactos][];
		
		while (opc != 5) {
			
			System.out.println("************* Menú Agenda ************");
			System.out.println("");
			System.out.println("1. Guardar Contactos ");
			System.out.println("2. Ver Contacto ");
			System.out.println("3. Eliminar Contacto ");
			System.out.println("4. Editar Contacto ");
			System.out.println("5. Salir ");
			System.out.println("");
			System.out.println("**************************************");
			System.out.println("Elija una Opción de las Proporcionadas");
			opc = leer.nextInt();
			
			switch (opc) {
			case 1:
				guardarDatosContacto(mContactos, numContactos);
				break;
			case 2:
				mostrarDatosContacto(mContactos, numContactos);
				break;
			case 3:
				borrarDatosContacto(mContactos, numContactos);
				break;
			case 4:
				editarDatosContacto(mContactos, numContactos);
				break;
			default:
				System.out.println("Agenda Cerrada");
			}	
		}
	}
}