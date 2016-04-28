package numero;
import java.util.ArrayList;

public class Entero extends Numero
{
	private int numero;
	
	public Entero()
	{
		this(0);
	}
	
	public Entero(int n)
	{
		this.numero=n;
	}
	
	//------------//
	
	public int getValorEntero()
	{
		return this.numero;
	}
	
	public double aReal()
	{
		return (double)this.numero;
	}
	
	public ArrayList<Entero> getNumerosPrimos()
	{
		ArrayList<Entero> primos=new ArrayList<Entero>();
		Entero aux;
		
		for(int i=0; i<this.numero; i++)
		{
			if(this.esPrimo(i))
			{
				aux=new Entero(i);
				primos.add(aux);
			}
		}
		
		return primos;
	}
	
	private boolean esPrimo(int n)
	{
		boolean swt=true;
		int cont=0;
		
		do
		{
			for(int i=2; i<n; i++)
			{
				if(n%i==0)
				{
					swt=false;
				}
			}
			
			cont++;
		}while(swt && cont<n);
		
		return swt;
	}
	
	@Override
	public double calcularDoble()
	{
		return this.numero*2;
	}

	@Override
	public double calcularMitad()
	{
		return this.numero/2;
	}

	@Override
	public String toString()
	{
		Integer aux=new Integer(this.numero);
		return aux.toString();
	}
}
