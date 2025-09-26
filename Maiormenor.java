/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Maiormenor
{
	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner(System.in);
	    int num1,num2,num3,maior=0,menor=0;
	    double media=0;
	    
	   
		System.out.println("Escreva o 1º numero");
		num1=leia.nextInt();
		System.out.println("Escreva o 2º numero");
		num2=leia.nextInt();
		System.out.println("Escreva o 3º numero");
		num3=leia.nextInt();
		
		if(num1>num2 && num1>num3){
		    maior=num1;}
		else if(num2>num1&&num2>num3){
		    maior=num2;}
		else if(num3>num1&&num3>num2){
		    maior=num2;}
		if(num1<num2&&num1<num3){
		    menor=num1;}
		else if(num2<num1&&num2<num3){
		    menor=num2;} 
		else if(num3<num1&&num3<num2){
		    menor=num3;} 
		    
	    media=(num1+num2+num3)/3;
		    
		System.out.println("O maior numero é: "+maior+"\nO menor é: "+menor+
		"\nA média dos numeros é: "+media);
		
	}
}



//1. Escreva um algoritmo que leia 3 números a partir do teclado.
//O algoritmo deve apresentar:
//a. O maior número.
//b. O menor número.
//c. A média aritmética dos três números.