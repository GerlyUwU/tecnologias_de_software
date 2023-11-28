import java.util.Scanner;

class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = derecho = null;
    }
}

public class ArbolBinarioUsuario {

    Nodo raiz;

    public ArbolBinarioUsuario() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
            return nodo;
        }

        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRec(nodo.derecho, valor);
        }

        return nodo;
    }

    public void imprimirHojas() {
        System.out.println("Nodos terminales u hojas:");
        imprimirHojasRec(raiz);
    }

    private void imprimirHojasRec(Nodo nodo) {
        if (nodo != null) {
            if (nodo.izquierdo == null && nodo.derecho == null) {
                System.out.print(nodo.valor + " ");
            }
            imprimirHojasRec(nodo.izquierdo);
            imprimirHojasRec(nodo.derecho);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolBinarioUsuario arbol = new ArbolBinarioUsuario();

        System.out.print("Ingrese el número de nodos a insertar: ");
        int numNodos = scanner.nextInt();

        for (int i = 0; i < numNodos; i++) {
            System.out.print("Ingrese el valor del nodo " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            arbol.insertar(valor);
        }

        arbol.imprimirHojas();
    }
}
