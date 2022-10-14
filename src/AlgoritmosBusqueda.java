import java.util.Arrays;

public class AlgoritmosBusqueda {
    public int buscar(int[] datos, int clave, String algoritmo){

        int indice=-1; //devuelve -1 si el valor clave no se encuentra en el arreglo
        switch(algoritmo){
            case "BusquedaLineal":
                indice = busquedaLineal(datos,clave);
                break;
            case "BusquedaBinaria":
                indice = busquedaBinaria(datos,clave);
                break;
        }

        imprimirResultadoBusqueda(indice,clave);

        return indice;
    }

    private void imprimirArreglo(int[] datos, String algoritmo){
        System.out.println(algoritmo + " = " + Arrays.toString(datos));
    }

    private void imprimirResultadoBusqueda(int indice, int clave){
        if(indice==-1){ //devuelve -1 si el valor clave no se encuentra en el arreglo
            System.out.println("Valor " + clave + " NO encontrado en el arreglo");
        }
        else
            System.out.println("Valor " + clave + " encontrado en el indice = "+indice);
    }

    //Algoritmos de Busqueda

    private int busquedaLineal(int[] datos, int clave){
        int indice=-1; //devuelve -1 si el valor clave no se encuentra en el arreglo

        return indice;
    }

    private int busquedaBinaria(int[] datos, int clave){
        int indice=-1; //devuelve -1 si el valor clave no se encuentra en el arreglo

        return indice;
    }
}
