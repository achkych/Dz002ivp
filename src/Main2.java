
public class Main2 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Пример массива с элементами
        int d = 1;
        double catchedRes1;

        if (d != 0) {
            if (intArray.length > 8) {
                catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } else {
                System.out.println("Выход за границы массива!");
            }
        } else {
            System.out.println("На ноль делить нельзя!");
        }
    }
}

