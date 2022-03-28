import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String original[] = new String[5];
        String invertido[] = new String[5];

        for (int i = 0; i < original.length; i++) {
            System.out.println("Escriba aqui: ");
            String cadena = sc.nextLine();
            original[i] = cadena;
        }

        System.out.println("ORIGINAL");
        for (int i = 0; i < original.length ; i++) {
            System.out.println("vector[" +i+"]: "+original[i]);
        }

        int indiceOriginal = 0;
        int indiceInvertido = 4;

        while (indiceOriginal < original.length){
            invertido[indiceInvertido] = original[indiceOriginal];

            indiceOriginal++;
            indiceInvertido--;
        }

        System.out.println();
        System.out.println("INVERTIDO");
        for (int i = 0; i < invertido.length; i++) {
            System.out.println("vector["+i+"]: " + invertido[i]);
        }

    }
}
