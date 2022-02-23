import java.util.Random;
import java.util.Scanner;

public class taskOne {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        int[][] array = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                i = j;
                if (array[i][j] % 2 == 0)
                    sum += array[i][j];
            }
        }
        System.out.println("сумма четных чисел главной диагонали: " + sum);
        System.out.print("все нечетные значения матрицы под главной диагональю: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j && array[i][j] % 2 != 0)
                    System.out.print(array[i][j] + " ");
            }
        }
        System.out.println(" ");
        int proizvedenie = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    proizvedenie = proizvedenie * array[i][j];
            }
        }
        int proizvedenieTwo = 1;
        System.out.println("произведение главной диагонали: " + proizvedenie);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1 - i)
                    proizvedenieTwo = proizvedenieTwo * array[i][j];
            }
        }
        System.out.println("произведение побочной диагонали: " + proizvedenieTwo);
        if (proizvedenie > proizvedenieTwo)
            System.out.println("произведениеглавной диагонали больше побочной");
        if (proizvedenie < proizvedenieTwo)
            System.out.println("произведение побочной диагонали больше главной");
        else
            System.out.println("произведения побочной и главной диагоналей равны");
        int sumThree = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1 - i && array[i][j]%2==0)
                    sumThree += array[i][j];
            }
        }
        System.out.println("сумма элементов над побочной диагональю: "+ sumThree + " ");
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int trans =array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=trans;
            }
        }
        System.out.println("транспонированная матрица: ");
        for(int j=0;j<n;j++){
            for(int i =0;i<n;i++){
                System.out.print(array[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}