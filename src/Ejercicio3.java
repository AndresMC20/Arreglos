import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        float notas[] = new float[5];                    //inicializamos el vector
        float media = 0;
        float minimo = 10;
        float maximo = 0;

        for (int i = 0; i < notas.length ; i++) {
            do{
                System.out.print("Escriba las notas:");
                notas[i] = sc.nextFloat();

                if(notas[i]<0 || notas[i]>10){
                    System.out.println("REVISAR LA NOTA");
                }
            } while (notas[i]<0 || notas[i]>10);
        }

        //MUESTREO DE NOTAS
        System.out.println("NOTAS");
        for (int i = 0; i < notas.length ; i++) {
            System.out.println("La " + (i+1) + "º nota es: " + notas[i]);
        }

        //CALCULO DE MEDIA, MAXIMA, Y MINIMA NOTA
        System.out.println();
        for (int i = 0; i < notas.length ; i++) {
            media = media + notas[i];

            if(notas[i] < minimo){
                minimo = notas[i];
            }

            if(notas[i] > maximo){
                maximo = notas[i];
            }
        }

        System.out.println("Media: " + media/ notas.length);
        System.out.println("Maximo: " + maximo);
        System.out.println("Minimo: " + minimo);



    }


}
