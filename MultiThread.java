/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
class multithreading extends Thread{
    public void run(){
        try {
            System.out.println("Thread"+Thread.currentThread().getId()+"is running");
        }
        catch(Exception e){
            System.out.println("exception is caught");
        }
    }
}

       
            
            
        
    

/**
 *
 * @author smv
 */
public class MultiThread {
    public static void main(String[]args){
        for(int i=0;i<8;i++){
            multithreading mt1=new multithreading();
            mt1.start();
        }
    }
}
        
    

