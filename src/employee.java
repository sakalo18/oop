
import java.util.Scanner;

import static java.lang.System.in;

public class employee {

    String name;
    String surname;
    String lastname;
    String jogTitle;
    String email;
    String phoneNumber;
    String age;

    public static void main(String[] args) {
        employee petrov = new employee();
        petrov.name = "Petr";
        petrov.surname = "Petrov";
        petrov.lastname = "petrovich";
        petrov.jogTitle = "manager";
        petrov.email = "petrov@gmail.com";
        petrov.phoneNumber = "+380532852858";
        petrov.age = "35";


        employee franko = new employee();
        franko.name = "ivan";
        franko.surname = "Franko";
        franko.lastname = "petrovich";
        franko.jogTitle = "saller";
        franko.email = "fronko@gmail.com";
        franko.phoneNumber = "+380532852858";
        franko.age = "35";

        Scanner sc = new Scanner(in);
        System.out.println("Enter surname Petrov or Franko");
        String surname = sc.next();


        switch (surname) {
            case "Petrov":
                System.out.println(petrov.name + "\n" + petrov.surname + "\n" + petrov.lastname + "\n" + petrov.jogTitle + "\n" + petrov.email
                            + "\n" + petrov.phoneNumber + "\n" + petrov.age);
            break;
            case "Franko":
                System.out.println(franko.name + "\n" + franko.surname + "\n" + franko.lastname + "\n" + franko.jogTitle + "\n" + franko.email
                    + "\n" + franko.phoneNumber + "\n" + franko.age);
                break;
        }
    }
}
//2. Створити клас "Співробітник" з полями: ПІБ, посада, email, телефон, вік.*/
