/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import User.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ConnectMySQL {

    String DB_URL = "jdbc:mysql://localhost:3306/E_Learning_Platform";
    String USER_NAME = "root";
    String PASSWORD = "123456";

    public static Connection getConnection(String dbURL, String userName,
            String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            //System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }

    public void run_query(String query) {
        try {
            // connnect to database 'testdb'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);

            // crate statement
            Statement stmt = conn.createStatement();

            // get data from table 'student'
            ResultSet rs = stmt.executeQuery(query);

            // show data
            /*while (rs.next()) {
                System.out.println(rs.getString(1) + ", " + rs.getString(2) + 
                        ", " + rs.getString(3) + ", " + rs.getString(4));
            }*/
            // Data will be here!
            StringBuilder results = new StringBuilder();
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            for (int i = 1; i <= numberOfColumns; i++) {
                results.append(metaData.getColumnName(i)).append("\t");
            }
            results.append("\n");
            //  Metadata
            while (rs.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    results.append(rs.getObject(i)).append("\t");
                }
                results.append("\n");
            }

            // Print out result
            System.out.println(results.toString());

            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String[] get_query(String query) {
        String[] failed = new String[1];
        try {
            // connnect to database 'testdb'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);

            // crate statement
            Statement stmt = conn.createStatement();

            // get data from table 'student'
            ResultSet rs = stmt.executeQuery(query);

            ArrayList<String> test_depart_id = new ArrayList<>();

            // Data will be here!
            StringBuilder results = new StringBuilder();
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();

            //  Metadata
            while (rs.next()) {
                for (int i = 1; i <= numberOfColumns; i++) {
                    test_depart_id.add(String.valueOf(rs.getObject(i)));
                }
            }

            String[] result_arr = new String[test_depart_id.size()];

            for (int i = 0; i < test_depart_id.size(); i++) {
                result_arr[i] = test_depart_id.get(i);
            }

            // close connection
            conn.close();

            return result_arr;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return failed;
    }
    public void set_query(String query) {

        try {
            // connnect to database 'testdb'
            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);

            // crate statement
            Statement stmt = conn.createStatement();


            stmt.executeUpdate(query);

           
            // close connection
            conn.close();


        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
    
    //Singleton
    private static final ConnectMySQL connectMySQL = new ConnectMySQL();
    private ConnectMySQL(){}
    public static ConnectMySQL getConnectMySQL(){
        return connectMySQL;
    }

}
