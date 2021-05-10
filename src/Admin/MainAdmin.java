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
    private static final F3_EditLecturer f3_EditLecturerDetail = new F3_EditLecturer();
    private static final F4_Student f4_Student = new F4_Student();
    private static F5_EditStudent f5_EditStudent = new F5_EditStudent();
    private static F6_EditScoreDetail f6_EditScoreDetail = new F6_EditScoreDetail();
    private static F8_Semester f8_Semester = new F8_Semester();
    private static F9_EditSemester f9_EditSemester = new F9_EditSemester();
    private static final FA_EditSemesterAdd fA_EditSemesterAdd = new FA_EditSemesterAdd();
    private static final FB_Department fB_Department = new FB_Department();
    private static final FC_EditDepartment fC_EditDepartment = new FC_EditDepartment();
    private static final FD_EditDepartmentAdd fD_EditDepartmentAdd = new FD_EditDepartmentAdd();
    private static final FE_Major fE_Major = new FE_Major();
    private static final FF_EditMajor fF_EditMajor = new FF_EditMajor();
    private static final FG_EditMajorAdd fG_EditMajorAdd = new FG_EditMajorAdd();
    private static FH_Subject fH_Subject = new FH_Subject();
    private static FI_EditSubject fI_EditSubject = new FI_EditSubject();
    private static FJ_EditSubjectAdd fJ_EditSubjectAdd = new FJ_EditSubjectAdd();

    public static void main(String[] args){  
        frame.setSize(1000, 720);
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);

        goToHome();
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
    
    public static void goToEditStudent() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(f5_EditStudent);
        frame.getContentPane().revalidate();
        frame.repaint();
    }

    public static void goToEditScoreDetail() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(f6_EditScoreDetail);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToSemester() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(f8_Semester);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToEditSemester() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(f9_EditSemester);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToEditSemesterAdd() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(fA_EditSemesterAdd);
        frame.getContentPane().revalidate();
        frame.repaint();
    }

    public static void goToDepartment() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(fB_Department);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToEditDepartment() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(fC_EditDepartment);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToEditDepartmentAdd() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(fD_EditDepartmentAdd);
        frame.getContentPane().revalidate();
        frame.repaint();
    }

    public static void goToMajor() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(fE_Major);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToEditMajor() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(fF_EditMajor);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToEditMajorAdd() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(fG_EditMajorAdd);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToSubject(){
        frame.getContentPane().removeAll();
        frame.getContentPane().add(fH_Subject);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToEditSubject(){
        frame.getContentPane().removeAll();
        frame.getContentPane().add(fI_EditSubject);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    public static void goToEditSubjectDetail(){
        frame.getContentPane().removeAll();
        frame.getContentPane().add(fJ_EditSubjectAdd);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
}
