/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
class Multithread implements Runnable{
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
public class runnableInference {
    public static void main(String[]args){
        for(int i=0;i<8;i++){
            Multithread mt1=new Multithread();
            Thread t1=new Thread(mt1);
            t1.start();
        }
    }
}