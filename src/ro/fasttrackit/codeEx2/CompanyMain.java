package ro.fasttrackit.codeEx2;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {
    public static void main(String[] args) {


        List<Person> companyEmployees = new ArrayList();
        companyEmployees.add(new Person("Ion", 45, "manager"));
        companyEmployees.add(new Person("Adrian", 35, "plumber"));
        companyEmployees.add( new Person("Marian", 24, "carpenter"));
        companyEmployees.add(new Person("Maria", 29, "welder"));
        companyEmployees.add(new Person("Robert", 22, "plumber"));

        Company company = new Company(companyEmployees);
        System.out.println("The manager is " + company.getManager());
        System.out.println("The employees with the profession plumber are " + company.getPersons("plumber"));
        System.out.println("The employees older than 30 are " + company.getPersonsOlder(30));
        System.out.println(company.getPerson("Maria"));
        company.employ(new Person("Alina",33,"welder"));
        company.roster();


    }
}
