import java.util.Scanner;

public class Agenda {
	
	
	
	public static int pintaMenu() {
		int opc;
		Scanner leer=new Scanner(System.in);
		
		do {
			System.out.println("1 Añadir, 2 Buscar, 3 Editar, 4 Borrar, 5 Ver todos, 6 Salir");
		opc=leer.nextInt();
		
		if (opc<=0 || opc>6) {
			System.out.println("Error de opcion");
			}
		}while (opc<=0 || opc>6);
		
		return opc;
	}
	
	public static void añadirContactos(String mContactos[][]) {
		
		Scanner leer=new Scanner(System.in);
		
		
		for (int i=0;i<mContactos.length;i++){
		
			if (mContactos[i][0].equals("")){
				System.out.println("Introduce nombre");
				mContactos[i][0]=leer.nextLine();
				System.out.println("Introduce telefono");
				mContactos[i][1]=leer.nextLine();
				System.out.println("Contacto añadido");
				break;
			}
		}
		
		
	}
		
	public static void inicializarMatriz (String mContactos[][]) {
		
		for(int i=0;i<mContactos.length;i++) {
			mContactos[i][0]="";
			mContactos[i][1]="";
		}

	}
			
	public static void verTodos(String mContactos[][]) {
		
		for (int i=0;i<mContactos.length;i++) {
			for (int j=0;j<mContactos[i].length;j++) {
				System.out.print(mContactos[i][j] + " ");
			}	System.out.println("");
		}
	}
			
	public static String buscarContacto(String mContactos[], String nombre,String vNombres[]) {
		
		String aux;
	
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escribe el nombre del contacto a buscar");
		nombre=leer.nextLine();
		
		for (int i=0;i<mContactos.length;i++) {
			aux=vNombres[i];
			for (int j=0;j<aux.length();j++) {
				if (nombre.equalsIgnoreCase(aux)) {
					
					
				}
				
			}
			
			
		}
	
		
		return buscarContacto;
	}
			
	
	
	
			//metodo editar
			//metodo borrar
			
	

	public static void main(String[] args) {
		
		int opcion;
		
		String menu,aux,vNombres;
		Scanner leer=new Scanner(System.in);
		
		String mContactos[][];
		mContactos=new String[10][2];
		
		inicializarMatriz(mContactos);
		
		do {
			System.out.println("AGENDA DE TELEFONOS (pulsa la opcion que desees)");
			System.out.println(" ");
			
			opcion=pintaMenu();
			
			
			switch (opcion) {
				case 1:
					System.out.println("1 - Añadir contacto");
					añadirContactos(mContactos); 
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
			
		}while( opcion!=6);
	
		
	}

}
