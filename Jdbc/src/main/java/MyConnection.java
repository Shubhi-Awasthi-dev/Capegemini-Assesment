import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MyConnection {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC", "root", "2004@Nitya");


//            PreparedStatement ps = con.prepareStatement(
//                    "select * from customers where name=? and phone=?"
//            );
//
//
//            ps.setString(1, "Priya Singh");
//            ps.setLong(2, 9876501234L);
//
//            ResultSet rs = ps.executeQuery();
//
//
//            if (rs.next()) {
//                System.out.println(rs.getString("name") + "\t" + rs.getLong("phone") + "\t" + rs.getDate("created_date"));
//            } else {
//                System.out.println("Customer Not Found");
//            }
//            PreparedStatement ps = con.prepareStatement(
//                    "insert into customers (id, name, phone, created_date, balance) values (?, ?, ?, ?, ?)"
//            );
//
//            ps.setInt(1, 16);
//            ps.setString(2, "Saurabh");
//            ps.setLong(3, 9999596047L);
//            ps.setDate(4, java.sql.Date.valueOf("2026-02-25"));
//            ps.setInt(5, 1200);
//
//            int rows = ps.executeUpdate();
//
//            if (rows > 0) {
//                System.out.println("Customer Created...");
//            } else {
//                System.out.println("Customer Not Created...");
//            }
//            delete

//            PreparedStatement ps =
//                    con.prepareStatement("delete from customers where id = ?");
//            ps.setInt(1, 1);
//
//            int rows = ps.executeUpdate();
//
//            if (rows > 0) {
//                System.out.println("Customer Deleted Successfully");
//            } else {
//                System.out.println("Customer ID Not Found");
//            }

            PreparedStatement ps = con.prepareStatement("update customers set name = ?, phone = ?, balance = ? where id = ?");

            ps.setString(1, "Saurabh Sharma");
            ps.setLong(2, 8887776665L);
            ps.setInt(3, 2000);
            ps.setInt(4, 16);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println(" Updated");
            } else {
                System.out.println("Customer ID Not Found");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}