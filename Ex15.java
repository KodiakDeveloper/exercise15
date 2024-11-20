package selectionStructures;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex15 {

	public static void main(String[] args) {

		float percentual = 10f;

		float quantity;

		float unitPrice = 300f;

		float actualPrice, discount;

		String productName;

		productName = JOptionPane.showInputDialog(null, "Input product name: ");

		productName = productName.toLowerCase().trim();

		if (productName.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Input valid data, try again!");
		}

		else {

			quantity = Float.parseFloat(JOptionPane.showInputDialog(null, "Input quantity: "));

			if (quantity <= 0) {
				JOptionPane.showMessageDialog(null, "Only positive values and greater than zero are available!");
			}

			else {

				percentual /= 100;

				actualPrice = unitPrice * quantity;

				discount = actualPrice - (actualPrice * percentual);

				DecimalFormat df = new DecimalFormat("$####.##");

				JOptionPane.showMessageDialog(null, "Product Name = " + productName + "\nPrice Without Discount = "
						+ df.format(actualPrice) + "\nPrice with Discount = " + df.format(discount));

			}

		}
	}

}
