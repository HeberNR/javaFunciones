package funciones;

public class EjFunciones {

    //tipo retorno / nombreFuncion / (tipoParametro1)
    public static void main(String[] args) {

        double x = 5.5;
        double suma = sumarDosNumeros(5, x);
        mostrarMensaje(suma);
        mostrarMensajeBienvenida();
        mostrarMensajeBienvenida("Heber");
        mostrarMensajeBienvenida("Heber", "Ramirez");
        System.out.println(mostrarMensajeBienvenida("Heber", 1));
        mostrarNroDecreciente(3);

        String[] nombres = {"Juan", "Maria", "Pablo"};

        mostrarNombresLista(nombres);



    }

    static double sumarDosNumeros (int nro1, double nro2) {
        double resultado = nro1 + nro2;
        return  resultado;
    }

    static void mostrarMensaje (double resultado){

        System.out.println("El resultado de la suma es " + resultado);
    }

    static void mostrarMensajeBienvenida(){
        System.out.println("Bienvenido a la clase 2 de Funciones");
    }

    static void mostrarMensajeBienvenida(String nombre){
        System.out.println("Bienvenido a la clase 2 de Funciones " + nombre);
    }

    static void mostrarMensajeBienvenida(String nombre, String apellido){
        System.out.println("Bienvenido a la clase 2 de Funciones " + nombre + " " + apellido);
    }

    static String mostrarMensajeBienvenida(String nombre, int curso){
        return "Bienvenido a la clase 2 de Funciones " + nombre + " curso: " + curso;
    }


    static void mostrarNroDecreciente(int nro){


        if (nro>0){
            nro--;
            System.out.println("El nro es: " + nro);
            mostrarNroDecreciente(nro);//la funcion se llama asi misma
        }
    }

    static void mostrarNombresLista(String[] nombres){ //recibe un array desde el main

        String texto = "Los asistentes del curso son: ";
        for (int i = 0; i< nombres.length; i++){
            texto = texto + nombres[i] + " ";
        }
        System.out.println(texto);
    }
}
