import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Recetas arrayIngrediente[] = new Recetas[5];

        arrayIngrediente[0] = new Recetas("ge", 45, "g");
    }

    public void arrayAleatorio() {
        int array1[] = new int[6];

        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt();
        }

        int array2[] = new int[3];

        for (int j = 0; j < array1.length; j++) {
            for (int i = 0; i < array2.length; i++) {
                if (array1[j] % 2 == 0) {
                    array2[i] = array1[j];
                }
            }
        }
    }

    public void array20() {
        int array1[] = new int[20];

        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(200) + 100;
        }

        System.out.println(array1[0]);
    }

    public void arrayPrimos() {
        int array1[] = new int[20];

        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(1000);
        }

        int contador = 1;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 2; j * j <= array1[i]; j++) {
                if (array1[i] % j == 0) {
                    contador++;
                }
            }
        }

        int array2[] = new int[contador];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 2; j * j <= array1[i]; j++) {
                if (array1[i] % j == 0) {
                    array2[i] = array1[i];
                }
            }
        }
    }

    public void arrayInvertido() {

        int array1[] = { 0, 1, 2, 3, 4 };

        int arrayInvertido[] = new int[array1.length];

        for (int i = array1.length - 1, j = 0; i >= 0; i--, j++) {
            arrayInvertido[j] = array1[i];
            System.out.println(arrayInvertido[j]);
        }

    }

    public void arrayUltimo() {

        int array1[] = { 0, 1, 2, 3, 4 };

        int numero = 2;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == numero) {
                System.out.println("El numero se encuentra en la posicion " + i);
            }
        }
    }

}
