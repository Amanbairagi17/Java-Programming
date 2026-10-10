package OOPsinJava.Comparable;

public class Batsman {
    String name;
    String country;
    double strikeRate;
    int centuries;
    int age;
    int matches;
    double runRate;
    double avg;

    Batsman(String name, String country, double strikeRate, int centuries, int age, int matches, double runRate, double avg){
        this.name = name;
        this.country = country;
        this.strikeRate = strikeRate;
        this.centuries = centuries;
        this.age = age;
        this.matches = matches;
        this.runRate = runRate;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Batsman{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", strikeRate=" + strikeRate +
                ", centuries=" + centuries +
                ", age=" + age +
                ", matches=" + matches +
                ", runRate=" + runRate +
                ", avg=" + avg +
                '}';
    }
}
