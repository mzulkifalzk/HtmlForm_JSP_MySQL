/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author Zulkifal
 */
public class User {
    int id;
    String name;
    String email;
//    String password;
//    String disc;
    String address;
    String companyname;
    String startdate;

    public User() {
    }

    public User(int id, String name, String email, String address, String companyname, String startdate){
        this.id = id;
        this.name = name;
        this.email = email;
//        this.password = password;
//        this.disc = disc;
        this.address = address;
        this.companyname = companyname;
        this.startdate = startdate;
    }

    public User(String name, String email, String address, String companyname, String startdate) {
        this.name = name;
        this.email = email;
//        this.password = password;
//        this.disc = disc;
        this.address = address;
        this.companyname = companyname;
        this.startdate = startdate;
    }

//    public User(String email, String password)/*, String company, String date) */{
//        this.email = email;
//        this.password = password;
//        this.company = company;
//        this.date = date;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
    
//    public void setDisc(String disc) {
//        this.disc = disc;
//    }
//
//    public String getDisc() {
//        return disc;
//    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCompanyname(){
        return companyname;
    }
    
    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }
    
    public String getStartdate(){
        return startdate;
    }
    
    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }  
}