/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class Search {
    String SQL = new String();
    
    public String searchAll(String Table_name, String Ordered_column) {
        if (Table_name == null)
                throw new NullPointerException("Table_name is null");
        if (Ordered_column == null)
            SQL = "Select * From " + Table_name;
        else {
            SQL = "Select * From " + Table_name + " Ordered by " + Ordered_column + " ASC";
        }
        return SQL;
    }
    public String search (String Table_name, String Column_name, String Search_txt) {
        if (Search_txt == null)
            SQL = searchAll(Table_name, null);
        else {
            if (Table_name == null)
                throw new NullPointerException("Table_name is null");
            SQL = "Select * From " + Table_name + " Where " + Column_name + " Like '" + Search_txt + "'";
        }
        return SQL;
    }
    public String searchSort(String Table_name, String Column_name, String Search_txt, String Sort_criteria) {
        SQL = search(Table_name, Column_name, Search_txt);
        SQL += " Order by " + Sort_criteria;
        return SQL;
    }
    public String getColumn(String Table_name, String Column_name) {
        if (Column_name == null) {
            SQL = searchAll(Table_name, null);
        }
        else {
            if (Table_name == null)
                throw new NullPointerException("Table_name is null");
            SQL = "Select " + Column_name + " From " + Table_name;
        }
        return SQL;
    }
    public String getColumnSort(String Table_name, String Column_name, String Sort_criteria) {
        SQL = getColumn(Table_name, Column_name);
        SQL += " Order by " + Sort_criteria;
        return SQL;
    }
    public String getValue(String Table_name, String Column_name, String value) {
        if (value == null || Column_name == null) {
            SQL = searchAll(Table_name, null);
        }
        else {
            if (Table_name == null)
                throw new NullPointerException("Table_name is null");
            SQL = "Select * From " + Table_name + " Where " + Column_name + " = " + value;
        }
        return SQL;
    }
    
    
    public String addReference(String Link, String Note) {
        if (Link == null || Note == null) 
            throw new NullPointerException("Null value");
        SQL = "Insert into reference (Link, Note) Values (" + Link + ", " + Note + ");";  //Reference is the placeholder table name
        return SQL;
    }
    public String deleteReference(String Link) {
        if (Link == null) 
            throw new NullPointerException("Null value");
        SQL = "Delete From reference Where Link = '" + Link + "'";
        return SQL;
    }
    public String editReference(String Link, String Note) {
        if (Link == null || Note == null) 
            throw new NullPointerException("Null value");
        SQL = "Update reference Set Note = " + Note + " Where Link = " + Link;
        return SQL;
    }
    
    
    public String editScore(String subject, String inclass, String midterm, String finals) {
        if (subject == null || inclass == null || midterm == null || finals == null) 
            throw new NullPointerException("Null value");
        SQL = "Update score Set In-class = " + inclass + ", Midterm = " + 
                midterm + ", Finals = " + finals + " Where Subject = '" + subject + "'";
        return SQL;
    }
    public String editStudent(String fullname, String date_of_birth, String gender, String email, String phone, String password, String student_id) {
        if (fullname == null && date_of_birth == null && gender == null && email == null && password == null || student_id == null) 
            throw new NullPointerException("Null value");
        StringBuilder firstname = new StringBuilder();
        StringBuilder middlename = new StringBuilder();
        StringBuilder lastname = new StringBuilder();
        int i = 0;
        for (; fullname.charAt(i) == ' ' && fullname != null; i++) {
            firstname.append(fullname.charAt(i));
        }
        i++;
        for (; fullname.charAt(i) == ' ' && fullname != null; i++) {
            middlename.append(fullname.charAt(i));
        }
        i++;
        if (i >= fullname.length() - 1) {
            lastname = middlename;
            middlename = middlename.delete(0, 100);
        }
        else {
            for (; i < fullname.length() && fullname != null; i++) {
                lastname.append(fullname.charAt(i));
            }
        }
        StringBuilder day = new StringBuilder();
        StringBuilder month = new StringBuilder();
        StringBuilder year = new StringBuilder();
        i = 0;
        for (; date_of_birth.charAt(i) == '/' && date_of_birth != null; i++) {
            day.append(fullname.charAt(i));
        }
        i++;
        for (; date_of_birth.charAt(i) == '/' && date_of_birth != null; i++) {
            month.append(fullname.charAt(i));
        }
        i++;
        for (; i < date_of_birth.length() && date_of_birth != null; i++) {
            year.append(fullname.charAt(i));  
        }
        
        StringBuilder str = new StringBuilder();
        str.append("Begin Transaction; Update lecturer Set");
        if (firstname != null)
            str.append(" first_name = ").append(firstname.toString());
        if (middlename != null)
            str.append(", middle_name = ").append(middlename.toString());
        if (lastname != null)
            str.append(", last_name = ").append(lastname.toString());
        if (gender != null)
            str.append(", gender = ").append(gender);
        if (day != null)
            str.append(" day = ").append(day.toString());
        if (month != null)
            str.append(", month = ").append(month.toString());
        if (year != null)
            str.append(", year = ").append(year.toString());
        if (email != null)
            str.append(", email = ").append(email);
        if (phone != null)
            str.append(", phone = ").append(phone);
        str.append(" Where student_id = ").append(student_id);
        if (password != null)
            str.append("; Update student_username Set password = ").append(password).append(" Where student_id = ").append(student_id).append("; Commit;");
        else
            str.append("; Commit;");
        /*SQL = "Begin Transaction; Update student Set first_name = " + firstname.toString() + ", middle_name = " + middlename.toString()
                + ", last_name = " + lastname.toString() + ", gender = " + gender + ", date_birth = " + date_of_birth + ", email = " + email + ", phone = "
                + phone + " Where student_id = " + student_id + "; Update student_username Set password = " + password 
                + " Where student_id = " + student_id + "; Commit;";*/
        return str.toString();
    }
    public String editLecturer(String fullname, String date_of_birth, String gender, String email, String phone, String password, String lecturer_id) {
        if (fullname == null && date_of_birth == null && gender == null && email == null && password == null || lecturer_id == null) 
            throw new NullPointerException("Null value");
        StringBuilder firstname = new StringBuilder();
        StringBuilder middlename = new StringBuilder();
        StringBuilder lastname = new StringBuilder();
        int i = 0;
        for (; fullname.charAt(i) == ' ' && fullname != null; i++) {
            firstname.append(fullname.charAt(i));
        }
        i++;
        for (; fullname.charAt(i) == ' ' && fullname != null; i++) {
            middlename.append(fullname.charAt(i));
        }
        i++;
        if (i >= fullname.length() - 1) {
            lastname = middlename;
            middlename = middlename.delete(0, 100);
        }
        else {
            for (; i < fullname.length() && fullname != null; i++) {
                lastname.append(fullname.charAt(i));
            }
        }
        StringBuilder day = new StringBuilder();
        StringBuilder month = new StringBuilder();
        StringBuilder year = new StringBuilder();
        i = 0;
        for (; date_of_birth.charAt(i) == '/' && date_of_birth != null; i++) {
            day.append(fullname.charAt(i));
        }
        i++;
        for (; date_of_birth.charAt(i) == '/' && date_of_birth != null; i++) {
            month.append(fullname.charAt(i));
        }
        i++;
        for (; i < date_of_birth.length() && date_of_birth != null; i++) {
            year.append(fullname.charAt(i));  
        }
        StringBuilder str = new StringBuilder();
        str.append("Begin Transaction; Update lecturer Set");
        if (firstname != null)
            str.append(" first_name = ").append(firstname.toString());
        if (middlename != null)
            str.append(", middle_name = ").append(middlename.toString());
        if (lastname != null)
            str.append(", last_name = ").append(lastname.toString());
        if (gender != null)
            str.append(", gender = ").append(gender);
        if (day != null)
            str.append(" day = ").append(day.toString());
        if (month != null)
            str.append(", month = ").append(month.toString());
        if (year != null)
            str.append(", year = ").append(year.toString());
        if (email != null)
            str.append(", email = ").append(email);
        if (phone != null)
            str.append(", phone = ").append(phone);
        str.append(" Where lecturer_id = ").append(lecturer_id);
        if (password != null)
            str.append("; Update lecturer_username Set password = ").append(password).append(" Where lecturer_id = ").append(lecturer_id).append("; Commit;");
        else
            str.append("; Commit;");
        /*SQL = "Begin Transaction; Update lecturer Set first_name = " + firstname.toString() + ", middle_name = " + middlename.toString()
                + ", last_name = " + lastname + ", gender = " + gender + ", date_birth = " + date_of_birth + ", email = " + email + ", phone = "
                + phone + " Where lecturer_id = " + lecturer_id + "; Update lecturer_username Set password = " + password 
                + " Where lecturer_id = " + lecturer_id + "; Commit;";*/
        return str.toString();
    }
    /*
    public String seeScoreDetail(String subject) {
        if (subject == null) 
            throw new NullPointerException("Null value");
        SQL = "Select * From ScoreDetail Where Subject = " + subject;
        return SQL;
    }
    */
    
    public String addLoginStudent(String username, String password) {
        if (username == null || password == null) 
            throw new NullPointerException("Null value");
        SQL = "Insert into student_username (student_id, password) Values (" + username + ", " + password + ")";
        return SQL;
    }
    public String addLoginLecturer(String username, String password) {
        if (username == null || password == null) 
            throw new NullPointerException("Null value");
        SQL = "Insert into lecturer_username (student_id, password) Values (" + username + ", " + password + ")";
        return SQL;
    }
    public boolean loginStudent(String username, String password) {
        if (username == null || password == null) {
            throw new NullPointerException("Null values");
        }
        //String connectionUrl = connectDB("root", "12345Abc");
        try (Connection con = connectDB(/*"jdbc:mysql://localhost=3306/E_Learning_Platform", */username, password); Statement stmt = con.createStatement();) {
            SQL = "Select * From student_username Where student_id Like " + "'" + username 
                    + "'";
            ResultSet rs = stmt.executeQuery(SQL);
            if (rs.getObject(2) == password)
                return true;
        }
        catch (SQLException e) {
            System.out.println("Faulty");
        }
        return false;
    }
    public boolean loginLecture(String username, String password) {
        //String connectionUrl = connectDB("root", "12345Abc");
        try (Connection con = connectDB(/*"jdbc:mysql://localhost=3306/E_Learning_Platform", */username, password); Statement stmt = con.createStatement();) {
            SQL = "Select * From lecturer_username Where lecturer_id Like " + "'" + username 
                    + "'";
            ResultSet rs = stmt.executeQuery(SQL);
            if (rs.getObject(2) == password)
                return true;
        }
        catch (SQLException e) {
            System.out.println("Faulty");
        }
        return false;
    }
    
    /*public Connection connectDB(String username, String password) {
        if (username == null || password == null) 
            throw new NullPointerException("Null value");
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost=3306/E_Learning_Platform", username, password);
            //System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        //SQL = "jdbc:mysql://localhost=3306/e_learning_platform/?user=" + username + "&password=" + password + "&useUnicode=true&characterEncoding=UTF-8"; //Student is placeholder
        //SQL = "jdbc:mysql://localhost:3306/e_learning_platform?zeroDateTimeBehavior=CONVERT_TO_NULL";
        return conn;
    }*/
    public static Connection connectDB(/*String dbURL, */String userName, 
            String password) {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/E_Learning_Platform", userName, password);
            //System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
    /*
    public String loginLecturer(String username, String password) {
        if (username == null || password == null) 
            throw new NullPointerException("Null value");
        SQL = "jdbc:mysql://localhost=1434;databaseName=Lecturer;user=" + username + ";password=" + password;
        return SQL;
    }
*/
    
    public String addVideo(String Title, String Note) {
        if (Title == null || Note == null) 
            throw new NullPointerException("Null value");
        SQL = "Insert into video (Title, Note) Values (" + Title + ", " + Note + ");";  //Video is the placeholder table name
        return SQL;
    }
}
