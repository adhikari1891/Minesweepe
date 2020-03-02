

	import java.awt.event.ActionListener;
	import javax.swing.*;
	


public class CalculatorView extends JFrame{
	private JTextField firstNumber= new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNUmber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	CalculatorView(){
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNUmber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
		
		}
	public int getFirstNumber() {
		return Integer.parseInt(firstNumber.getText());
		
	}
	public int getSecondNumber() {
		return Integer.parseInt(secondNUmber.getText());
		
	}
	public int getCalcSolution() {
		return Integer.parseInt(calcSolution.getText());
		
	}
	public void setCalcSolution(int Solution) {
		calcSolution.setText(Integer.toString(Solution));
		
	}
	
	
	void addCalculateListener(ActionListener listenForCalcButton) {
		calculateButton.addActionListener(listenForCalcButton);
	}
	
	void displayErrorMessage(String errorMessage ) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
	
	

}
