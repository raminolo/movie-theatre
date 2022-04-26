package movieTheater;

import java.util.Scanner;

public class Entertainment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("WELCOME TO MOVIE WORLD!");
        System.out.println("PLEASE CHOOSE YOUR FAVORITE MOVIE THEATER");
        System.out.println("AMC | IPIC | REGAL | EMAGINE");

        String theater = scan.nextLine().toLowerCase();
        MovieService service = null;
        switch(theater){
            case "amc":
                service = new Amc(50, true, 70, 5, true, true);
                service.welcomeCustomers();
              while(true){
                  System.out.println("movies | seats | info".toUpperCase() + "| QUIT");
                  String opt = scan.nextLine();
                  if(opt.equalsIgnoreCase("movies")){
                      service.showAvailableMovie();
                  }else if(opt.equalsIgnoreCase("seats")){
                      System.out.println("WHICH MOVIE");
                      String movieName = scan.nextLine();
                      service.showAvailableSeat(movieName);
                  }else if(opt.equalsIgnoreCase("quit")){
                      break;
                  }
              }

                break;
            case "ipic":

                break;
            case "regal":

                break;
            case "emagine":

                break;
        }

    }
}
