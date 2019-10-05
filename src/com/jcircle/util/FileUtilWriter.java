package com.jcircle.util;

import com.jcircle.model.Contact;

import java.io.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FileUtilWriter<T> {

    private  List<T> itemList = null;

     public FileUtilWriter(List<T> list) {
        this.itemList = list;
    }

    public FileUtilWriter(){

    }

    /**
     * Normal Flow with Fork & join
     */
    public void  writeWithoutForkAndJoin() {
        long startSeconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        System.out.println("-------Writing Starts------"+startSeconds);
         StringBuilder stringBuilder = new StringBuilder();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Test.txt"));) {
            if(this.itemList != null && this.itemList.size() > 0) {
                List<Contact> contactList = (List<Contact>) this.itemList;
                this.itemList.forEach(item -> {
                    try {
                        Contact contact = (Contact) item;
                        stringBuilder.append((contact.getContactId()));
                        stringBuilder.append(" ");
                        stringBuilder.append((contact.getContactName()));
                        stringBuilder.append(" ");
                        stringBuilder.append((contact.getMobile()));
                        stringBuilder.append(" ");
                        stringBuilder.append(contact.getPrimaryEmail());
                        stringBuilder.append(" ");
                        stringBuilder.append(contact.getAddress());
                        stringBuilder.append(" ");
                        stringBuilder.append('\n');
                        bufferedWriter.write(stringBuilder.toString());
                        stringBuilder.setLength(0);
                    }
                    catch(IOException ex) {
                        ex.printStackTrace();
                    }
                    finally {
                        try {
                            bufferedWriter.flush();

                        }
                        catch(IOException ex) {
                            ex.printStackTrace();
                        }


                    }
                });

                long endSeconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                System.out.println("-------Writing Ends------"+endSeconds);
            }

        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }

        catch(IOException ex) {
            ex.printStackTrace();
        }




    }

    /**
     * Normal Flow with Fork & join
     */
    public void  writeWithParallelStreams() {
        long startSeconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        System.out.println("-------Writing Starts------"+startSeconds);
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Test.txt"));) {
            if(this.itemList != null && this.itemList.size() > 0) {
                List<Contact> contactList = (List<Contact>) this.itemList;
                this.itemList.parallelStream().forEach(item -> {
                    try {
                        Contact contact = (Contact) item;
                        stringBuilder.append((contact.getContactId()));
                        stringBuilder.append(" ");
                        stringBuilder.append((contact.getContactName()));
                        stringBuilder.append(" ");
                        stringBuilder.append((contact.getMobile()));
                        stringBuilder.append(" ");
                        stringBuilder.append(contact.getPrimaryEmail());
                        stringBuilder.append(" ");
                        stringBuilder.append(contact.getAddress());
                        stringBuilder.append(" ");
                        stringBuilder.append('\n');
                        bufferedWriter.write(stringBuilder.toString());
                        stringBuilder.setLength(0);
                    }
                    catch(IOException ex) {
                        ex.printStackTrace();
                    }
                    finally {
                        try {
                            bufferedWriter.flush();

                        }
                        catch(IOException ex) {
                            ex.printStackTrace();
                        }


                    }
                });

                long endSeconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                System.out.println("-------Writing Ends------"+endSeconds);
            }

        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }

        catch(IOException ex) {
            ex.printStackTrace();
        }




    }


}
