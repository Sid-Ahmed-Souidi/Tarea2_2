import javax.swing.*;

public class Arrays {

	int[] vector;

	public Arrays(int numero) {

		vector = new int[numero];

		for (int i = 0; i < numero; i++) {

			int valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce valor"));
			vector[i] = valor;
		}
	}

	public void getDatosArray() {

		System.out.println("Los valores de la matriz son: ");

		for (int j = 0; j < vector.length; j++) {

			System.out.print(vector[j] + "; ");
		}

	}
}
