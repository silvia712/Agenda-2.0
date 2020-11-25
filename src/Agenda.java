import java.util.Scanner;

public class Agenda {

	public static int pintaMenu() {
		int opc;
		Scanner leer = new Scanner(System.in);

		do {
			System.out.println("1 Añadir, 2 Buscar, 3 Editar, 4 Borrar, 5 Ver todos, 6 Salir");
			opc = leer.nextInt();

			if (opc <= 0 || opc > 6) {
				System.out.println("Error de opcion");
			}
		} while (opc <= 0 || opc > 6);

		return opc;
	}

	public static void añadirContactos(String mContactos[][]) {

		Scanner leer = new Scanner(System.in);

		for (int i = 0; i < mContactos.length; i++) {

			if (mContactos[i][0].equals("")) {
				System.out.println("Introduce nombre");
				mContactos[i][0] = leer.nextLine();
				System.out.println("Introduce telefono");
				mContactos[i][1] = leer.nextLine();
				System.out.println("Contacto añadido");
				break;
			}
		}

	}

	public static void inicializarMatriz(String mContactos[][]) {

		for (int i = 0; i < mContactos.length; i++) {
			mContactos[i][0] = "";
			mContactos[i][1] = "";
		}
	}

	public static void verTodos(String mContactos[][]) {

		for (int i = 0; i < mContactos.length; i++) {
			if (!mContactos[i][0].equalsIgnoreCase("")) {
				System.out.println(mContactos[i][0] + " - " + mContactos[i][1]);
			}
		}
	}

	public static void buscarOpcion(String mContactos[][]) {

		int pos = buscarContacto(mContactos);
		// posicion = buscarContacto(mContactos);
		if (pos == -1) {
			System.out.println("No existe el contacto");
		} else {
			System.out.println(mContactos[pos][1]);
		}
	}

	public static void borrarContacto(String mContactos[][]) {

		// System.out.prinln("Escribe el contacto a borrar");
		int pos = buscarContacto(mContactos);

		if (pos == -1) {
			System.out.println("No existe el contacto");
		} else {
			mContactos[pos][0] = "";
			mContactos[pos][1] = "";
		}
	}

	public static void editarContacto(String mContactos[][]) {

		String nuevoNombre, nuevoTelefono;
		Scanner leer = new Scanner(System.in);

		int pos = buscarContacto(mContactos);

		if (pos == -1) {
			System.out.println("No existe el contacto");

		} else {
			//System.out.println("Escribe el nuevo nombre y telefono");
			nuevoNombre = leer.nextLine();
			nuevoTelefono = leer.nextLine();
			mContactos[pos][0] = nuevoNombre;
			mContactos[pos][1] = nuevoTelefono;
		}
	}

	// Si no lo encuentro devuelvo -1 sino la posicion donde esta
	public static int buscarContacto(String mContactos[][]) {
		// int pos = -1;

		String busqueda;
		Scanner leer = new Scanner(System.in);

		//System.out.println("Escribe el criterio de busqueda");
		busqueda = leer.nextLine();

		for (int i = 0; i < mContactos.length; i++) {
			// for (int j=0;j<mContactos[j].length;j++){
			if (mContactos[i][0].equalsIgnoreCase(busqueda) || mContactos[i][1].equalsIgnoreCase(busqueda)) {
				// if (mContactos[i][j]).equalsIgnoreCase(busqueda){
				return i;
			}
		}
		// pos = i;
		// break;
		// return pos;
		return -1;

	}

	public static void main(String[] args) {

		int opcion, posicion;

		String menu;
		Scanner leer = new Scanner(System.in);

		String mContactos[][];
		mContactos = new String[10][2];

		inicializarMatriz(mContactos);
		
		System.out.println("AGENDA DE TELEFONOS (pulsa la opcion que desees)");

		do {
			
			opcion = pintaMenu();

			switch (opcion) {
			case 1:
				System.out.println("1 - Añadir contacto ");
				añadirContactos(mContactos);
				break;
			case 2:
				System.out.println("2 - Buscar contacto: Escribe el nombre a buscar ");
				buscarOpcion(mContactos);
				break;
			case 3:
				System.out.println("3 - Editar contacto: Escribe el nuevo nombre y telefono ");
				editarContacto(mContactos);
				break;
			case 4:
				System.out.println("4 - Borrar contacto: escribe el contacto a borrar");
				borrarContacto(mContactos);
				System.out.println("Contacto borrado");
				break;
			case 5:
				System.out.println("5 - Ver todos");
				verTodos(mContactos);
				break;
			case 6:
				System.out.println("Hasta luego !");
				break;
			}

		} while (opcion != 6);

	}

}
