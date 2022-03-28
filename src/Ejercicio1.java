public class Ejercicio1 {

    public static void main(String[] args) {

        //inicializacion del vector
        int vector_numeros[] = new int[10];

        for (int i = 0; i <vector_numeros.length ; i++) {
            vector_numeros[i] = (int) (Math.random() * 10 + 1);

        }

        for (int i = 0; i <vector_numeros.length ; i++) {

            int numero = vector_numeros[i];
            int cuadrado = (int) Math.pow(numero, 2);
            int cubo = (int) Math.pow(numero, 3);

            System.out.println("vector["+i+"]= " +vector_numeros[i] + " al cuadrado:" +cuadrado + " y al cubo:" +cubo);

        }

    }

}
