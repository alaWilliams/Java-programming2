public class Main2 {
      public static void main(String[] args) {
          // create an object from Person Class
          Person person1 = new Person("Kelly", 1999, 165 );
          Person person2 = new Person("Simon", 2002, 180);
          System.out.println(person1.getName());
          System.out.println(person2.getBirthYear());
          System.out.printf("Simon is %.2f tall", person1.getHeight());

      }
  }

