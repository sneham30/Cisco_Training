package Assignment;

public class ParkingSlot {
	public static final int NO_OF_FLOORS = 5;// constant variable to hold no of
												// floors
	public static final int SLOTS = 2;// constant variable to hold no of slots
	public static int slotIndex = 1;// static variable to create unique
									// parkingslot
	KeyValueMap kvstore[];// array of KeyValueMap objects

	/* constructor to initialise array of KeyValueMapObjects */
	// Default constructor
	public ParkingSlot() {
		kvstore = new KeyValueMap[NO_OF_FLOORS];// intialising array with no of
												// floors
		for (int i = 0; i < kvstore.length; i++) {
			kvstore[i] = new KeyValueMap(SLOTS);// constructing keyValueMap
												// Object for every floor with
												// slot size
		}
	}

	/* Parameterised construtor with no of floors and slots */
	public ParkingSlot(int floors, int slot) {
		kvstore = new KeyValueMap[floors];// intialising array with no of
		                                  // floors
		for (int i = 0; i < kvstore.length; i++) {
			kvstore[i] = new KeyValueMap(slot);// constructing keyValueMap
											  // Object for every floor with
												// slot size
		}
	}
  /*method to print avalaibale place */
	/*For every floor check whether its empty by calling isEmpty of keyValueMap
	 * if its empty it prints the floor ie.,empty
	 * else it will call showSpaceAvailable() of KeyValueMap which returns no of space available*/
	public void showAvailableParkingFloors() {

		for (int i = 0; i < kvstore.length; i++) { 
			int count = 0;
			if (kvstore[i].isEmpty()) {
				System.out.println("All slots are Free!!! in Floor " + (i + 1));

			} else {
				// kvstore[i].showAll();
				count = kvstore[i].showSpaceAvailable();
				System.out.println(count
						+ " number of Parking is available in " + (i + 1)
						+ " floor");
			}
		}
	}
	/*For every floor check whether the space available if yes
	 * it parks car by calling put(key,value) of KeyValueMap in first slot of that floor
	 * so the car gets Park in the 1st floor if space available there else in second floor so on..
	 * until a floor gets filled up all cars are parked in that floor once its filled it moves to next floor
	 * */
	public void parkACar(String CarNumber) {
		String parkingSlot = "slot" + slotIndex++;
		boolean flag = false;
		for (int i = 0; i < kvstore.length; i++) {
			String keySet[] = kvstore[i].getKeySet();
			for (int j = 0; j < keySet.length; j++) {
				if (keySet[j] == null) {
					kvstore[i].put(CarNumber, parkingSlot);
					flag = true;
					break;
				}

			}
			if (flag) {
				break;
			}

		}

	}
/*method to print slot number of a Car*/
	/*loops through all slots of every floor and finds for the CarNumber as key using get(key) of KeyMapValue 
	 * and prints the floor n slot number*/
	public String getACar(String CarNumber) {
		String value = null;
		for (int i = 0; i < kvstore.length; i++) {
			value = kvstore[i].get(CarNumber);
			if (value != null) {
				System.out.println("Car " + CarNumber + " is placed at "
						+ (i + 1) + " Floor in slot number:"
						+ kvstore[i].get(CarNumber));
				break;
			}

		}
		return value;
	}

	public static void main(String arg[]) {
		ParkingSlot ps = new ParkingSlot(3, 4);
		// String cars[]= {"car001","car002"};
		ps.parkACar("car001");
		ps.parkACar("car002");
		ps.parkACar("car003");

		ps.getACar("car001");
		ps.getACar("car002");
		ps.getACar("car003");

		ps.showAvailableParkingFloors();

	}

}