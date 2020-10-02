public class Person {

    private String name;
    private String surname;
    private double temperature;
    private  String q1;
    private String q2;
    private String q3;
    private  String q4;


    public Person(String name, String surname, double temperature,String q1, String q2, String q3, String q4){
        this.name = name;
        this.surname = surname;
        this.temperature = temperature;
        this.q1 = q1;
        this.q2= q2;
        this.q3 = q3;
        this.q4 = q4;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getQ1() {
        return q1;
    }

    public String getQ2() {
        return q2;
    }

    public String getQ3() {
        return q3;
    }

    public String getQ4() {
        return q4;
    }
}
