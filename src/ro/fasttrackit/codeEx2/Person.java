package ro.fasttrackit.codeEx2;

public class Person {
    private String name;
    private Integer age;
    private String position;

    Person(String name, Integer age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;

    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

}
