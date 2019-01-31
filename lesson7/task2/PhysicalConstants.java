package homework.lesson7.task2;

public class PhysicalConstants {
    public static final double L_S_I_V = 299_798_458;   //light speed in vacuum
    public static final double G_C = 6.67408e-11;   //gravitational constant
    public static final double C_P = 6.6260702e-34;   //constant Planka
    public static final double E_C = 1.6021766e-19;  //elementary charge
    public static final double A_O_G = 9.80665;  //acceleration of gravity
    public static final double M_E = 0.000_548_579_909;  //electron mass
    public static final double M_P = 1.007_276_466_879;  //proton mass
    public static final double M_N = 1.008_664_915_88;  //neutron  mass

   PhysicalConstants(){

    }
    public static void main(String[] args) {
        System.out.println(PhysicalConstants.M_N);
    }
}
