/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class Nim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String user1, user2, pilePick;
        int Pile1, Pile2, Pile3, counter, userRemoval, sum1, sum2;
        
        Pile1 = 3;
        Pile2 = 10;
        Pile3 = 12;
        
        counter = 1;
        sum1 = 0;
        sum2 = 0;
        
        System.out.print("Player 1, enter your name: ");
        user1 = keyboard.next();
        System.out.print("Player 2, enter your name: ");
        user2 = keyboard.next();
        
        
        while(counter > 0){
        
            System.out.print("A: " + Pile1 + " B: " + Pile2 + " C: " + Pile3 + "\n" + "\n" + user1 + ", pick a pile: ");
            pilePick = keyboard.next();
            System.out.print(user1 + " how many to you want to remove from pile " + pilePick + ": ");
            userRemoval = keyboard.nextInt();
            if("a".equals(pilePick)){
            
                Pile1 = Pile1 - userRemoval;
                if(Pile1 <= 0){
                    Pile1 = 0;
                }
            }else if("b".equals(pilePick)){
            
                Pile2 = Pile2 - userRemoval;
                if(Pile2 <= 0){
                    Pile2 = 0;
                }
            }else if("c".equals(pilePick)){
            
                Pile3 = Pile3 - userRemoval;
                if(Pile3 <= 0){
                    Pile3 = 0;
                }
            }
            if((Pile1 + Pile2 + Pile3) == 0){
                System.out.println(user2 + ", there are no counters left, so you WIN!");
                counter = 0;
                break;
            }
            
            System.out.print("A: " + Pile1 + " B: " + Pile2 + " C: " + Pile3 + "\n" + "\n" + user2 + ", pick a pile: ");
            pilePick = keyboard.next();
            System.out.print(user2 + " how many to you want to remove from pile " + pilePick + ": ");
            userRemoval = keyboard.nextInt();
            if("a".equals(pilePick)){
            
                Pile1 = Pile1 - userRemoval;
                if(Pile1 <= 0){
                    Pile1 = 0;
                }
            }else if("b".equals(pilePick)){
            
                Pile2 = Pile2 - userRemoval;
                if(Pile2 <= 0){
                    Pile2 = 0;
                }
            }else if("c".equals(pilePick)){
            
                Pile3 = Pile3 - userRemoval;
                if(Pile3 <= 0){
                    Pile3 = 0;
                }
            }
            if((Pile1 + Pile2 + Pile3) == 0){
                System.out.println(user1 + ", there are no counters left, so you WIN!");
                counter = 0;
                break;
            }
        }
            
            
  
    
    }
 }
    

