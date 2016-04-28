package numero;

public class Real extends Numero
{
	private double numD;
	
	public Real(double n)
	{
		this.numD=n;
	}
	
	public void setNumD(double d)
	{
		this.numD=d;
	}
	
	public double getValorReal()
	{
		return numD;
	}
	
	public int aEntero()
	{
		return (int) numD;
	}

	@Override
	public double calcularDoble()
	{
		double resul=this.numD*2;
		
		return resul;
	}

	@Override
	public double calcularMitad()
	{
		double resul=this.numD/2;
		return resul;
	}

	@Override
	public String toString()
	{
		String s1=String.format("[ %d ]",getValorReal());
	    return s1;	
	}
}

