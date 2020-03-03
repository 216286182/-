package Encapsulation;

public class EncapsulationExample {

    private String name = "Avery";
    private int age = 22;

    public EncapsulationExample() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EncapsulationExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
