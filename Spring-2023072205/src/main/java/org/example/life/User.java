package org.example.life;

public class User {

    public User() {
        System.out.println("1 Bean Object Create By no argument Constructor");
    }

    public void initMethod() {
        System.out.println("4 call special init method to init Object");
    }

    public void destroyMethod() {
        System.out.println("7 call special destroy method to destroy Object");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2 set bean properties by setter method");
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
