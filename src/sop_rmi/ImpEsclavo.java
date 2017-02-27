package sop_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

public class ImpEsclavo extends UnicastRemoteObject implements IntEsclavo {

    private int id;
    private String nombreUsuario;
    private String direccion;

    public ImpEsclavo() throws RemoteException {
        super();
        id = -1;
        nombreUsuario = null;
        direccion = null;
    }

    public void setIdResidencia(int id) throws RemoteException {
        this.id = id;
    }

    public void setNombreUsuario(String nom) throws RemoteException {
        this.nombreUsuario = nom;
    }

    public void setDireccion(String dir) throws RemoteException {
        this.direccion = dir;
    }

    public int getIdResidencia() throws RemoteException {
        return id;
    }

    public String getNombreUsuario() throws RemoteException {
        return nombreUsuario;
    }

    public String getDireccion() throws RemoteException {
        return direccion;
    }

    public double getLectura() throws RemoteException {
        Random rnd = new Random();
        return (rnd.nextDouble() * 100) + 1;
    }
}
