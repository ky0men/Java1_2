package baiTap06_12_2021;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Question8 {
    private static String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName = Students_PPDIEN";
    private static String USER = "sa";
    private static String PW;

    public static Connection getConnection(String DB_URL, String USER, String PW) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PW);
            System.out.println("Connect successfull!");
        } catch (SQLException e) {
            System.out.println("Connect failed!");
            e.printStackTrace();
        }
        return conn;
    }

    public static void displayAllStudents(Connection conn) {
        ResultSet rs;
        try {
            CallableStatement cstm = conn.prepareCall("{call display_all_students()}");
            rs = cstm.executeQuery();
            System.out.println("++++ Display all student information ++++");
            System.out.printf("\n%s | %-16s | %-7s | %-12s | %s", "StuID", "Student Name", "Gender", "Birthday",
                    "ID Science\n");
            while (rs.next()) {
                System.out.printf("\n%s | %-16s | %-7s | %-12s | %d", rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getDate(4), rs.getInt(5));
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your SQL Server password: ");
        PW = sc.nextLine();
        Connection conn = getConnection(DB_URL, USER, PW);
        displayAllStudents(conn);
        sc.close();
    }
}
