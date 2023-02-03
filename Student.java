package HW17;

public class Student {

    String name;
    String address;

    Student(String sName, String sAddress){

        name = sName;
        address = sAddress;
    }

    void displayInfo(){
        System.out.println("Student's name is " + name + " and their address is " + address);
    }
}
