package fase4;

public class Fase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ciutat1 ="barcelona";
		String ciutat2 ="Madrid";
		String ciutat3 ="Valencia";
		String ciutat4 ="Malaga";
		String ciutat5 ="Cadis";
		String ciutat6 ="Santander";
		
		
		
		char auxCiutat1[]= new char [ciutat1.length()];
		char auxCiutat2[]= new char [ciutat2.length()];
		char auxCiutat3[]= new char [ciutat3.length()];
		char auxCiutat4[]= new char [ciutat4.length()];
		char auxCiutat5[]= new char [ciutat5.length()];
		char auxCiutat6[]= new char [ciutat6.length()];
		
		addArryCiudat(ciutat1, auxCiutat1);
		addArryCiudat(ciutat2, auxCiutat2);
		addArryCiudat(ciutat3, auxCiutat3);
		addArryCiudat(ciutat3, auxCiutat3);
		addArryCiudat(ciutat4, auxCiutat4);
		addArryCiudat(ciutat5, auxCiutat5);
		addArryCiudat(ciutat6, auxCiutat6);
		
		imprimir (auxCiutat1);
		imprimir (auxCiutat2);
		imprimir (auxCiutat3);
		imprimir (auxCiutat4);
		imprimir (auxCiutat5);
		imprimir (auxCiutat6);
		
		
	}

	
	public static void addArryCiudat(String ciutat, char arryCiutat[]) {
		int count=0;
		for (int i=ciutat.length()-1; i!=-1;i--) {
			if (i==0) {
				count=ciutat.length()-1;
			}
			arryCiutat[count]=ciutat.charAt(i);
			count++;
		}
	}
	
	public static void imprimir(char arryCiutat[]) {
		for (int i=0; i<arryCiutat.length; i++) {
			
			System.out.print(arryCiutat[i]);
		}
		System.out.println();
	}
}


