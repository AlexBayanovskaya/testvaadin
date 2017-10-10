package testvaadin;

import java.util.ArrayList;
import java.util.List;

public class GridGenerate {

    public static List<Person> getPersons() {

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Petr", "Petrov"));
        persons.add(new Person("Ivan", "Ivanov"));
        persons.add(new Person("Gus", "Gusanov"));

        return persons;
    }
}
