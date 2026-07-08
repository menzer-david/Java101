import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = {4, 3, 4, 2, 8, 3, 7, 8};
		System.out.println(countOccurences(arr, 3));
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(reverseArray(arr)));
		System.out.println(sumGrid(new int[][]{arr, arr}));
		System.out.println(fib(7));
	}

	public static int countOccurences(int[] arr, int n){
	    int o = 0;
	    for (int i = 0; i < arr.length; i++){
	        if (arr[i] == n){
	            o++;
            }

        }
        return o;
    }

	public static int[] reverseArray(int[] arr){
	    int[] n = new int[arr.length];
	    for (int i = 0; i < arr.length; i++){
	        n[i] = arr[arr.length-i-1];
        }
        return n;
    }

	public static int sumGrid(int[][] arr){
	    int n = 0;
	    for (int i = 0; i < arr.length; i++){
    	    for (int i2 = 0; i2 < arr[i].length; i2++){
    	        n += arr[i][i2];
    	    }
	    }
	    return n;
    }

	public static int fib(int f){
	    if (f == 1){
	        return 1;
	    }
	    if (f == 2){
	        return 1;
	    }
	    int[] arr = new int[f];
	    arr[0] = 1;
	    arr[1] = 1;
	    for (int i = 2; i<f; i++){
	        arr[i]=arr[i-1]+arr[i-2];
	    }
	    return arr[f-1];
    }
}
