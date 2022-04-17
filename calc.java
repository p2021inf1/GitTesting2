package tddpractica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calc {

	public void messageInit() throws IOException { 
		System.out.println("Això és una calculadora");
	}
	
	public int sumaNombres(int a, int b) {
		int c=0;
		c=a+b;
		return c;
	}
	
	public void Resultat(int k) {
		System.out.println("El resultat és: " +  k);
	}
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));  
		
		calc calc2 = new calc();
		
		calc2.messageInit();
		
		try {
			System.out.println("Introdueix un nombre enter");
			int m=Integer.parseInt(obj.readLine());
			System.out.println("Introdueix un altre nombre enter");
			int n=Integer.parseInt(obj.readLine());
			
			int s = calc2.sumaNombres(m, n);
			
			calc2.Resultat(s);
			
		} catch (Exception e) {
			System.out.println("No has introduït cap nombre...adéu");
			
		}
		
		
	}
}
