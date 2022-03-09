//Jaime Marrero CS 200

/*
Creates a Contact that has a Name, Phone Number, Address, and Group. The phone number is stored as a Long variable
because it is able to store 64 bits of memory. Other than that, the class is built with setters/getters.
 */

public class Contact {
    private String name;
    private long phoneNumber;
    private String address;
    private int groupCategory;

    public Contact(){
        this.name="";
        this.phoneNumber = 0;
        this.address="";
        this.groupCategory=0;
    }
    public Contact(String name, long phoneNumber, String address, int groupCategory){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.address=address;
        this.groupCategory=groupCategory;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getGroupCategory(){
        return groupCategory;
    }

    public void setGroupCategory(int groupCategory){
        this.groupCategory = groupCategory;
    }

    //Returns a toString with all the Contact's information from the ContactList ArrayList.
    public String toString() {
        return String.format("%s %s %s %s", getName(), getPhoneNumber(), getAddress(), getGroupCategory());
    }
}
