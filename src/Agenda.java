import java.util.Scanner;

public class Agenda {
	
	public static void pintaMenu() {
		
		System.out.println("1 Añadir, 2 Buscar, 3 Editar, 4 Borrar, 5 Ver todos, 6 Salir");
	}
	
	public static void añadirContactos(String mContactos[][]) {
		
		Scanner leer=new Scanner(System.in);
		System.out.println("Introduce nombre y telefono");
		
		for (int i=0;i<mContactos.length;i++){
		for (int j=0;j<mContactos[i].length;j++) {
			mContactos[i][j]=leer.nextLine();
		}
	}
		
		
		
		
		
	}
			
	public static void verTodos(String mContactos[][]) {
		
		for (int i=0;i<mContactos.length;i++) {
			for (int j=0;j<mContactos[i].length;j++) {
				System.out.print(mContactos[i][j] + " ");
			}	System.out.println("");
		}
	}
			
	
			//metodo buscar y visualizar contacto
			//metodo editar
			//metodo borrar
			
	

	public static void main(String[] args) {
		
		int opcion;
		String menu;
		Scanner leer=new Scanner(System.in);
		
		String mContactos[][];
		mContactos=new String[3][2];
		
		
		System.out.println("AGENDA DE TELEFONOS (pulsa la opcion que desees)");
		System.out.println(" ");
		pintaMenu();
		opcion=leer.nextInt();
		
		
		switch (opcion) {
			case 1:
				System.out.println("1 - Añadir contacto");
				añadirContactos(mContactos); // como hacer para parar de introducir contactos y volver al menu
				break;
			case 2:
				System.out.println("2 - Buscar contacto");
				break;
			case 3:
				System.out.println("3 - Editar contacto");
				break;
			case 4:
				System.out.println("4 - Borrar contacto");
				break;
			case 5:
				System.out.println("5 - Ver todos");
				verTodos(mContactos);
				System.out.println("");
				pintaMenu();
				break;
			case 6:
				System.out.println("Hasta luego !");
				break;
				}
		
		
	
		
		
		
	}

}
