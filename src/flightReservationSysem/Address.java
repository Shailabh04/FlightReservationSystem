package flightReservationSysem;
import java.util.*;

public class Address {
    Scanner sc= new Scanner(System.in);
    private String street;
    private String city;
    private String state;

    public void setAddress(){
        System.out.println("Enter Street: ");
        street = sc.nextLine();

        System.out.println("Enter City: ");
        city = sc.nextLine();

        System.out.println("Enter State: ");
        state = sc.nextLine();
    }

    public void getAddress(){
        System.out.println("Street: " + street + ", City: " + city + ", State: " + state);
    }
}
