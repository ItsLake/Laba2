
public class Function {
    private static double keys[];

    private static double values[];

    public static double getY(double x) {
        return 0;
    }

    public static double functionY(double x){
        double y;
        if(x >=3.4){y= Math.sin(x)* Math.log10(x); }
        else{y =Math.pow(Math.cos(x),2); }
        System.out.println(y);
        return y;
    }

    public static int countSteps(double start, double end, double step) {
         double count =  (end - start)/step;
        System.out.println(count);
        return (int) count;
    }

    public static void iniitKeys(double start, double end, double step) {

        int count = countSteps(start, end, step);

        keys = new double[count];

        double sum = start;
        for (int i = 0; i < keys.length; i++) {
            keys[i] = sum;
            sum += step;
        }
    System.out.println(keys[0]);
        System.out.println(keys[175]);

    }
    public static void initValues(double t) {
        values = new double[keys.length];

        for (int i = 0; i < values.length; i++) {
            values[i] = getY(keys[i]);
        }
        System.out.println(keys[0]);
        System.out.println(keys[280]);
        System.out.println(keys[600]);
    }


}
