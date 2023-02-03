package HW17;

public class AccessLevelsTester {
    public static void main(String[] args) {
        //AccessLevels lvl1=new AccessLevels(); //not possible as constructor is private
        AccessLevels lvl2=new AccessLevels("Java");
        AccessLevels lvl3=new AccessLevels(1000);
        AccessLevels lvl4=new AccessLevels('G');

    }
}
