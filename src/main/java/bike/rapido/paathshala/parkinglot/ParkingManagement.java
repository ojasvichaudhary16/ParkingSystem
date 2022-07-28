package bike.rapido.paathshala.parkinglot;

public class ParkingManagement {
    static int availableSlot = 4;


    public String canPark() {
        if(availableSlot>0){
            availableSlot=availableSlot-1;
            return "You Can Park";
        }
        else{
            return "Parking Full";
        }
    }


}
