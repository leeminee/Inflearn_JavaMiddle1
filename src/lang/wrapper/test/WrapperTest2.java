package lang.wrapper.test;

public class WrapperTest2 {

    public static void main(String[] args) {
        String[] array = {"1.5","2.5","3.0"};

        double sum = 0;
        for (String s : array) {
            double a = Double.parseDouble(s);
            sum += a;
        }
        System.out.println("합 : "+ sum);
    }
}
