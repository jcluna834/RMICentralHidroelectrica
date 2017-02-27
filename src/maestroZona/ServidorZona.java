package maestroZona;

import java.rmi.Naming;
import java.util.Scanner;
import sop_rmi.*;

public class ServidorZona {
    public static void main(String args[]) {
        try {
            ImpMaestroZona obj = new ImpMaestroZona();
            Naming.rebind("rmi://" + args[0] + ":" + args[1] + "/zona", obj);
            System.out.println("Servidor Maestro Zona registrado");
            int opc = -1;
            Scanner sc = new Scanner(System.in);
            String direccion = null, puerto = null;
            String linea = null;
            do {
                imprimir("Menu De Inicio del Servidor Zona\n");
                imprimir("1. Agregar nuevo Maestro Local\n");
                imprimir("2. Ver Sensores asociados\n");
                imprimir("0. Salir\n");
                imprimir("Selecciona una opcion: ");
                opc = Integer.parseInt(sc.nextLine());
                switch (opc) {
                    case 1:
                        imprimir("Ingresa la direccion IP del Maestro Local: ");
                        direccion = sc.nextLine();
                        imprimir("Ingresa el numero de puerto: ");
                        puerto = sc.nextLine();
                        try {
                            int x = obj.addMaestroLocal((IntMaestroLocal) Naming.lookup("rmi://" + direccion + ":" + puerto + "/local"));
                            if (x == 0) {
                                imprimir("Maestro Local Agregado Correctamente\n");
                            } else {
                                if (x == 1) {
                                    imprimir("La lista de Maestros Locales asociados esta llena\n");
                                } else {
                                    imprimir("Error al ingresar Maestro Local Asociado\n");
                                }
                            }
                        } catch (Exception ex) {
                            imprimir("Ha Ocurrido un error en la conexion con: " + direccion + ":" + puerto + "\n");
                        }
                        break;
                    case 2:
                        for (Integer i : obj.getIdentificadores()) {
                            imprimir("Sensor ID: " + i + "\n");
                        }
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
