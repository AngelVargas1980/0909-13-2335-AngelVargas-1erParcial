package Clases;

public class CalculadoraBasica {


    public void sumar() {
        //Variables
        //cant = numero de veces a ingresar nuemeros.
        //Num= guarda los numero a calcular
        //Suma = hace la suma total de num's.
        //seguir = para no salir al menu y seguir sumando.
        float num=0, suma = 0;
        int seguir = 0,cant = 0;

        //creamos un Do while para hacer sumas las veces que el usuario quiera.
        do {
            //Le preguntamos cuantos numero quiere sumar
            System.out.println("Escriba cuantos numeros desea sumar: ");
            cant = ScannerText.datosInt();//Guardamos la cantidad de numeros a preguntar para sumar.

            //Creamos un ciclo para recolectar los datos a sumar mientras los sumamos al mismo tiempo.
            for (int i = 0; i < cant; i++){
                System.out.println("Ingrese el numero a sumar: ");
                num = ScannerText.datosInt();//guardamos los numeros para sumarlos.
                suma = suma + num;//hacemos la suma.
            }
            //Le mostramos las suma de todos los numeros que ingreso.
            System.out.println("El total de la suma es: " + suma);

            //Le preguntamos si desea volver a sumar numero o regresar al menu anterior.
            System.out.println("\n¿Desea volver a sumar?");
            System.out.println("1) Sí.");
            System.out.println("2) No, salir.");
            seguir = ScannerText.datosInt();//Recogemos la respuesta

            //en el caso que elija volver a sumar, inicializamso las variables en 0 nuevamente.
            suma = 0;

        }while (seguir != 2);//Si dice que no, nos salimos al menu anterior.

    }


    public void restar() {
        //Variables
        //cant = numero de veces a ingresar nuemeros.
        //Num= guarda los numero a calcular
        //resta = hace la resta total de num's.
        //seguir = para no salir al menu y seguir restando.
        float num=0, cant = 0, resta = 0, vali = 0; //vali es una variable de validacion.
        int seguir = 0;

        do {
            System.out.println("Escriba cuantos numeros desea restar: ");
            cant = ScannerText.datosInt();

            for (int i = 0; i < cant; i++){
                System.out.println("Ingrese el numero a restar: ");
                num = ScannerText.datosFloat();
                //si vali se encuentra en 0 el primer numero ingresado se guarda directamente
                //sin calcular nada
                if (vali == 0){
                    resta = num;
                    vali++; //Incrementamos vali para que el segundo numero en adelante si los reste.
                }else {
                    //si vamos por el segundo numero ingresado entonces si restamos.
                    resta = resta - num;
                }
            }
            System.out.println("El total de la resta es: " + resta);
            System.out.println("\n¿Desea volver a restar?");
            System.out.println("1) Sí.");
            System.out.println("2) No, salir.");
            seguir = ScannerText.datosInt();

            //en el caso que elija volver a restar, inicializamso las variables en 0 nuevamente.
            resta = 0;
            vali = 0;
        }while (seguir != 2);
    }

    public void multi() {

        float num=0, cont = 0, multi = 0, vali = 0;
        int seguir = 0;

        do {
            System.out.println("Escriba cuantos numeros desea Multiplicar: ");
            cont = ScannerText.datosInt();

            for (int i = 0; i < cont; i++){
                System.out.println("Ingrese el numero a Multiplicar: ");
                num = ScannerText.datosFloat();
                if (vali == 0){
                    multi = num;
                    vali++;
                }else {
                    multi = multi * num;
                }
            }
            System.out.println("El total de la Multiplicacion es: " + multi);
            System.out.println("\n¿Desea volver a Multiplicar?");
            System.out.println("1) Sí.");
            System.out.println("2) No, salir.");
            seguir = ScannerText.datosInt();
            multi = 0;
            vali = 0;
        }while (seguir != 2);
    }

    public void div() {
    }
}
