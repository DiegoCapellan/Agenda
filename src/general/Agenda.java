import java.util.*;

public class Agenda {

	private static int pintaMenu() {
		// TODO Auto-generated method stub
		Scanner leerOpc = new Scanner(System.in);
		boolean correcto = false;
		int opc=0;
		do {
			System.out.println("************* Menú Agenda ************");
			System.out.println("");
			System.out.println("1. Guardar Contacto ");
			System.out.println("2. Ver Contacto ");
			System.out.println("3. Buscar Contacto");
			System.out.println("4. Eliminar Contacto ");
			System.out.println("5. Editar Contacto ");
			System.out.println("6. Salir ");
			System.out.println("");
			System.out.println("**************************************");
			System.out.println("Elija una Opción de las Proporcionadas");
			opc = leerOpc.nextInt();
			
			if(opc<1||opc>6) {
				System.out.println("Opción no Permitida, Vuelva a Intentarlo)");
			}else {
				correcto = true;
			}
		
		} while (!correcto);
		
		return opc;
	}
	
	
	public static int buscarEspacioBlanco(String mDatos[][]) {
		int espacioBlanco = -1;
		
		for (int i=0; i < mDatos.length; i++) {
			if (mDatos[i][0] == null) {
				espacioBlanco = i;
				break;	
			}
		}
		return espacioBlanco;
	}
	
	public static void guardarContacto(String mDatos[][]) {
		Scanner leer = new Scanner(System.in);
		
		int espacioBlanco = buscarEspacioBlanco(mDatos);
		if (espacioBlanco == -1) {
			System.out.println("No Hay Espacio Disponible");
		}else {
			System.out.println("Dime el Nombre");
			mDatos[espacioBlanco][0] = leer.nextLine();
			
			System.out.println("Dime el Número de Teléfono");
			mDatos[espacioBlanco][1] = leer.nextLine();
		}
	}
	
	
	private static void verContacto(String mDatos[][]) {
		// TODO Auto-generated method stub
		for (int i=0; i < mDatos.length; i++) {
			if (mDatos[i][0]!=null) {
				System.out.println((i+1)+": "+mDatos[i][0]+" - "+mDatos[i][1]);
			}
		}
	}
	
	
	public static int buscarContacto(String mDatos[][]) {
		Scanner leerNombre = new Scanner(System.in);
		
		boolean buscado = false;
		String nombre = "";
		
		System.out.println("Dime el Nombre del Contacto Buscar");
		nombre = leerNombre.nextLine();
		
		for (int i = 0; i < mDatos.length; i++) {
			
			if ((mDatos[i][0] != null) && mDatos[i][0].equalsIgnoreCase(nombre)) {
				System.out.println("Ese Contaco tiene de Nombre " + mDatos[i][0] + " y su Telefono es " + mDatos[i][1]);
				buscado = true;
				return i;
			}
		}
		if (buscado=false) {
			System.out.println("Contacto no encontrado");
		}
		return -1;
	}
	
	
	public static void eliminarContacto(String mDatos[][]) {
		Scanner leerNombre = new Scanner(System.in);
		String nombre = "";
		
		System.out.println("Dime el Nombre del Contacto a Eliminar");
		nombre = leerNombre.nextLine();
		
		for (int i = 0; i < mDatos.length; i++) {
			if ((mDatos[i][0] != null) && mDatos[i][0].equalsIgnoreCase(nombre)) {
		}
			mDatos[i][0] = null;
			mDatos[i][1] = null;
				
			System.out.println("Ha sido Eliminado el Contacto Elegido");
	}
		}
	
	
	public static void editarContacto(String mDatos[][]) {
		Scanner leerEdicion = new Scanner(System.in);
		
		int posicion = buscarContacto(mDatos);
		
		System.out.println("El Nombre ha sido Editado");
		mDatos[posicion][0] = leerEdicion.nextLine();
		
		System.out.println("El Numero ha sido Editado");
		mDatos[posicion][1] = leerEdicion.nextLine();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mDatos[][] = new String [50][2];
		
		int opc = 0;
		
		do {
			opc=pintaMenu();
			switch (opc) {
			case 1:
				guardarContacto(mDatos);
				break;
			case 2:
				verContacto(mDatos);
				break;
			case 3:
				buscarContacto(mDatos);
				break;
			case 4:
				eliminarContacto(mDatos);
				break;
			case 5:
				editarContacto(mDatos);
				break;
			case 6:
				System.out.println("Agenda Cerrada");
				break;
			}
		} while (opc != 6);
	}
}
