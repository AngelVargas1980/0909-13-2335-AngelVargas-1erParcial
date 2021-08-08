package Clases;

public class CalculadoraAvanzada {


    public void rCuadrada() {
        //Variables
        float num = 0;
        int seguir = 0;
        do {
            System.out.println("Calcular la raíz cuadrada de un número.");

            System.out.println("\nIngrese el numero para calcular su Raiz Cuadrada.");
            num = ScannerText.datosFloat();

            if (num < 0){
                System.out.println("INDEFINIDO");
            }else {
                //usamos las librerias MATH con el metodo sqrt para sacar la Raiz.
                double resultado = Math.sqrt(num);
                System.out.println("La raíz cuadrada de " + num + " es " + resultado);
            }

            System.out.println("\n¿Desea volver a calcular otra Raiz?");
            System.out.println("1) Sí.");
            System.out.println("2) No, salir.");
            seguir = ScannerText.datosInt();
            //Si elije si, incializamos en 0 las variables.
            num = 0;
        } while (seguir != 2);
    }

    public void potencias() {
    }

    public void anguloSCT() {
    }
}
