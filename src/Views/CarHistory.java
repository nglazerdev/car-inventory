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
        jlMake = new javax.swing.JLabel();
        jlModel = new javax.swing.JLabel();
        jlYear = new javax.swing.JLabel();
        jlTransmission = new javax.swing.JLabel();
        jlEngine = new javax.swing.JLabel();
        jlDrivetrain = new javax.swing.JLabel();
        jlVIN = new javax.swing.JLabel();
        jlColor = new javax.swing.JLabel();
        jlCylinders = new javax.swing.JLabel();
        jlGas = new javax.swing.JLabel();
        jlVehicleInfomation = new javax.swing.JLabel();
        jlVehicleType = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jlBodyType.setText("Body Type");

        jlMileage.setText("Mileage");

        jlMake.setText("Make");

        jlModel.setText("Model");

        jlYear.setText("Year");

        jlTransmission.setText("Transmission");

        jlEngine.setText("Engine");

        jlDrivetrain.setText("Drivetrain");

        jlVIN.setText("VIN #");

        jlColor.setText("Color");

        jlCylinders.setText("Cylinders");

        jlGas.setText("Gas");

        jlVehicleInfomation.setText("Vehicle Information");

        jlVehicleType.setText("Vehicle Type");

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel1");

        jLabel3.setText("jLabel1");

        jLabel4.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlVIN)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlMake)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlModel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTransmission)
                            .addComponent(jlEngine)
                            .addComponent(jlDrivetrain)))
                    .addComponent(jlVehicleInfomation)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlYear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlMileage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(67, 67, 67)
                        .addComponent(jlBodyType)))
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlColor)
                    .addComponent(jlVehicleType)
                    .addComponent(jlGas)
                    .addComponent(jlCylinders))
                .addContainerGap(245, Short.MAX_VALUE))
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
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlModel)
                            .addComponent(jlEngine)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlYear)
                                .addComponent(jLabel3))
                            .addComponent(jlDrivetrain))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMileage)
                            .addComponent(jlBodyType)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlColor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCylinders)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlGas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlVehicleType)))
                .addGap(18, 18, 18)
                .addComponent(jlVIN)
                .addContainerGap(306, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    // End of variables declaration//GEN-END:variables
}
