package Multithreading.ReactiveProg;

import Multithreading.ConcurrentProg.ExecutorEx;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class VirtualThreadEx1 implements Runnable {



    public static void main(String[] arg){

        System.out.println( "Start :: "+ Thread.currentThread().getName());
        //Thread thread = Thread.startVirtufalThread(new VirtualThreadEx1());

       // Thread.startVirtualThread()

    }

    @Override
    public void run() {
        System.out.println( "Start :: "+ Thread.currentThread().getName());
        System.out.println( "Hello This is virtual Thread :: ");

    }
}
