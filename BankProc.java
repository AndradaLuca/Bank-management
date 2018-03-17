package tema4bb;

import java.io.Serializable;

public interface BankProc extends Serializable{
	
	  /**
     * Creates a person
    
     * @param person : the person who owns the account
     * @pre person != NULL 
     * @post bank size different
     */
	
	public void addPerson(Person p);
	
	
	  /**
     * Creates a person
    
     * @param person : the person who owns the account
     * @pre person != NULL 
     * @post bank size different
     */
	
	public void removePerson(Person person);
	
	   /**
     * Creates an account to the Bank, with given parameters.
     * @param account : the new acccount created will be added to the Bank
     * @param person : the person who owns the account
     * @pre person != NULL && account != NULL
     * @post bank size
     */

	
	public void addAccount(Account account,Person person);
	   /**
     * Remove an account.
     * @param account : the new acccount created will be added to the Bank
     * @param person : the person who owns the account
     * @pre person != NULL && account != NULL
     * @post inserted account can be retrieved from hash and it's details are correct.
     */

	
	public void removeAccount(Account account,Person person);

}
