package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public static void printPower(int power) {
        int num = 1;
        if (power < 0){
            System.out.println("too much power");
        }else {
            int result = 1;
            System.out.println(1);
            while (num <= power){
                result = result * 2;
                System.out.println(result);
                num++;
            }
        }

    }

    public static void main(String[] args) {
        printPower(0);
    }
}
