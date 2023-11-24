
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int numeros[] = new int[1000000];
        generarNumeros(numeros);
        imprimirnumeros(numeros);
        busquedaBinaria(numeros, 50000);
        busquedaSecuencial(numeros, 50000);

    }

    public static int[] generarNumeros(int[] array) {
        int aux, tamanio = array.length;
        for (int i = 0; i < array.length; i++) {
            aux = (int) (Math.random() * 100);
            array[i] = aux;
        }
        return array;
    }

    public static void imprimirnumeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " .-" + array[i]);
        }
    }

    static void busquedaBinaria(int[] lista, int elemento) {
        long inicio = System.currentTimeMillis();
        Arrays.sort(lista);
        int izquierda = 0;
        int derecha = lista.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            // Comprueba si el elemento está presente en el medio
            if (lista[medio] == elemento) {
                System.out.println(medio + " lo encontramos!!!!!");
                long fin = System.currentTimeMillis();

                // Calcula la duración
                long duracion = fin - inicio;

                // Muestra la duración en milisegundos
                System.out.println("El tiempo de ejecución  de busqueda binaria fue: " + duracion + " milisegundos");
                return;
            }

            // Si el elemento es más pequeño, ignora la mitad derecha
            if (lista[medio] > elemento) {
                derecha = medio - 1;
            }

            // Si el elemento es más grande, ignora la mitad izquierda
            else {
                izquierda = medio + 1;
            }
        }

        // Si llegamos aquí, el elemento no está presente en la lista
        System.out.println("No lo encontramos pipipipipi"); // Obtiene el tiempo de finalización
        long fin = System.currentTimeMillis();

        // Calcula la duración
        long duracion = fin - inicio;

        // Muestra la duración en milisegundos
        System.out.println("El tiempo de ejecución  de busqueda binaria fue: " + duracion + " milisegundos");

    }// fin del metodo de busqueda binaria

    static void busquedaSecuencial(int[] lista, int elemento) {
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == elemento) {
                System.out.println(i + " lo encontramos "); // Devuelve la posición si el elemento es encontrado
                long fin = System.currentTimeMillis();

                // Calcula la duración
                long duracion = fin - inicio;

                // Muestra la duración en milisegundos
                System.out.println("El tiempo de ejecución  de busqueda secuencial fue: " + duracion + " milisegundos");
                return;
            }
        }

        System.out.println("no lo encontramos"); // Devuelve -1 si el elemento no es encontrado
        // Obtiene el tiempo de finalización
        long fin = System.currentTimeMillis();

        // Calcula la duración
        long duracion = fin - inicio;

        // Muestra la duración en milisegundos
        System.out.println("El tiempo de ejecución de busqueda secuencial  fue: " + duracion + " milisegundos");
    }
}
