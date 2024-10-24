/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;
class Multithread1 extends Thread{
    int threadNumber;
    Multithread1(int tNo){
        this.threadNumber=tNo;
    
}
public void run(){
        for(int i=1;i<6;i++){
            System.out.println("task"+i+"by threadnumber"+threadNumber);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){     
                
            }
        }
    }
}
/**
 *
 * @author smv
 */
public class ThreadClassConstructor {
    public static void main(String[] args){
        for(int i=1;i<8;i++){
            Multithread1 mt1=new Multithread1(i);
            mt1.start();
            
        }
    }
}
