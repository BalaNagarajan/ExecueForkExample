package com.jcircle.util;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class ForkJoinFileWriter<T> extends RecursiveTask {

   private List<T> inputList;

   private static final int LIST_THRESHOLD = 5000;

   public ForkJoinFileWriter(List<T> inputList) {

       this.inputList = inputList;

   }


    @Override
    protected Object compute() {

       System.out.println(inputList.size());
       if(inputList != null && inputList.size() > 0) {

           if(inputList.size() <= LIST_THRESHOLD) {
               System.out.println("IF");
               FileUtilWriter fileWriter = new FileUtilWriter(inputList);
               fileWriter.writeWithoutForkAndJoin();


           }
           else {
               System.out.println("ELSE");
               int length = inputList.size();
               int half = length / 2;

               ForkJoinFileWriter writerOne = new ForkJoinFileWriter(inputList.subList(0,half));
               ForkJoinFileWriter writerTwo = new ForkJoinFileWriter(inputList.subList(half,length));
               writerOne.fork();
               writerTwo.fork();

             //  invokeAll(writerOne,writerTwo);
           }

       }

        return null;
    }

    public void writeToFile(List<T> contactList) {
        FileUtilWriter fileWriter = new FileUtilWriter(inputList);
        fileWriter.writeWithoutForkAndJoin();


    }
}
