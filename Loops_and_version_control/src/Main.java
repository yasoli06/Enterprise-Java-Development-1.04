import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 8, 6, 10};

        System.out.println("" + difMaxMin(numbers));
        twoMin(numbers);

        double x = 2.0;
        double y = 3.0;
        System.out.println("Resultado de la expresión matemática: " + calcularExpresion(x, y));
}
    //Tarea 1: Diferencia entre el valor más grande y más pequeño
    public static int difMaxMin(int[] numbers) {
        if (numbers.length < 1) { // verificar si la matriz tiene al menos 1 elemento
            throw new Error ("The length of the array must be at least 1");
        }
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return max - min;
    }
    // Tarea 2: 1- 2 elemento más pequeño de un array e imprimir:
    public static void twoMin (int[] numbers) {
        if (numbers.length < 2) {
            throw new Error ("The length of the array must be at least 2");
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num > min2 && num != min1) {
                min2 = num;
            }
        }
        System.out.println("El valor más pequeño es: " + min1);
        System.out.println("El segundo valor más pequeño es: " + min2);
    }
    //Tarea 3:
    public static double calcularExpresion(double x, double y) {
        return (x*x) + (((4*y)/5) - x) * (((4*y)/5) - x);
    }
}