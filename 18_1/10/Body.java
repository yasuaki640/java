public class Body {
    String name;
    double height;
    double weight;

    public Body() {
        set("", 0.0, 0.0);
    }

    public Body(double height, double weight) {
        set("", height, weight);
    }

    public Body(String name, double height, double weight) {
        set(name, height, weight);
    }

    public void set(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double calcStdWeight() {
        double meterHeight = height / 100.;
        double stdWeight = meterHeight * meterHeight * 22.0;
        return stdWeight;
    }

    public void print() {
        System.out.println("名前 : " + name);
        System.out.println("身長 : " + height + " cm");
        System.out.println("名前 : " + name + " kg");
    }
}
