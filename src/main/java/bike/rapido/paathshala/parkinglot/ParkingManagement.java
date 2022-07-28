package bike.rapido.paathshala.parkinglot;

public class ParkingManagement {
    private static int availableSlot = 4;


    public String park() {
        if(availableSlot>0){
            availableSlot=availableSlot-1;
            return "You Can Park";
        }
        else{
            return "Parking Full";
        }
    }

    public String depart(){
        if(availableSlot < 4){
            availableSlot = availableSlot + 1;
            return "Car Departed";
        }
        else{
            return "Parking Empty";
        }
    }


}
