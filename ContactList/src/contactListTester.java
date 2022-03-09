//Jaime Marrero CS 200

/*
The Tester class creates multiple Contact objects that are stored in the ContactList class. The contactList Tester adds,
changes contact information, verifies if a contact exists, and retrieves group number.
 */

public class contactListTester {
    public static void main(String[] args)   {

        //Creates Contact's and adds them to ContactList.
        ContactList contactList = new ContactList();
        contactList.addContact( new Contact("Don", 5556667777L, "5 Main Rd", 1) );
        Contact joe = new Contact("Joe", 1234567777L, "305 Abc Road", 0);
        contactList.addContact(joe);
        contactList.addContact( new Contact("Bob", 9999999999L, "123 Foo Road", 1) );
        contactList.addContact( new Contact("Jim", 1111111111L, "999 Road Rd", 1) );
        System.out.println(contactList.getAllContacts());


        //Make's changes to contact's.
        System.out.println("Changing contact list...");
        contactList.changeContactPhoneNum(0, 5557776666L);
        contactList.changeContactAddress(2, "10 Mass Ave");
        contactList.changeContactName(3, "Richard");
        System.out.println(contactList.getAllContacts());

        //Retrieves the number of Contacts and verifies if they exist.
        System.out.println("The total number of contacts in the list is: " + contactList.getTotal());
        System.out.println("Does Joe exist in contact list? : " + contactList.doesExist(joe));

        //Collects all Contact's in a Group.
        System.out.println("Contacts with group #1:");
        for(Contact group : contactList.getGroup(1)) {
            System.out.println(group);
        }
    }

}
