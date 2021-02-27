package fase3;

public class Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ciutats[]= {"Barcelona", "Madrid", "Valencia", "Malaga", "Cadis", "Santander"};
		int asciiChar;
		String ciutatCanviada = null;
		Boolean cambiado=false;
		
		String arrayCiutatsModificades[]= new String[6];
		
		for (int j=0; j<ciutats.length; j++) {
			String ciutat=ciutats[j];
			for (int i=0; i<ciutat.length()-1; i++) {
				asciiChar=(int) ciutat.charAt(i);
				if (asciiChar==65 || asciiChar==97) {
					ciutatCanviada=ciutat.replace(ciutat.charAt(i), '4');
					
					cambiado=true;
				}
			}
			if (cambiado==true) {
				arrayCiutatsModificades[j]=ciutatCanviada;
			}else {
				arrayCiutatsModificades[j]= ciutat;
			}
			
			System.out.println(arrayCiutatsModificades[j]);
		}
		
	}

}
