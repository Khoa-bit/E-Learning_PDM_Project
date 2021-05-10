/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import javax.swing.JFrame;

/**
 *
 * @author galactyx
 */
public class MainAdmin {
    private static final JFrame frame = new JFrame("JFrame Example");
    private static final F1_HomePage f1_HomePage = new F1_HomePage();
    private static final F2_Lecturer f2_Lecturer = new F2_Lecturer();
    private static final F3_EditLecturerDetail f3_EditLecturerDetail = new F3_EditLecturerDetail();
    private static final F4_Student f4_Student = new F4_Student();
    private static final F5_Semester f5_Semester = new F5_Semester();
    private static final F7_EditSemesterAdd f7_EditSemesterAdd = new F7_EditSemesterAdd();
    private static final F8_Department f8_Department = new F8_Department();
    private static final F9_EditDepartment f9_EditDepartment = new F9_EditDepartment();
    private static final FA_EditDepartmentAdd fA_EditDepartmentAdd = new FA_EditDepartmentAdd();
    private static final FB_Major fB_Major = new FB_Major();
    private static final FC_EditMajor fC_EditMajor = new FC_EditMajor();
    private static final FD_EditMajorAdd fD_EditMajorAdd = new FD_EditMajorAdd();

    public static void main(String[] args){  
        frame.setSize(1000, 720);
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);

        goToLecturer();
    }

    public static void goToHome() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(f1_HomePage);
        frame.getContentPane().revalidate();
        frame.repaint();
    }

    public static void goToLecturer() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(f2_Lecturer);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToEditLecturerDetail() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(f3_EditLecturerDetail);
        frame.getContentPane().revalidate();
        frame.repaint();
    }

    public static void goToStudent() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(f4_Student);
        frame.getContentPane().revalidate();
        frame.repaint();
    }

    public static void goToSemester() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(f5_Semester);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToEditSemesterAdd() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(f7_EditSemesterAdd);
        frame.getContentPane().revalidate();
        frame.repaint();
    }

    public static void goToDepartment() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(f8_Department);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToEditDepartment() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(f9_EditDepartment);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToEditDepartmentAdd() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(fA_EditDepartmentAdd);
        frame.getContentPane().revalidate();
        frame.repaint();
    }

    public static void goToMajor() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(fB_Major);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToEditMajor() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(fC_EditMajor);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToEditMajorAdd() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(fD_EditMajorAdd);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
}
