package flightReservationSysem;

import java.util.Scanner;

    public class Passenger extends Contact{
        protected void Passenger(){
            System.out.println("Kindly register with following details:");
            Contact contact = new Contact();
            contact.setContact();
            contact.getContact();
            contact.setAddress();
            contact.getAddress();

            System.out.print("------Please Select the PNR from 1 to 3 for enquiry------");
            int  a = sc.nextInt();
            if(a == 1){
                JetAirways jet = new JetAirways();
                jet.flightCompany();
            }else if(a == 2){
                AirIndia air= new AirIndia();
                air.flightCompany();
            }else if(a == 3){
               Indigo indigo = new Indigo();
               indigo.flightCompany();
            }else {
                System.out.println("Please Enter Valid Number!");
            }
        }
    }
