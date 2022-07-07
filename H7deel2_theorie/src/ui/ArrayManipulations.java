package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] doubleArray = {8.4,9.3,0.2,7.9,3.4};
		Arrays.sort(doubleArray);
		
		
		int[] filledIntArray = new int[10];
		Arrays.fill(filledIntArray,  7);
		displayArray(filledIntArray, "fille array");
		
		int[] intArray = {1,2,3,4,5,6};
		int[] intArrayCopy = new int [intArray.length];
		int[] intArrayCopy2 = new int [intArray.length];
		int[] intArrayCopy3 = new int [intArray.length];
		
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		intArrayCopy2 = Arrays.copyOf(intArray,intArray.length);
		intArrayCopy3 = Arrays.copyOfRange(intArray, 1, 5);
		
		
		displayArray(intArray, "intArray");
		displayArray(intArrayCopy, "intArrayCopy");
		
		boolean b = Arrays.equals(intArray, intArrayCopy);
		
		int location = Arrays.binarySearch(intArray,  6);
		
		System.out.println(Arrays.toString(intArray));
		
		String[] colors = {"red", "white", "blue", "green", "grey"};
		List<String> kleurenLijst = new ArrayList<>(Arrays.asList(colors));
		
		String[] colors2 = kleurenLijst.toArray(new String[kleurenLijst.size()]);
		

	}
	
	public static void displayArray(int[] array, String description) {
		System.out.printf("%n%s: ", description);
		
		for(int value: array) {
			System.out.printf("%d ",  value);
		}
	}

}
