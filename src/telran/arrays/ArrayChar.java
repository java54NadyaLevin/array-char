package telran.arrays;


public class ArrayChar {
	private char[] array;
	public ArrayChar(char[] array) { //class constructor
		this.array = array; //this - to avoid conflict
	}
//massive should be immutable => there's no getter.
	
	public int compareTo(ArrayChar another) {
		//TODO
		return -1;
	}
}
