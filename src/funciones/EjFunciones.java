package funciones;

public class EjFunciones {

    //tipo retorno / nombreFuncion / (tipoParametro1)
    public static void main(String[] args) {

        double x = 5.5;
        double suma = sumarDosNumeros(5, x);
        mostrarMensaje(suma);

    }

    static double sumarDosNumeros (int nro1, double nro2) {
        double resultado = nro1 + nro2;
        return  resultado;
    }

    static void mostrarMensaje (double resultado){
        System.out.println("El resultado de la suma es " + resultado);
    }
}
