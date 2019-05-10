package SplitString;

public class Student {
    private String name;
    private int age;
    private int yearBrday;

    public Student() {

    }

    public Student(String name, int age, int yearBrday) {
        this.yearBrday = yearBrday;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getYearBrday() {
        return yearBrday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYearBrday(int yearBrday) {
        this.yearBrday = yearBrday;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", age: " + getAge() + ", year birthday: " + getYearBrday();
    }

}
