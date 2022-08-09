/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project1;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author parab
 */
public class TABLES {
  public static void main(String[] args)
    {
        Connection con=null;
        Statement st=null;
        try
        {
            con= CONNECTIONPROVIDER.getCon();
            st=con.createStatement();
            
          //  st.executeUpdate("create table USERS(FIRSTNAME varchar(200)not null,LASTNAME varchar(200) not null,DATEOFBIRTH varchar(100) not null,AGE varchar(100)not null,GENDER varchar(125) not null,EMAIL varchar(300) not null, PHONENO varchar(100) not null, AADHARNO varchar(100) not null)");
            JOptionPane.showMessageDialog(null, "Table Created Sucesfully");
        }
        catch ( SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
        {
            con.close();
            st.close();
        }
        catch(Exception e)
        {}
        }
    
    }
}
