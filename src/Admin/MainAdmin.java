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
    public static void main(String[] args){
        JFrame frame = new JFrame("JFrame Example");    
        frame.setSize(1000, 720);
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);
        
        F1_HomePage f1_HomePage = new F1_HomePage();
        frame.add(f1_HomePage);
    }
}
