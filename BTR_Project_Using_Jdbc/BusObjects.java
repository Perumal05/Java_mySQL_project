package BTR_Project_Using_Jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusObjects {
    public void displayBusInfo() throws SQLException {

        String query = "Select * from Bus";
        Connection con = DataBaseConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()){
            System.out.println("************* " + rs.getString(2) + " ************");
            System.out.println("BusNo : " + rs.getInt(1));
            if(rs.getInt(3)==1)
                System.out.println("AC : Yes");
            else
                System.out.println("AC : No");
            System.out.println("Bus Capacity : " + rs.getInt(4));
        }
        System.out.println("------------------------------------------------------");
    }

    public int getBusCapacity(int id) throws SQLException{
        String query = "Select capacity from Bus where busNo = " + id;
        Connection con = DataBaseConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        return rs.getInt(1);
    }
}
