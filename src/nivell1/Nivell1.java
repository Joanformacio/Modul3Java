package nivell1;

import java.util.*;


public class Nivell1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String notes[][]=new String [5][4];
		int count=0;
		Scanner sc= new Scanner(System.in);
		
		for (int i=0; i<notes.length; i++) {
			
			System.out.println("Introduce un alumno y despues sus notas: ");
			for(int j=0; j<notes[i].length;j++) {
				
				notes[i][j]=sc.nextLine();
			}
		}
		
		for (int i=0; i<notes.length; i++) {
				
			for(int j=0; j<notes[i].length;j++) {
				
				if (notes[i][j].length()==1) {
					count= count + Integer.parseInt( notes[i][j]);
				}
				
				
				System.out.print(notes[i][j] + " ");
				
			}
			if ((count/3>=5)) {
				System.out.println("L'alumne ha aprobat amb una nota de: " + (count/3));
			}else {
				System.out.println("L'alumne ha suspes amb una nota de: " + (count/3));
			}
			System.out.println("");
			System.out.println("/////////////////////////////////////////////////");
			count=0;
		}
	}

}
