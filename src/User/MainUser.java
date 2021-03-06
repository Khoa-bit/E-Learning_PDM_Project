/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class MainUser {

    private static final JFrame frame = new JFrame("JFrame Example");
    private static final Stack<JPanel> panelStack = new Stack();

    private static final Frame1_Intro frame1_Intro = new Frame1_Intro();
    private static final Frame2_LoginLecturer frame2_LoginLecturer = new Frame2_LoginLecturer();
    private static final Frame3_LoginStudent frame3_LoginStudent = new Frame3_LoginStudent();
    private static Frame4_HomeLecturer frame4_HomeLecturer = new Frame4_HomeLecturer();
    private static Frame5_HomeStudent frame5_HomeStudent = new Frame5_HomeStudent();
    private static Frame6_SemesterLecturer frame6_SemesterLecturer = new Frame6_SemesterLecturer();
    private static Frame7_SemesterStudent frame7_SemesterStudent = new Frame7_SemesterStudent();
    private static Frame8_ClassesLecturer frame8_ClassesLecturer = new Frame8_ClassesLecturer();
    private static Frame9_ClassesStudent frame9_ClassesStudent = new Frame9_ClassesStudent();
    private static Frame10_OptionsLecturer frame10_OptionsLecturer = new Frame10_OptionsLecturer();
    private static Frame11_OptionsStudent frame11_OptionsStudent = new Frame11_OptionsStudent();
    private static Frame12_InclassLecturer frame12_InclassLecturer = new Frame12_InclassLecturer();
    private static Frame13_InclassStudent frame13_InclassStudent = new Frame13_InclassStudent();
    private static Frame14_SeeReviewLecturer frame14_SeeReviewLecturer = new Frame14_SeeReviewLecturer();
    private static Frame15_ReviewStudent frame15_ReviewStudent = new Frame15_ReviewStudent();
    private static Frame16_HistoryLecturer frame16_HistoryLecturer = new Frame16_HistoryLecturer();
    private static Frame17_SeePastReview frame17_SeePastReview = new Frame17_SeePastReview();
    private static Frame18_StudentList frame18_StudentList = new Frame18_StudentList();
    private static Frame19_InformationLecturer frame19_InformationLecturer = new Frame19_InformationLecturer();
    private static Frame20_InformationStudent frame20_InformationStudent = new Frame20_InformationStudent();
    private static Frame21_ScoreEdit frame21_ScoreEdit = new Frame21_ScoreEdit();
    private static Frame22_HistoryStudent frame22_HistoryStudent = new Frame22_HistoryStudent();
    private static Frame24_SeeScore frame24_SeeScore = new Frame24_SeeScore();
    private static Frame25_SeeScoreDetail frame25_SeeScoreDetail = new Frame25_SeeScoreDetail();
    private static Frame26_ReferenceStudent frame26_ReferenceStudent = new Frame26_ReferenceStudent();
    private static Frame27_ReferenceLecturer frame27_ReferenceLecturer = new Frame27_ReferenceLecturer();
    private static Frame28_EditReference frame28_EditReference = new Frame28_EditReference();
    private static Frame29_VideoListStudent frame29_VideoListStudent = new Frame29_VideoListStudent();
    private static Frame30_VideoStudent frame30_VideoStudent = new Frame30_VideoStudent();
    private static Frame31_VideoListLecturer frame31_VideoListLecturer = new Frame31_VideoListLecturer();
    private static Frame32_SeeVideoLecturer frame32_SeeVideoLecturer = new Frame32_SeeVideoLecturer();
    private static Frame33_AddVideoLecturer frame33_AddVideoLecturer = new Frame33_AddVideoLecturer();

    public static void main(String[] args) {

        //---------------------------------------------------------------------
        frame.setSize(1000, 720);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        goToIntro();

    }

    public static void goToPanel(JPanel panel) {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.getContentPane().revalidate();
        frame.repaint();

        panelStack.push(panel);
//        System.out.println(panelStack);
        System.out.println(panel.getClass());
    }

    public static void goBack() {
        panelStack.pop();
        goToPanel(panelStack.pop());
    }

    public static void goToIntro() {
        goToPanel(frame1_Intro);
    }

    public static void goToLoginLecturer() {
        goToPanel(frame2_LoginLecturer);
    }

    public static void goToLoginStudent() {
        goToPanel(frame3_LoginStudent);
    }

    public static void goToHomeLecturer() {
        frame4_HomeLecturer = new Frame4_HomeLecturer();
        goToPanel(frame4_HomeLecturer);
        frame4_HomeLecturer = new Frame4_HomeLecturer();
    }

    public static void goToHomeStudent() {
        frame5_HomeStudent = new Frame5_HomeStudent();
        goToPanel(frame5_HomeStudent);
        frame5_HomeStudent = new Frame5_HomeStudent();
    }

    public static void goToSemesterLecturer() {
        frame6_SemesterLecturer = new Frame6_SemesterLecturer();
        goToPanel(frame6_SemesterLecturer);
        frame6_SemesterLecturer = new Frame6_SemesterLecturer();
    }

    public static void goToSemesterStudent() {
        frame7_SemesterStudent = new Frame7_SemesterStudent();
        goToPanel(frame7_SemesterStudent);
        frame7_SemesterStudent = new Frame7_SemesterStudent();
    }

    public static void goToClassesLecturer() {
        frame8_ClassesLecturer = new Frame8_ClassesLecturer();
        goToPanel(frame8_ClassesLecturer);
        frame8_ClassesLecturer = new Frame8_ClassesLecturer();
    }

    public static void goToClassesStudent() {
        frame9_ClassesStudent = new Frame9_ClassesStudent();
        goToPanel(frame9_ClassesStudent);
        frame9_ClassesStudent = new Frame9_ClassesStudent();
    }

    public static void goToOptionsLecturer() {
        frame10_OptionsLecturer = new Frame10_OptionsLecturer();
        goToPanel(frame10_OptionsLecturer);
        frame10_OptionsLecturer = new Frame10_OptionsLecturer();
    }

    public static void goToOptionsStudent() {
        frame11_OptionsStudent = new Frame11_OptionsStudent();
        goToPanel(frame11_OptionsStudent);
        frame11_OptionsStudent = new Frame11_OptionsStudent();
    }

    public static void goToInclassLecturer() {
        frame12_InclassLecturer = new Frame12_InclassLecturer();
        goToPanel(frame12_InclassLecturer);
        frame12_InclassLecturer = new Frame12_InclassLecturer();
    }

    public static void goToInclassStudent() {
        frame13_InclassStudent = new Frame13_InclassStudent();
        goToPanel(frame13_InclassStudent);
        frame13_InclassStudent = new Frame13_InclassStudent();
    }

    public static void goToSeeReviewLecturer() {
        frame14_SeeReviewLecturer = new Frame14_SeeReviewLecturer();
        goToPanel(frame14_SeeReviewLecturer);
        frame14_SeeReviewLecturer = new Frame14_SeeReviewLecturer();
    }

    public static void goToReviewStudent() {
        frame15_ReviewStudent = new Frame15_ReviewStudent();
        goToPanel(frame15_ReviewStudent);
        frame15_ReviewStudent = new Frame15_ReviewStudent();
    }

    public static void goToHistoryLecturer() {
        frame16_HistoryLecturer = new Frame16_HistoryLecturer();
        goToPanel(frame16_HistoryLecturer);
        frame16_HistoryLecturer = new Frame16_HistoryLecturer();
    }

    public static void goToSeePastReview() {
//        ================Not in used================
        frame17_SeePastReview = new Frame17_SeePastReview();
        goToPanel(frame17_SeePastReview);
        frame17_SeePastReview = new Frame17_SeePastReview();
    }

    public static void goToStudentList() {
        frame18_StudentList = new Frame18_StudentList();
        goToPanel(frame18_StudentList);
        frame18_StudentList = new Frame18_StudentList();
    }

    public static void goToInformationLecturer() {
//        ================Not in used================
        frame19_InformationLecturer = new Frame19_InformationLecturer();
        goToPanel(frame19_InformationLecturer);
        frame19_InformationLecturer = new Frame19_InformationLecturer();
    }

    public static void goToInformationStudent() {
//        ================Not in used================
        frame20_InformationStudent = new Frame20_InformationStudent();
        goToPanel(frame20_InformationStudent);
        frame20_InformationStudent = new Frame20_InformationStudent();
    }

    public static void goToScoreEdit() {
        frame21_ScoreEdit = new Frame21_ScoreEdit();
        goToPanel(frame21_ScoreEdit);
        frame21_ScoreEdit = new Frame21_ScoreEdit();
    }

    public static void goToHistoryStudent() {
        frame22_HistoryStudent = new Frame22_HistoryStudent();
        goToPanel(frame22_HistoryStudent);
        frame22_HistoryStudent = new Frame22_HistoryStudent();
    }

    public static void goToSeeScore() {
        frame24_SeeScore = new Frame24_SeeScore();
        goToPanel(frame24_SeeScore);
        frame24_SeeScore = new Frame24_SeeScore();
    }

    public static void goToSeeScoreDetail() {
        frame25_SeeScoreDetail = new Frame25_SeeScoreDetail();
        goToPanel(frame25_SeeScoreDetail);
        frame25_SeeScoreDetail = new Frame25_SeeScoreDetail();
    }

    public static void goToReferenceStudent() {
        frame26_ReferenceStudent = new Frame26_ReferenceStudent();
        goToPanel(frame26_ReferenceStudent);
        frame26_ReferenceStudent = new Frame26_ReferenceStudent();
    }

    public static void goToReferenceLecturer() {
        frame27_ReferenceLecturer = new Frame27_ReferenceLecturer();
        goToPanel(frame27_ReferenceLecturer);
        frame27_ReferenceLecturer = new Frame27_ReferenceLecturer();
    }

    public static void goToEditReference() {
        frame28_EditReference = new Frame28_EditReference();
        goToPanel(frame28_EditReference);
        frame28_EditReference = new Frame28_EditReference();
    }

    public static void goToVideoListStudent() {
        frame29_VideoListStudent = new Frame29_VideoListStudent();
        goToPanel(frame29_VideoListStudent);
        frame29_VideoListStudent = new Frame29_VideoListStudent();
    }

    public static void goToVideoStudent() {
        frame30_VideoStudent = new Frame30_VideoStudent();
        goToPanel(frame30_VideoStudent);
        frame30_VideoStudent = new Frame30_VideoStudent();
    }

    public static void goToVideoListLecturer() {
        frame31_VideoListLecturer = new Frame31_VideoListLecturer();
        goToPanel(frame31_VideoListLecturer);
        frame31_VideoListLecturer = new Frame31_VideoListLecturer();
    }

    public static void goToSeeVideoLecturer() {
        frame32_SeeVideoLecturer = new Frame32_SeeVideoLecturer();
        goToPanel(frame32_SeeVideoLecturer);
        frame32_SeeVideoLecturer = new Frame32_SeeVideoLecturer();
    }

    public static void goToAddVideoLecturer() {
        frame33_AddVideoLecturer = new Frame33_AddVideoLecturer();
        goToPanel(frame33_AddVideoLecturer);
        frame33_AddVideoLecturer = new Frame33_AddVideoLecturer();
    }

}
