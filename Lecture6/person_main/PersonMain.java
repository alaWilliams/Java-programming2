
public class PersonMain {
 public static void main(String[] args) {
  int defYear = Person.getDefaultYear();
  System.out.println(defYear);

  Person andy = new Person("Andy McCoy", 1968);

  System.out.println(Person.getCount());



 }

}
