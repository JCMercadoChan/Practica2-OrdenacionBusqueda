import java.util.Scanner;

public class usarOrdenacionBusqueda {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Solicitar valores a ordenar
        System.out.println("Ingrese los valores a ordenar o valores donde se quiere buscar un valor (separados por coma): ");
        String datosE = entrada.next();

        //Guardar los valores ingresados en un array de enteros
        String[] string = datosE.replaceAll("\\[", "").replaceAll("\\]", "").split(",");

        int[] datos = new int[string.length];

        for (int i = 0; i < string.length; i++) {
            datos[i] = Integer.parseInt(string[i]);
        }

        //Solicitar el algoritmo de a utilizar
        System.out.println("Ingrese el nombre del algoritmo de ordenacion a utilizar: ");
        String algoritmo = entrada.next();

        int[] resultadoOrdenamiento;
        int resultadoBusqueda;

        switch(algoritmo) {
            case "Intercambio","SelectionSort","InsertionSort","BubbleSort","ShellSort":
                AlgOrdenacionBasicos algoritmosBasicos = new AlgOrdenacionBasicos();
                //Ejecutar el algoritmo de ordenacion solicitado
                resultadoOrdenamiento = algoritmosBasicos.ordenar(datos,algoritmo);
                break;
            case "MergeSort","QuickSortPivIni","QuickSortPivCen","radixSort":
                AlgOrdenacionAvanzados algoritmosAvanzados = new AlgOrdenacionAvanzados();
                //Ejecutar el algoritmo de ordenacion solicitado
                resultadoOrdenamiento = algoritmosAvanzados.ordenar(datos,algoritmo);
                break;
            case "BusquedaLineal","BusquedaBinaria":
                AlgoritmosBusqueda algoritmosBusqueda = new AlgoritmosBusqueda();
                //Solicitar el valor de la clave que se desea buscar
                System.out.println("Ingrese el valor clave a buscar: ");
                int clave = entrada.nextInt();

                //Ejecutar el algoritmo de busqueda solicitado
                resultadoBusqueda = algoritmosBusqueda.buscar(datos, clave, algoritmo);
                break;
        }
        
    }
}
