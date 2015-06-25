package ParkingSlot;


import java.util.ArrayList;
import java.util.Iterator;

/*
 * A Map is a key Value pair that store value at a key index
 * key can be of any type and value can also be of any type
 * and it should not allow duplicates
 * class to implement Map functions using 2 arrayList Objects for keys and value
 */


public class KeyValueMap {

	int capacity = 5;

	ArrayList<Object> keys; // ArrayList Object for keys
	private ArrayList<Object> values;// ArrayList Object for values


	// default constructor to initialize keys & value with capacity
	public KeyValueMap() {
		this.keys = new ArrayList<Object>(capacity);
		this.values = new ArrayList<Object>(capacity);
	}

	// Parameterized constructor to initialize keys & value with size
	public KeyValueMap(int size) {
		this.capacity = size;
		this.keys = new ArrayList<Object>(capacity);
		this.values = new ArrayList<Object>(capacity);
	}

	/*
	 * implementation of put method that adds key value pair
	 * @param :Object key ,Object value
	 * @return :void
	 * Checks for non null key param , checks whether key list is within the
	 * capacity
	 * then checks whether key not value are duplicated if not adds key and
	 * value to their
	 * respective ArrayList
	 */
	public void put(Object key, Object value)
			throws ArrayIndexOutOfBoundsException {
		if (key != null) {
			if (keys.size() < capacity) {

				if (!checkDuplicate(key, value)) { // checking duplicates

					keys.add(key);
					values.add(value);
				} else {
					System.out.println("Cannot Insert!!! Duplicate Values");
				}

			} else {
				System.out.println("Cannot Insert!! Exceeded key-value Store capacity!!");
			}
		} else
			System.out.println("Key cannot be null!!");
	}

	/*
	 * method to check duplicates
	 * @param : Object key,Object value
	 * @return : boolean
	 * returns true if keys contains key or if values contains/has value Object
	 * else returns false
	 */
	private boolean checkDuplicate(Object key, Object value) {
		boolean flag = false;
		if (keys.contains(key) || values.contains(value)) {
			flag = true;
		}
		return flag;
	}

	/*
	 * method to return Object i.e., value at key
	 * @param: Object key
	 * @return : Object value
	 * returns the value stored at key
	 * finds the index for key in keys and returns the value at same index in
	 * values
	 */
	public Object get(Object key) {
		int index = keys.indexOf(key);
		if (index != -1) { return values.get(index); }
		return null;
	}

	/*
	 * method to return Object i.e., value at index given
	 * @param: int index
	 * @return: Object value
	 * returns the Object at index from values
	 */
	public Object getValue(int index) {

		return values.get(index);

	}

	/*
	 * method to return keys present
	 * @return: Object[] keys
	 * returns an Object array of keys
	 */
	public Object[] getKeySet() {
		Object[] keyset = new Object[keys.size()];
		int keycount = 0;
		Iterator<Object> itr = keys.iterator();
		while (itr.hasNext()) {
			keyset[keycount++] = itr.next();
		}
		return keyset;
	}

	/*
	 * method to remove a key value-pair for a key
	 * @param : Object key
	 * @return: void
	 * finds the value at key given and then removes both key and value from
	 * keys and values
	 */
	public void remove(Object key) {

		Object value = get(key);
		keys.remove(key);
		values.remove(value);
	}

	/*
	 * method to remove a key value-pair for an index
	 * @param : int index
	 * @return : void
	 * finds the value at key whose index is given and removes both key and
	 * value it holds
	 */
	public void removeIndex(int index) {

		Object value = getValue(index);
		keys.remove(index);
		values.remove(value);
	}

	/*
	 * method to display key-value pair
	 * displays every key and value it holds
	 */
	public void showAll() {
		Object[] keyset = getKeySet();
		System.out.println("Key Value Pair");
		for (Object key : keyset) {
			System.out.println(key + "-->" + get(key));
		}

	}

	/*
	 * method to check key-value pair is empty or not
	 * @return: boolean
	 * returns true if keys is empty else returns false
	 */
	public boolean isEmpty() {
		return keys.isEmpty();
	}

	/*
	 * method to return no Of available spaces in key-value map
	 * @return : int space
	 * returns the no of available empty spaces i.e.,difference of capacity and
	 * keys size
	 */
	public int showSpaceAvailable() {
		return this.capacity - keys.size();
	}

	public static void main(String args[]) {
		KeyValueMap keyValue = new KeyValueMap();
		// populating key-value store
		keyValue.put(1, "a");
		keyValue.put('b', "b");
		keyValue.put(3, "c");
		keyValue.put("hello", "d");
		keyValue.put(5, "e");
		keyValue.put(6, "1");

		Object[] keyset = keyValue.getKeySet();
		System.out.println("Keys available:");
		for (Object key : keyset) {
			System.out.print(key + "\t");
		}

		System.out.println();

		keyValue.showAll();

		System.out.println("Available Space:" + keyValue.showSpaceAvailable());

		System.out.println("value at key b:" + keyValue.get('b'));
		System.out.println("value at index 2:" + keyValue.getValue(2));

		System.out.println("Is KeyValueMAP empty?? " + keyValue.isEmpty());

		keyValue.remove('b');
		System.out.println("After removing key b:");
		keyValue.showAll();

		System.out.println("After removing index 0:");
		keyValue.removeIndex(0);
		keyValue.showAll();

		System.out.println("Available Space:" + keyValue.showSpaceAvailable());
	}
}
