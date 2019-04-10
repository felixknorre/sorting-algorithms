
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
	//sorting algo
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
	//merge sort
	public void mergeSort() {
		//TODO implement
	}
	//quick sort
	public void quickSort() {
		//TODO implement
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


}
