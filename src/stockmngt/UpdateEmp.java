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

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;


/**
 *
 * @author DELL-PC
 */
public class UpdateEmp extends javax.swing.JInternalFrame implements GlobalVariables {
File myfile;String old;
    /**
     * Creates new form UpdateEmp
     */
    public UpdateEmp() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("update_employee");

        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("DOB");

        jButton3.setLabel("Search");
        jButton3.setName(""); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Emp_id");

        jLabel3.setText("Salary");

        jLabel4.setText("Phone  No.");

        jLabel5.setText("Address");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel7.setText("Position");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Post", "Worker", "Security Gaurd", "Cleaner", " " }));

        jLabel8.setText("Gender");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setText("Update Image");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(49, 49, 49)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(68, 68, 68)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(2, 2, 2)
                                .addComponent(jRadioButton2))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(168, 168, 168)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4))
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        
        String filename="";
if(myfile.length()<300000000)
{
if(myfile!=null)
{
filename = new java.util.Date().getTime() + myfile.getName();//Date.getTime() added for unique file name.
int i;JOptionPane.showMessageDialog(rootPane,"1");
FileInputStream rd = null;
FileOutputStream outs = null;

try {
rd = new FileInputStream(myfile);
outs = new FileOutputStream("myimages\\"+filename);//writing the new file in 'Images' folder, in the project
JOptionPane.showMessageDialog(rootPane,"2");


byte[] b = new byte[2048];
while ((i = rd.read(b)) !=-1) {
outs.write(b, 0, i); //copying from pictures to empimages byte by byte
}JOptionPane.showMessageDialog(rootPane,"3");
} 
catch (Exception e) 
{
JOptionPane.showMessageDialog(rootPane, "error" + e.getMessage());
} 
finally {
try {
rd.close();
outs.close();
} catch (Exception e) {
JOptionPane.showMessageDialog(rootPane, "error in closing file" + e.getMessage());
}
}JOptionPane.showMessageDialog(rootPane,"end");
}
else
{
    filename=old;
}
        
        
       try{ 
            Connection myconnection;

            myconnection=DriverManager.getConnection(path+place, user, psw);
            try{
                JOptionPane.showMessageDialog(rootPane,"query");
                String a="update employeetable set Emp_id=?,Name=?,Phone_no=?,Address=?,Post=?,Gender=?,DOB=?,Salary=?,image=? where Name=?";
                PreparedStatement mystat=myconnection.prepareStatement(a);
                mystat.setString(1,jTextField3.getText());
                mystat.setString(2,jTextField1.getText());
                mystat.setString(3,jTextField4.getText());
                mystat.setString(4,jTextArea1.getText());
                mystat.setString(5,jComboBox1.getSelectedItem().toString());
                mystat.setString(10,jTextField1.getText());
                mystat.setString(9, filename);
                
                
                if(jRadioButton1.isSelected())
                {
                mystat.setString(6, "Male");
                }
                else if(jRadioButton2.isSelected())
                {
                mystat.setString(6, "Female");
                }

                mystat.setString(7,jTextField2.getText());

                mystat.setString(8,jFormattedTextField1.getText());

                
                
                if(mystat.executeUpdate()==1)
                {
                    JOptionPane.showMessageDialog(rootPane, "updated Successfully");
                    
                    jTextArea1.setText("");
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jComboBox1.setSelectedIndex(0);
                    buttonGroup1.clearSelection();
                    jFormattedTextField1.setText("");
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "Error in query");
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
        //     finally{
            //         myconnection.close();
            //
            //     }
        //
}JOptionPane.showMessageDialog(rootPane,"query");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          
                 try{
         Connection myconnection;
         
        
         myconnection=DriverManager.getConnection(path+place, user, psw);
         try{
             String a="select * from employeetable where Name like ?";
             PreparedStatement mystat=myconnection.prepareStatement(a);
             mystat.setString(1,'%'+jTextField1.getText()+'%');
             ResultSet myresult=mystat.executeQuery();
             
             DefaultTableModel mymodel=(DefaultTableModel) jTable1.getModel();
             
             String id,name,post,phone;
             if(myresult.next()){
                 jScrollPane1.setVisible(true);
getContentPane().revalidate();
                 mymodel.setRowCount(0);
                 do{
                     id=myresult.getString("Emp_id");
                     name=myresult.getString("Name");
                     post=myresult.getString("Post");
                     phone=myresult.getString("Phone_no");
                    mymodel.addRow(new Object[]{id,name,post,phone});
                 }
                 while(myresult.next());
                 
                 
                 
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
             
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
            Connection myconnection;

            myconnection=DriverManager.getConnection(path+place, user, psw);
            try{
                int row=jTable1.getSelectedRow();
                int col=3;
                String phone=jTable1.getValueAt(row, col).toString();

                String a="select * from employeetable where Phone_no = ?";
                PreparedStatement mystat=myconnection.prepareStatement(a);
                mystat.setString(1,phone);
                ResultSet myresult=mystat.executeQuery();

                if(myresult.next()){
                    jTextField3.setText(myresult.getString("Emp_id"));
                    jTextField1.setText(myresult.getString("Name"));
                    jTextField4.setText(myresult.getString("Phone_no"));
                    jTextArea1.setText(myresult.getString("Address"));
                     jComboBox1.setSelectedItem(myresult.getString("Post"));
                 jTextField2.setText(myresult.getString("DOB"));
             jFormattedTextField1.setText(myresult.getString("Salary"));
             
             old=myresult.getString("image");
              String ofile="myimages\\"+myresult.getString("image");
              JOptionPane.showMessageDialog(rootPane,ofile);
            Image simg = ImageIO.read( new File(ofile)).getScaledInstance( jLabel9.getWidth(), jLabel9.getHeight(),  Image.SCALE_AREA_AVERAGING);
            JOptionPane.showMessageDialog(rootPane,"abc1");
            jLabel9.setIcon(new ImageIcon(simg));
            JOptionPane.showMessageDialog(rootPane,"abc2");
             if(myresult.getString("Gender").equals("Male"))
             {
                 jRadioButton1.setSelected(true);
             }
             else
                   jRadioButton2.setSelected(true);

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

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

      
        JFileChooser myfilechooser=new JFileChooser();

        myfilechooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if(f.isDirectory())
                return true;

                String extension=f.getName().substring(f.getName().lastIndexOf(".")+1);
                String allowed[]={"jpg","png","gif","jpeg","bmp"};
                for(String a:allowed)
                {
                    if(a.equals(extension))
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                return false;

            }
            @Override
            public String getDescription() {
                return "All Picture Files";

            }

        });

        myfilechooser.showOpenDialog(rootPane);

        if(myfilechooser.showOpenDialog(rootPane)==JFileChooser.APPROVE_OPTION)
        {
            myfile=myfilechooser.getSelectedFile();
            try
            {
                Image simg = ImageIO.read( new File(myfile.getAbsolutePath())).getScaledInstance( jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_AREA_AVERAGING);
                jLabel9.setIcon(new ImageIcon(simg));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Cannot read image");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
