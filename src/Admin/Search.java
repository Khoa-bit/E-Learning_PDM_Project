/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;
import User.*;
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
            SQL = "Select * From " + Table_name + " Order by " + Ordered_column + " ASC;";
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
            SQL = "Select * From " + Table_name + " Where " + Column_name + " = '" + value + "'";
        }
        return SQL;
    }
    
    
    public String addReference(String Link, String Note) {
        if (Link == null || Note == null) 
            throw new NullPointerException("Null value");
        SQL = "Insert into reference (Link, Note) Values ('" + Link + "', '" + Note + "');";  //Reference is the placeholder table name
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
        SQL = "Update reference Set Note = '" + Note + "' Where Link = '" + Link + "'";
        return SQL;
    }
    public String editScore(String class_id, String student_id, String inclass, String midterm, String finals,
        String inclass_percentage, String midterm_percentage, String final_percentage) {
            if (class_id == null || student_id == null || (inclass == null && midterm == null && finals == null
                 && inclass_percentage == null && midterm_percentage == null)) 
            throw new NullPointerException("Null value");
        StringBuilder str = new StringBuilder();
        boolean hasOne = false;
        str.append("Update score Set ");
        if (inclass != null) {
            str.append("in_class_score = '").append(inclass).append("'");
            hasOne = true;
        }
        if (midterm != null) {
            if (hasOne)
                str.append(", ");
            str.append("midterm_score = '").append(midterm).append("'");
            hasOne = true;
        }
        if (finals != null) {
            if (hasOne)
                str.append(", ");
            str.append("final_score = '").append(finals).append("'");
            hasOne = true;
        }
        if (inclass_percentage != null) {
            if (hasOne)
                str.append(", ");
            str.append("in_class_percentage = '").append(inclass_percentage).append("'");
            hasOne = true;
        }
        if (midterm_percentage != null) {
            if (hasOne)
                str.append(", ");
            str.append("midterm_percentage = '").append(midterm_percentage).append("'");
            hasOne = true;
        }
        if (final_percentage != null) {
            if (hasOne)
                str.append(", ");
            str.append("final_percentage = '").append(final_percentage).append("'");
            hasOne = true;
        }
        str.append(" Where class_id = '").append(class_id).append("'").append(" AND student_id = '")
                .append(student_id).append("'");
        return str.toString();
    }
    public String editStudent(String fullname, String date_of_birth, String gender, String email, String phone, 
            String student_id, String department_id, String major_id) {
        if (fullname == null && date_of_birth == null && gender == null && email == null 
                && department_id == null && major_id == null || student_id == null) 
            throw new NullPointerException("Null value");
        StringBuilder firstname = new StringBuilder();
        StringBuilder middlename = new StringBuilder();
        StringBuilder lastname = new StringBuilder();
        int i = 0;
        for (;fullname != null && i < fullname.length() && fullname.charAt(i) != ' '; i++) {
            firstname.append(fullname.charAt(i));
        }
        i++;
        for (;fullname != null && i < fullname.length() && fullname.charAt(i) != ' '; i++) {
            middlename.append(fullname.charAt(i));
        }
        i++;
        if (i >= fullname.length() - 1) {
            lastname = middlename;
            middlename = middlename.delete(0, 100);
        }
        else {
            for (; i < fullname.length() && fullname != null && i < fullname.length(); i++) {
                lastname.append(fullname.charAt(i));
            }
        }
        
        StringBuilder day = new StringBuilder();
        StringBuilder month = new StringBuilder();
        StringBuilder year = new StringBuilder();
        i = 0;
        for (;date_of_birth != null && i < date_of_birth.length() && date_of_birth.charAt(i) != '/'; i++) {
            day.append(date_of_birth.charAt(i));
        }
        i++;
        for (;date_of_birth != null && i < date_of_birth.length() && date_of_birth.charAt(i) != '/'; i++) {
            month.append(date_of_birth.charAt(i));
        }
        i++;
        for (;date_of_birth != null && i < date_of_birth.length() && i < date_of_birth.length(); i++) {
            year.append(date_of_birth.charAt(i));  
        }
        
        StringBuilder str = new StringBuilder();
        str.append("Update student Set ");
        boolean hasOne = false;
        boolean firstNameExist = false;
        if (firstname.toString() != null && firstname.toString().length() > 0) {
            str.append(" first_name = '").append(firstname.toString()).append("'");
            hasOne = true;
            firstNameExist = true;
        }
        if (middlename.toString() != null && firstNameExist) {
            if (hasOne)
                str.append(", ");
            str.append("middle_name = '").append(middlename.toString()).append("'");
            hasOne = true;
        }
        if (lastname.toString() != null && firstNameExist) {
            if (hasOne)
                str.append(", ");
            str.append("last_name = '").append(lastname.toString()).append("'");
            hasOne = true;
        }
        if (gender != null) {
            if (hasOne)
                str.append(", ");
            str.append("gender = '").append(gender).append("'");
            hasOne = true;
        }
        if (day.toString() != null && day.toString().length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("day = '").append(day.toString()).append("'");
            hasOne = true;
        }
        if (month.toString() != null && month.toString().length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("month = '").append(month.toString()).append("'");
            hasOne = true;
        }
        if (year.toString() != null && year.toString().length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("year = '").append(year.toString()).append("'");
            hasOne = true;
        }
        if (email != null && email.length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("email = '").append(email).append("'");
            hasOne = true;
        }
        if (phone != null && phone.length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("phone = '").append(phone).append("'");
            hasOne = true;
        }
        if (major_id != null && major_id.length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append(", major_id = '").append(major_id).append("'");
            hasOne = true;
        }
        str.append(" Where student_id = '").append(student_id).append("'");
        /*if (password != null) {
            str.append("; Update student_username Set password = '").append(password)
                    .append("'").append(" Where student_id = '").append(student_id).append("'");
        }*/
        /*if (department_id != null)
            str.append("; Update major Set department_id = ").append(department_id).append(" Where major_id = ")
                    .append(major_id);*/
        //str.append("; Commit;");
        /*SQL = "Begin Transaction; Update student Set first_name = " + firstname.toString() + ", middle_name = " + middlename.toString()
                + ", last_name = " + lastname.toString() + ", gender = " + gender + ", date_birth = " + date_of_birth + ", email = " + email + ", phone = "
                + phone + " Where student_id = " + student_id + "; Update student_username Set password = " + password 
                + " Where student_id = " + student_id + "; Commit;";*/
        return str.toString();
    }
    public String editStudentPassword(String password, String student_id) {
        StringBuilder str = new StringBuilder();
        if (password != null && password.length() > 0) {
            str.append("Update student_username Set password = '").append(password)
                    .append("'").append(" Where student_id = '").append(student_id).append("'");
            return str.toString();
        }
        else {
            return null;
        }
    }
    public String editLecturer(String fullname, String date_of_birth, String gender, String email, String phone, 
            String lecturer_id, String department_id) {
        if (fullname == null && date_of_birth == null && gender == null && email == null 
                && department_id == null|| lecturer_id == null) 
            throw new NullPointerException("Null value");
        StringBuilder firstname = new StringBuilder();
        StringBuilder middlename = new StringBuilder();
        StringBuilder lastname = new StringBuilder();
        int i = 0;
        for (;fullname != null && i < fullname.length() && fullname.charAt(i) != ' '; i++) {
            firstname.append(fullname.charAt(i));
        }
        i++;
        for (;fullname != null && i < fullname.length() && fullname.charAt(i) != ' '; i++) {
            middlename.append(fullname.charAt(i));
        }
        i++;
        if (i >= fullname.length() - 1) {
            lastname = middlename;
            middlename = middlename.delete(0, 100);
        }
        else {
            for (; i < fullname.length() && fullname != null && i < fullname.length(); i++) {
                lastname.append(fullname.charAt(i));
            }
        }
        
        StringBuilder day = new StringBuilder();
        StringBuilder month = new StringBuilder();
        StringBuilder year = new StringBuilder();
        i = 0;
        for (;date_of_birth != null && i < date_of_birth.length() && date_of_birth.charAt(i) != '/'; i++) {
            day.append(date_of_birth.charAt(i));
        }
        i++;
        for (;date_of_birth != null && i < date_of_birth.length() && date_of_birth.charAt(i) != '/'; i++) {
            month.append(date_of_birth.charAt(i));
        }
        i++;
        for (;date_of_birth != null && i < date_of_birth.length() && i < date_of_birth.length(); i++) {
            year.append(date_of_birth.charAt(i));  
        }
        StringBuilder str = new StringBuilder();
        boolean hasOne = false;
        boolean firstNameExist = false;
        str.append("Update Lecturer Set");
        if (firstname.toString() != null && firstname.toString().length() > 0) {
            str.append(" first_name = '").append(firstname.toString()).append("'");
            hasOne = true;
            firstNameExist = true;
        }
        if (middlename.toString() != null && firstNameExist) {
            if (hasOne)
                str.append(", ");
            str.append("middle_name = '").append(middlename.toString()).append("'");
            hasOne = true;
        }
        if (lastname.toString() != null && firstNameExist) {
            if (hasOne)
                str.append(", ");
            str.append("last_name = '").append(lastname.toString()).append("'");
            hasOne = true;
        }
        if (gender != null) {
            if (hasOne)
                str.append(", ");
            str.append("gender = '").append(gender).append("'");
            hasOne = true;
        }
        if (day.toString() != null && day.toString().length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("day_birth = '").append(day.toString()).append("'");
            hasOne = true;
        }
        if (month.toString() != null && month.toString().length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("month_birth = '").append(month.toString()).append("'");
            hasOne = true;
        }
        if (year.toString() != null && year.toString().length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("year_birth = '").append(year.toString()).append("'");
            hasOne = true;
        }
        if (email != null && email.length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("email = '").append(email).append("'");
            hasOne = true;
        }
        if (phone != null && phone.length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("phone = '").append(phone).append("'");
            hasOne = true;
        }
        if (department_id != null && department_id.length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("department_id = '").append(department_id).append("'");
            hasOne = true;
        }
        str.append(" Where lecturer_id = '").append(lecturer_id).append("'");
        
        /*if (password != null && password.length() > 0)
            str.append("; Update lecturer_username Set password = '").append(password).append("'")
                    .append(" Where lecturer_id = '").append(lecturer_id).append("'").append("; Commit;");
        else
            str.append("; Commit;");*/
        /*SQL = "Begin Transaction; Update lecturer Set first_name = " + firstname.toString() + ", middle_name = " + middlename.toString()
                + ", last_name = " + lastname + ", gender = " + gender + ", date_birth = " + date_of_birth + ", email = " + email + ", phone = "
                + phone + " Where lecturer_id = " + lecturer_id + "; Update lecturer_username Set password = " + password 
                + " Where lecturer_id = " + lecturer_id + "; Commit;";*/
        return str.toString();
    }
    public String editLecturerPassword(String password, String lecturer_id) {
        StringBuilder str = new StringBuilder();
        if (password != null && password.length() > 0){
            str.append("Update lecturer_username Set password = '").append(password).append("'")
                    .append(" Where lecturer_id = '").append(lecturer_id).append("'");
            return str.toString();
        }
        else
            return null;
    }
    /*
    public String seeScoreDetail(String subject) {
        if (subject == null) 
            throw new NullPointerException("Null value");
        SQL = "Select * From ScoreDetail Where Subject = " + subject;
        return SQL;
    }
    */
    public String editSemester(String semester_name, String date_start, String date_end) {
        StringBuilder day_start = new StringBuilder();
        StringBuilder month_start = new StringBuilder();
        StringBuilder year_start = new StringBuilder();
        int i = 0;
        if (date_start == null || date_end == null)
            throw new NullPointerException("Null values");
        for (;date_start != null && i < date_start.length() && date_start.charAt(i) != '/'; i++) {
            day_start.append(date_start.charAt(i));
        }
        i++;
        for (;date_start != null && i < date_start.length() && date_start.charAt(i) != '/'; i++) {
            month_start.append(date_start.charAt(i));
        }
        i++;
        for (; i < date_start.length() && date_start != null; i++) {
            year_start.append(date_start.charAt(i));  
        }
        StringBuilder day_end = new StringBuilder();
        StringBuilder month_end = new StringBuilder();
        StringBuilder year_end = new StringBuilder();
        i = 0;
        for (;date_end != null && i < date_end.length() && date_end.charAt(i) != '/'; i++) {
            day_end.append(date_end.charAt(i));
        }
        i++;
        for (;date_end != null && i < date_end.length() && date_end.charAt(i) != '/'; i++) {
            month_end.append(date_end.charAt(i));
        }
        i++;
        for (; i < date_end.length() && date_end != null; i++) {
            year_end.append(date_end.charAt(i));  
        }
        StringBuilder str = new StringBuilder();
        boolean hasOne = false;
        str.append("Update semester Set ");
        if (day_start.toString() != null && day_start.toString().length() > 0) {
            str.append("day_start = '").append(day_start.toString()).append("'");
            hasOne = true;
        }
        if (month_start.toString() != null && month_start.toString().length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("month_start = '").append(month_start.toString()).append("'");
            hasOne = true;
        }
        if (year_start.toString() != null && year_start.toString().length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("year_start = '").append(year_start.toString()).append("'");
            hasOne = true;
        }
        if (day_end.toString() != null && day_end.toString().length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("day_end = '").append(day_end.toString()).append("'");
            hasOne = true;
        }
        if (month_end.toString() != null && month_end.toString().length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("month_end = '").append(month_end.toString()).append("'");
            hasOne = true;
        }
        if (year_end.toString() != null && year_end.toString().length() > 0) {
            if (hasOne)
                str.append(", ");
            str.append("year_end = '").append(year_end.toString()).append("'");
            hasOne = true;
        }
        str.append(" Where semester_name = '").append(semester_name).append("'");
        /*SQL = "Update semester Set day_start = " + day_start + ", month_start = " + month_start + ", year_start = "
                + year_start + ", day_end = " + day_end + ", month_end = " + month_end + ", year_end = " 
                + year_end + " Where semester_name = " + semester_name;*/
        return str.toString();
    }
    public String editDepartment(String department_id, String department_name) {
        if (department_id == null || department_name == null) {
            throw new NullPointerException("Null value");
        }
        SQL = "Update department Set department_name = '" + department_name + "' Where department_id = '" 
                + department_id + "'";
        return SQL;
    }
    
    
    public String addLoginStudent(String username, String password) {
        if (username == null || password == null) 
            throw new NullPointerException("Null value");
        SQL = "Insert into student_username (student_id, password) Values ('" + username + "', '" + password + "')";
        return SQL;
    }
    public String addLoginLecturer(String username, String password) {
        if (username == null || password == null) 
            throw new NullPointerException("Null value");
        SQL = "Insert into lecturer_username (student_id, password) Values ('" + username + "', '" + password + "')";
        return SQL;
    }
    public String addSemester(String semester_name, String date_start, String date_end) {
        StringBuilder day_start = new StringBuilder();
        StringBuilder month_start = new StringBuilder();
        StringBuilder year_start = new StringBuilder();
        int i = 0;
        for (;date_start != null && i < date_start.length() && date_start.charAt(i) != '/'; i++) {
            day_start.append(date_start.charAt(i));
        }
        i++;
        for (;date_start != null && i < date_start.length() && date_start.charAt(i) != '/'; i++) {
            month_start.append(date_start.charAt(i));
        }
        i++;
        for (; i < date_start.length() && date_start != null; i++) {
            year_start.append(date_start.charAt(i));  
        }
        StringBuilder day_end = new StringBuilder();
        StringBuilder month_end = new StringBuilder();
        StringBuilder year_end = new StringBuilder();
        i = 0;
        for (;date_end != null && i < date_end.length() && date_end.charAt(i) != '/'; i++) {
            day_end.append(date_end.charAt(i));
        }
        i++;
        for (;date_end != null && i < date_end.length() && date_end.charAt(i) != '/'; i++) {
            month_end.append(date_end.charAt(i));
        }
        i++;
        for (; i < date_end.length() && date_end != null; i++) {
            year_end.append(date_end.charAt(i));  
        }
        SQL = "Insert into semester(semester_name, day_start, month_start, year_start, day_end, month_end, year_end) "
                + "Values ('" + semester_name + "', '" + Integer.parseInt(day_start.toString()) + "', '" + 
                Integer.parseInt(month_start.toString()) + "', '" + Integer.parseInt(year_start.toString()) + "', '" + 
                Integer.parseInt(day_end.toString()) + "', '" + Integer.parseInt(month_end.toString()) + "', '" + Integer.parseInt(year_end.toString()) + "')";
        return SQL;
    }
    public String addDepartment(String department_id, String department_name) {
        if (department_id == null || department_name == null)
            throw new NullPointerException("Null value");
        SQL = "Insert into department(department_id, department_name) Values ('" + 
                department_id + "', '" + department_name + "')";
        return SQL;
    }
            
    public boolean loginStudent(String username, String password) {
        if (username == null || password == null) {
            throw new NullPointerException("Null values");
        }
        //String connectionUrl = connectDB("root", "12345Abc");
        try (Connection con = connectDB(/*"jdbc:mysql://localhost=3306/E_Learning_Platform", */username, password); Statement stmt = con.createStatement();) {
            SQL = "Select * From student_username Where student_id = " + "'" + username 
                    + "'";
            ResultSet rs = stmt.executeQuery(SQL);
            if (rs.getObject(2).equals(password))
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
            SQL = "Select * From lecturer_username Where lecturer_id = " + "'" + username 
                    + "'";
            ResultSet rs = stmt.executeQuery(SQL);
            if (rs.getObject(2).equals(password))
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
        SQL = "Insert into video (Title, Note) Values ('" + Title + "', '" + Note + "');";  //Video is the placeholder table name
        return SQL;
    }
}
