package movieTheater;

import com.github.javafaker.Faker;

public class Amc extends Theater implements MovieService{

    private boolean hasVr;
    private Faker faker;
    private String[] movies;

    public Amc(int numberOfSeats, boolean hasPopcorn, int numberOfRooms, int numberOfRestrooms, boolean has3D, boolean HasVr) {
        super(numberOfSeats, hasPopcorn, numberOfRooms, numberOfRestrooms, has3D);
        this.hasVr = hasVr;
        this.faker = new Faker();
        movies = new String[10];
        for (int i = 0; i < 10; i++) {

            movies[i] = faker.book().title();
        }
    }

    public boolean isHasVr() {
        return hasVr;
    }

    public void setHasVr(boolean hasVr) {
        this.hasVr = hasVr;
    }



    @Override
    public void welcomeCustomers() {
        System.out.println("Welcome to amc hope you have a great time with us!".toUpperCase());
    }

    @Override
    public void showAvailableMovie() {
        System.out.println("*-*-*-*-*-*-*AVAILABLE MOVIES*-*-*-*-*-*-*-*-*");

        for (int i = 1; i < 10; i++) {

            System.out.println(i+1 + "- "  + movies[i] + "\t$" +  Double.valueOf((int)(Math.random()*25-10+10)));

        }


    }

    @Override
    public void showAvailableSeat(String movie) {

        for (int i = 0; i < movies.length; i++) {

            if(movie.equalsIgnoreCase(movies[i])){
                System.out.println(movies[i] + " AVAILABLE SEATS "  + (int)(Math.random()*(80-50)+50) );
            }

        }
    }

    @Override
    public void showTheaterInfo() {

    }
}
