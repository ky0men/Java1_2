package baiTap06_12_2021;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Question9 {
    private static String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName = Students_PPDIEN";
    private static String USER = "sa";
    private static String PW;

    public static void updateStudent(Connection conn, Scanner sc) {
        ResultSet rs = null;
        CallableStatement cstm = null;
        Statement st = null;
        try {
            cstm = conn.prepareCall("{call update_student_info(?, ?)}");
            System.out.print("Input student ID to update: ");
            String id = sc.nextLine();
            System.out.print("Update student name: ");
            String name = sc.nextLine();
            cstm.setString(1, id);
            cstm.setString(2, name);
            int isValid = cstm.executeUpdate();

            if (isValid != 0) {
                System.out.println("Update successfull. Student information after update: ");
                st = conn.createStatement();
                rs = st.executeQuery("SELECT * FROM Student WHERE IDStud = '" + id + "'");
                while (rs.next()) {
                    System.out.printf("\n%s | %-16s | %-7s | %-12s | %d", rs.getString(1), rs.getString(2),
                            rs.getString(3), rs.getDate(4), rs.getInt(5));
                }
            } else {
                System.out.println("Update failed. Can not found student id: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (cstm != null) {
                    cstm.close();
                }
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your SQL Server password: ");
        PW = sc.nextLine();
        Connection conn = Question8.getConnection(DB_URL, USER, PW);
        updateStudent(conn, sc);
    }
}
