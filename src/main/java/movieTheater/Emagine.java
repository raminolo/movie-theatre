package movieTheater;

public class Emagine extends Theater{

    private String specialEvents;
    public Emagine(int numberOfSeats, boolean hasPopcorn, int numberOfRooms, int numberOfRestrooms, boolean has3D, String specialEvents) {
        super(numberOfSeats, hasPopcorn, numberOfRooms, numberOfRestrooms, has3D);
        this.specialEvents = specialEvents;
    }

    public String getSpecialEvents() {
        return specialEvents;
    }

    public void setSpecialEvents(String specialEvents) {
        this.specialEvents = specialEvents;
    }
}
