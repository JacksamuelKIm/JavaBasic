package Ch04.Practices;

class ArrayUtil {
	public static int [] concat(int[] a, int[] b) {
		int [] arr = new int [a.length+b.length];
		for (int i =0; i<arr.length ; i++) {
			if(i<a.length){
				arr[i] = a[i];
			} else {
				arr[i] = b[i-a.length];
			}
		}
		
		return arr;
	}
	public static void print(int[] a) { 
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}	
}

public class Practice9_StaticEx {
	public static void main(String[] args) {
		int [] array1 = {1, 5, 7, 9};
		int [] array2 = {3, 6, -1, 100, 77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}