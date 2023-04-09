import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SILab1 {
    public static List<Integer> filterOddNumbers(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer el : list) {
            if (el % 2 == 1) {
                result.add(el);
            }
        }
        return result;
    }

    private static int sumEvenNumbers(List<Integer> list) {
        int sum = 1;
        for (Integer el : list) {
            if (el % 2 == 0) {
                sum *= el;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m=0;
        List<Integer> list = new ArrayList<>();

        for (m=0; m <= n; m++) {
          //Fixed by ivana milevska
          list.add(sc.nextInt());
        }
        //

        System.out.println(filterOddNumbers(list));

        System.out.println(sumEvenNumbers(list));
    }
}
