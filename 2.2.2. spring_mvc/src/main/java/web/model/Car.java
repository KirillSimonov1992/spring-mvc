package web.model;

public class Car {
    private static int COUNT_CARS;
    private int id;
    private String mark;
    private String color;

    static {
        COUNT_CARS = 0;
    }

    public Car(String mark, String color) {
        this.id = ++COUNT_CARS;
        this.mark = mark;
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
