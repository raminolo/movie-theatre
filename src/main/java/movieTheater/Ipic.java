package movieTheater;

public class Ipic extends Theater{

    private String dinner;

    public Ipic(int numberOfSeats, boolean hasPopcorn, int numberOfRooms, int numberOfRestrooms, boolean has3D, String dinner) {
        super(numberOfSeats, hasPopcorn, numberOfRooms, numberOfRestrooms, has3D);
        this.dinner = dinner;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }
}
