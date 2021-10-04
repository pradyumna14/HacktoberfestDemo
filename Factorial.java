import java.util.Scanner;  

public class Factorial
{  
	public static int facto(int n){  
        	int fact = 1;  
        	int i = 1;  
  
  	      	while( i <= n ) {  
            		fact = fact * i;   
            		i++;  
		} 
	 	return fact; 
        }  
	public static void main(String[] args) {  
          
        	Scanner sc = new Scanner(System.in);   
        	System.out.println("Enter a number: ");  
		int num = sc.nextInt();  
        	System.out.println("Factorial : " + facto(num));  
    	}  
}  