
abstract class Room {


    protected int numberOfBeds;

    protected int squareFeet;

    protected double pricePerNight;


    public Room(int numberOfBeds, int squareFeet, double pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.squareFeet = squareFeet;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Room Size: " + squareFeet + " sq.ft");
        System.out.println("Price per Night: ₹" + pricePerNight);
    }
}



class SingleRoom extends Room {

    public SingleRoom() {
        super(1, 250, 1500.0);
    }
}


class DoubleRoom extends Room {

    public DoubleRoom() {
        super(2, 400, 2500.0);
    }
}


class SuiteRoom extends Room {

    public SuiteRoom() {
        super(3, 750, 5000.0);
    }
}



public class BookStayApp {

    public static void main(String[] args) {


        System.out.println("Hotel Room Initialization");


        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();
        int availableSingleRooms = 5;
        int availableDoubleRooms = 3;
        int availableSuiteRooms = 2;



        System.out.println("\nSingle Room Details:");
        singleRoom.displayRoomDetails();
        System.out.println("Single Rooms Available: " + availableSingleRooms);

        System.out.println("\nDouble Room Details:");
        doubleRoom.displayRoomDetails();
        System.out.println("Double Rooms Available: " + availableDoubleRooms);

        System.out.println("\nSuite Room Details:");
        suiteRoom.displayRoomDetails();
        System.out.println("Suite Rooms Available: " + availableSuiteRooms);

    }
}