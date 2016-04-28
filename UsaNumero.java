package numero;
import java.util.Scanner;
import java.util.ArrayList;

public class UsaNumero
{
	public static void main(String[] args)
	{
		Scanner entradaDatos=new Scanner(System.in);
		ArrayList<Entero> primos;
		Entero auxEntero;
		Numero vector[]=new Numero[10];
		double vectorAux[]=new double[10];
		int posicion=0, max;
		
		System.out.println("Introduzca numeros:");
		
	    for (int i=1; i<=10; i++)
	    {
	    	if(i%2==0)
	    	{
	    		vector[i-1]=new Real(entradaDatos.nextDouble());
	    		entradaDatos.nextLine();
	    	}
	    	else
	    	{
	    		vector[i-1]=new Entero(entradaDatos.nextInt());
	    		entradaDatos.nextLine();
	    	}
	    }
	    
	    for (int i=1; i<=10; i++)
	    {
	    	if(i%2==0)
	    	{
	    		Real aux=(Real)vector[i-1];
	    		vectorAux[i-1]=aux.calcularDoble();
	    	}
	    	else
	    	{
	    		Entero aux=(Entero)vector[i-1];
	    		vectorAux[i-1]=aux.calcularMitad();
	    	}
	    }
	    
	    max=Integer.MIN_VALUE;
	    
	    for(int i=1; i<=10; i++)
	    {
	    	if(!(i%2==0))
	    	{
	    		Entero aux=(Entero)vector[i-1];
	    		
	    		if(max<aux.getValorEntero())
	    		{
	    			max=aux.getValorEntero();
	    			posicion=i-1;
	    		}
	    	}
	    }
	    
	    auxEntero=(Entero)vector[posicion];
	    primos=auxEntero.getNumerosPrimos();
	    max=0;
	    
	    for(int i=0; i<primos.size(); i++)
	    {
	    	max+=primos.get(i).getValorEntero();
	    }
	    
	    System.out.printf("La suma de los primos del mayor es: %d", max);
	}
}
