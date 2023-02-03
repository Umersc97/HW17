package HW17;

public class AccessLevels {
    private AccessLevels(){
        System.out.println("Constructor without any parameters");
    }

    AccessLevels(String name){
        System.out.println("Constructor with a String as parameter");
    }

    protected AccessLevels(int number){
        System.out.println("Constructor with an Int as parameter");
    }

    public AccessLevels(char c){
        System.out.println("Constructor with an Char as parameter");
    }

    public static void main(String[] args) {
        AccessLevels lvl1=new AccessLevels();
        AccessLevels lvl2=new AccessLevels("Java");
        AccessLevels lvl3=new AccessLevels(1000);
        AccessLevels lvl4=new AccessLevels('G');
    }
}
