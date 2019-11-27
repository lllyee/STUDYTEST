package com.company;

import java.util.Collections;

public class RunnableTest {
    public static void main(String[] args){
        class MyRunnable implements Runnable{

            private int ticket=10;
            public void run() {

               for(int i=0;i<20;i++){
                   if(this.ticket>0){
                       System.out.println(Thread.currentThread().getName()+"买票:..."+this.ticket--);
                   }

               }


            }
        }

        MyRunnable runn=new MyRunnable();
        Thread t1=new Thread(runn);
        Thread t2=new Thread(runn);
        Thread t3=new Thread(runn);
        t1.start();
        t2.start();
        t3.start();
    }
}
