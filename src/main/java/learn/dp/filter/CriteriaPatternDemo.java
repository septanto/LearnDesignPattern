package learn.dp.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Anto", "Male", "Single"));
        persons.add(new Person("Reyhan", "Male", "Married"));
        persons.add(new Person("Arfian", "Male", "Single"));
        persons.add(new Person("Robi", "Male", "Married"));
        persons.add(new Person("Luthfi", "Male", "Single"));
        persons.add(new Person("Dita", "Female", "Married"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPerson(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPerson(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPerson((singleMale.meetCriteria(persons)));

        System.out.println("\nSingle or Females: ");
        printPerson(singleOrFemale.meetCriteria(persons));
    }

    public static void printPerson(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }

}
