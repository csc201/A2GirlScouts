import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prompt for the number of girl scouts
		int size = Integer.parseInt(JOptionPane
				.showInputDialog("Enter the number of girl scouts"));
		int[] girlScout = new int[size];

		int i = 0;
		while (i < size) {
			//prompt for the number of cookie box sold for each girl scout
			girlScout[i] = Integer.parseInt(JOptionPane
					.showInputDialog("Enter the number of cookie boxes for girl scout #"
							+ i));
			i++;
		}

	}
}
