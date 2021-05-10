/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

/**
 *
 * @author doquangminh
 */
public class F1_HomePage extends javax.swing.JPanel {

    /**
     * Creates new form HomePage
     */
    public F1_HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditStudent = new javax.swing.JButton();
        btnEditLecture = new javax.swing.JButton();
        btnEditSemester = new javax.swing.JButton();
        btnEditDepartment = new javax.swing.JButton();
        btnEditSubject = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMajor = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btnEditStudent.setFont(new java.awt.Font("SF Pro", 0, 18)); // NOI18N
        btnEditStudent.setText("Student");
        btnEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditStudentActionPerformed(evt);
            }
        });

        btnEditLecture.setFont(new java.awt.Font("SF Pro", 0, 18)); // NOI18N
        btnEditLecture.setText("Lecturer");
        btnEditLecture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditLectureActionPerformed(evt);
            }
        });

        btnEditSemester.setFont(new java.awt.Font("SF Pro", 0, 18)); // NOI18N
        btnEditSemester.setText("Semester");
        btnEditSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSemesterActionPerformed(evt);
            }
        });

        btnEditDepartment.setFont(new java.awt.Font("SF Pro", 0, 18)); // NOI18N
        btnEditDepartment.setText("Department");
        btnEditDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDepartmentActionPerformed(evt);
            }
        });

        btnEditSubject.setFont(new java.awt.Font("SF Pro", 0, 18)); // NOI18N
        btnEditSubject.setText("Subject");
        btnEditSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditSubjectActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(255, 51, 102));
        btnLogOut.setFont(new java.awt.Font("SF Pro", 0, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setText("Log out");
        btnLogOut.setBounds(new java.awt.Rectangle(5, 5, 5, 5));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Home");

        btnMajor.setFont(new java.awt.Font("SF Pro", 0, 18)); // NOI18N
        btnMajor.setText("Major");
        btnMajor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMajorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditLecture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditSubject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditLecture, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditStudentActionPerformed

    private void btnEditLectureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditLectureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditLectureActionPerformed

    private void btnEditSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditSemesterActionPerformed

    private void btnEditDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditDepartmentActionPerformed

    private void btnEditSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditSubjectActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMajorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMajorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditDepartment;
    private javax.swing.JButton btnEditLecture;
    private javax.swing.JButton btnEditSemester;
    private javax.swing.JButton btnEditStudent;
    private javax.swing.JButton btnEditSubject;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnMajor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
