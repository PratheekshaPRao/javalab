/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Multithread3 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
            }
        }
    }
}
/**}
 * 
 *
 * @author smv
 */
public class k111 {
     public static void main(String[] args){
            Multithread3 mt1=new Multithread3 ();
            mt1.start();
            
}
}
