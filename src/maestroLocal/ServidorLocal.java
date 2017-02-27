package maestroLocal;

import java.rmi.Naming;
import java.util.Scanner;
import sop_rmi.*;

public class ServidorLocal {

    public static void main(String args[]) {
        try {
            int opc = -1;
            Scanner sc = new Scanner(System.in);
            String direccion = null, puerto = null;
            String linea = null;
            ImpMaestroLocal obj = new ImpMaestroLocal();
            imprimir("Ingresa el ID de este Maestro Local: ");
            obj.setIdLocal(Integer.parseInt(sc.nextLine()));
            System.out.println("Objeto instanciado:" + obj);
            Naming.rebind("rmi://" + args[0] + ":" + args[1] + "/local", obj);
            System.out.println("Servidor local registrado en: " + args[0] + ":" + args[1]);
            do {
                imprimir("Menu De Inicio Del Servidor Local\n");
                imprimir("1. Agregar nuevo Sensor\n");
                imprimir("2. Ver sensores asociados\n");
                imprimir("0. Salir\n");
                imprimir("Selecciona una opcion: ");
                opc = Integer.parseInt(sc.nextLine());
                switch (opc) {
                    case 1:
                        imprimir("Ingresa la direccion IP del sensor: ");
                        direccion = sc.nextLine();
                        imprimir("Ingresa el numero de puerto: ");
                        puerto = sc.nextLine();
                        try {
                            int x = obj.addSensor((IntEsclavo) Naming.lookup("rmi://" + direccion + ":" + puerto + "/esclavo"));
                            if(x==0)
                                imprimir("Sensor Agregado Correctamente\n");
                            else{
                                if(x==1)
                                    imprimir("La lista de sensores asociados esta llena\n");
                                else {
                                    imprimir("Error al ingresar Sensor Asociado\n");
                                }
                            }
                        }catch(Exception ex) {
                            imprimir("Ha Ocurrido un error en la conexion con: "+direccion+":"+puerto+"\n");
                        }
                        break;
                    case 2:
                        for(Integer i: obj.getIdentificadores())
                            imprimir("Sensor ID: "+i+"\n");
                        break;
                    case 0:
                        imprimir("Servidor configurado...\n");
                        break;
                    default:
                        imprimir("Opcion no valida\n");
                        break;
                }
            } while (opc != 0);
        } catch (Exception e) {
            System.out.println("UserServer error: " + e.getMessage());
        }
    }

    private static void imprimir(String linea) {
        System.out.print(linea);
    }
}
