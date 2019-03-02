
public class Insertion {

	public static void main(String[] args) {
		int[] a = {6, 5, 3, 8, 2, 7, 1, 4};
		System.out.println("unsorted:    " + toString(a));
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0 && a[j - 1] > a[j]; j--) {
				swap(a, j, (j - 1));
			}
			System.out.println("iteration " + (i) + ": " + toString(a));
		}
		System.out.println("sorted:      " + toString(a));
	}
	
	//swap two elem. in an array
	public static void swap(int[] a, int x, int y) {
		if (x != y) {
			int tmp = a[x];
			a[x] = a[y];
			a[y] = tmp;
		}
	}
	
	//array to string
	public static String toString(int[] a) {
		String stg = "";
		for (int i = 0; i < a.length ; i++) {
		stg += a[i] + " ";
		}
		return stg;
	}
	

}
