package Main;

import Clases.CalculadoraBasica;
import Clases.ScannerText;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //Creamos nuestro objeto de Calculadora basica.
        CalculadoraBasica calculadora = new CalculadoraBasica();

        //Vamos a crear un menu donde se le muestre al usuario las opciones de calculadora basica y la avanzada.

        //Variables Locales para los menus.
        //opc = Menu principal, opc1 y opc2 Submenus.
        int opc = 0, opc1 = 0, opc2 = 0;

        do{
            System.out.println("\n");
            System.out.println("******MENU******");
            System.out.println("1). Calculadora Basica.");
            System.out.println("2). Calculadora Avanzada.");
            System.out.println("3). Salir");
            System.out.println("Ingrese su Opción: ");
            //Creare una clase que  me serviara para leer los datos del usuario y aus vez tratar errores.
            opc = ScannerText.datosInt();

            switch (opc){

                //Caso 1 para calculadora Basica
                case 1:{
                    do{
                        System.out.println("\n");
                        System.out.println("******MENU******");
                        System.out.println("1). Suma.");
                        System.out.println("2). Resta.");
                        System.out.println("3). Multiplicacion.");
                        System.out.println("4). Divicion.");
                        System.out.println("5). Salir");
                        System.out.println("Ingrese su Opción: ");
                        opc1 = ScannerText.datosInt();

                        switch (opc1){
                            case 1:
                                calculadora.sumar();
                                break;
                            case 2:
                                calculadora.restar();
                                break;
                            case 3:
                                calculadora.multi();
                                break;
                            case 4:
                                calculadora.div();
                                break;
                            case 5:
                                System.out.println("Saliendo al menu anterior.");
                                break;
                        }
                    }while (opc1 != 5);

                }
                break;

                //Caso 1 para calculadora avanzada
                case 2:{
                    do{
                        System.out.println("\n");
                        System.out.println("******MENU******");
                        System.out.println("1). Raiz Cuadrada.");
                        System.out.println("2). Potencias.");
                        System.out.println("3). Seno, Conseno y Tangente dado el valor de un ángulo.");
                        System.out.println("4). Salir");
                        System.out.println("Ingrese su Opción: ");
                        opc2 = ScannerText.datosInt();

                        switch (opc2){
                            case 1:
                                calculadoraA.rCuadrada();
                                break;

                            case 2:
                                calculadoraA.potencias();
                                break;

                            case 3:
                                calculadoraA.anguloSCT();
                                break;

                            case 4:
                                System.out.println("Saliendo al menu anteriror.");
                                break;
                        }
                    }while (opc2 != 4);
                }
                break;

                //Caso 2 para salir
                case 3:{
                    System.out.println("Saliendo, pase un buen dia.");
                }
                break;
            }

        }while (opc != 3);
    }

}
