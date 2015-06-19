package Assignment;

public class ParkingSlot {
	public static final int NO_OF_FLOORS = 5;
	KeyValueStore kvstore[] ;
	public ParkingSlot(){
		kvstore = new KeyValueStore[NO_OF_FLOORS];
		
	}
	public ParkingSlot(int size){
		kvstore = new KeyValueStore[size];
	}
/*	void showAvailableParkingFloors(){
		
		for(int i =0;i<kvstore.length;i++){
			int count = 0;
			if(kvstore[i].isEmpty()){
				count
			}
			count = kvstore[i].showSpaceAvailable();
			System.out.println(count + "no of Parking is available in" + i + "floor");
		}
	}*/
	
	/*private void park(String string) {
		for(int i =0;i<kvstore.length;i++){
			if(kvstore[i].)
		}
		
	}*/
public static void main(String arg[]){
	ParkingSlot ps = new ParkingSlot();
	//String cars[]= {"car001","car002"};
//	ps.park("car001");
}

}
