package flightReservationSysem;

public class Contact {
    String name;
    String phoneNumber;
    String email;

    public String contact(String name, String phone, String email){
        this.name = name;
        this.phoneNumber = phone;
        this.email = email;

        return "Name: " + this.name + " | Phone: " + phoneNumber + " | EmailID: " + this.email;
    }
}
