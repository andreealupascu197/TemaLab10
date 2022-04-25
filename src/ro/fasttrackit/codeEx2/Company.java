package ro.fasttrackit.codeEx2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company {
    private List<Person> employees;

    Company(List<Person> employees) {
        this.employees = employees;
    }

    public Person getManager() {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getPosition().equals("manager")) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession) {
        Iterator<Person> iterator = employees.iterator();
        List<Person> persons = new ArrayList<>();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getPosition().equals(profession)) {
                persons.add(person);
            }
        }
        return persons;
    }

    public List<Person> getPersonsOlder(int age) {
        Iterator<Person> iterator = employees.iterator();
        List<Person> olderPersons = new ArrayList<>();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getAge() > age) {
                olderPersons.add(person);
            }
        }
        return olderPersons;
    }

    public List<Person> getPerson(String filterName) {
        Iterator<Person> iterator = employees.iterator();
        List<Person> namePerson = new ArrayList<>();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName().equals(filterName)) {
                namePerson.add(person);
            }
        }
        return namePerson;

    }

    public void employ(Person person) {
        employees.add(person);
    }

    public void roster() {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.getName() + ", " + person.getAge() + " years old, is a " +person.getPosition());
        }
    }

}
