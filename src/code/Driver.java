package code;

import javax.swing.*;

public class Driver implements Runnable{

	private JFrame _window;
	private JPanel _main;
	
	
	public Driver() {
		
	}
	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Driver());
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		_window = new JFrame("Project repertory");
		_main = new JPanel();
		_window.getContentPane().add(_main);
	}
	
}
