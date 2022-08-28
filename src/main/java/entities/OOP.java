/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import Controller.Action;
import java.util.ArrayList;
import java.util.Scanner;
import Controller.Manage_films;
import Controller.Manage_premieres;
import Controller.Manage_rooms;
import java.time.LocalDate;
/**
 *
 * @author HP
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
      ArrayList<Film> film_array = new ArrayList<>();
      ArrayList<Room> room_array = new ArrayList<>();
      ArrayList<User> user_array = new ArrayList<>();
      ArrayList<Admin> admin_array = new ArrayList<>();
      ArrayList<Premiere> premiere_array = new ArrayList<>();
      
      Manage_rooms room_manager = new Manage_rooms();
      Manage_films film_manager = new Manage_films();
      Manage_premieres premiere_manager = new Manage_premieres(film_array, film_manager, 
                   room_array, room_manager);      
      
      do{         
        System.out.println("----------------Theater Management----------------");
        System.out.println("1. Manage Films");
        System.out.println("2. Manage Rooms");
        System.out.println("3. Manage Premieres"); 
        System.out.println("7. Log out of the world");
                
        boolean out = false;
        int choice = s.nextInt();
        
        switch (choice){
           case 1 -> {
               do {
                   System.out.println("--------Manage Films--------");
                   System.out.println("1. Add a film");
                   System.out.println("2. Edit a film");
                   System.out.println("3. Remove a film");
                   System.out.println("4. Show a film's infomation");
                   System.out.println("5. Show all films' name");
                   System.out.println("7. Return to main menu");
                   
                   choice = s.nextInt();
                   
                   switch (choice){
                       case 1 -> {
                           System.out.println("  ----Add a film----");
                           
                           Film new_film = film_manager.add_item();
                           film_array.add(new_film);
                       }
                       
                       case 2 -> {
                           System.out.println("  ----Edit a film----");
                           film_manager.edit_item(film_array);
                       }
                       
                       case 3 -> {
                           System.out.println("  ----Remove a film----");
                           film_manager.remove_item(film_array);
                       }
                       
                       case 4 -> {
                           System.out.println("  ----Show a film's infomation----");
                           film_manager.show_item_info(film_array);
                       }
                       
                       case 5 -> {
                           System.out.println("  ----Show all films' name----");
                           film_manager.show_all_items(film_array);
                       }
                       
                       case 7 -> out = true;
                   }
                   
               }while(!out);
              }

           case 2 -> {
               do{
                   System.out.println("--------Manage Rooms--------");
                   System.out.println("1. Add a new room");
                   System.out.println("2. Edit a room");
                   System.out.println("3. Remove a room");
                   System.out.println("4. Show a room's information");
                   System.out.println("5. Show all rooms");
                   System.out.println("7. Return to main menu");
                   
                   
                   choice = s.nextInt();
                   switch(choice){
                       
                       case 1:
                           System.out.println(" ----Add a new room----");
                           Room new_room = room_manager.add_item();
                           room_array.add(new_room);
                           break;
                           
                       case 2:
                           System.out.println("  ----Edit a room's information----");
                           room_manager.edit_item(room_array);
                           break;
                           
                       case 3:
                           System.out.println("  ----Remove a room----");
                           room_manager.remove_item(room_array);
                           break;
                           
                       case 4:
                           System.out.println("  ----Show a room's information");
                           room_manager.show_item_info(room_array);
                           break;
                           
                       case 5:
                           System.out.println("  ----Show all rooms----");
                           room_manager.show_all_items(room_array);
                           break;
                           
                       case 7:
                           out = true;
                           break;
                   }
                   
               }while(!out);
              }

           case 3 -> {
               do{
                   System.out.println("-----------Manage Premieres-----------");
                   System.out.println("1. Add a new premiere");
                   System.out.println("2. Edit a premiere");
                   System.out.println("3. Remove a premiere");
                   System.out.println("4. Show a premiere's information");
                   System.out.println("5. Show all premieres");
                   System.out.println("7. Return to main menu");
                          
                   choice = s.nextInt();
                   switch(choice){
                       case 1 -> {
                           System.out.println(" ----Add a new premiere----");
                           Premiere new_premiere = premiere_manager.add_item();
                           premiere_array.add(new_premiere);
                       }
                       
                       case 2 -> {
                           System.out.println("  ----Edit premiere's information----");
                           premiere_manager.edit_item(premiere_array);
                       }
                       
                       case 3 -> {
                           System.out.println("  ----Remove a premiere----");
                           premiere_manager.remove_item(premiere_array);
                       }
                       
                       case 4 -> {
                           System.out.println("  ----Show a premirere's information");
                           premiere_manager.show_item_info(premiere_array);
                       }
                       
                       case 5 -> {
                           System.out.println("  ----Show all premieres----");
                           premiere_manager.show_all_items(premiere_array);
                       }
                       
                       case 7 -> out = true;
                   }
                   
               }while(!out);
              }
               
           case 7 -> {
               System.out.println("See you again!!");
               System.exit(0);  
           }
        }
       
      }while(true);
    /*
      
    User user1 = new User("Heisenberg", "110133215", "bhaf1101", "20-02-2001", "Ha Noi");
    Admin admin1 = new Admin("Jesse", "110133211", "bhaf1109", "20-03-2001", "Ha Noi");
    user1.show_type_object();
    admin1.show_type_object();
    System.out.println(user1.get_id());
    System.out.println(user1.get_name());
    System.out.println(user1.get_phone_number());
    System.out.println(user1.get_region());
*/
    }
        
  
    
}
