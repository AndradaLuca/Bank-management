package tema4bb;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Gui extends JFrame {

	private static final long serialVersionUID=1L;
	
	private JFrame frame = new JFrame("Bank");
	private JLabel label1 = new JLabel("CNP:");
	private JLabel label2 = new JLabel("Nume:");
	private JLabel label3 = new JLabel("Adresa:");
	private JLabel label4 = new JLabel("Telefon:");

	private JLabel label5 = new JLabel("IBAN:");
	private JLabel label6 = new JLabel("Money:");
	private JLabel label7 = new JLabel("Saving/Spending:");
	private JLabel label8 = new JLabel("Add/Whitdraw:");

	private JTextField textfield1 = new JTextField("");
	private JTextField textfield2 = new JTextField("");
	private JTextField textfield3 = new JTextField("");
	private JTextField textfield4 = new JTextField("");
	private JTextField textfield5 = new JTextField("");
	private JTextField textfield6 = new JTextField("");
	private JTextField textfield7 = new JTextField("");
	private JTextField textfield8 = new JTextField("");

	private JButton adauga = new JButton("Add Account");
	private JButton adaugap = new JButton("Add Person");
	private JButton sterge = new JButton("Delete");
	private JButton tabel = new JButton("Display");
	private JButton removea = new JButton("Remove Account");
	private JButton removep = new JButton("Remove Person");
	private JButton up = new JButton("Update Person");
	private JButton ua = new JButton("Update Account");
	private JButton am = new JButton("Add Money");
	private JButton wm = new JButton("Whitdraw Money");

	private Bank bank;
	private JTable table;
	private Serializable s;

	private String[] columnNames;

	public DefaultTableModel model;
	private static int i = 0;
	private int j = 0;

	public Gui() {
		bank = new Bank();
		bank=s.deserializare();
		addComponents();
		jFrameSetup();

	}

	private void jFrameSetup() {

		frame.setBounds(100, 100, 900, 700);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(null);

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

	public void addComponents() {

		label1.setBounds(45, 20, 100, 30);
		textfield1.setBounds(80, 20, 100, 30);
		frame.getContentPane().add(label1);
		frame.getContentPane().add(textfield1);

		label2.setBounds(40, 65, 100, 30);
		textfield2.setBounds(80, 65, 100, 30);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(textfield2);

		label3.setBounds(33, 110, 100, 30);
		textfield3.setBounds(80, 110, 100, 30);
		frame.getContentPane().add(label3);
		frame.getContentPane().add(textfield3);

		label4.setBounds(33, 155, 100, 30);
		textfield4.setBounds(80, 155, 100, 30);
		frame.getContentPane().add(label4);
		frame.getContentPane().add(textfield4);

		label5.setBounds(300, 25, 100, 30);
		textfield5.setBounds(350, 25, 100, 30);
		frame.getContentPane().add(label5);
		frame.getContentPane().add(textfield5);

		label6.setBounds(300, 70, 100, 30);
		textfield6.setBounds(350, 70, 100, 30);
		frame.getContentPane().add(label6);
		frame.getContentPane().add(textfield6);

		label7.setBounds(250, 120, 100, 30);
		textfield7.setBounds(350, 120, 100, 30);
		frame.getContentPane().add(label7);
		frame.getContentPane().add(textfield7);
		
		label8.setBounds(250, 170, 100, 30);
		textfield8.setBounds(350, 170, 100, 30);
		frame.getContentPane().add(label8);
		frame.getContentPane().add(textfield8);

		adauga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Account account = null;
				Person person = new Person(textfield1.getText(), textfield2.getText(), textfield3.getText(),
						textfield4.getText());
				Account account = null;
				if (textfield7.getText().equals("saving") || textfield7.getText().equals("Saving")) {
					account = new SavingAccount(textfield5.getText(), Double.parseDouble(textfield6.getText()));
				} else if (textfield7.getText().equals("Spending") || textfield7.getText().equals("spending")) {
					account = new SpendingAccount(textfield5.getText(), Double.parseDouble(textfield6.getText()));
				}

				// Person p=new Person("a","a","a","a");
				// Account a=new SavingAccount("Aa",123);
				bank.addAccount(account, person);

				i++;
				JOptionPane.showMessageDialog(null, "Adaugare reusita!");

			}
		});

		adauga.setBounds(550, 20, 150, 30);
		frame.getContentPane().add(adauga);

		adaugap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Account account = null;
				Person person = new Person(textfield1.getText(), textfield2.getText(), textfield3.getText(),
						textfield4.getText());

				bank.addPerson(person);

				JOptionPane.showMessageDialog(null, "Adaugare reusita!");

			}
		});

		adaugap.setBounds(720, 20, 150, 30);
		frame.getContentPane().add(adaugap);

		removea.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				// Account account = null;
				j = 1;
				HashMap<Person, HashSet<Account>> copy = new HashMap<Person, HashSet<Account>>();

				Person person = new Person(textfield1.getText(), textfield2.getText(), textfield3.getText(),
						textfield4.getText());
				Account account = null;

				if (textfield7.getText().equals("saving") || textfield7.getText().equals("Saving")) {
					account = new SavingAccount(textfield5.getText(), Double.parseDouble(textfield6.getText()));
				} else if (textfield7.getText().equals("Spending") || textfield7.getText().equals("spending")) {
					account = new SpendingAccount(textfield5.getText(), Double.parseDouble(textfield6.getText()));
				}

				bank.removeAccount(account, person);

				JOptionPane.showMessageDialog(null, "Stergere reusita!");

			}
		});

		removea.setBounds(550, 70, 150, 30);
		frame.getContentPane().add(removea);

		removep.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				// Account account = null;

				Person person = new Person(textfield1.getText(), textfield2.getText(), textfield3.getText(),
						textfield4.getText());
				bank.removePerson(person);

				JOptionPane.showMessageDialog(null, "Stergere reusita!");

			}
		});

		removep.setBounds(720, 70, 150, 30);
		frame.getContentPane().add(removep);

		ua.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				// Account account = null;

				Person person = new Person(textfield1.getText(), textfield2.getText(), textfield3.getText(),
						textfield4.getText());
				Account account = null;

				if (textfield7.getText().equals("saving") || textfield7.getText().equals("Saving")) {
					account = new SavingAccount(textfield5.getText(), Double.parseDouble(textfield6.getText()));
				} else if (textfield7.getText().equals("Spending") || textfield7.getText().equals("spending")) {
					account = new SpendingAccount(textfield5.getText(), Double.parseDouble(textfield6.getText()));
				}

				for (HashSet<Account> conturi : bank.getBank().values()) {
					for (Account cont : conturi)
						if (cont.getIban().equals(account.getIban())) {
							cont.setSuma(Double.parseDouble(textfield6.getText()));
						}
				}
				JOptionPane.showMessageDialog(null, "Modificare reusita!");

			}
		});

		ua.setBounds(550, 120, 150, 30);
		frame.getContentPane().add(ua);

		up.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				// Account account = null;

				Person person = new Person(textfield1.getText(), textfield2.getText(), textfield3.getText(),
						textfield4.getText());
				Account account = null;

				if (textfield7.getText().equals("saving") || textfield7.getText().equals("Saving")) {
					account = new SavingAccount(textfield5.getText(), Double.parseDouble(textfield6.getText()));
				} else if (textfield7.getText().equals("Spending") || textfield7.getText().equals("spending")) {
					account = new SpendingAccount(textfield5.getText(), Double.parseDouble(textfield6.getText()));
				}

				for (Entry<Person, HashSet<Account>> entry : bank.getBank().entrySet()) {
					if (entry.getKey().getCnp().equals(person.getCnp())) {

						entry.getKey().setNume(textfield2.getText());
						entry.getKey().setAdresa(textfield3.getText());
						entry.getKey().setTelefon(textfield4.getText());
					}
				}
				JOptionPane.showMessageDialog(null, "Modificare reusita!");

			}
		});

		up.setBounds(720, 120, 150, 30);
		frame.getContentPane().add(up);

		
		am.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				// Account account = null;

				Person person = new Person(textfield1.getText(), textfield2.getText(), textfield3.getText(),
						textfield4.getText());
				Account account = null;

				if (textfield7.getText().equals("saving") || textfield7.getText().equals("Saving")) {
					account = new SavingAccount(textfield5.getText(), Double.parseDouble(textfield6.getText()));
				} else if (textfield7.getText().equals("Spending") || textfield7.getText().equals("spending")) {
					account = new SpendingAccount(textfield5.getText(), Double.parseDouble(textfield6.getText()));
				}

				for (HashSet<Account> conturi : bank.getBank().values()) {
					for (Account cont : conturi)
						if (cont.getIban().equals(account.getIban())) {
							cont.addMoney(Double.parseDouble(textfield8.getText()));
						}
				}
				JOptionPane.showMessageDialog(null, "Adaugare reusita!");

			}
		});

		am.setBounds(720, 170, 150, 30);
		frame.getContentPane().add(am);
		
		wm.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				// Account account = null;

				Person person = new Person(textfield1.getText(), textfield2.getText(), textfield3.getText(),
						textfield4.getText());
				Account account = null;

				if (textfield7.getText().equals("saving") || textfield7.getText().equals("Saving")) {
					account = new SavingAccount(textfield5.getText(), Double.parseDouble(textfield6.getText()));
				} else if (textfield7.getText().equals("Spending") || textfield7.getText().equals("spending")) {
					account = new SpendingAccount(textfield5.getText(), Double.parseDouble(textfield6.getText()));
				}

				for (HashSet<Account> conturi : bank.getBank().values()) {
					for (Account cont : conturi)
						if (cont.getIban().equals(account.getIban())) {
							cont.removeMoney(Double.parseDouble(textfield8.getText()));
						}
				}
				JOptionPane.showMessageDialog(null, "Retragere reusita!");

			}
		});

		wm.setBounds(550, 170, 150, 30);
		frame.getContentPane().add(wm);
		
		tabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame f1 = new JFrame();
				model = new DefaultTableModel();
				model.addColumn("CNP");
				model.addColumn("Nume");
				model.addColumn("Adresa");
				model.addColumn("Telefon");
				model.addColumn("IBAN");
				model.addColumn("Suma");
				
				

				Map<Person, HashSet<Account>> map = bank.getBank();

				for (Person person : map.keySet()) {

					for (Account account : map.get(person)) {

						model.addRow(new Object[] { person.getCnp(), person.getNume(), person.getAdresa(),
								person.getTelefon(), account.getIban(), account.getSuma() });
					}
				}
				if (j == 1) {
					model.removeRow(table.getSelectedRow());
					j = 0;
				}
				table = new JTable(model);
				JScrollPane scroll1 = new JScrollPane(table);
				JPanel panel1 = new JPanel(new BorderLayout());
				panel1.add(scroll1, BorderLayout.CENTER);
				f1.add(panel1);
				f1.pack();
				f1.setVisible(true);

			}
		});
		tabel.setBounds(650, 225, 100, 30);
		frame.getContentPane().add(tabel);

		
		
	}

	
	
	public static void main(String arg[]) throws ClassNotFoundException, IOException {

		Gui interfata = new Gui();
		

	}
}
