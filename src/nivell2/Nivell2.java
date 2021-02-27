package nivell2;

import java.util.Scanner;

public class Nivell2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int fibonacci;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("introduce un numero de secuencia de fibonacii ");
		
		do {
			n= sc.nextInt();
		}while(n<2);
		
		  
		fibonacci=calcularFibonacci(0, 1, n);
		//System.out.println(fibonacci);
	}
	
	public static int calcularFibonacci(int a, int b, int auxn)
	{
	   int c;
		if (auxn==0 ) {
			 return -1;
			 
		}else {
			c= a+b;
			a=b;
			b=c;
			System.out.print(c + " ");
			return calcularFibonacci(a, b, auxn-1); 
		}
		
		
	}

}
