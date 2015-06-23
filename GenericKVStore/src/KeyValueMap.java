
import java.util.Comparator;
import java.util.Scanner;

public class KeyValueMap {
	private static final int SIZE = 5;// Deafult size for key-value store
	private Object keys[];
	private int keyindex = -1;// index for keys
	private int valueindex = -1;// index for values array
	private Object values[];

	// private String key;
	// private String value;

	/* construstors to intialise size */
	public KeyValueMap() {
		this.keys = new Object[SIZE];
		this.values = new Object[SIZE];

	}

	public KeyValueMap(int size) {
		this.keys = new Object[size];
		this.values = new Object[size];

	}

	/* implementation of put method that adds key value pair */
	public void put(Object key, Object value)
			throws ArrayIndexOutOfBoundsException {
		if (key != null) {
			if (keyindex < keys.length) {
				if (!checkDuplicate(key, value)) { // checking duplicates

					keys[++keyindex] = key;
					values[++valueindex] = value;
				} else {
					System.out.println("Cannot Insert!!! Duplicate Values");
				}

			} else {
				System.out
						.println("Cannot Insert!! Exceeded key-value Store Capacity!!");
			}
		} else
			System.out.println("Key cannot be null!!");
	}

	/* method to check duplicates */
	private boolean checkDuplicate(Object key, Object value) {

		for (int i = 0; i < keys.length; i++) {
			if (keys[i] == key || values[i] == value) {
				// System.out.println("Duplicate Found!!!");
				return true;
			}
		}
		return false;
	}

	public Object getValue(Object key) {
		int index = findKeyIndex(key);// method that returns index of keyarray
										// for give string
		if (index != -1 && index <= keys.length) {
			return values[index];
		}
		return null;

	}

	public Object get(int index) {
		if (index != -1 && index-- <= keys.length) {

			return values[index];
		}
		return null;

	}

	/* method that returns index of keyarray for give string */
	private int findKeyIndex(Object key) {

		for (int i = 0; i < keys.length; i++) {
			if ((keys[i]).equals(key)) {
				return i;
			}
		}

		return -1;
	}

	/* removes key-value pair and replaces it with null */
	public void remove(Object key) {

		int index = findKeyIndex(key);
		keys[index] = null;
		values[index] = null;
	}

	/* method that displays all keyvalue pair */
	public void showAll() {
		if (!isEmpty()) {
			System.out.println("Key Value Pair:");

			for (int i = 0; i < keys.length; i++) {
				if (keys[i] != null) {
					System.out.println(keys[i] + "-->" + values[i]);
				}
			}
		}
	}

	public boolean isEmpty() {
		if (keyindex == -1) {
			return true;
		}
		return false;
	}

	public Object[] getKeySet() {
		Object keySet[] = new Object[keys.length];
		if (!isEmpty()) {
			for (int i = 0; i < keys.length; i++) {
				if (keys[i] != null) {
					keySet[i] = keys[i];
				}
			}
		}
		return keySet;
	}

	public int showSpaceAvailable() {
		int count = 0;
		for (int i = 0; i < keys.length; i++) {
			if (keys[i] == null) {
				count++;
			}
		}
		return count;
	}

	/* sort the key-value pair based on key an both ways */
	/*
	 * public void sort(Boolean basedOnKey, Boolean asc) { if (basedOnKey) { if
	 * (asc) {
	 * 
	 * for (int i = 0; i < keys.length; i++) { if (keys[i] != null) { for (int j
	 * = i + 1; j < keys.length; j++) {
	 * 
	 * if (compare(keys[i],keys[j]) < 0) { Object temp = keys[i]; Object tval =
	 * values[i]; keys[i] = keys[j]; values[i] = values[j]; keys[j] = temp;
	 * values[j] = tval;
	 * 
	 * } }
	 * 
	 * } } } else { for (int i = 0; i < keys.length; i++) { for (int j = i + 1;
	 * j < keys.length; j++) { if ((( (KeyValueMap) keys[j])).compareTo(
	 * (KeyValueMap) keys[i]) > 0) { Object temp = keys[i]; Object tval =
	 * values[i]; keys[i] = keys[j]; values[i] = values[j]; keys[j] = temp;
	 * values[j] = tval;
	 * 
	 * } } }
	 * 
	 * } } else {
	 * 
	 * if (asc) { for (int i = 0; i < values.length; i++) { for (int j = i + 1;
	 * j < values.length; j++) { if (( ((KeyValueMap)
	 * values[j])).compareTo((KeyValueMap) values[i]) < 0) { Object temp =
	 * keys[i]; Object tval = values[i]; keys[i] = keys[j]; values[i] =
	 * values[j]; keys[j] = temp; values[j] = tval;
	 * 
	 * } } } } else { for (int i = 0; i < values.length; i++) { for (int j = i +
	 * 1; j < values.length; j++) { if ((( (KeyValueMap)
	 * values[j]).compareTo((KeyValueMap) values[i]) > 0)) { Object temp =
	 * keys[i]; Object tval = values[i]; keys[i] = keys[j]; values[i] =
	 * values[j]; keys[j] = temp; values[j] = tval; } } }
	 * 
	 * }
	 * 
	 * } }
	 * 
	 * @Override public String toString(){ return this.key; }
	 */

	public static void main(String args[]) {
		KeyValueMap kv = new KeyValueMap();

		kv.put(7.9, " value");
		kv.put(1, 'a');
		kv.put('b', " value1");
		kv.put("a", "sneha");
		kv.put("hello", "vishal");
		kv.showAll();
		Object[] a = kv.getKeySet();
		System.out.println("Availabe Keyset:");
		for (Object st : a) {
			System.out.print(st + "\t");
		}

		System.out.println();
		// System.out.println(kv.toString());
		System.out.println("Enter key:");
		Scanner scan = new Scanner(System.in);
		// Object key = scan.next();
		Object val = kv.getValue(1);
		System.out.println("Value for 1" + "-->" + val);

		Object val2 = kv.getValue('b');
		System.out.println("Value for b" + "-->" + val2);

		System.out.println("Enter index:");
		int index = scan.nextInt();

		Object val1 = kv.get(index);
		System.out.println("Value at index " + index + ":" + val1);

		/*
		 * System.out.println("Enter key to remove:"); String rk = scan.next();
		 * kv.remove(rk);
		 */
		kv.showAll();

		boolean b = kv.isEmpty();

		System.out.println("Is KeyValueStore Empty??" + b);

		System.out.println("Available space:" + kv.showSpaceAvailable());
		// System.out.println();
		/*
		 * System.out.println("Value Based sort in descending order:");
		 * kv.sort(false, false); kv.showAll();
		 * System.out.println("Value Based sort in ascending order:");
		 * kv.sort(false, true); kv.showAll();
		 * System.out.println("Key Based sort in ascending order:");
		 * kv.sort(true, true); kv.showAll();
		 * System.out.println("Key Based sort in descending order:");
		 * kv.sort(true, false); kv.showAll();
		 */
		System.out.println("After removing key b :");
		// String rk = scan.next();
		kv.remove('b');
		kv.showAll();
		// kv.sort(false, false);
	}

}