/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class AppOpration {
    public String who_is_using_this_app = "-";
    public String what_semester = "-";
    public String what_class = "-";
    
    
    
    private static final AppOpration operation = new AppOpration();
    private AppOpration(){}
    public static AppOpration getAppOpration(){
        return operation;
    }
    
}
