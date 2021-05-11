/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Admin
 */
public class Search {
    String SQL = new String();
    
    public String searchAll(String Table_name, String Ordered_column) {
        if (Ordered_column == null)
            SQL = "Select * From " + Table_name;
        else {
            if (Table_name == null)
                throw new NullPointerException("Table_name is null");
            SQL = "Select * From " + Table_name + " Ordered by " + Ordered_column;
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
        SQL = "Insert into Reference (Link, Note) Values (" + Link + ", " + Note + ");";  //Reference is the placeholder table name
        return SQL;
    }
    public String deleteReference(String Link) {
        if (Link == null) 
            throw new NullPointerException("Null value");
        SQL = "Delete From Reference Where Link = '" + Link + "'";
        return SQL;
    }
    public String editReference(String Link, String Note) {
        if (Link == null || Note == null) 
            throw new NullPointerException("Null value");
        SQL = "Update Reference Set Note = " + Note + " Where Link = " + Link;
        return SQL;
    }
    
    
    public String editScore(String subject, String inclass, String midterm, String finals) {
        if (subject == null || inclass == null || midterm == null || finals == null) 
            throw new NullPointerException("Null value");
        SQL = "Update ScoreList Set In-class = " + inclass + ", Midterm = " + 
                midterm + ", Finals = " + finals + " Where Subject = '" + subject + "'";
        return SQL;
    }
    /*
    public String seeScoreDetail(String subject) {
        if (subject == null) 
            throw new NullPointerException("Null value");
        SQL = "Select * From ScoreDetail Where Subject = " + subject;
        return SQL;
    }
    */
    
    public String loginStudent(String username, String password) {
        if (username == null || password == null) 
            throw new NullPointerException("Null value");
        SQL = "jdbc:mysql://localhost=1434;databaseName=Student;user=" + username + ";password=" + password;
        return SQL;
    }
    public String loginLecturer(String username, String password) {
        if (username == null || password == null) 
            throw new NullPointerException("Null value");
        SQL = "jdbc:mysql://localhost=1434;databaseName=Lecturer;user=" + username + ";password=" + password;
        return SQL;
    }
    
    public String addVideo(String Title, String Note) {
        if (Title == null || Note == null) 
            throw new NullPointerException("Null value");
        SQL = "Insert into Video (Title, Note) Values (" + Title + ", " + Note + ");";  //Video is the placeholder table name
        return SQL;
    }
}
