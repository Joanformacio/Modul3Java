package fase1;

import java.util.*;


public class Fase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;
		
		System.out.println("Introdueix una ciutat\n");
		
		ciutat1=sc.nextLine();
		
		System.out.println("Introdueix una ciutat");
		
		ciutat2=sc.nextLine();
		
		System.out.println("Introdueix una ciutat");
		
		ciutat3=sc.nextLine();
		
		System.out.println("Introdueix una ciutat");
		
		ciutat4=sc.nextLine();
		
		System.out.println("Introdueix una ciutat");
		
		ciutat5=sc.nextLine();
		
		System.out.println("Introdueix una ciutat");
		
		ciutat6=sc.nextLine();
		
		System.out.println("Les ciutats que has son: " + ciutat1 +" "+ ciutat2 +" "+ ciutat3 +" "+ ciutat4 +" "+ ciutat5 + " "+ ciutat6 );
		
		
		//FASE2
		String arrayCiutats[]= {ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6};
		
		ordenarLista(arrayCiutats,arrayCiutats.length);
		
		
		for (String ciutat:arrayCiutats) {
			System.out.println(ciutat);
		}
		
		
	}
	
	public static String[] ordenarLista(String ciutats[], int tamany) {
		String auxArray[]= new String[tamany];
		String auxCiutat;
		
		
		for (int i=0; i< ciutats.length;i++) {
			for (int j=0; j< ciutats.length;j++) {
				
				if (ciutats[i].compareTo(ciutats[j])<0) {
					 auxCiutat=ciutats[j];
					 ciutats[j]=ciutats[i];
					 ciutats[i]=auxCiutat; 
				}
			}
			
		}
		
		
		return auxArray;
	}

}
