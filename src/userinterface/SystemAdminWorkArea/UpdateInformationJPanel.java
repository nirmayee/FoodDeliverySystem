/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nemod
 */
public class UpdateInformationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateInformationJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    String user;
   // List userList = new ArrayList();
    String username;
    
    public UpdateInformationJPanel(JPanel userProcessContainer, EcoSystem system, String user, String username) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.user = user;
        this.username = username;
        this.populateData();
        this.usernameTextField.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        usernameTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(32, 47, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        nameTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        passwordTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        usernameTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        submitJButton.setBackground(new java.awt.Color(255, 255, 255));
        submitJButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Update Information");
        jLabel7.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(submitJButton)))
                .addContainerGap(383, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void populateData() {
        
        usernameTextField.setText(this.username);
        if(this.user.equals("Customer"))
        {
//            for(Customer c: system.getCustomerDirectory().getCustomerList())
//            {
//                if(c.getUsername().equals(this.username))
//                {
//                    Customer cust = c;
//                    nameTextField.setText(cust.getName());
//                }
//            }
//            
//            for(UserAccount ua: system.getUserAccountDirectory().getUserAccountList())
//            {
//                if(ua.getUsername().equals(this.username))
//                {
//                    UserAccount userAccount = ua;
//                    passwordTextField.setText(userAccount.getPassword());
//                }
//            }
        }
        else if(this.user.equals("DeliveryMan"))
        {
           for(DeliveryMan d: system.getDeliveryManDirectory().getDeliverymanList())
            {
                if(d.getUsername().equals(this.username))
                {
                    DeliveryMan dm = d;
                    nameTextField.setText(dm.getName());
                }
            }
            
            for(UserAccount ua: system.getUserAccountDirectory().getUserAccountList())
            {
                if(ua.getUsername().equals(this.username))
                {
                    UserAccount userAccount = ua;
                    passwordTextField.setText(userAccount.getPassword());
                }
            }
        }
        else
        {
            for(Restaurant c: system.getRestaurantDirectory().getRestaurantList())
            {
                if(c.getRestaurantAdminUsername().equals(this.username))
                {
                    Restaurant cust = c;
                    nameTextField.setText(cust.getName());
                }
            }
            
            for(UserAccount ua: system.getUserAccountDirectory().getUserAccountList())
            {
                if(ua.getUsername().equals(this.username))
                {
                    UserAccount userAccount = ua;
                    passwordTextField.setText(userAccount.getPassword());
                }
            }
        }

    }
    
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        if(this.user.equals("DeliveryMan"))
        {
            ManageDeliveryManJPanel manageDeliveryManJPanel = (ManageDeliveryManJPanel) component;
            manageDeliveryManJPanel.populateTable(); 
        }
        else if(this.user.equals("Restaurant"))
        {
            ManageRestaurantsJPanel manageRestaurantsJPanel = (ManageRestaurantsJPanel) component;
            manageRestaurantsJPanel.populateTable();
        }
   

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
       
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
         String name = nameTextField.getText();
         String password = String.valueOf(passwordTextField.getPassword());
        if(this.user.equals("Customer"))
        {
//           for(Customer c: system.getCustomerDirectory().getCustomerList())
//            {
//                if(c.getUsername().equals(this.username))
//                {
//                    Customer cust = c;
//                    cust.setName(nameTextField.getText());
//                }
//            }
//            
//            for(UserAccount ua: system.getUserAccountDirectory().getUserAccountList())
//            {
//                if(ua.getUsername().equals(this.username))
//                {
//                    UserAccount userAccount = ua;
//                    ua.setPassword(password);
//                }
//            }
//            JOptionPane.showMessageDialog(null, "Customer updated succesfully");
//            nameTextField.setText("");
//            passwordTextField.setText("");
//            usernameTextField.setText("");
        }
        else if(this.user.equals("DeliveryMan"))
        {
            DeliveryMan d = null;
            for(DeliveryMan dm: system.getDeliveryManDirectory().getDeliverymanList()) 
            {
                if(dm.getUsername().equals(this.username))
                {
                    d = dm;
                    d.setName(name);
                    break;
                }
            }
            for(UserAccount ua: system.getUserAccountDirectory().getUserAccountList())
            {
                if(ua.getUsername().equals(this.username))
                {
                    UserAccount userAccount = ua;
                    userAccount.setPassword(password);
                    break;
                }
            }
            String name1 = d.getName();
            for(Employee emp: system.getEmployeeDirectory().getEmployeeList())
            {
                if(name1.equals(emp.getName()))
                {
                            emp.setName(name);
                }
            }
            JOptionPane.showMessageDialog(null, "Delivery Man updated successfully");
        }
        else
        {
            for(Restaurant c: system.getRestaurantDirectory().getRestaurantList())
            {
                if(c.getRestaurantAdminUsername().equals(this.username))
                {
                    Restaurant cust = c;
                    cust.setName(nameTextField.getText());
                }
            }
            
            for(UserAccount ua: system.getUserAccountDirectory().getUserAccountList())
            {
                if(ua.getUsername().equals(this.username))
                {
                    UserAccount userAccount = ua;
                    ua.setPassword(password);
                }
            }
            JOptionPane.showMessageDialog(null, "Restaurant updated successfully");
        }
        nameTextField.setText("");
        passwordTextField.setText("");
        usernameTextField.setText("");
        System.out.println("Print" + system.getEmployeeDirectory().getEmployeeList());

    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
