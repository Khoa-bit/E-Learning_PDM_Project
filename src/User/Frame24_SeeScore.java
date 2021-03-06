/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Frame24_SeeScore extends javax.swing.JPanel {

    /**
     * Creates new form Frame24_SeeScore
     */
    public Frame24_SeeScore() {
        initComponents();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        String query = "SELECT class.class_id FROM class, student_list"
                + " WHERE class.semester_name = " + "'"
                + AppOpration.getAppOpration().what_semester + "'"
                + " AND student_list.class_id "
                + "= class.class_id AND student_list.student_id = '"
                + AppOpration.getAppOpration().who_is_using_this_app + "';";

        String[] infos = ConnectMySQL.getConnectMySQL().get_query(query);

        int total_credit = 0;
        
        
        for (int j = 0; j < infos.length; j++) {
            query = "SELECT * FROM class WHERE class_id = "
                    + "'" + infos[j] + "';";
            String[] infos_2 = ConnectMySQL.getConnectMySQL()
                    .get_query(query);

            String id = infos_2[0];
            String room = infos_2[1];
            String period = infos_2[2] + "-" + infos_2[3];
            String day = infos_2[4];

            query = "SELECT name, credit FROM subject WHERE subject_id = '"
                    + infos_2[5] + "';";

            String[] infos_3 = ConnectMySQL.getConnectMySQL()
                    .get_query(query);

            String subject = infos_3[0];
            String credit = infos_3[1];

            total_credit += Integer.parseInt(credit);

            model.addRow(new Object[]{id, subject,
                credit});

        }

        credit.setText(String.valueOf(total_credit));
        
        
        //Calculate average
        float total_score = 0;
        
        for (int j = 0; j < infos.length; j++) {
            query = "SELECT * FROM score WHERE class_id = "
                    + "'" + infos[j] 
                    + "' AND student_id = '"
                    + AppOpration.getAppOpration().who_is_using_this_app
                    + "';";
            String[] infos_4 = ConnectMySQL.getConnectMySQL()
                    .get_query(query);
            
            
            String in_class_score = infos_4[2];
            String midterm_score = infos_4[3];
            String final_score = infos_4[4];
            String in_class_percentage = infos_4[5];
            String midterm_percentage = infos_4[6];
            String final_percentage = infos_4[7];
            
            
            //Calculate average
            int in_class_score_int = 0;
            int midterm_score_int = 0;
            int final_score_int = 0;

            in_class_score_int = Integer.parseInt(in_class_score);

            midterm_score_int = Integer.parseInt(midterm_score);

            final_score_int = Integer.parseInt(final_score);

            int in_class_percentage_int
                    = Integer.parseInt(in_class_percentage);
            int midterm_percentage_int
                    = Integer.parseInt(midterm_percentage);
            int final_percentage_int = Integer.parseInt(final_percentage);

            float average_result = in_class_score_int * in_class_percentage_int / 100
                    + midterm_score_int * midterm_percentage_int / 100
                    + final_score_int * final_percentage_int / 100;
            
            String credit_string = String.valueOf(jTable1.getValueAt(j, 2)); 
            int credit_int = Integer.parseInt(credit_string);
            total_score += (average_result * credit_int);
        }
        total_score /= total_credit;
        
        average.setText(String.valueOf(total_score));

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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        average = new javax.swing.JTextField();
        credit = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Your score");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Class ID", "Subject name", "Credit"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jButton2.setText("See detail");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel2.setText("Average GPA:");

        jLabel3.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N
        jLabel3.setText("Total credit:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(credit)
                            .addComponent(average, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(credit)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(average, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        if (i != -1) {
            String class_id = String.valueOf(jTable1.getValueAt(i, 0));
            //ManageData.getManageData().setBook_choosen(id);

            AppOpration.getAppOpration().see_class_score_student = class_id;
            
            String subject_name = String.valueOf(jTable1.getValueAt(i, 1));
            AppOpration.getAppOpration().see_subject_score_student = subject_name;

            MainUser.goToSeeScoreDetail();
        }

        //MainUser.goToSeeScoreDetail();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainUser.goBack(); // Frame11_OptionsStudent
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField average;
    private javax.swing.JTextField credit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
