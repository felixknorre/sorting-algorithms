public class Sequence {
	
	private int[] seq;
	
	public Sequence(int[] s) {
		seq = s;
	}
	//basic sequence methods
	public void setItem(int p, int value) {
		this.seq[p] = value;
	}
	public int getItem(int a) {
		return this.seq[a];
	}
	public int[] getArray() {
		return this.seq;
	}
	public int length() {
		return seq.length;
	}
	public String toString() {
		String str = "";
		for(int i = 0; i < seq.length; i++) {
			str += this.getItem(i) + " ";
		}
		return str;
	}
	//selection sort
	public void selectionSort() {
		for(int i = 0; i < (seq.length - 1); i++) {
			this.swap(i, this.min(i));
		}
	}
	//insertion sort
	public void insertionSort() {
		for(int i = 0; i < this.length(); i++) {
			for (int j = i;j > 0 && this.getItem(j - 1) > this.getItem(j) ; j--) {
				this.swap(j, (j - 1));
			}
		}
	}
	//bubble sort
	public void bubbleSort() {
		int p = (this.length() - 1); //position of the last swap
		while(p > 0) {
			int re = p;
			p = 0;
			for(int i = 0; i < re; i++) {
				if(this.getItem(i) > this.getItem(i + 1)) {
					this.swap(i, (i + 1));
					p = i;
				}
			}
		}
	}
	//quick sort
	public void quickSort() {
		quickSort(this, 0, this.length() - 1);
		
	}
	public static void quickSort(Sequence sequence, int li, int ri) {
		if (li >= ri) {
			return;
		}
		// li = left item, ri = right item
		int p = pivot(li, ri); //select pivot element
		sequence.swap(p, ri); // swap pivot with the last element
		int lpointer = li; //left pointer
		int rpointer = ri - 1; //right pointer
				
		do {
			//search a element bigger than the pivot
			while(lpointer <= rpointer && sequence.getItem(lpointer) < sequence.getItem(ri)) {
				++lpointer;
			}
			//seach a element smaller than the pivot
			while(lpointer < rpointer && sequence.getItem(rpointer) >= sequence.getItem(ri)) {
				--rpointer;
			} //swap the smaller with the bigger element
			if (lpointer < rpointer) {
				sequence.swap(lpointer++, rpointer);
			}
		} while(lpointer <= --rpointer);
		p = lpointer;
		sequence.swap(p, ri); //swap pivot to the final index
		//sort the part before and after the pivot		
		quickSort(sequence, li, p - 1);
		quickSort(sequence, p + 1, ri);
	}
	//help-methods
	public void swap(int a, int b) {
		if (a != b) {
			int tmp = this.getItem(a);
			this.setItem(a, this.getItem(b));
			this.setItem(b, tmp);
		}
	}
	public int min(int i) {
		int min = i;
		for (int j = i + 1 ; j < seq.length; j++) {
			if (this.getItem(min) > this.getItem(j)) {
				min = j;
			}
		}
		return min;
	}
	public static int pivot(int li, int ri) {
		return (li + ri + 1) / 2;
	}


}
