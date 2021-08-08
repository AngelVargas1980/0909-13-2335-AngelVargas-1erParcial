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

        float base;
        int n;
        int seguir = 0;

        do {
            System.out.println("Ingrese la base: ");
            base = ScannerText.datosFloat();

            System.out.println("Ingrese el exponente");
            n = ScannerText.datosInt();

            //usamos las librerias MATH con el metodo pow para sacar la potencia, donde primero de coloca la base y luego el exponente.
            double resultado = Math.pow(base, n);

            System.out.println(base + " elevado a la " + n + " es igual a " + resultado);
            System.out.println("\n¿Desea volver a calcular otra Potencia?");
            System.out.println("1) Sí.");
            System.out.println("2) No, salir.");
            seguir = ScannerText.datosInt();

            //Si elije si, incializamos en 0 las variables.
            base = 0;
            n = 0;
        } while (seguir != 2);

    }

    public void anguloSCT() {
        float num;
        int seguir = 0;
        do {
            try {
                System.out.print("Introduce un ángulo de (0...360°): ");
                num = ScannerText.datosFloat();
                anguloCal(num);
            } catch (Exception e) {
                System.out.println("ERROR: Datos incorrectos.");
            }

            System.out.println("\n¿Desea volver a calcular otra vez?");
            System.out.println("1) Sí.");
            System.out.println("2) No, salir.");
            seguir = ScannerText.datosInt();

            //Si elije si, incializamos en 0 las variables.
            num = 0;
        } while (seguir != 2);
    }

    static void anguloCal(double num) {
        //Primer punto, pasar "num" a radianes.
        double b = Math.toRadians(num);
        System.out.println("Seno de " + num + " es: " + Math.sin(b));
        System.out.println("Coseno de " + num + " es: " + Math.cos(b));
        System.out.println("Tangente de " + num + " es: " + Math.tan(b));
    }

}
