
package abstractClasses;

/**
 * This program demonstrates abstract classes.
 * @version 1.01
 * @author syYing
 */

 public class PersonTest {
     public static void main(String[] args) {
         Person[] people = new Person[2];

         people[0] = new Employee("Harry", 50000, 1989, 10, 1);
         people[1] = new Student("Maria", "cs");

         for(Person p : people) {
             System.out.println(p.getName() + ", " + p.getDescription());
         }

         Employee alice1 = new Employee ( " Alice Adams " , 75000 , 1987 , 12 , 15 ) ;
         Employee alice2 = alice1;
         Employee alice3 = new Employee ( " Alice Adams " , 75000 , 1987 , 12 , 15 ) ;

         System.out.println(alice1 == alice2);
         System.out.println(alice1 == alice3);
         System.out.println(alice1.equals(alice3));
     }
 }
