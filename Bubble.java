
public class Bubble {

	public static void main(String[] args) {
		int[] a = {6, 5, 3, 8, 2, 7, 1, 4};
		System.out.println("unsorted:    " + toString(a));
		int iteration = 1;
		int p = a.length -1; //position of the last swap
		while ( p > 0) {
			int re = p;
			p = 0;
			for (int i = 0; i < re; i++) {
				if (a[i] > a[i +1]) {
					swap(a, i, (i+1));
					p = i;
				}
			}
			System.out.println("iteration " + iteration + ": " + toString(a));
			iteration++;
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
