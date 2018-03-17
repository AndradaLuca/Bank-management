package tema4bb;



public class SavingAccount extends Account {

	private static final long serialVersionUID=1L;
	
	// The saving account allows a
	// single large sum deposit
	private static int oSinguraDepunere = 1;
	private double dobanda = 3;

	public SavingAccount(String iban, double suma) {
		// TODO Auto-generated constructor stub
		
			super(iban,suma);
	
	}
	

	@Override
	public void addMoney(double money) {
		// TODO Auto-generated method stub
		if (oSinguraDepunere == 1) {
			double suma = getSuma();
			setSuma(suma + money);
			oSinguraDepunere--;
		}

	}

	@Override
	public void removeMoney(double money) {
		// TODO Auto-generated method stub
		double suma = 0;
		double dobandaS;

		dobandaS = getSuma() * (3 / 100);
		suma = getSuma() + dobandaS - money;
		setSuma(suma);

	}

}
