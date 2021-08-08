package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerText {

    //Utilizaremos esta clase que remplaza a escanere y manejamos los Errores.

    //Cadenas de entradas String
    public static String dato(){
        String datos = null;

        try{
            BufferedReader entrada =  new BufferedReader(new InputStreamReader(System.in));
            datos = entrada.readLine();
        }catch(IOException e){
            System.out.print("Error: "+e.getMessage());
        }
        return datos;
    }


    public static int datosInt(){
        try{
            return (Integer.parseInt(dato()));
        }catch(NumberFormatException error){
            return (Integer.MIN_VALUE);
        }
    }

    public static float datosFloat(){
        try{
            Float f = new Float(dato());
            return (f.floatValue());
        }catch(NumberFormatException error){
            return (Float.NaN);
        }
    }

}
