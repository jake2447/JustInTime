
import java.util.*;

public class MainUItempsim {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc = new Scanner(System.in);
        String password = sc.nextLine();

        User sta = new User(name, password);
        System.out.println(sta.getName());
        System.out.println(sta.getPassword());
    }
}