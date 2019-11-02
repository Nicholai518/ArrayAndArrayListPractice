package tryingOut;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArrayArrayListsGenericLists {

	public static void main(String[] args) {

		// Variables
		int[] intArray = new int[5];
		double[] doubleArray = new double[5];
		String[] stringArray = new String[5];

		// Goal: Make 3 ArrayLists. Integer, Double and String
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

		ArrayList<Double> doubleArrayList = new ArrayList<Double>();

		ArrayList<String> stringArrayList = new ArrayList<String>();

		// Greeting
		JOptionPane.showMessageDialog(null, "Lets give some array's elements");

		// Get int values
		intArray = returningIntValues();

		// Display int values in array
		JOptionPane.showMessageDialog(null, Arrays.toString(intArray));

		// get double values
		doubleArray = returningDoubleValues();

		// Display double values in array
		JOptionPane.showMessageDialog(null, Arrays.toString(doubleArray));

		// Get string values
		stringArray = returningStringValues();

		// Display string values in array
		JOptionPane.showMessageDialog(null, stringArray);

		// get Integer values
		integerArrayList = returningIntegerValues();

		// Display integer values
		JOptionPane.showMessageDialog(null, integerArrayList);

		// get Double values
		doubleArrayList = returningDoubleArrayListValues();

		// Display double values
		JOptionPane.showMessageDialog(null, doubleArrayList);

		// get String values
		stringArrayList = returningStringArrayListValues();

		// Display String values
		JOptionPane.showMessageDialog(null, stringArrayList);

	} // End of Main Method

	/**
	 * A Method that returns int[] array with 5 elements
	 * 
	 * @return an int array containing 5 elements
	 */
	public static int[] returningIntValues() {
		int[] intElements = new int[5];

		for (int i = 0; i < 5; i++) {
			intElements[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter int value " + (i + 1)));
		}

		// Return int array
		return intElements;

	} // End of returningIntValues Method

	/**
	 * A method that returns a double array with 5 elements
	 * 
	 * @return a double array containing 5 elements
	 */

	public static double[] returningDoubleValues() {
		double[] doubleElements = new double[5];

		for (int i = 0; i < 5; i++) {
			doubleElements[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter double value " + (i + 1)));
		}

		// Return double array
		return doubleElements;

	} // end of returningDoubleValues method

	/**
	 * A method that returns a String array containing 5 elements
	 * 
	 * @return A string array containing 5 elements
	 */
	public static String[] returningStringValues() {
		String[] stringElements = new String[5];

		for (int i = 0; i < 5; i++) {
			stringElements[i] = JOptionPane.showInputDialog("Enter string " + (i + 1));
		}

		return stringElements;
	}

	/**
	 * Returns an ArrayList of Integer Elements
	 * 
	 * @return an ArrayList of Integer Elements
	 */

	public static ArrayList returningIntegerValues() {
		ArrayList<Integer> integerElements = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {

			integerElements.add(Integer.parseInt(JOptionPane.showInputDialog("Enter your Integer element " + (i + 1))));
		}

		return integerElements;

	}

	public static ArrayList returningDoubleArrayListValues() {
		ArrayList<Double> doubleElements = new ArrayList<Double>();

		for (int i = 0; i < 5; i++) {
			doubleElements
					.add(Double.parseDouble(JOptionPane.showInputDialog("Enter Double ArrayList value" + (i + 1))));
		}

		return doubleElements;
	}

	public static ArrayList returningStringArrayListValues() {
		ArrayList<String> stringElements = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			stringElements.add(JOptionPane.showInputDialog("Enter String ArrayList value" + (i + 1)));
		}

		return stringElements;
	}

} // End of Class
