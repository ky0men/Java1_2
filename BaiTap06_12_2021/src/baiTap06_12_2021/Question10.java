package baiTap06_12_2021;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Question10 {
    private static String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName = Students_PPDIEN";
    private static String USER = "sa";
    private static String PW;

    public static void searchByIdAndName(Connection conn, Scanner sc) {
        ResultSet rs = null;
        CallableStatement cstm = null;
        try {
            cstm = conn.prepareCall("{call search_id_and_name(?, ?)}");
            System.out.print("Input student ID: ");
            String id = sc.nextLine();
            System.out.print("Input student full name: ");
            String name = sc.nextLine();
            cstm.setString(1, id);
            cstm.setString(2, name);
            rs = cstm.executeQuery();
            if (rs.next()) {
                System.out.println("Student found: ");
                System.out.printf("\n%s | %-16s | %-7s | %-12s | %d", rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getDate(4), rs.getInt(5));
            } else {
                System.out.println("Can not found student id: " + id + " and name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (cstm != null) {
                try {
                    cstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your SQL Server password: ");
        PW = sc.nextLine();
        Connection conn = Question8.getConnection(DB_URL, USER, PW);
        searchByIdAndName(conn, sc);
    }
}
