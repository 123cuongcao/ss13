package ra.academy.modal;

import java.util.Date;

public class Person {
    private String name ;
    private boolean gender;
    private int age;
    private Date birthday;

    public Person() {
    }

    public Person(String name, boolean gender, int age, Date birthday) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
