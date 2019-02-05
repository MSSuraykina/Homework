package homework.lesson8.task1;

import java.util.ArrayList;
import java.util.List;

public class My_Sputnik{

        public static Sputnik  cosmos_864= new Sputnik("COSMOS 864","1976-108A",1008,962,83,974.3,7.38,104.6);
        public static Sputnik cosmos_970_deb = new Sputnik("COSMOS 970 DEB","1977-121X",1160,1044,6,1089.4,7.32,107.15);
        public static Sputnik cosmos_1900_deb = new Sputnik("COSMOS 1900 DEB","1987-101F",744, 683, 66, 744.3, 7.47, 98.91);
        public static Sputnik cosmos_1249_coolant = new Sputnik("COSMOS 1249 COOLANT","1981-021R",956,904,65,901.09,7.42,103.47);
        public static Sputnik meteor_2_8_deb = new Sputnik("METEOR 2-8 DEB","1982-025S",896,878,82,887.63,7.41,102.56);
        public static Sputnik delta_1_deb = new Sputnik("DELTA 1 DEB","1975-052FG",1244,869,99,869.3,7.51,106.17);
        public static Sputnik fengyun_1c_deb = new Sputnik("FENGYUN 1C DEB","1999-025DW",800,766,99,772.84,7.48,100.37);
        public static Sputnik cosmos_2298_deb = new Sputnik("COSMOS 2298 DEB","1994-083D",792,776,74,778.65,7.47,100.39);
        public static Sputnik sl_8_deb = new Sputnik("SL-8 DEB","1991-009CQ", 1650,1471,74,1616.4,7.05,117.17);
        public static Sputnik ops_4684_deb = new Sputnik("OPS 4682 DEB","1965-027EV",1304,1247,90,1302.8,7.20,110.91);

        public static void main(String[] args) {

        List<Sputnik> sputniks = new ArrayList<>();
        sputniks.add(cosmos_864);
        sputniks.add(cosmos_970_deb);
        sputniks.add(cosmos_1249_coolant);
        sputniks.add(cosmos_1900_deb);
        sputniks.add(cosmos_2298_deb);
        sputniks.add(meteor_2_8_deb);
        sputniks.add(delta_1_deb);
        sputniks.add(fengyun_1c_deb);
        sputniks.add(sl_8_deb);
        sputniks.add(ops_4684_deb);



        for (Sputnik sputnik:sputniks){
            System.out.println("Имя спутника: " + sputnik.getName()
                    +" Высота орбиты:" + sputnik.getAltitude());
        }


    }


}
