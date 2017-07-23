import javax.swing.JOptionPane;

public class PrimeNumbers {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("Give me a number");
	int num = Integer.parseInt(number);
	if (num == 2){
		JOptionPane.showMessageDialog(null, "Prime");
	}
	for(int i = num - 1; i > 1; i--){
		if(num % i == 0){
			JOptionPane.showMessageDialog(null, "Not prime");
			break;
		} if (i == 2){
			JOptionPane.showMessageDialog(null, "Prime");
		}
		}
}
}
