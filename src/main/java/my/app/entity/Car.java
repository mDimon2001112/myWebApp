package my.app.entity;

public class Car {
    private int id;
    private  String carName;
    private int age;

    public Car() {
    }

    public Car(String carName, int age) {
        this.carName = carName;
        this.age = age;
    }

    public Car(int id, String carName, int age) {
        this.id = id;
        this.carName = carName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
