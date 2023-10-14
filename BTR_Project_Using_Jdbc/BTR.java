package BTR_Project_Using_Jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class BTR {
    public static void main(String[] args) throws SQLException {
        Scanner in = new Scanner(System.in);
        BusObjects obj = new BusObjects();
        obj.displayBusInfo();
        int choice = 1;
        while(choice == 1){
            System.out.println("Enter 1 to Book ticket and 2 to exit : ");
            choice = in.nextInt();
            Booking bookings  = new Booking();
            if(bookings.isAvailable()){
                BookingObjects ob3 = new BookingObjects();
                ob3.addBooking(bookings);
                System.out.println("Your Booking is Confirmed.");
            }
            else
                System.out.println("Sorry! Booking is full. Try to Book in another Bus or Date.");
        }
    }
}

