
public class Selection {

	public static void main(String[] args) {
		int[] a = {1, 9, 7, 8, 5, 3, 2, 10, 4};
		System.out.println(toString(a));
		for (int i = 0; i < a.length - 1; i++) {
			swap(a, i, min(a, i));
		}
		System.out.println(toString(a));
		

	}
	//swap two elem. in an array
	public static void swap( int[] a, int x, int y) {
		if (x != y) {
			int tmp = a[y];
			a[y] = a[x];
			a[x] = tmp;
		}
	}
	//search min in array
	public static int min(int[] a, int i) {
		int p = i;
		
		for (int j = i + 1; j < a.length; j++) {
			if ( a[p] > a[j]) {
				p = j;
			}
		}
		return p;
	}
	//array to string
	public static String toString(int[] a) {
		String stg = "";
		for (int i = 0; i < a.length ; i++) {
		stg += a[i];
		}
		return stg;
	}

}
