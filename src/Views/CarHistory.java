/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author Nicholas
 */
public class CarHistory extends javax.swing.JPanel {

    /**
     * Creates new form CarHistory
     */
    public CarHistory() {
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

        jlBodyType = new javax.swing.JLabel();
        jlMileage = new javax.swing.JLabel();
        jtfMileage = new javax.swing.JTextField();
        jlMake = new javax.swing.JLabel();
        jlModel = new javax.swing.JLabel();
        jlYear = new javax.swing.JLabel();
        jtfYear = new javax.swing.JTextField();
        jlTransmission = new javax.swing.JLabel();
        jlEngine = new javax.swing.JLabel();
        jlDrivetrain = new javax.swing.JLabel();
        jlVIN = new javax.swing.JLabel();
        jtfVIN = new javax.swing.JTextField();
        jtfEngine = new javax.swing.JTextField();
        jlColor = new javax.swing.JLabel();
        jlCylinders = new javax.swing.JLabel();
        jtfCylinders = new javax.swing.JTextField();
        jlGas = new javax.swing.JLabel();
        jlVehicleInfomation = new javax.swing.JLabel();
        jlVehicleType = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfHistory = new javax.swing.JTextArea();
        jtfMake = new javax.swing.JTextField();
        jtfTransmission = new javax.swing.JTextField();
        jtfModel = new javax.swing.JTextField();
        jtfDrivetrain = new javax.swing.JTextField();
        jtfBodyType = new javax.swing.JTextField();
        jtfColor = new javax.swing.JTextField();
        jtfGas = new javax.swing.JTextField();
        jtfVehicleType = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jlBodyType.setText("Body Type");

        jlMileage.setText("Mileage");

        jtfMileage.setEditable(false);
        jtfMileage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMileageActionPerformed(evt);
            }
        });

        jlMake.setText("Make");

        jlModel.setText("Model");

        jlYear.setText("Year");

        jtfYear.setEditable(false);
        jtfYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfYearActionPerformed(evt);
            }
        });

        jlTransmission.setText("Transmission");

        jlEngine.setText("Engine");

        jlDrivetrain.setText("Drivetrain");

        jlVIN.setText("VIN #");

        jtfVIN.setEditable(false);
        jtfVIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfVINActionPerformed(evt);
            }
        });

        jtfEngine.setEditable(false);

        jlColor.setText("Color");

        jlCylinders.setText("Cylinders");

        jtfCylinders.setEditable(false);
        jtfCylinders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCylindersActionPerformed(evt);
            }
        });

        jlGas.setText("Gas");

        jlVehicleInfomation.setText("Vehicle Information");

        jlVehicleType.setText("Vehicle Type");

        jtfHistory.setEditable(false);
        jtfHistory.setColumns(20);
        jtfHistory.setRows(5);
        jScrollPane1.setViewportView(jtfHistory);

        jtfMake.setEditable(false);
        jtfMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMakeActionPerformed(evt);
            }
        });

        jtfTransmission.setEditable(false);
        jtfTransmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTransmissionActionPerformed(evt);
            }
        });

        jtfModel.setEditable(false);

        jtfDrivetrain.setEditable(false);

        jtfBodyType.setEditable(false);

        jtfColor.setEditable(false);

        jtfGas.setEditable(false);

        jtfVehicleType.setEditable(false);

        jLabel1.setText("History");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlMake)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfMake))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlModel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfModel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlTransmission)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfTransmission, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlEngine)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfEngine, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlDrivetrain)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfDrivetrain, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jlVehicleInfomation)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlYear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfYear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlMileage)
                                    .addComponent(jlVIN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfMileage, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jlBodyType))
                                    .addComponent(jtfVIN, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfBodyType, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlColor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfColor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlVehicleType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlCylinders)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCylinders, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlGas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfGas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlVehicleInfomation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMake)
                            .addComponent(jlTransmission)
                            .addComponent(jtfMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfTransmission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlModel)
                            .addComponent(jlEngine)
                            .addComponent(jtfEngine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlYear))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlDrivetrain)
                                .addComponent(jtfDrivetrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMileage)
                            .addComponent(jtfMileage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlBodyType)
                            .addComponent(jtfBodyType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlColor)
                            .addComponent(jtfColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCylinders)
                            .addComponent(jtfCylinders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlGas)
                            .addComponent(jtfGas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlVehicleType)
                            .addComponent(jtfVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlVIN)
                    .addComponent(jtfVIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCylindersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCylindersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCylindersActionPerformed

    private void jtfVINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfVINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfVINActionPerformed

    private void jtfMileageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMileageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMileageActionPerformed

    private void jtfYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfYearActionPerformed

    private void jtfMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMakeActionPerformed

    private void jtfTransmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTransmissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTransmissionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlBodyType;
    private javax.swing.JLabel jlColor;
    private javax.swing.JLabel jlCylinders;
    private javax.swing.JLabel jlDrivetrain;
    private javax.swing.JLabel jlEngine;
    private javax.swing.JLabel jlGas;
    private javax.swing.JLabel jlMake;
    private javax.swing.JLabel jlMileage;
    private javax.swing.JLabel jlModel;
    private javax.swing.JLabel jlTransmission;
    private javax.swing.JLabel jlVIN;
    private javax.swing.JLabel jlVehicleInfomation;
    private javax.swing.JLabel jlVehicleType;
    private javax.swing.JLabel jlYear;
    private javax.swing.JTextField jtfBodyType;
    private javax.swing.JTextField jtfColor;
    private javax.swing.JTextField jtfCylinders;
    private javax.swing.JTextField jtfDrivetrain;
    private javax.swing.JTextField jtfEngine;
    private javax.swing.JTextField jtfGas;
    private javax.swing.JTextArea jtfHistory;
    private javax.swing.JTextField jtfMake;
    private javax.swing.JTextField jtfMileage;
    private javax.swing.JTextField jtfModel;
    private javax.swing.JTextField jtfTransmission;
    private javax.swing.JTextField jtfVIN;
    private javax.swing.JTextField jtfVehicleType;
    private javax.swing.JTextField jtfYear;
    // End of variables declaration//GEN-END:variables
}