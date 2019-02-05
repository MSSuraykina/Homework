package homework.lesson8.task1;

public class Sputnik {
    public String name;
    public String id;//int'l designator
    private int apogee; //апогей орбиты спутника в км
    private int perigee; //перигей орбиты спутника в км
    private int inclination; //наклон орбиты в градусах
    private double altitude; //высота орбиты полета в км
    private double velocity; //скорость спутника
    private double period; // период обращения на орбите

    public Sputnik(String name, String id, int apogee, int perigee, int inclination, double altitude, double velocity, double period) {
        this.name = name;
        this.id = id;
        this.apogee = apogee;
        this.perigee = perigee;
        this.inclination = inclination;
        this.altitude = altitude;
        this.velocity = velocity;
        this.period = period;
    }
    //Sputnik sputnik;
//
   // {
    //    sputnik = new Sputnik();
   // }

   // public Sputnik(Sputnik sputnik) {
   //     this.sputnik = sputnik;
   // }

    public Sputnik() {

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getApogee() {
        return apogee;
    }

    public int getPerigee() {
        return perigee;
    }

    public int getInclination() {
        return inclination;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getPeriod() {
        return period;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }
}
