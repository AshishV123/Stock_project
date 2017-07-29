package stockmngt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static stockmngt.GlobalVariables.path;
import static stockmngt.GlobalVariables.place;
import static stockmngt.GlobalVariables.psw;
import static stockmngt.GlobalVariables.user;

public class Stockmngt {
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error In Applying Nimus Field");
        }
           
                 try{
         Connection myconnection;
         
        
         myconnection=DriverManager.getConnection(path+place, user, psw);
         try{
             String a="select * from logintable";
             PreparedStatement mystat=myconnection.prepareStatement(a);
           ResultSet myresult=mystat.executeQuery();
           
           if(myresult.next())
           {
               commonlogin obj=new commonlogin();
               obj.setVisible(true);
           }
           else
           {
               firstLogin obj =new firstLogin();
               obj.setVisible(true);
           }
           
           
           
           
             //JOptionPane.showMessageDialog(null,myresult.toString());
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,"Error in query"+e.getMessage());
         }
         finally{
         myconnection.close();
         
     }
               
     }   
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,"Error in Connection"+e.getMessage());
     }
             
        
        
        
        
        
        
        
    
    }
    
}
