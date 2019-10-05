package com.jcircle.app;

import com.jcircle.model.Contact;
import com.jcircle.util.FileUtilWriter;
import com.jcircle.util.ForkJoinFileWriter;
import com.jcircle.util.LoadContactsUtil;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class DataLoadApp {



    public static void main(String[] args) {

        long startSeconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        System.out.println("-------Processing Starts------"+startSeconds);
        Contact contact = new Contact();
        List<Contact> contactList = LoadContactsUtil.getPopulatedList(contact);
        ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        ForkJoinFileWriter forkJoinFileWriter = new ForkJoinFileWriter(contactList);
        pool.invoke(forkJoinFileWriter);
      //  FileUtilWriter fileWriter = new FileUtilWriter(contactList);
       // fileWriter.writeWithoutForkAndJoin();
       // fileWriter.writeWithParallelStreams();
        long endSeconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        System.out.println("-------Processing Ends------"+endSeconds);
    }
}
