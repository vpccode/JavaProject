package com.shoppingproject.shoppingproject.Controller;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
//import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import com.shoppingproject.shoppingproject.Model.Users;
import com.shoppingproject.shoppingproject.Repository.UsersRepo;

@Controller
public class UserController {
  
@Autowired 
   private UsersRepo userrepo;
   //Getting the Data From HTML//
    @GetMapping("/Usersadd")
    public String  Useradd(){
        return "Usersadd";
    }

  //Fetch the Data Usersignup and Save the Data in Database//
   @PostMapping("/createuser")
    public String createuser(Users user)
    {

        System.out.println("*********************");
        System.out.println("inside create");
        System.out.println("************************");

        userrepo.save(user);

         return "login";
   }
   //for Username ,password match from UserModel //
   @PostMapping("/welcome")
   public String welcome(Users user)
   {
    //   System.out.println("Email  " +user.getEmail());
    //   System.out.println("Password  " +user.getPassword());
 

    //  System.out.println("**********Users***********");
    //  System.out.println("*********************");

    List<Users> u=userrepo.findAll();
     for(Users ur:u) {
    //      System.out.println("Email  " +ur.getEmail());
    //    System.out.println("Password  " +ur.getPassword());

        if(user.getPassword().equals(ur.getPassword()) && user.getEmail().equals(ur.getEmail()))
        {
            return "index";
        }
       
     }
    
    // System.out.println("**********Users***********" +user);
    return "Error";
  
   }
   
}
