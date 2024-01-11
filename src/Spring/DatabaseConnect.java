package Spring;


import java.sql.*;
import java.util.List;

public class DatabaseConnect {
    public static void main(String[] args) {
        //dburl
        //Communications link failure
        //ssl -> https 요청
        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
        String username = "root";
        String pw = "1234";

        try (Connection conn = DriverManager.getConnection(url, username, pw)) {


            String insert = "insert into author values(3,'test3')";
            String select = "select * from author;";


            Statement st = conn.createStatement();
            //st.execute(insert);
            ResultSet rs = st.executeQuery(select);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("id : "+id+" name : "+name);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
