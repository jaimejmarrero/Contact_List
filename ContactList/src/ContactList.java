//Jaime Marrero CS 200

/*
The ContactList class creates an array that stores the created contacts. The class also allows you to swap contact
information based on its location in the Array List with its location in the ith position. Class also has a method that
creates an Array for the Group number. Finally, it prints out all the contacts names, address, phone numbers, and group.
 */

import java.util.ArrayList;
import java.util.List;


public class ContactList {
    private List<Contact> contactList;

    public ContactList() {
        this.contactList = new ArrayList<>();
    }

    public ContactList(List<Contact> contacts) {
        this.contactList = contacts;
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public void changeContactName(int i, String n) {
        Contact con = contactList.get(i);
        con.setName(n);
    }

    public void changeContactPhoneNum(int i, long phone) {
        Contact con = contactList.get(i);
        con.setPhoneNumber(phone);
    }

    public void changeContactAddress(int i, String add) {
        Contact con = contactList.get(i);
        con.setAddress(add);
    }

    public String getNameFor(int i) {
        return contactList.get(i).getName();
    }

    public long getPhoneFor(int i) {
        return contactList.get(i).getPhoneNumber();
    }

    public String getAddressFor(int i) {
        return contactList.get(i).getAddress();
    }

    public int getTotal() {
        return contactList.size();
    }

    //Reviews the ArrayList to see if there is a matching phone number, if false, throws an exception.
    public String whosePhoneNum(long phoneNum) throws Exception {
        for (Contact con : contactList) {
            if(con.getPhoneNumber() == phoneNum) return con.getName();
        }
        throw new Exception("Unable to find phone number");
    }
    //Creates a new ArrayList to create a group, and adds it to that Group.
    public Contact[] getGroup(int g) {
        List<Contact> result = new ArrayList<Contact>();
        for(Contact con : contactList) {
            if(con.getGroupCategory() == g) result.add(con);
        }
        Contact[] arr = new Contact[result.size()];
        arr = result.toArray(arr);
        return arr;
    }

    public boolean doesExist(Contact c) {
        for(Contact con : contactList) {
            if(c == con) return true;
        }
        return false;
    }

    //Creates/Returns a String with all the Contact's information from the ContactList ArrayList.
    public String getAllContacts() {
        StringBuilder builder = new StringBuilder();
        for(Contact con : contactList) {
            builder.append(String.format("%s %s %s %s\n", con.getName(), con.getPhoneNumber(), con.getAddress(), con.getGroupCategory()));
        }
        return builder.toString();
    }
}
