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

    //Algoritmos de Ordenación Básicos (directos)

    private int[] intercambio(int[] datos){


        return datos;
    }

    private int[] selectionSort(int[] datos){


        return datos;
    }

    private int[] insertionSort(int[] datos){


        return datos;
    }

    private int[] bubbleSort(int[] datos){


        return datos;
    }

    //Algoritmos de Ordenación Avanzados (indirectos)
    //ShellSort queda en esta practica para poder hacer uso directo del metodo insertionSort
    private int[] shellSort(int[] datos){


        return datos;
    }
}
