/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmngt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static stockmngt.GlobalVariables.path;
import static stockmngt.GlobalVariables.place;
import static stockmngt.GlobalVariables.psw;
import static stockmngt.GlobalVariables.user;

/**
 *
 * @author DELL-PC
 */
public class View_stock extends javax.swing.JInternalFrame {

    /**
     * Creates new form View_stock
     */
    public View_stock() {
        initComponents();
        
        
        
        
        
                 try{
         Connection myconnection;
         
        
         myconnection=DriverManager.getConnection(path+place, user, psw);
         try{
             String a="select * from companytable";
             PreparedStatement mystat=myconnection.prepareStatement(a);
            // mystat.setString(1,'%'+jTextField1.getText()+'%');
             ResultSet myresult=mystat.executeQuery();
             
            // DefaultTableModel mymodel=(DefaultTableModel) jTable1.getModel();
             
            // String id,name,post,phone;
             if(myresult.next()){
                
                jComboBox1.removeAllItems();
                jComboBox1.addItem("Choose Company");
                do{
                     jComboBox1.addItem(myresult.getString("name"));
                 }
                 while(myresult.next());
                 
                 
                 
             }   
             else
             {
              JOptionPane.showMessageDialog(rootPane,"Nothing in Stock");   
             }
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(rootPane,"Error in query"+e.getMessage());
         }
         finally{
         myconnection.close();
         
     }
               
     }   
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(rootPane,"Error in Connection"+e.getMessage());
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel3.setText("Quatity");

        jLabel4.setText("Item ID");

        jLabel5.setText("GST");

        jLabel2.setText("Price");

        jLabel6.setText("Model");

        jLabel12.setText("Company");

        jLabel13.setText("Product");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Product First" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(40, 40, 40))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, 128, Short.MAX_VALUE))
                        .addContainerGap(137, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addComponent(jLabel8)
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel10)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel15))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel16))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel17))
                        .addGap(78, 78, 78))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
               if(jComboBox1.getSelectedIndex()>0){    
       // jTextField6.setText(jComboBox1.getSelectedItem().toString());
        
        
        
        
                  
                 try{
         Connection myconnection;
         
        
         myconnection=DriverManager.getConnection(path+place, user, psw);
         try{
             String a="select * from stocktable where company=?";
             PreparedStatement mystat=myconnection.prepareStatement(a);
            mystat.setString(1,jComboBox1.getSelectedItem().toString());
             ResultSet myresult=mystat.executeQuery();
             
            // DefaultTableModel mymodel=(DefaultTableModel) jTable1.getModel();
             
            // String id,name,post,phone;
             if(myresult.next()){
                
                 jComboBox2.removeAllItems();
                 jComboBox2.addItem("Choose Product");
                 do{

                     jComboBox2.addItem(myresult.getString("product"));
                 }
                 while(myresult.next());
                       
             }   
             else
             {
              JOptionPane.showMessageDialog(rootPane,"No product in Stock!...Kindly add first!");   
             }
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(rootPane,"Error in query"+e.getMessage());
         }
         finally{
         myconnection.close();
         
     }
               
     }   
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(rootPane,"Error in Connection"+e.getMessage());
     }
        }
        else
        {
               jComboBox2.removeAllItems();
                 jComboBox2.addItem("Choose Product");
      //       jTextField6.setText("");
        }
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jComboBox2.getSelectedIndex()>0)
        {
        //     jTextField7.setText(jComboBox2.getSelectedItem().toString());
             try{
         Connection myconnection;
         myconnection=DriverManager.getConnection(path+place, user, psw);
         try{
             String a="select * from stocktable where company=? and product=?";
             PreparedStatement mystat=myconnection.prepareStatement(a);
            mystat.setString(1,jComboBox1.getSelectedItem().toString());
            mystat.setString(2,jComboBox2.getSelectedItem().toString());
             ResultSet myresult=mystat.executeQuery();
             if(myresult.next()){
                
                 jComboBox3.removeAllItems();
                  jComboBox3.addItem("Choose Item");
                 do{

                     jComboBox3.addItem(myresult.getString("Name"));
                 }
                 while(myresult.next());
             }   
             else
             {
              JOptionPane.showMessageDialog(rootPane,"Nothing in this product!...Kindly add first!");   
             }
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(rootPane,"Error in query"+e.getMessage());
         }
         finally{
         myconnection.close();
         
     }
               
     }   
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(rootPane,"Error in Connection"+e.getMessage());
     }
             
        }
        else
        {
               jComboBox3.removeAllItems();
                  jComboBox3.addItem("Choose Item");
          //   jTextField7.setText("");
            
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        if(jComboBox3.getSelectedIndex()>0&&jComboBox1.getSelectedIndex()>0&&jComboBox2.getSelectedIndex()>0)
        {
            String company=jComboBox1.getSelectedItem().toString();
            String name=jComboBox3.getSelectedItem().toString();
            String product=jComboBox2.getSelectedItem().toString();

            try{
                Connection myconnection;

                myconnection=DriverManager.getConnection(path+place, user, psw);
                try{
                    String a="select * from stocktable where (Name =? and company=?) and product=?";
                    PreparedStatement mystat=myconnection.prepareStatement(a);
                    mystat.setString(1,name);
                    mystat.setString(2,company);
                    mystat.setString(3,product);
                    ResultSet myresult=mystat.executeQuery();
                  if(myresult.next()){

                        jLabel14.setText(myresult.getString("Item_id"));
                        jLabel15.setText(myresult.getString("Price"));

                        jLabel16.setText(myresult.getString("Item_Quantity"));
                        jLabel17.setText(myresult.getString("GST"));

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane,"No Data Found");
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane,"Error in query"+e.getMessage());
                }
                finally{
                    myconnection.close();

                }

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane,"Error in Connection"+e.getMessage());
            }

        }

        

    }//GEN-LAST:event_jComboBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
