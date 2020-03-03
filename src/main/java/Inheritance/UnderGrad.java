package Inheritance;

public class UnderGrad {
    private String id = "216286182";
    private String name = "Avery";
    private int year = 3;

    public UnderGrad() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "UnderGrad{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

}
