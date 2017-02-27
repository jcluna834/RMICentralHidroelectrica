package sop_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IntMaestroLocal extends Remote {
    /*
     * pone el identificador del maestro local
     */
    public void setIdLocal(int id) throws RemoteException;
    
    /*
     * obtiene el identificador del maestro local
     */
    public int getIdLocal() throws RemoteException;
    
    /*
     * Agrega un sensor a la lista de sensores que contiene este maestro local
     * retorna 0 si se agrega correctamente, 1 si la lista esta llena, -1 si el sensor ya habia sido agregado
     */
    public int addSensor(IntEsclavo sensor) throws RemoteException;
    
    /*
     * Retorna la lectura del sensor cuyo identificador es igual al ingresado, -1 si el sensor no existe en la lista
     */
    public double getLecturaSensor(int id) throws RemoteException;
    
    /*
     * Retorna la direccion de residencia del sensor cuyo identificador es igual al ingresado, null si el sensor no existe en la lista
     */
    public String getDireccionResidencia(int id) throws RemoteException;
    
    /*
     * Retorna el nombre del usuario cuyo identificador de sensor es igual al ingresado, null si el sensor no existe en la lista
     */
    public String getNombreUsuario(int id) throws RemoteException;
    
    /*
     * Retorna una lista de los identificadores de los sensores asociados a este maestro local
     */
    public List<Integer> getIdentificadores() throws RemoteException;
    
    /*
     * pone el nombre de usuario al sensor cuyo identificador es igual al ingresado
     * retorna true si se cambia el nombre, false en caso contrario
     */
    public boolean setNombreUsuario(String nom, int id) throws RemoteException;
    
    /*
     * pone la direccion al sensor cuyo identificador es igual al ingresado
     * retorna true si se cambia la direccion, false en caso contrario
     */
    public boolean setDireccion(String dir, int id) throws RemoteException;
}