package movieTheater;

import com.github.javafaker.Faker;

public class FakerClass {
    public static void main(String[] args) {

        Faker fake = new Faker();

        String s = fake.book().title();
        System.out.println(s);



    }
}
