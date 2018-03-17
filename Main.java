package tema4bb;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final long serialVersionUID=1L;
		
		//Bank bank=new Bank();
		Serializable s= new Serializable();
		Bank bank=new Bank();
	//	bank=s.deserializare();
		Person p1= new Person("1","andrada","a","a");
		Person p2 = new Person("2","vica","v","v");
		Person p3 = new Person("3","Bobo","b","b");
		
		Account a1= new SavingAccount("1",1111);
		Account a2 = new SavingAccount("2",2222);
		Account a3 =new SpendingAccount("3",3333);
		Account a4 = new SpendingAccount("4",4444);
		
		
		bank.addPerson(p1);
		bank.addAccount(a1, p1);
		bank.addAccount(a3, p1);
		//bank.addPerson(p2);
	//	bank.addAccount(a2, p2);
		

		System.out.println(bank.getBank().entrySet()+"\n");
		
	//	bank.removeAccount(a1, p1);
		
		System.out.println(bank.getBank().entrySet()+"\n");
		
		bank.addAccount(a4, p1);
		//bank.addAccount(a2, p1);
		
		System.out.println(bank.getBank().entrySet()+"\n");
		
	//	bank.removePerson(p1);
		
		System.out.println(bank.getBank().entrySet()+"\n");
		
		
	//	s.serializare(bank);
		
		
		
		
		
	}
	
	

}
