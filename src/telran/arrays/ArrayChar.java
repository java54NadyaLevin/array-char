package telran.arrays;

import java.lang.reflect.Array;
import java.lang.Character;


public class ArrayChar {
	private char[] array; // encapsulated state

	public ArrayChar(char[] array) { // class constructor
		this.array = array; // this - to avoid conflict
	}
//massive should be immutable => there's no getter.

	public int compareTo(ArrayChar another) {
		return this.compare(this.array, another.array);
	}
	
	private int compare(char[] first, char[] second) {
		int length = Math.min(first.length, second.length);
		int index = 0;
		while (index < length && first[index] == second[index]) {
			index++;
		}
		return index == length ? first.length - second.length : first[index] - second[index];
	}

	public int indexOf(char character) {
		int index = 0;
		while (index < array.length && array[index] != character) {
			index++;
		}

		return index == array.length ? -1 : index;
	}

	public int lastIndexOf(char character) {
		int index = array.length - 1;
		while (index > -1 && array[index] != character) {
			index--;
		}
		return index;
	}

	
	public int count(char character) {
		int count = 0;
		for (int index = 0; index < array.length; index++) {
			if (this.array[index] == character) {
				count++;
			}
		}
		return count;
	}
	
	private char[] toLowerCase(char[] array) {
		char[] lowerCaseArray = new char[array.length];
		for(int index = 0; index < array.length; index++) {
			lowerCaseArray[index] = Character.toLowerCase(array[index]);
		}
		return lowerCaseArray;
	}
	
	public int compareToIgnoreCase(ArrayChar another) {
		char[] ar1 = toLowerCase(this.array);
		char[] ar2 = toLowerCase(another.array);
		
		return this.compare(ar1, ar2);
	}
	
	public boolean contains(char character) {
		
		return this.indexOf(character) != -1;
	}
	
	public boolean equals(ArrayChar another) {
		return this.compare(this.array, another.array) == 0;
	}
	
	public boolean equalsIgnoreCase(ArrayChar another) {
		
		return this.compareToIgnoreCase(another) == 0;
	}
}
