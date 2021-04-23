package main.java.Views;

import main.java.Controllers.Database;
import main.java.Models.Car;
import main.java.Models.Customer;
import main.java.Models.Order;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Nicholas
 */
public class Orders extends javax.swing.JPanel {

    /**
     * Creates new form Orders
     */
    public Search search;
    public Car purchaseCar;
    public Customer selectedCustomer;

    public Orders(Search search) {
        initComponents();
        this.search = search;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlDownPayment = new javax.swing.JLabel();
        jlBank = new javax.swing.JLabel();
        jlLoanNumber = new javax.swing.JLabel();
        jlLoanDuration = new javax.swing.JLabel();
        jtfDownPayment = new javax.swing.JTextField();
        jtfBank = new javax.swing.JTextField();
        jtfLoanNumber = new javax.swing.JTextField();
        jtfLoanDuration = new javax.swing.JTextField();
        jbSave = new javax.swing.JButton();
        jbSelectCustomer = new javax.swing.JButton();
        jtfSalePrice = new javax.swing.JTextField();
        jlDownPayment1 = new javax.swing.JLabel();

        jlDownPayment.setText("Down Payment");

        jlBank.setText("Bank");

        jlLoanNumber.setText("Loan Number");

        jlLoanDuration.setText("Loan Duration");

        jtfLoanNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLoanNumberActionPerformed(evt);
            }
        });

        jbSave.setText("Submit");
        jbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSaveActionPerformed(evt);
            }
        });

        jbSelectCustomer.setText("Select Customer");
        jbSelectCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelectCustomerActionPerformed(evt);
            }
        });

        jlDownPayment1.setText("Sale Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSave)
                    .addComponent(jbSelectCustomer)
                    .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlDownPayment)
                                    .addComponent(jlBank)
                                    .addComponent(jlLoanNumber)
                                    .addComponent(jlLoanDuration)
                                    .addComponent(jlDownPayment1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfSalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtfLoanDuration, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfLoanNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfBank, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfDownPayment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(570, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbSelectCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDownPayment1)
                    .addComponent(jtfSalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDownPayment)
                    .addComponent(jtfDownPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBank)
                    .addComponent(jtfBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLoanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlLoanNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLoanDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlLoanDuration))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(jbSave)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbSelectCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelectCustomerActionPerformed
        // TODO add your handling code here:\
        Database database = new Database();
        JFrame frame = new JFrame();
        SelectCustomer add = new SelectCustomer(database.allCustomers(), this);
        add.setVisible(true);
        frame.setSize(500, 400);
        frame.add(add);
        frame.setVisible(true);
    }//GEN-LAST:event_jbSelectCustomerActionPerformed

    private void jtfLoanNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLoanNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLoanNumberActionPerformed

    private void jbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSaveActionPerformed
        // TODO add your handling code here:
        if (selectedCustomer != null) {
            float price = Float.parseFloat(jtfSalePrice.getText());
            int downPayment = Integer.parseInt(jtfDownPayment.getText());
            String bank = jtfBank.getText();
            int loanNumber = Integer.parseInt(jtfLoanNumber.getText());
            int loanMonths = Integer.parseInt(jtfLoanDuration.getText());
            Order order = new Order();
            order.setSalesPrice(price);
            order.setDownPayment(downPayment);
            order.setBank(bank);
            order.setLoanNumber(loanNumber);
            order.setLoanMonths(loanMonths);

            Database database = new Database();
            database.insertOrder(order, this.purchaseCar.getCarID(), this.selectedCustomer.getID());
            database.recordCarHistory(this.purchaseCar, "Purchased");
            database.setCarStatus(this.purchaseCar, "Purchased");

            search.performFilter();
            JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            topFrame.dispatchEvent(new WindowEvent(topFrame, WindowEvent.WINDOW_CLOSING));
        } else {
            JOptionPane.showMessageDialog(this,
                    "Select a Customer",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbSave;
    private javax.swing.JButton jbSelectCustomer;
    private javax.swing.JLabel jlBank;
    private javax.swing.JLabel jlDownPayment;
    private javax.swing.JLabel jlDownPayment1;
    private javax.swing.JLabel jlLoanDuration;
    private javax.swing.JLabel jlLoanNumber;
    private javax.swing.JTextField jtfBank;
    private javax.swing.JTextField jtfDownPayment;
    private javax.swing.JTextField jtfLoanDuration;
    private javax.swing.JTextField jtfLoanNumber;
    private javax.swing.JTextField jtfSalePrice;
    // End of variables declaration//GEN-END:variables
}