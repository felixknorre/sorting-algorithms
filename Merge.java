public class Merge {

	public static void main(String[] args) {
		int[] a = {6, 5, 3, 8, 2, 7, 1, 4};
		System.out.println("unsorted:    " + toString(a));
		mergesort(a);
		System.out.println("sorted:      " + toString(a));

	}
	public static void mergesort(int[] a) {
		mergesort(a, 0, a.length);
	}
	public static void mergesort(int[] a, int li, int re) {
		if(re - li <= 1) {
			return;
		}
		int m = (li + re) / 2;
		mergesort(a, li, m);
		mergesort(a, m, re);
		
		int[] tmp = new int[re-li];
		int i = 0;
		int jl = li;
		int jr = m;
		
		while(jl < m && jr < re ) {
			if (a[jl] <= a[jr]) {
				tmp[i++] = a[jl++];
			} else {
				tmp[i++] = a[jr++];
			}
		}
		while(jl < m) {
			tmp[i++] = a[jl++];
		}
		while(jr < re) {
			tmp[i++] = a[jr++];
		}
		for (int k = 0; k < tmp.length; k++) {
			a[li + k] = tmp[k];
		}
		System.out.println("iteration:   " + toString(a));
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
