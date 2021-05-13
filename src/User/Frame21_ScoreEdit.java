/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Frame21_ScoreEdit extends javax.swing.JPanel {

    /**
     * Creates new form Frame21_ScoreEdit
     */
    public Frame21_ScoreEdit() {
        initComponents();
        if (AppOpration.getAppOpration().student_id_to_input_score.equals("-")) {

        } else {
            String query = "SELECT * FROM student WHERE student_id = '"
                    + AppOpration.getAppOpration().student_id_to_input_score + "';";
            String[] infos_2 = ConnectMySQL.getConnectMySQL().get_query(query);
            String student_id = infos_2[0];
            String full_name = infos_2[1] + " " + infos_2[2]
                    + " " + infos_2[3];

            String title_text = student_id + "    -    " + full_name;

            title.setText(title_text);

            query = "SELECT * FROM score WHERE student_id = '"
                    + AppOpration.getAppOpration().student_id_to_input_score 
                    + "' AND class_id = '"
                    + AppOpration.getAppOpration().what_class
                    + "';";

            String[] infos_3 = ConnectMySQL.getConnectMySQL().get_query(query);

            in_class_score.setText(infos_3[2]);
            midterm_score.setText(infos_3[3]);
            final_score.setText(infos_3[4]);
            in_class_percentage.setText(infos_3[5]);
            midterm_percentage.setText(infos_3[6]);
            final_percentage.setText(infos_3[7]);

            String in_class_score_text = in_class_score.getText();
            String midterm_score_text = midterm_score.getText();
            String final_score_text = final_score.getText();
            String in_class_percentage_text = in_class_percentage.getText();
            String midterm_percentage_text = midterm_percentage.getText();
            String final_percentage_text = final_percentage.getText();

            if (in_class_score_text == null) {
                in_class_score_text = "0";
            }
            if (midterm_score_text == null) {
                midterm_score_text = "0";
            }
            if (final_score_text == null) {
                final_score_text = "0";
            }

            int in_class_score_int = 0;
            int midterm_score_int = 0;
            int final_score_int = 0;

            in_class_score_int = Integer.parseInt(in_class_score_text);

            midterm_score_int = Integer.parseInt(midterm_score_text);

            final_score_int = Integer.parseInt(final_score_text);

            int in_class_percentage_int
                    = Integer.parseInt(in_class_percentage_text);
            int midterm_percentage_int
                    = Integer.parseInt(midterm_percentage_text);
            int final_percentage_int = Integer.parseInt(final_percentage_text);

            float average_result = in_class_score_int * in_class_percentage_int / 100
                    + midterm_score_int * midterm_percentage_int / 100
                    + final_score_int * final_percentage_int / 100;

            average.setText(String.valueOf(average_result));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        midterm_score = new javax.swing.JTextField();
        in_class_score = new javax.swing.JTextField();
        average = new javax.swing.JTextField();
        final_score = new javax.swing.JTextField();
        final_percentage = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        midterm_percentage = new javax.swing.JTextField();
        in_class_percentage = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("SF Pro Display", 0, 24)); // NOI18N
        jLabel4.setText("In-class Score:");

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 0, 24)); // NOI18N
        jLabel5.setText("Final Score:");

        in_class_score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_class_scoreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Score");

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 0, 24)); // NOI18N
        jLabel6.setText("Midterm Score:");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 0, 24)); // NOI18N
        jLabel8.setText("Percentage:");

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 24)); // NOI18N
        jLabel2.setText("Midterm Score:");

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 0, 24)); // NOI18N
        jLabel9.setText("Final Score:");

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 24)); // NOI18N
        jLabel3.setText("Average:");

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 0, 24)); // NOI18N
        jLabel10.setText("In-class Score:");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("*It will change for all students in this class");

        title.setFont(new java.awt.Font("SF Pro Display", 0, 24)); // NOI18N
        title.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(in_class_score, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(midterm_score, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(final_score, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(average, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(midterm_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(final_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(in_class_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(in_class_score, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(midterm_score, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(final_score)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(average, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(in_class_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(midterm_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(final_percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String in_class_score_text = in_class_score.getText();
        String midterm_score_text = midterm_score.getText();
        String final_score_text = final_score.getText();
        String in_class_percentage_text = in_class_percentage.getText();
        String midterm_percentage_text = midterm_percentage.getText();
        String final_percentage_text = final_percentage.getText();

        //Checking for valid value
        int counter = 0;
        for (int i = 0; i <= 100; i++) {
            String number = String.valueOf(i);

            if (in_class_score_text.equals(number)) {
                counter++;
            }
            if (midterm_score_text.equals(number)) {
                counter++;
            }
            if (final_score_text.equals(number)) {
                counter++;
            }
            if (in_class_percentage_text.equals(number)) {
                counter++;
            }
            if (midterm_percentage_text.equals(number)) {
                counter++;
            }
            if (final_percentage_text.equals(number)) {
                counter++;
            }
        }

        if (in_class_score_text.equals("")) {
            counter++;
            in_class_score_text = "0";
        }
        if (midterm_score_text.equals("")) {
            counter++;
            midterm_score_text = "0";
        }
        if (final_score_text.equals("")) {
            counter++;
            final_score_text = "0";
        }

        if (counter == 6) {

            String query = "UPDATE score SET in_class_percentage = '"
                    + in_class_percentage_text + "', midterm_percentage = '"
                    + midterm_percentage_text + "', final_percentage = '"
                    + final_percentage_text + "' WHERE class_id = '"
                    + AppOpration.getAppOpration().what_class + "';";

            ConnectMySQL.getConnectMySQL().set_query(query);

            query = "UPDATE score SET in_class_score = '"
                    + in_class_score_text + "', midterm_score  = '"
                    + midterm_score_text + "', final_score  = '"
                    + final_score_text + "' WHERE class_id = '"
                    + AppOpration.getAppOpration().what_class + "'"
                    + " AND student_id = '"
                    + AppOpration.getAppOpration().student_id_to_input_score
                    + "';";

            ConnectMySQL.getConnectMySQL().set_query(query);

            MainUser.goBack();
        } else {
            JOptionPane.showMessageDialog(null, "Input valid number!");
        }

        //MainUser.goBack(); // Frame18_StudentList
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MainUser.goBack(); // Frame18_StudentList
    }//GEN-LAST:event_jButton3ActionPerformed

    private void in_class_scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_class_scoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_class_scoreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField average;
    private javax.swing.JTextField final_percentage;
    private javax.swing.JTextField final_score;
    private javax.swing.JTextField in_class_percentage;
    private javax.swing.JTextField in_class_score;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField midterm_percentage;
    private javax.swing.JTextField midterm_score;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
