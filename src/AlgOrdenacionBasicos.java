import java.util.Arrays;

public class AlgOrdenacionBasicos {
    public int[] ordenar(int[] datos, String algoritmo){

        int[] resultado = new int [datos.length];

        switch(algoritmo){
            case "Intercambio":
                resultado = intercambio(datos);
                break;
            case "SelectionSort":
                resultado = selectionSort(datos);
                break;
            case "InsertionSort":
                resultado = insertionSort(datos);
                break;
            case "BubbleSort":
                resultado = bubbleSort(datos);
                break;
            case "ShellSort":
                resultado = shellSort(datos);
                break;
        }

        imprimirArreglo(resultado, algoritmo);

        return resultado;
    }

    private void imprimirArreglo(int[] datos, String algoritmo){
        System.out.println(algoritmo + " = " + Arrays.toString(datos));
    }

    //Algoritmos de Ordenacion Básicos (directos)

    private int[] intercambio(int[] datos){
        //TODO implementar algoritmo de intercambio

        return datos;
    }

    private int[] selectionSort(int[] datos){
        //TODO implementar algoritmo SelectionSort

        return datos;
    }

    private int[] insertionSort(int[] datos){
        //TODO implementar algoritmo InsertionSort

        return datos;
    }

    private int[] bubbleSort(int[] datos){
        //TODO implementar algoritmo BubbleSort

        return datos;
    }

    //Algoritmos de Ordenacion Avanzados (indirectos)
    //ShellSort queda en esta practica para poder hacer uso directo del metodo insertionSort
    private int[] shellSort(int[] datos){
        //TODO implementar algoritmo ShellSort

        return datos;
    }
}
