package sop_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.ArrayList;

public class ImpMaestroZona extends UnicastRemoteObject implements IntMaestroZona {
    private List<IntMaestroLocal> locales;

    public ImpMaestroZona() throws RemoteException {
        super();
        locales = new ArrayList();
    }

    public int addMaestroLocal(IntMaestroLocal local) throws RemoteException {
        if (locales.size() == 5)
            return 1;
        else {
            int band = 0;
            for (IntMaestroLocal i : locales) {
                if (local.getIdLocal() == i.getIdLocal())
                    band = -1;
            }
            if (band == 0) {
                locales.add(local);
            }
            return band;
        }
    }

    public double getLecturaSensor(int id) throws RemoteException {
        double aux = -1, lectura = -1;
        for (IntMaestroLocal i : locales) {
            aux = i.getLecturaSensor(id);
            if(aux!=-1)
                lectura=aux;
        }
        return lectura;
    }

    public String getDireccionResidencia(int id) throws RemoteException {
        String aux = null,direccion = null;
        for (IntMaestroLocal i : locales) {
            aux = i.getDireccionResidencia(id);
            if(aux!=null)
                direccion = aux;
        }
        return direccion;
    }

    public String getNombreUsuario(int id) throws RemoteException {
        String aux = null,nombre = null;
        for (IntMaestroLocal i : locales) {
            aux = i.getNombreUsuario(id);
            if(aux!=null)
                nombre = aux;
        }
        return nombre;
    }

    public boolean setNombreUsuario(String nom, int id) throws RemoteException {
        boolean band = false;
        for (IntMaestroLocal i : locales) {
            if(i.setNombreUsuario(nom, id))
                band = true;
        }
        return band;
    }

    public boolean setDireccion(String dir, int id) throws RemoteException {
        boolean band = false;
        for (IntMaestroLocal i : locales) {
            if(i.setDireccion(dir, id))
                band = true;
        }
        return band;
    }

    public List<Integer> getIdentificadores() throws RemoteException {
        List<Integer> ids = new ArrayList();
        for (IntMaestroLocal i : locales) {
            for(int id : i.getIdentificadores())
                ids.add(id);
        }
        return ids;
    }

}