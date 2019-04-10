import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SequenceTest {
	
	@Test
	void testGetIten() {
		//unsortet int array
		int[] p = {15,3,12,67,98,34,20,1};
		//create new sequence
		Sequence s = new Sequence(p);
		int expected = 12;
		int actual = s.getItem(2);
		assertEquals(expected, actual, "The method should return item x on position y");
	}
	@Test
	void testSetItem() {
		//unsortet int array
		int[] p = {15,3,12,67,98,34,20,1};
		//create new sequence
		Sequence s = new Sequence(p);
		int[] expected = {15,3,12,67,100,34,20,1};
		s.setItem(4, 100);
		int[] actual = s.getArray();
		assertArrayEquals(expected, actual, "The method should set the value on position x");
	}
	@Test
	void testGetArray() {
		//unsortet int array
		int[] p = {15,3,12,67,98,34,20,1};
		//create new sequence
		Sequence s = new Sequence(p);
		int[] expected = {15,3,12,67,98,34,20,1};
		int[] actual = s.getArray();
		assertArrayEquals(expected, actual, "The method should return the sequence as array");
	}
	@Test
	void testLength() {
		//unsortet int array
		int[] p = {15,3,12,67,98,34,20,1};
		//create new sequence
		Sequence s = new Sequence(p);
		int expected = 8;
		int actual = s.length();
		assertEquals(expected, actual, "The method should return the length of the sequence");
	}
	@Test
	void testmin() {
		//unsortet int array
		int[] p = {15,3,12,67,98,34,20,1};
		//create new sequence
		Sequence s = new Sequence(p);
		int expected = 7;
		int actual = s.min(0);
		assertEquals(expected, actual, "The method should return the position of the smallest value");
	}
	@Test
	void testToString() {
		//unsortet int array
		int[] p = {15,3,12,67,98,34,20,1};
		//create new sequence
		Sequence s = new Sequence(p);
		String expected = "15 3 12 67 98 34 20 1 ";
		assertEquals(expected, s.toString(), "The method should return the sequence as String");
	}
	@Test
	void testSwap() {
		//unsortet int array
		int[] p = {15,3,12,67,98,34,20,1};
		//create new sequence
		Sequence s = new Sequence(p);
		int[] expected = {3,15,12,67,98,34,20,1};
		s.swap(0, 1);
		assertArrayEquals(expected, s.getArray(), "The method should swap two items in the sequence");
	}
	@Test
	void testSelectionSort() {
		//unsortet int array
		int[] p = {15,3,12,67,98,34,20,1};
		//create new sequence
		Sequence s = new Sequence(p);
		int[] expected = {1,3,12,15,20,34,67,98};
		s.selectionSort();
		assertArrayEquals(expected, s.getArray(),"The method should sort the sequence");
		//System.out.println(s.toString());
	}
	@Test
	void testInsertionSort() {
		//unsortet int array
		int[] p = {15,3,12,67,98,34,20,1};
		//create new sequence
		Sequence s = new Sequence(p);
		int[] expected = {1,3,12,15,20,34,67,98};
		s.insertionSort();
		assertArrayEquals(expected, s.getArray(),"The method should sort the sequenze");
		//System.out.println(s.toString());
	}
	@Test
	void testBubbleSort() {
		//unsortet int array
		int[] p = {15,3,12,67,98,34,20,1};
		//create new sequence
		Sequence s = new Sequence(p);
		int[] expected = {1,3,12,15,20,34,67,98};
		s.bubbleSort();
		assertArrayEquals(expected, s.getArray(),"The method should sort the sequenze");
		//System.out.println(s.toString());
	}
	@Test
	void testMergeSort() {
		//unsortet int array
		int[] p = {15,3,12,67,98,34,20,1};
		//create new sequence
		Sequence s = new Sequence(p);
		int[] expected = {1,3,12,15,20,34,67,98};
		s.mergeSort();
		assertArrayEquals(expected, s.getArray(),"The method should sort the sequenze");
		//System.out.println(s.toString());
	}
	@Test
	void testQuickSort() {
		//unsortet int array
		int[] p = {15,3,12,67,98,34,20,1};
		//create new sequence
		Sequence s = new Sequence(p);
		int[] expected = {1,3,12,15,20,34,67,98};
		s.quickSort();
		assertArrayEquals(expected, s.getArray(),"The method should sort the sequenze");
		//System.out.println(s.toString());
	}

}
