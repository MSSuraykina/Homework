package homework.lesson7.task2;

public class PhysicalConstants {
    public static double L_S_I_V = 299_798_458;   //light speed in vacuum
    public static double G_C = 6.67408e-11;   //gravitational constant
    public static double C_P = 6.6260702e-34;   //constant Planka
    public static double E_C = 1.6021766e-19;  //elementary charge
    public static double A_O_G = 9.80665;  //acceleration of gravity
    public static double M_E = 0.000_548_579_909;  //electron mass
    public static double M_P = 1.007_276_466_879;  //proton mass
    public static double M_N = 1.008_664_915_88;  //neutron  mass

   PhysicalConstants(){
           L_S_I_V = PhysicalConstants.L_S_I_V;
           G_C = PhysicalConstants.G_C;
           C_P = PhysicalConstants.C_P;
           E_C = PhysicalConstants.E_C;
           A_O_G = PhysicalConstants.A_O_G;
           M_E = PhysicalConstants.M_E;
           M_P = PhysicalConstants.M_P;
           M_N = PhysicalConstants.M_N;

    }


    public static void main(String[] args) {
        System.out.println(PhysicalConstants.G_C);
    }
}
