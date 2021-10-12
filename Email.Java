package emailapp;


import javax.swing.JOptionPane;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("John","Smith");
		
		JOptionPane.showInputDialog(null, "First Java Dialog Box!");
		
		
		em1.setAlternateEmail("js@gmail.com");
		System.out.println(" Your Alternate Email is: " + em1.getAlternateEmail());
		em1.showInfo();
		System.out.println(em1.showInfo());
	}

}
