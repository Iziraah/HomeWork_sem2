package семинар2;
import java.util.Scanner;

public class chislo {
    public static int chislo(int n) {
        if(n == 1){
            return 1;
        }
        else{            
        return chislo(n-1) + n;
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        in.close();
        int triangle = chislo(n);
        System.out.printf("Ваше треугольное число: %d\n", triangle);
}
}
