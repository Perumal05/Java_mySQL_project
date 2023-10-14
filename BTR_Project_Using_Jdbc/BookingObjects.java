package BTR_Project_Using_Jdbc;
import java.sql.ResultSet;
import java.sql.*;
import java.util.Date;
public class BookingObjects{
    public int getBookCount(int id,Date date) throws SQLException{
        Connection con = DataBaseConnection.getConnection();
        String query = "Select count(passengerName) from Booking where busNo = ? and Travel_date = ?";
        PreparedStatement st = con.prepareStatement(query);
        java.sql.Date Date1 = new java.sql.Date(date.getTime());
        st.setInt(1,id);
        st.setDate(2,Date1);
        ResultSet rs = st.executeQuery();
        rs.next();
        return rs.getInt(1);
    }

    public void addBooking(Booking bookings) throws SQLException{
        Connection con = DataBaseConnection.getConnection();
        String query = "insert into Booking values(?,?,?)";
        PreparedStatement st = con.prepareStatement(query);

        st.setString(1,bookings.passengerName);
        st.setInt(2,bookings.busNo);
        java.sql.Date Date2 = new java.sql.Date(bookings.date.getTime());
        st.setDate(3,Date2);

        st.executeUpdate();
    }
}
