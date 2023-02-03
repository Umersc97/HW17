package HW17;

public class Constructor {

    String name;
    String color;
    int num;

    Constructor(String sName, String sColor, int sNum){
        name = sName;
        color = sColor;
        num = sNum;
    }

    void displayInfo(){
        System.out.println("Name: "+ name + "Color: " + color + "Number: " + num);
    }
}
