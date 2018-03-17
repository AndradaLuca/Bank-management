package tema4bb;

import static org.junit.Assert.assertTrue;

public class Unit {
	
	Bank banca=new Bank();
	
	Person p1= new Person("1","andrada","a","a");
	Person p2 = new Person("2","vica","v","v");
	Person p3 = new Person("3","Bobo","b","b");
	
	Account a1= new SavingAccount("1",1111);
	Account a2 = new SavingAccount("2",2222);
	Account a3 =new SpendingAccount("3",3333);
	Account a4 = new SpendingAccount("4",4444);
	
	//add person
	@org.junit.Test
	public void t1() throws Exception {
		int size=banca.size();
	
		banca.addPerson(p1);
		
		
		assertTrue(size+1 == banca.size());
	
	}
	//remove person
	@org.junit.Test
	public void t2() throws Exception {
		banca.addPerson(p1);
		banca.addPerson(p2);
		int size=banca.size();
	
		banca.removePerson(p1);
		
		System.out.println(banca.size() +" "+ size);
		assertTrue(size-1 == banca.size());
	
	}
	//add account
	@org.junit.Test
	public void t3() throws Exception {
		banca.addPerson(p1);
		banca.addPerson(p2);
		int size=banca.size();
	
		banca.addAccount(a1, p1);
		
	
		assertTrue(banca.Psize(a1));
	
	}
	
	//reove account
	@org.junit.Test
	public void t4() throws Exception {
		banca.addPerson(p1);
		banca.addPerson(p2);
		int size=banca.size();
	
		banca.addAccount(a1, p1);
		banca.addAccount(a2, p1);
		
		banca.removeAccount(a1, p1);
	
		assertTrue(!banca.Psize(a1));
	}
	
	
}
