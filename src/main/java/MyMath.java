public class MyMath {

    public static int mmc(int num1, int num2) {
        int mmc = 0;

        for (int i = 2; i <= num2; i++) {
            int aux = num1 * i;
            if ((aux % num2) == 0) {
                mmc = aux;
                i = num2 + 1;
            }
        }
        return mmc;
    }

    public static double maior(double num1, double num2){
        return  (num1 + num2 + abs(num1-num2))/2;
    }


    public static double abs(double num){
        return num < 0 ? num * - 1 : num;
    }
}
