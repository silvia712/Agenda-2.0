import java.util.Scanner;

public class añadir {

	public static void main(String[] args) {
		// añadir contacto y ver todos. 3x2. Opcion infinita???
		
		String mContactos[][];
		mContactos=new String[3][2];
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Introduce nombre y telefono");
		
			for (int i=0;i<mContactos.length;i++){
			for (int j=0;j<mContactos[i].length;j++) {
				mContactos[i][j]=leer.nextLine();
			}
		}
		//ver todos que no salgan vacios si se elimina
			for (int i=0;i<mContactos.length;i++) {
				for (int j=0;j<mContactos[i].length;j++) {
					System.out.print(mContactos[i][j] + " ");
				}System.out.println("");
			}
			
			
	}

}
