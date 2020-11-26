import java.util.Scanner;

public class Agenda {

	public static void inicializarMatriz(String mContactos[][]) {

		for (int i = 0; i < mContactos.length; i++) {
			mContactos[i][0] = "";
			mContactos[i][1] = "";
		}
	}
		
	public static int pintaMenu() {
		
		int opc;
		Scanner leer = new Scanner(System.in);

		do {
			System.out.println("    *** MENU ***");
			System.out.println(" ");
			System.out.println("1-Anadir   4-Borrar");
			System.out.println("2-Buscar   5-Ver todos");
			System.out.println("3-Editar   6-Salir");
					
			opc = leer.nextInt();

			if (opc <= 0 || opc > 6) {
				System.out.println("Error de opcion");
				System.out.println(" ");
			}
		} while (opc <= 0 || opc > 6);

		return opc;
	}

	public static void anadirContactos(String mContactos[][]) {

		Scanner leer = new Scanner(System.in);
	
		for (int i=0; i<mContactos.length; i++) {

			if (mContactos[i][0].equals("")) {
				System.out.println("Introduce nombre y telefono");
				mContactos[i][0] = leer.nextLine();
				mContactos[i][1] = leer.nextLine();
				System.out.println("Contacto anadido");
				System.out.println(" ");
				break;
			}
		}
	}

	public static int buscarContacto(String mContactos[][]) {
		//este metodo en realidad busca una posicion a mostrar
		// Si no lo encuentro devuelvo -1 sino la posicion donde esta
		//int pos = -1;

		String busqueda;
		Scanner leer = new Scanner(System.in);

		//System.out.println("Escribe el criterio de busqueda");
		busqueda = leer.nextLine();

		for (int i = 0; i < mContactos.length; i++) {
			if (mContactos[i][0].equalsIgnoreCase(busqueda) || mContactos[i][1].equalsIgnoreCase(busqueda)) {
				return i; //posicion donde coincide la busqueda
				}
			}
			// pos = i;
			// break;
			// return pos;
			return -1;//-1 pq esta fuera del rango de una matriz
		}
	
	public static void buscarOpcion(String mContactos[][]) {

		int pos = buscarContacto(mContactos);
		
		if (pos == -1) {
			System.out.println("No existe el contacto");
			System.out.println(" ");
		} else {
			System.out.println(mContactos[pos][1]);
		}
	}
	
	public static void editarContacto(String mContactos[][]) {

		String nuevoNombre, nuevoTelefono;
		Scanner leer = new Scanner(System.in);

		int pos = buscarContacto(mContactos);

		if (pos == -1) {
			System.out.println("No existe el contacto");
			System.out.println(" ");
		} else {
			System.out.println("Escribe el nuevo nombre y telefono");
			nuevoNombre = leer.nextLine();
			nuevoTelefono = leer.nextLine();
			mContactos[pos][0] = nuevoNombre;
			mContactos[pos][1] = nuevoTelefono;
			System.out.println("Cambios guardados");
			System.out.println(" ");
		}
	}
	
	public static void borrarContacto(String mContactos[][]) {

		int pos = buscarContacto(mContactos);

		if (pos == -1) {
			System.out.println("No existe el contacto");
			System.out.println(" ");
		} else {
			mContactos[pos][0] = "";
			mContactos[pos][1] = "";
			System.out.println("Contacto borrado");
			System.out.println(" ");
		}
	}
	
	public static void verTodos(String mContactos[][]) {

		for (int i = 0; i < mContactos.length; i++) {
			if (!mContactos[i][0].equalsIgnoreCase("")) {
				System.out.println(mContactos[i][0] + " - " + mContactos[i][1]);
			}
		}
	}

	public static void main(String[] args) {

		int opcion, posicion;

		String menu;
		Scanner leer = new Scanner(System.in);

		String mContactos[][];
		mContactos = new String[10][2];

		inicializarMatriz(mContactos);
		
		System.out.println(" ");
		System.out.println("AGENDA DE TELEFONOS (pulsa la opcion que desees)");
		System.out.println(" ");
		

		do {
			
			opcion = pintaMenu();

			switch (opcion) {
			case 1:
				System.out.println("1 - AÑADIR");
				anadirContactos(mContactos);
				break;
			case 2:
				System.out.println("2 - BUSCAR");
				System.out.println("Escribe el nombre del contacto a buscar");
				buscarOpcion(mContactos);
				break;
			case 3:
				System.out.println("3 - EDITAR");
				System.out.println("Escribe el nombre del contacto a editar");	
				editarContacto(mContactos);						
				break;
			case 4:
				System.out.println("4 - BORRAR");
				System.out.println("Escribe el nombre del contacto a borrar");			
				borrarContacto(mContactos);
				
				break;
			case 5:
				System.out.println("5 - VER TODOS");
				verTodos(mContactos);
				System.out.println(" ");
				break;
			case 6:
				System.out.println("Hasta luego!");
				break;
			}

		} while (opcion != 6);

	}

}
