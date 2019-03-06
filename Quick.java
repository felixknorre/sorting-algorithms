
public class Quick {

	public static void main(String[] args) {
		int[] a = {6, 5, 3, 8, 2, 7, 1, 4};
		System.out.println("unsorted:    " + toString(a));
		sortQuick(a, 0, a.length - 1);
		System.out.println("sorted:      " + toString(a));

	}
	public static int pivot(int[] a, int li, int re) {
		return (li + re + 1) / 2; // select the pivot
	}
	public static void sortQuick(int[] a, int li, int re) {
		if (li >= re) {
			return;
		}
		int p = pivot(a, li, re);
		//System.out.println(a[p]);

		
		swap(a, p, re);
		int il = li; //Pionter
		int ir = re-1;//Pointer
		
		do {
			while(il <= ir && a[il] < a[re]) {
				++il;
			}
			while(il < ir && a[ir] >= a[re]) {
				--ir;
			}
			if (il < ir) {
				swap(a, il++, ir);
			}
		} while(il <= --ir);
		p = il;
		swap(a, p, re);
		
		sortQuick(a, li, (p-1));
		sortQuick(a, (p+1), re);
	}
	
	public static void swap( int[] a, int x, int y) {
		if (x != y) {
			int tmp = a[y];
			a[y] = a[x];
			a[x] = tmp;
		}
	}
	public static String toString(int[] a) {
		String stg = "";
		for (int i = 0; i < a.length ; i++) {
		stg += a[i] + " ";
		}
		return stg;
	}

}
