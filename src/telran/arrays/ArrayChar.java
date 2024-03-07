package telran.arrays;


public class ArrayChar {
	private char[] array; //encapsulated state
	public ArrayChar(char[] array) { //class constructor
		this.array = array; //this - to avoid conflict
	}
//massive should be immutable => there's no getter.
	
	public int compareTo(ArrayChar another) {
		int length = Math.min(this.array.length, another.array.length);
		int index = 0;
		while(index < length && this.array[index] == another.array[index]) {
			index++;
		}
		return index == length ? this.array.length - another.array.length : this.array[index]-another.array[index];
	}
	public int indexOf(char character) {
		int index = 0;
		while(index < array.length && array[index] != character) {
			index++;
		}
	
	return index == array.length ? -1 : index;	
	}
	
	public int lastIndexOf(char character) {
		int index = array.length-1;
		while(index > -1 && array[index] != character) {
			index--;
		}
		return index;
	}
	
	//compareToIgnoreCase, contains, equals, equalsIgnoreCase (will use compareToIgnoreCase), count which count number of characters are in massive(one character in)
}
