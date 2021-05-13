/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Stack;

/**
 *
 * @author galactyx
 */
public class MainAdmin {
    private static final JFrame frame = new JFrame("JFrame Example");
    private static final Stack<JPanel> panelStack = new Stack();
    
    private static final F1_HomePage f1_HomePage = new F1_HomePage();
    private static /*final*/ F2_Lecturer f2_Lecturer; //= new F2_Lecturer();
    private static final F3_EditLecturer f3_EditLecturerDetail = new F3_EditLecturer();
    private static /*final*/ F4_Student f4_Student; //= new F4_Student();
    private static final F5_EditStudent f5_EditStudent = new F5_EditStudent();
    private static final F6_EditScoreDetail f6_EditScoreDetail = new F6_EditScoreDetail();
    private static /*final*/ F8_Semester f8_Semester; //= new F8_Semester();
    private static final F9_EditSemester f9_EditSemester = new F9_EditSemester();
    private static final FA_EditSemesterAdd fA_EditSemesterAdd = new FA_EditSemesterAdd();
    private static /*final*/ FB_Department fB_Department; //= new FB_Department();
    private static final FC_EditDepartment fC_EditDepartment = new FC_EditDepartment();
    private static final FD_EditDepartmentAdd fD_EditDepartmentAdd = new FD_EditDepartmentAdd();
    private static final FE_Major fE_Major = new FE_Major();
    private static final FF_EditMajor fF_EditMajor = new FF_EditMajor();
    private static final FG_EditMajorAdd fG_EditMajorAdd = new FG_EditMajorAdd();
    private static final FH_Subject fH_Subject = new FH_Subject();
    private static final FI_EditSubject fI_EditSubject = new FI_EditSubject();
    private static final FJ_EditSubjectAdd fJ_EditSubjectAdd = new FJ_EditSubjectAdd();

    public static void main(String[] args){  
        frame.setSize(1000, 720);
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);
        
        goToHome();
    }

    public static void goToPanel(JPanel panel) {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.getContentPane().revalidate();
        frame.repaint();
        
        panelStack.push(panel);
        System.out.println(panelStack);
    }
    
    public static void goBack() {
        panelStack.pop();
        goToPanel(panelStack.pop());
    }

    public static void goToHome() {
        goToPanel(f1_HomePage);
    }

    public static void goToLecturer() {
        f2_Lecturer = new F2_Lecturer();
        goToPanel(f2_Lecturer);
    }
    
    public static void goToEditLecturerDetail() {
        goToPanel(f3_EditLecturerDetail);
    }

    public static void goToStudent() {
        f4_Student = new F4_Student();
        goToPanel(f4_Student);
    }
    
    public static void goToEditStudent() {
        goToPanel(f5_EditStudent);
    }

    public static void goToEditScoreDetail() {
        goToPanel(f6_EditScoreDetail);
    }
    
    public static void goToSemester() {
        f8_Semester = new F8_Semester();
        goToPanel(f8_Semester);
    }
    
    public static void goToEditSemester() {
        goToPanel(f9_EditSemester);
    }
    
    public static void goToEditSemesterAdd() {
        goToPanel(fA_EditSemesterAdd);
    }

    public static void goToDepartment() {
        fB_Department = new FB_Department();
        goToPanel(fB_Department);
    }
    
    public static void goToEditDepartment() {
        goToPanel(fC_EditDepartment);
    }
    
    public static void goToEditDepartmentAdd() {
        goToPanel(fD_EditDepartmentAdd);
    }

    public static void goToMajor() {
        goToPanel(fE_Major);
    }
    
    public static void goToEditMajor() {
        goToPanel(fF_EditMajor);
    }
    
    public static void goToEditMajorAdd() {
        goToPanel(fG_EditMajorAdd);
    }
    
    public static void goToSubject(){
        goToPanel(fH_Subject);
    }
    
    public static void goToEditSubject(){
        goToPanel(fI_EditSubject);
    }
    
    public static void goToEditSubjectAdd(){
        goToPanel(fJ_EditSubjectAdd);
    }
}
