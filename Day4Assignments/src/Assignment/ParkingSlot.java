package Assignment;

public class ParkingSlot {
	public static final int NO_OF_FLOORS = 5;
	public static final int SLOTS =2;
	public static int slotIndex =1;
	KeyValueMap kvstore[] ;
	public ParkingSlot(){
		kvstore = new KeyValueMap[NO_OF_FLOORS];
		for(int i =0;i<kvstore.length;i++){
			kvstore[i] = new KeyValueMap(SLOTS);
			}
	}
	public ParkingSlot(int floors, int slot){
		kvstore = new KeyValueMap[floors];
		for(int i =0;i<kvstore.length;i++){
			kvstore[i] = new KeyValueMap(slot);
			}
	}
	public void showAvailableParkingFloors(){
		
		for(int i =0;i<kvstore.length;i++){
			int count = 0;
			if(kvstore[i].isEmpty()){
				System.out.println("All slots are Free!!! in Floor " + (i+1));
				
			}else{
				kvstore[i].showAll();
			count = kvstore[i].showSpaceAvailable();
			System.out.println(count + " number of Parking is available in " + (i+1) + " floor");
		}
		}
	}

	public void parkACar(String CarNumber) {
		String parkingSlot = "slot"+slotIndex++;
		boolean flag = false;
		for(int i =0;i<kvstore.length;i++){
			String keySet[] = kvstore[i].getKeySet();
			for(int j =0 ;j<keySet.length;j++)
			{
				if(keySet[j]==null){
			kvstore[i].put(CarNumber, parkingSlot);
			flag =true;
			break;
				}
				
			}
			if(flag){
				break;
			}
		     
			}
		
	}
	public String getACar(String CarNumber){
		String value = null;
		for(int i =0;i<kvstore.length;i++){
			 value =kvstore[i].get(CarNumber);
			if(value!=null){
				System.out.println("Car "+ CarNumber + "is placed at " + (i+1) + " Floor in slot number:" + kvstore[i].get(CarNumber));
				break;
			}
		
			}
		return value;
	}
public static void main(String arg[]){
	ParkingSlot ps = new ParkingSlot();
	//String cars[]= {"car001","car002"};
	ps.parkACar("car001");
	//ps.parkACar("car002");
	String slot = ps.getACar("car001");
	ps.showAvailableParkingFloors();
	
}

}