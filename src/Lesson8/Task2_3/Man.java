package Lesson8.Task2_3;

public class Man implements Cloneable {
    private String name;
    private int age;
    private String job;

    public Man(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String info() {
        return name + " is " + age + " years old. Jod: " + job;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
