package Review;

public class SortedSequence {

	private Object[] data;
	private int manyItems;
	
	public SortedSequence() {
		data = new Object[10];
		manyItems = 0;
	}
	
	public SortedSequence(int size) {
		this.data = new Object[size];
		this.manyItems = 0;
	}
	
	private void add(int value) {
		if(manyItems < data.length) {
			data[0] = value;
		}
	}
}
