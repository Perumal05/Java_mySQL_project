package BTR_Project_Using_Jdbc;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String passengerName;
    int busNo;
    Date date;
    Booking()  {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Name :");
        passengerName = in.nextLine();
        System.out.println("Enter the BusNo you want to travel : ");
        busNo = in.nextInt();
        System.out.println("Enter the Date [dd-MM-yyyy] : ");
        String DateInput = in.next();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = df.parse(DateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isAvailable() throws SQLException {
        int tempCapacity = 0;
        BusObjects ob1 = new BusObjects();
        tempCapacity = ob1.getBusCapacity(busNo);

        int booked = 0;
        BookingObjects ob2 = new BookingObjects();
        booked = ob2.getBookCount(busNo,date);
        return booked < tempCapacity;
    }
}

