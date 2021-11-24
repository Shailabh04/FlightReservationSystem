package flightReservationSysem;
import java.util.*;

class JetAirways extends Flight{
    void flightCompany(){
        pnr = "1";
        departureFrom = "Delhi";
        destination = "Mumbai";
        flightName = "Jet Airways";
        flightNum = "1";
        dateOfDeparture = "1 Dec, 2021";
        dateOfArrival = "1 Dec, 2021";
        timeOfDeparture = "1:00 PM";
        timeOfArrival = "2:30 PM";
        System.out.print("PNR: "+pnr+", Departure: "+departureFrom+", Destination: "+destination+", Flight Name: "+flightName+", Flight No.: "+flightNum+", Date of Departure: "+dateOfDeparture+", Date of Arrival: "+dateOfArrival+", Time of Departure: "+timeOfDeparture+", Time of Arrival: "+timeOfArrival);

    }
}
class AirIndia extends Flight{
    void flightCompany(){
        pnr = "2";
        departureFrom = "Delhi";
        destination = "Kolkata";
        flightName = "Air India";
        flightNum = "2";
        dateOfDeparture = "2 Dec, 2021";
        dateOfArrival = "2 Dec, 2021";
        timeOfDeparture = "1:00 PM";
        timeOfArrival = "2:30 PM";
        System.out.print("PNR: "+pnr+", Departure: "+departureFrom+", Destination: "+destination+", Flight Name: "+flightName+", Flight No.: "+flightNum+", Date of Departure: "+dateOfDeparture+", Date of Arrival: "+dateOfArrival+", Time of Departure: "+timeOfDeparture+", Time of Arrival: "+timeOfArrival);

    }
}

class Indigo extends Flight{
    void flightCompany(){
        pnr = "3";
        departureFrom = "Mumbai";
        destination = "Bangalore";
        flightName = "Indigo";
        flightNum = "3";
        dateOfDeparture = "3 Dec, 2021";
        dateOfArrival = "3 Dec, 2021";
        timeOfDeparture = "1:00 PM";
        timeOfArrival = "2:30 PM";
        System.out.print("PNR: "+pnr+", Departure: "+departureFrom+", Destination: "+destination+", Flight Name: "+flightName+", Flight No.: "+flightNum+", Date of Departure: "+dateOfDeparture+", Date of Arrival: "+dateOfArrival+", Time of Departure: "+timeOfDeparture+", Time of Arrival: "+timeOfArrival);

    }
}

abstract class Flight{
    String pnr;
    String departureFrom, destination;
    String flightName;
    String flightNum;
    String dateOfDeparture, timeOfDeparture, dateOfArrival, timeOfArrival;
    abstract void flightCompany();

}
