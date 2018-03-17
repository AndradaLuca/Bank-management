package tema4bb;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class Bank implements BankProc {

	private static final long serialVersionUID=1L;
	
	private HashMap<Person, HashSet<Account>> bank;

	public Bank() {
		bank = new HashMap<Person, HashSet<Account>>();

	}

	@Override
	public void addPerson(Person person) {
		assert person != null;
		int size = bank.size();
		bank.put(person, new HashSet<Account>());
		assert bank.size() == (size + 1);

	}

	@Override
	public void removePerson(Person person) {
		assert person != null;
		int size = bank.size()-1;
		HashMap<Person, HashSet<Account>> copyBank = new HashMap<Person, HashSet<Account>>(bank);

		for (Entry<Person, HashSet<Account>> entry : this.getBank().entrySet()) {
			if (entry.getKey().getCnp().equals(person.getCnp())) {

				copyBank.remove(entry.getKey());
			}
		}

		bank.clear();
		bank.putAll(copyBank);
		assert bank.size() == size;

	}

	@Override
	public void addAccount(Account account, Person person) {
		assert person != null;
		assert account != null;
		int size = bank.size();
		for (Entry<Person, HashSet<Account>> entry : this.getBank().entrySet()) {
			if (entry.getKey().getCnp().equals(person.getCnp())) {
				entry.getValue().add(account);

			}
		}

		assert bank.size() == size;

	}

	@Override
	public void removeAccount(Account account, Person person) {
		assert person != null;
		assert account != null;
		int size = bank.size();

		HashSet<Account> list = new HashSet<Account>();
		for (Entry<Person, HashSet<Account>> entry : this.getBank().entrySet()) {
			if (entry.getKey().getCnp().equals(person.getCnp())) {
				entry.getValue().remove(account);
				
			
				}
			}
		

		
		assert bank.size() == size;

	}

	public HashMap<Person, HashSet<Account>> getBank() {
		return bank;
	}
	
	public int size()
	{
		return bank.size();
	}
	
	public boolean Psize(Account account)
	{
		for (Entry<Person, HashSet<Account>> entry : this.getBank().entrySet()) {
			if (entry.getValue().contains(account)) return true;
	}
		return false;}

}
