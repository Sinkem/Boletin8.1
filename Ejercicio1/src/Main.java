import java.util.Random;

public class Main{
    public static void main(String[] args) {
        int array1[] = new int [6];

        Random random = new Random(); 

        for(int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(10);
        }

        int array2[] = new int [3];

        for(int j= 0; j < array1.length; j++){
            for(int i = 0; i < array2.length; i++){
                if(array1[j] % 2 == 0){
                    array2[i] = array1[j];
                }
            }
        }

        System.out.println(array1[1]);
    }

    public void arrayAleatorio(){
        int array1[] = new int [6];

        Random random = new Random(); 

        for(int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt();
        }

        int array2[] = new int [3];

        for(int j= 0; j < array1.length; j++){
            for(int i = 0; i < array2.length; i++){
                if(array1[j] % 2 == 0){
                    array2[i] = array1[j];
                }
            }
        }
    }

    public void array20(){
        int array1[] = new int [20];

        Random random = new Random();

        for(int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(200) + 100;
        }

        System.out.println(array1[0]);
    }

    public void arrayPrimos(){
        int array1[] = new int[20];

        Random random = new Random();

        for(int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(1000);
        }

        int
    }
}