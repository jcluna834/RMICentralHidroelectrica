package sop_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IntEsclavo extends Remote {
    /*
     * pone el identificador de la residencia al sensor
     */
    public void setIdResidencia(int id) throws RemoteException;
    
    /*
     * pone el nombre de usuario al sensor
     */
    public void setNombreUsuario(String nom) throws RemoteException;
    
    /*
     * pone la direccion al sensor
     */
    public void setDireccion(String dir) throws RemoteException;
    
    /*
     * obtiene el identificador de la residencia del sensor
     */
    public int getIdResidencia() throws RemoteException;
    
    /*
     * obtiene el nombre de usuario de la residencia del sensor
     */
    public String getNombreUsuario() throws RemoteException;
    
    /*
     * obtiene la direccion del sensor
     */
    public String getDireccion() throws RemoteException;
    
    /*
     * obtiene la lectura del sensor
     */
    public double getLectura() throws RemoteException;
}