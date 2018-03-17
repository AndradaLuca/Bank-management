package tema4bb;

import java.io.Serializable;


public abstract class Account implements Serializable {
	private static final long serialVersionUID=1L;
	private String iban;
	private double suma;
	
	
	public Account(String iban, double suma) {
		// TODO Auto-generated constructor stub
		this.iban=iban;
		this.suma=suma;
	}

	public void setIban(String iban)
	{
		this.iban=iban;
	}
	
	public String getIban()
	{
		return iban;
	}
	
	public void setSuma(double suma)
	{
		this.suma=suma;
	}
	
	public double getSuma()
	{
		return suma;
	}
	
	public abstract void addMoney(double money);
	public abstract void removeMoney(double money);
	
	 @Override
	    public boolean equals(Object object) {
	        if (this == object) return true;
	        if (object == null ) return false;
	       if( getClass() != object.getClass()) return false;

	        Account account = (Account) object;

	        if (iban != account.getIban()) return false;
	        return  iban.equals(account.getIban());

	    }

	    @Override
	    public int hashCode() {
	       return (getSuma()+getIban()).hashCode();
	    }
	    
	    public String toString()
	    {
	    	return "iban " + getIban()+ " suma " + getSuma();
	    }

}
