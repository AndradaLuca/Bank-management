package tema4bb;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable{
	private static final long serialVersionUID=1L;
	
	
	private String cnp;
	private String nume;
	private String adresa;
	private String telefon;

	public Person(String cnp, String nume, String adresa, String telefon) {
		this.cnp = cnp;
		this.nume = nume;
		this.adresa = adresa;
		this.telefon = telefon;

	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;

	}

	public String getCnp()

	{
		return cnp;
	}
	
	public void setNume(String nume)
	{
		this.nume=nume;
	}
	
	public String getNume()
	{
		return nume;
	}
	
	public void setAdresa(String adresa)
	{
		this.adresa=adresa;
	}
	
	public String getAdresa()
	{
		return adresa;
	}
	
	public void setTelefon(String telefon)
	{
		this.telefon=telefon;
	}
	
	public String getTelefon()
	{
		return telefon;
	}
	
	public String toString()
	{
		return "Persoana " + getNume() + " CNP " + getCnp() + " adresa " + getAdresa() + " telefon " + getTelefon();
	}
	
	
	
	@Override
	public int hashCode() {
		 return (getNume()+getCnp()+getAdresa()+getTelefon()).hashCode();
	}
	
	@Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null ) return false;
       if(getClass() != object.getClass()) return false;

        Person person=(Person)object;

        if (person.getCnp() !=cnp) return false;
        return cnp.equals(person.getCnp());

    }
	
	
}
