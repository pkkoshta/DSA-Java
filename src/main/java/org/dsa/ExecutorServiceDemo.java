package org.dsa;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 6; i++) {
            int request = i;
            executorService.submit(()->{
               try {
                   System.out.println("theard pool "+ request +" is executing");
                   System.out.println("request is executing "+ request+ " by thead "+Thread.currentThread().getName());
               }catch (Exception e){
                   e.printStackTrace();
               }
            });
        }
        executorService.shutdown();
    }


}
