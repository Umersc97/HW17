package HW17;

public class Students {
    String name;
    int science;
    int math;
    int art;
    int average;

    Students(String sName, int sScience, int sMath, int sArt){
        name = sName;
        science = sScience;
        math = sMath;
        art = sArt;
    }

    void displayInfo(){
        int average = (science + math + art) / 3;
        System.out.println(name + ": " + average);
    }
}
