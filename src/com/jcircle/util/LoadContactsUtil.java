package com.jcircle.util;

import com.jcircle.model.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoadContactsUtil {


    public static <T> List<T>  getPopulatedList(T t) {
        List<T> listObj = null;
        LoadContactsUtil utilObj = new LoadContactsUtil();

        if(t!=null) {

           String objectName = t.getClass().getSimpleName();
            listObj = getObjectList(objectName);
        }
      return listObj;
    }


    public static <T> List<T>  getObjectList(String objectName) {
        List<T> objectList = null;
        LoadContactsUtil loadContactsUtil = new LoadContactsUtil();
        if(objectName.equalsIgnoreCase("Contact")) {
            objectList = (List) loadContactsUtil.getContacts();

        }
        return objectList;
    }

    private List<Contact> getContacts() {

        long startSeconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        System.out.println("-------Loading Contacts------"+startSeconds);
        System.out.println("-----Inside Get Contact-----");
        List<Contact> contactList = new ArrayList<Contact>();
        Contact contactObj = new Contact();
        contactObj.setContactName("Test1");
        contactObj.setAddress("56 Newyork 676");
        contactObj.setMobile(233);
        contactObj.setContactId("123");
        contactObj.setPrimaryEmail("Test1@yaho.com");
        contactList.add(contactObj);
        //2
        contactObj = new Contact();
        contactObj.setContactName("Test2");
        contactObj.setAddress("Chicago 676");
        contactObj.setMobile(22344);
        contactObj.setContactId("167");
        contactObj.setPrimaryEmail("tye@yaho.com");
        contactList.add(contactObj);
        //3
        contactObj = new Contact();
        contactObj.setContactName("Test3");
        contactObj.setAddress("Dayton 343");
        contactObj.setMobile(209);
        contactObj.setContactId("198");
        contactObj.setPrimaryEmail("GERT@yaho.com");
        contactList.add(contactObj);
        //4
        contactObj = new Contact();
        contactObj.setContactName("Test5");
        contactObj.setAddress("Houston");
        contactObj.setMobile(278);
        contactObj.setContactId("0998");
        contactObj.setPrimaryEmail("hert@yaho.com");
        contactList.add(contactObj);



        contactObj = new Contact();
        contactObj.setContactName("Test875");
        contactObj.setAddress("China");
        contactObj.setMobile(012);
        contactObj.setContactId("89");
        contactObj.setPrimaryEmail("WQE@teerrs.com");
        contactList.add(contactObj);
        //8
        contactObj = new Contact();
        contactObj.setContactName("Test556");
        contactObj.setAddress("WI");
        contactObj.setMobile(9834);
        contactObj.setContactId("08764");
        contactObj.setPrimaryEmail("WSDE@Gmai.com");
        contactList.add(contactObj);
        //9
        contactObj = new Contact();
        contactObj.setContactName("Test5642");
        contactObj.setAddress("Dallas");
        contactObj.setMobile(3344);
        contactObj.setContactId("90867");
        contactObj.setPrimaryEmail("WSDE@gmal.com");
        contactList.add(contactObj);



        //9
        contactObj = new Contact();
        contactObj.setContactName("Test5642");
        contactObj.setAddress("Dallas");
        contactObj.setMobile(3344);
        contactObj.setContactId("90867");
        contactObj.setPrimaryEmail("WSDE@gmal.com");
        contactList.add(contactObj);
        //10
        contactObj = new Contact();
        contactObj.setContactName("GGTTHH");
        contactObj.setAddress("Chennai");
        contactObj.setMobile(7654);
        contactObj.setContactId("443311");
        contactObj.setPrimaryEmail("NJAN@SIFY.com");
        contactList.add(contactObj);
        //11
        contactObj = new Contact();
        contactObj.setContactName("Test154");
        contactObj.setAddress("Gadi");
        contactObj.setMobile(765);
        contactObj.setContactId("0909");
        contactObj.setPrimaryEmail("Vendga@yaho.com");
        contactList.add(contactObj);

        //11
        contactObj = new Contact();
        contactObj.setContactName("Test154");
        contactObj.setAddress("Gadi");
        contactObj.setMobile(765);
        contactObj.setContactId("0909");
        contactObj.setPrimaryEmail("Vendga@yaho.com");
        contactList.add(contactObj);
        //12
        contactObj = new Contact();
        contactObj.setContactName("Test1665");
        contactObj.setAddress("Ceylon");
        contactObj.setMobile(5432);
        contactObj.setContactId("9875");
        contactObj.setPrimaryEmail("gokli@yaho.com");
        contactList.add(contactObj);
        //13
        contactObj = new Contact();
        contactObj.setContactName("Test909u");
        contactObj.setAddress("Delhi");
        contactObj.setMobile(545);
        contactObj.setContactId("90986");
        contactObj.setPrimaryEmail("enith@gmail.com");
        contactList.add(contactObj);
        //14
        contactObj = new Contact();
        contactObj.setContactName("Rajini");
        contactObj.setAddress("Philipin");
        contactObj.setMobile(8987);
        contactObj.setContactId("3323");
        contactObj.setPrimaryEmail("Rajini@yaho.com");
        contactList.add(contactObj);
        //15
        contactObj = new Contact();
        contactObj.setContactName("Kathir");
        contactObj.setAddress("Karisipatto");
        contactObj.setMobile(332);
        contactObj.setContactId("975");
        contactObj.setPrimaryEmail("Kathir@kariiap.com");
        contactList.add(contactObj);
        //16
        contactObj = new Contact();
        contactObj.setContactName("Eroo");
        contactObj.setAddress("Japan");
        contactObj.setMobile(664);
        contactObj.setContactId("6647");
        contactObj.setPrimaryEmail("Error@gmsik.com");
        contactList.add(contactObj);
        //17
        contactObj = new Contact();
        contactObj.setContactName("Hileer");
        contactObj.setAddress("Germany");
        contactObj.setMobile(909);
        contactObj.setContactId("7654");
        contactObj.setPrimaryEmail("Hile@germ.com");
        contactList.add(contactObj);//2
        contactObj = new Contact();
        contactObj.setContactName("Test2");
        contactObj.setAddress("Chicago 676");
        contactObj.setMobile(22344);
        contactObj.setContactId("167");
        contactObj.setPrimaryEmail("tye@yaho.com");
        contactList.add(contactObj);
        //3
        contactObj = new Contact();
        contactObj.setContactName("Test3");
        contactObj.setAddress("Dayton 343");
        contactObj.setMobile(209);
        contactObj.setContactId("198");
        contactObj.setPrimaryEmail("GERT@yaho.com");
        contactList.add(contactObj);
        //4
        contactObj = new Contact();
        contactObj.setContactName("Test5");
        contactObj.setAddress("Houston");
        contactObj.setMobile(278);
        contactObj.setContactId("0998");
        contactObj.setPrimaryEmail("hert@yaho.com");
        contactList.add(contactObj);
        //5
        contactObj = new Contact();
        contactObj.setContactName("Test8");
        contactObj.setAddress("Buffalo");
        contactObj.setMobile(200);
        contactObj.setContactId("985");
        contactObj.setPrimaryEmail("Deer@gmail.com");
        contactList.add(contactObj);
        //6
        contactObj = new Contact();
        contactObj.setContactName("Test56");
        contactObj.setAddress("Madurai");
        contactObj.setMobile(112);
        contactObj.setContactId("098");
        contactObj.setPrimaryEmail("WEE@TERT.com");
        contactList.add(contactObj);
        //7
        contactObj = new Contact();
        contactObj.setContactName("Test875");
        contactObj.setAddress("China");
        contactObj.setMobile(012);
        contactObj.setContactId("89");
        contactObj.setPrimaryEmail("WQE@teerrs.com");
        contactList.add(contactObj);
        //8
        contactObj = new Contact();
        contactObj.setContactName("Test556");
        contactObj.setAddress("WI");
        contactObj.setMobile(9834);
        contactObj.setContactId("08764");
        contactObj.setPrimaryEmail("WSDE@Gmai.com");
        contactList.add(contactObj);
        //9
        contactObj = new Contact();
        contactObj.setContactName("Test5642");
        contactObj.setAddress("Dallas");
        contactObj.setMobile(3344);
        contactObj.setContactId("90867");
        contactObj.setPrimaryEmail("WSDE@gmal.com");
        contactList.add(contactObj);
        //10
        contactObj = new Contact();
        contactObj.setContactName("GGTTHH");
        contactObj.setAddress("Chennai");
        contactObj.setMobile(7654);
        contactObj.setContactId("443311");
        contactObj.setPrimaryEmail("NJAN@SIFY.com");
        contactList.add(contactObj);
        //11
        contactObj = new Contact();
        contactObj.setContactName("Test154");
        contactObj.setAddress("Gadi");
        contactObj.setMobile(765);
        contactObj.setContactId("0909");
        contactObj.setPrimaryEmail("Vendga@yaho.com");
        contactList.add(contactObj);
        //12
        contactObj = new Contact();
        contactObj.setContactName("Test1665");
        contactObj.setAddress("Ceylon");
        contactObj.setMobile(5432);
        contactObj.setContactId("9875");
        contactObj.setPrimaryEmail("gokli@yaho.com");
        contactList.add(contactObj);
        //13
        contactObj = new Contact();
        contactObj.setContactName("Test909u");
        contactObj.setAddress("Delhi");
        contactObj.setMobile(545);
        contactObj.setContactId("90986");
        contactObj.setPrimaryEmail("enith@gmail.com");
        contactList.add(contactObj);
        //14
        contactObj = new Contact();
        contactObj.setContactName("Rajini");
        contactObj.setAddress("Philipin");
        contactObj.setMobile(8987);
        contactObj.setContactId("3323");
        contactObj.setPrimaryEmail("Rajini@yaho.com");
        contactList.add(contactObj);
        //15
        contactObj = new Contact();
        contactObj.setContactName("Kathir");
        contactObj.setAddress("Karisipatto");
        contactObj.setMobile(332);
        contactObj.setContactId("975");
        contactObj.setPrimaryEmail("Kathir@kariiap.com");
        contactList.add(contactObj);
        //16
        contactObj = new Contact();
        contactObj.setContactName("Eroo");
        contactObj.setAddress("Japan");
        contactObj.setMobile(664);
        contactObj.setContactId("6647");
        contactObj.setPrimaryEmail("Error@gmsik.com");
        contactList.add(contactObj);
        //17
        contactObj = new Contact();
        contactObj.setContactName("Hileer");
        contactObj.setAddress("Germany");
        contactObj.setMobile(909);
        contactObj.setContactId("7654");
        contactObj.setPrimaryEmail("Hile@germ.com");
        contactList.add(contactObj);//2
        contactObj = new Contact();
        contactObj.setContactName("Test2");
        contactObj.setAddress("Chicago 676");
        contactObj.setMobile(22344);
        contactObj.setContactId("167");
        contactObj.setPrimaryEmail("tye@yaho.com");
        contactList.add(contactObj);
        //3
        contactObj = new Contact();
        contactObj.setContactName("Test3");
        contactObj.setAddress("Dayton 343");
        contactObj.setMobile(209);
        contactObj.setContactId("198");
        contactObj.setPrimaryEmail("GERT@yaho.com");
        contactList.add(contactObj);
        //4
        contactObj = new Contact();
        contactObj.setContactName("Test5");
        contactObj.setAddress("Houston");
        contactObj.setMobile(278);
        contactObj.setContactId("0998");
        contactObj.setPrimaryEmail("hert@yaho.com");
        contactList.add(contactObj);
        //5
        contactObj = new Contact();
        contactObj.setContactName("Test8");
        contactObj.setAddress("Buffalo");
        contactObj.setMobile(200);
        contactObj.setContactId("985");
        contactObj.setPrimaryEmail("Deer@gmail.com");
        contactList.add(contactObj);
        //6
        contactObj = new Contact();
        contactObj.setContactName("Test56");
        contactObj.setAddress("Madurai");
        contactObj.setMobile(112);
        contactObj.setContactId("098");
        contactObj.setPrimaryEmail("WEE@TERT.com");
        contactList.add(contactObj);
        //7
        contactObj = new Contact();
        contactObj.setContactName("Test875");
        contactObj.setAddress("China");
        contactObj.setMobile(012);
        contactObj.setContactId("89");
        contactObj.setPrimaryEmail("WQE@teerrs.com");
        contactList.add(contactObj);
        //8
        contactObj = new Contact();
        contactObj.setContactName("Test556");
        contactObj.setAddress("WI");
        contactObj.setMobile(9834);
        contactObj.setContactId("08764");
        contactObj.setPrimaryEmail("WSDE@Gmai.com");
        contactList.add(contactObj);
        //9
        contactObj = new Contact();
        contactObj.setContactName("Test5642");
        contactObj.setAddress("Dallas");
        contactObj.setMobile(3344);
        contactObj.setContactId("90867");
        contactObj.setPrimaryEmail("WSDE@gmal.com");
        contactList.add(contactObj);
        //10
        contactObj = new Contact();
        contactObj.setContactName("GGTTHH");
        contactObj.setAddress("Chennai");
        contactObj.setMobile(7654);
        contactObj.setContactId("443311");
        contactObj.setPrimaryEmail("NJAN@SIFY.com");
        contactList.add(contactObj);
        //11
        contactObj = new Contact();
        contactObj.setContactName("Test154");
        contactObj.setAddress("Gadi");
        contactObj.setMobile(765);
        contactObj.setContactId("0909");
        contactObj.setPrimaryEmail("Vendga@yaho.com");
        contactList.add(contactObj);
        //12
        contactObj = new Contact();
        contactObj.setContactName("Test1665");
        contactObj.setAddress("Ceylon");
        contactObj.setMobile(5432);
        contactObj.setContactId("9875");
        contactObj.setPrimaryEmail("gokli@yaho.com");
        contactList.add(contactObj);
        //13
        contactObj = new Contact();
        contactObj.setContactName("Test909u");
        contactObj.setAddress("Delhi");
        contactObj.setMobile(545);
        contactObj.setContactId("90986");
        contactObj.setPrimaryEmail("enith@gmail.com");
        contactList.add(contactObj);
        //14
        contactObj = new Contact();
        contactObj.setContactName("Rajini");
        contactObj.setAddress("Philipin");
        contactObj.setMobile(8987);
        contactObj.setContactId("3323");
        contactObj.setPrimaryEmail("Rajini@yaho.com");
        contactList.add(contactObj);
        //15
        contactObj = new Contact();
        contactObj.setContactName("Kathir");
        contactObj.setAddress("Karisipatto");
        contactObj.setMobile(332);
        contactObj.setContactId("975");
        contactObj.setPrimaryEmail("Kathir@kariiap.com");
        contactList.add(contactObj);
        //16
        contactObj = new Contact();
        contactObj.setContactName("Eroo");
        contactObj.setAddress("Japan");
        contactObj.setMobile(664);
        contactObj.setContactId("6647");
        contactObj.setPrimaryEmail("Error@gmsik.com");
        contactList.add(contactObj);
        //17
        contactObj = new Contact();
        contactObj.setContactName("Hileer");
        contactObj.setAddress("Germany");
        contactObj.setMobile(909);
        contactObj.setContactId("7654");
        contactObj.setPrimaryEmail("Hile@germ.com");
        contactList.add(contactObj);//2
        contactObj = new Contact();
        contactObj.setContactName("Test2");
        contactObj.setAddress("Chicago 676");
        contactObj.setMobile(22344);
        contactObj.setContactId("167");
        contactObj.setPrimaryEmail("tye@yaho.com");
        contactList.add(contactObj);

        //16
        contactObj = new Contact();
        contactObj.setContactName("Eroo");
        contactObj.setAddress("Japan");
        contactObj.setMobile(664);
        contactObj.setContactId("6647");
        contactObj.setPrimaryEmail("Error@gmsik.com");
        contactList.add(contactObj);
        //17
        contactObj = new Contact();
        contactObj.setContactName("Hileer");
        contactObj.setAddress("Germany");
        contactObj.setMobile(909);
        contactObj.setContactId("7654");
        contactObj.setPrimaryEmail("Hile@germ.com");
        contactList.add(contactObj);//2
        contactObj = new Contact();
        contactObj.setContactName("Test2");
        contactObj.setAddress("Chicago 676");
        contactObj.setMobile(22344);
        contactObj.setContactId("167");
        contactObj.setPrimaryEmail("tye@yaho.com");
        contactList.add(contactObj);
        //3
        contactObj = new Contact();
        contactObj.setContactName("Test3");
        contactObj.setAddress("Dayton 343");
        contactObj.setMobile(209);
        contactObj.setContactId("198");
        contactObj.setPrimaryEmail("GERT@yaho.com");
        contactList.add(contactObj);
        //4
        contactObj = new Contact();
        contactObj.setContactName("Test5");
        contactObj.setAddress("Houston");
        contactObj.setMobile(278);
        contactObj.setContactId("0998");
        contactObj.setPrimaryEmail("hert@yaho.com");
        contactList.add(contactObj);
        //5
        contactObj = new Contact();
        contactObj.setContactName("Test8");
        contactObj.setAddress("Buffalo");
        contactObj.setMobile(200);
        contactObj.setContactId("985");
        contactObj.setPrimaryEmail("Deer@gmail.com");
        contactList.add(contactObj);
        //6
        contactObj = new Contact();
        contactObj.setContactName("Test56");
        contactObj.setAddress("Madurai");
        contactObj.setMobile(112);
        contactObj.setContactId("098");
        contactObj.setPrimaryEmail("WEE@TERT.com");
        contactList.add(contactObj);
        //7
        contactObj = new Contact();
        contactObj.setContactName("Test875");
        contactObj.setAddress("China");
        contactObj.setMobile(012);
        contactObj.setContactId("89");
        contactObj.setPrimaryEmail("WQE@teerrs.com");
        contactList.add(contactObj);
        //8
        contactObj = new Contact();
        contactObj.setContactName("Test556");
        contactObj.setAddress("WI");
        contactObj.setMobile(9834);
        contactObj.setContactId("08764");
        contactObj.setPrimaryEmail("WSDE@Gmai.com");
        contactList.add(contactObj);
        //9
        contactObj = new Contact();
        contactObj.setContactName("Test5642");
        contactObj.setAddress("Dallas");
        contactObj.setMobile(3344);
        contactObj.setContactId("90867");
        contactObj.setPrimaryEmail("WSDE@gmal.com");
        contactList.add(contactObj);
        //10
        contactObj = new Contact();
        contactObj.setContactName("GGTTHH");
        contactObj.setAddress("Chennai");
        contactObj.setMobile(7654);
        contactObj.setContactId("443311");
        contactObj.setPrimaryEmail("NJAN@SIFY.com");
        contactList.add(contactObj);
        //11
        contactObj = new Contact();
        contactObj.setContactName("Test154");
        contactObj.setAddress("Gadi");
        contactObj.setMobile(765);
        contactObj.setContactId("0909");
        contactObj.setPrimaryEmail("Vendga@yaho.com");
        contactList.add(contactObj);
        //12
        contactObj = new Contact();
        contactObj.setContactName("Test1665");
        contactObj.setAddress("Ceylon");
        contactObj.setMobile(5432);
        contactObj.setContactId("9875");
        contactObj.setPrimaryEmail("gokli@yaho.com");
        contactList.add(contactObj);
        //13
        contactObj = new Contact();
        contactObj.setContactName("Test909u");
        contactObj.setAddress("Delhi");
        contactObj.setMobile(545);
        contactObj.setContactId("90986");
        contactObj.setPrimaryEmail("enith@gmail.com");
        contactList.add(contactObj);
        //14
        contactObj = new Contact();
        contactObj.setContactName("Rajini");
        contactObj.setAddress("Philipin");
        contactObj.setMobile(8987);
        contactObj.setContactId("3323");
        contactObj.setPrimaryEmail("Rajini@yaho.com");
        contactList.add(contactObj);
        //15
        contactObj = new Contact();
        contactObj.setContactName("Kathir");
        contactObj.setAddress("Karisipatto");
        contactObj.setMobile(332);
        contactObj.setContactId("975");
        contactObj.setPrimaryEmail("Kathir@kariiap.com");
        contactList.add(contactObj);
        //16
        contactObj = new Contact();
        contactObj.setContactName("Eroo");
        contactObj.setAddress("Japan");
        contactObj.setMobile(664);
        contactObj.setContactId("6647");
        contactObj.setPrimaryEmail("Error@gmsik.com");
        contactList.add(contactObj);
        //17
        contactObj = new Contact();
        contactObj.setContactName("Hileer");
        contactObj.setAddress("Germany");
        contactObj.setMobile(909);
        contactObj.setContactId("7654");
        contactObj.setPrimaryEmail("Hile@germ.com");
        contactList.add(contactObj);//2
        contactObj = new Contact();
        contactObj.setContactName("Test2");
        contactObj.setAddress("Chicago 676");
        contactObj.setMobile(22344);
        contactObj.setContactId("167");
        contactObj.setPrimaryEmail("tye@yaho.com");
        contactList.add(contactObj);
        //3
        contactObj = new Contact();
        contactObj.setContactName("Test3");
        contactObj.setAddress("Dayton 343");
        contactObj.setMobile(209);
        contactObj.setContactId("198");
        contactObj.setPrimaryEmail("GERT@yaho.com");
        contactList.add(contactObj);
        //4
        contactObj = new Contact();
        contactObj.setContactName("Test5");
        contactObj.setAddress("Houston");
        contactObj.setMobile(278);
        contactObj.setContactId("0998");
        contactObj.setPrimaryEmail("hert@yaho.com");
        contactList.add(contactObj);
        //5
        contactObj = new Contact();
        contactObj.setContactName("Test8");
        contactObj.setAddress("Buffalo");
        contactObj.setMobile(200);
        contactObj.setContactId("985");
        contactObj.setPrimaryEmail("Deer@gmail.com");
        contactList.add(contactObj);
        //6
        contactObj = new Contact();
        contactObj.setContactName("Test56");
        contactObj.setAddress("Madurai");
        contactObj.setMobile(112);
        contactObj.setContactId("098");
        contactObj.setPrimaryEmail("WEE@TERT.com");
        contactList.add(contactObj);
        //7
        contactObj = new Contact();
        contactObj.setContactName("Test875");
        contactObj.setAddress("China");
        contactObj.setMobile(012);
        contactObj.setContactId("89");
        contactObj.setPrimaryEmail("WQE@teerrs.com");
        contactList.add(contactObj);
        //8
        contactObj = new Contact();
        contactObj.setContactName("Test556");
        contactObj.setAddress("WI");
        contactObj.setMobile(9834);
        contactObj.setContactId("08764");
        contactObj.setPrimaryEmail("WSDE@Gmai.com");
        contactList.add(contactObj);
        //9
        contactObj = new Contact();
        contactObj.setContactName("Test5642");
        contactObj.setAddress("Dallas");
        contactObj.setMobile(3344);
        contactObj.setContactId("90867");
        contactObj.setPrimaryEmail("WSDE@gmal.com");
        contactList.add(contactObj);
        //10
        contactObj = new Contact();
        contactObj.setContactName("GGTTHH");
        contactObj.setAddress("Chennai");
        contactObj.setMobile(7654);
        contactObj.setContactId("443311");
        contactObj.setPrimaryEmail("NJAN@SIFY.com");
        contactList.add(contactObj);
        //11
        contactObj = new Contact();
        contactObj.setContactName("Test154");
        contactObj.setAddress("Gadi");
        contactObj.setMobile(765);
        contactObj.setContactId("0909");
        contactObj.setPrimaryEmail("Vendga@yaho.com");
        contactList.add(contactObj);
        //12
        contactObj = new Contact();
        contactObj.setContactName("Test1665");
        contactObj.setAddress("Ceylon");
        contactObj.setMobile(5432);
        contactObj.setContactId("9875");
        contactObj.setPrimaryEmail("gokli@yaho.com");
        contactList.add(contactObj);
        for(int i=0;i<900000;i++) {
            contactList.add(contactObj);
        }

        long endSeconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        System.out.println("-------Loading Contacts Ends------"+endSeconds);

        return contactList;
    }
}
