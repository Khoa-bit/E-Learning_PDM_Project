/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class AppOpration {
    public String who_is_using_this_app = "-";
    public String what_semester = "-";
    public String what_class = "-";
    public String what_session = "-";
    
    public String student_id_to_input_score = "-";
    
    public String video_path = "src\\Video\\2020279SCSES002S010_Algorithm_Lesson_1";
    
    public String see_class_score_student = "-";
    public String see_subject_score_student = "-";
    
    
    public static void copyFileUsingChannel(File source, File dest) throws IOException {
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destChannel = new FileOutputStream(dest).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        }finally{
           sourceChannel.close();
           destChannel.close();
        }
    }
    
    public void open_video_file(String path){
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                try {
                    desktop.open(new File(path));
                } catch (IOException ex) {
                    //Logger.getLogger(ManageData.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "This file is not supported by the system");
                }
            } 
            else {
                System.out.println("Open is not supported");
            }
    }
    
    private static final AppOpration operation = new AppOpration();
    private AppOpration(){}
    public static AppOpration getAppOpration(){
        return operation;
    }
    
}
