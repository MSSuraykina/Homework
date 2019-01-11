package homework.lesson4.task1;

import java.util.Arrays;

public class Astronaut {
    public Astronaut(int growth, int height, int volumHead, int volumBreast, int volumeWaist, int volumHip, int hootSize) {
        this.growth = growth;
        this.height = height;
        this.volumHead = volumHead;
        this.volumBreast = volumBreast;
        this.volumeWaist = volumeWaist;
        this.volumHip = volumHip;
        this.hootSize = hootSize;
    }

    int growth;

    @Override
    public String toString() {
        return ":" +
                "вес=" + growth +
                ", рост=" + height +
                ", обхват головы=" + volumHead +
                ", обхват груди=" + volumBreast +
                ", обхват талии=" + volumeWaist +
                ", обхват бедер=" + volumHip +
                ", размер ноги=" + hootSize ;
    }

    int height;
    int volumHead;
    int volumBreast;
    int volumeWaist;
    int volumHip;
    int hootSize;
}
