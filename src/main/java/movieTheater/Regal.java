package movieTheater;

public class Regal extends Theater{

    private String secondFloor;
    public Regal(int numberOfSeats, boolean hasPopcorn, int numberOfRooms, int numberOfRestrooms, boolean has3D, String secondFloor) {
        super(numberOfSeats, hasPopcorn, numberOfRooms, numberOfRestrooms, has3D);
        this.secondFloor = secondFloor;
    }

    public String getSecondFloor() {
        return secondFloor;
    }

    public void setSecondFloor(String secondFloor) {
        this.secondFloor = secondFloor;
    }
}
