import java.util.Arrays;

public class AlgOrdenacionAvanzados {
    public int[] ordenar(int[] datos, String algoritmo){

        int[] resultado = new int [datos.length];

        switch(algoritmo){
            case "MergeSort":
                resultado = mergeSort(datos);
                break;
            case "QuickSortPivIni":
                resultado = quickSortPivIni(datos);
                break;
            case "QuickSortPivCen":
                resultado = quickSortPivCen(datos);
                break;
            case "radixSort":
                resultado = radixSort(datos);
                break;
        }

        imprimirArreglo(resultado, algoritmo);

        return resultado;
    }

    private void imprimirArreglo(int[] datos, String algoritmo){
        System.out.println(algoritmo + " = " + Arrays.toString(datos));
    }

    //Algoritmos de Ordenación Avanzados (indirectos)



    private int[] mergeSort(int[] datos){
        //TODO implementar algoritmo MergeSort

        return datos;
    }

    private int[] quickSortPivIni(int[] datos){
        //TODO implementar algoritmo QuickSort Pivote Inicial

        return datos;
    }

    private int[] quickSortPivCen(int[] datos){
        //TODO implementar algoritmo QuickSort Pivote Central

        return datos;
    }

    //Algoritmos de Ordenación por urnas (Opcional - Extra)

    private int[] radixSort(int[] datos){
        //TODO implementar algoritmo RadixSort (Opcional)

        return datos;
    }
}
