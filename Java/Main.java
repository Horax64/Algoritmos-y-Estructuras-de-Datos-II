import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        // ... 
        input.close();
        
        int[] array = {1,2,3,4,5,6};

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        for(int numero : array){
            System.out.println(numero);
        }

        // Sumatoria en Java 

        int n = 100;

        int[] sumatoria = new int[n];
        int suma = 0;

        for(int i = 0; i < sumatoria.length; i++){
            sumatoria[i]=i+1;
        }

        for(int numero : sumatoria){
            suma += numero;
        }

        System.out.println(suma);

        

    }   


}