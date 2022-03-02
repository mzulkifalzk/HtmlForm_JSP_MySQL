/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Zulkifal
 */
public class UserDatabase {
    Connection con ;

    public UserDatabase(Connection con) {
        this.con = con;
    }
    
    /*
    username    name=name
    useremail   name=email
    Password    name=password
    */
    
    //for register user 
    public boolean saveUser(User user){
        boolean set = false;
        try{
            //Insert register data to database
            String query = "insert into user(name,email,address,companyname,startdate) values(?,?,?,?,?)";
           
           PreparedStatement pt = this.con.prepareStatement(query);
           pt.setString(1, user.getName());
           pt.setString(2, user.getEmail());
//           pt.setString(3, user.getPassword());
//           pt.setString(4, user.getDisc());
           pt.setString(3, user.getAddress());
//           pt.setString(3, user.getAddress());
           pt.setString(4, user.getCompanyname());
           pt.setString(5, user.getStartdate());
           
           pt.executeUpdate();
           set = true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return set;
    }
}
