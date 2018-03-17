package tema4bb;



public class SpendingAccount extends Account{

	private static final long serialVersionUID=1L;
	
	public SpendingAccount(String iban, double suma) {
		super(iban, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addMoney(double money) {
		// TODO Auto-generated method stub
		
		double suma=getSuma();
		setSuma(suma+money);
		
	}

	@Override
	public void removeMoney(double money) {
		// TODO Auto-generated method stub
		
		double suma=getSuma();
		setSuma(suma-money);
		
	}

}
