package web.model;

public class Car {
    private String model;
    private String color;
    private String body;

    public Car(String model, String color, String body) {
        this.model = model;
        this.color = color;
        this.body = body;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
