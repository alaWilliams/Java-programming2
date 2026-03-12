
// test list

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> myList = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();

        myList.add("Snoopy");
        myList.add("Mickey");
        myList.add("Hamster");

        myList.add("abc");
        myList.add("def");
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (Object s : myList){
            System.out.println(s);
        }

        int number = intList.get(2);
        System.out.println(number);
    }
}
