package flightReservationSysem;
import java.util.Scanner;

public class Contact extends Address{
    Scanner sc= new Scanner(System.in);
       private String name;
       private String phoneNumber;
       private String email;

        public void setContact(){
            System.out.println("Enter Name: ");
            name = sc.nextLine();

            System.out.println("Enter Phone: ");
            phoneNumber = sc.nextLine();

            System.out.println("Enter Email: ");
            email = sc.nextLine();

        }

        public void getContact(){
            System.out.println("Name: " + name + ", Number: " + phoneNumber + ", EmailID: " + email);
        }
}
