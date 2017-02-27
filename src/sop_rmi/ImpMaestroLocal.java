package sop_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.ArrayList;

public class ImpMaestroLocal extends UnicastRemoteObject implements IntMaestroLocal {
    private int id;
    private List<IntEsclavo> sensores;

    public ImpMaestroLocal() throws RemoteException {
        super();
        id = -1;
        sensores = new ArrayList();
    }

    public void setIdLocal(int id) throws RemoteException {
        this.id = id;
    }

    public int getIdLocal() throws RemoteException {
        return id;
    }

    public int addSensor(IntEsclavo sensor) throws RemoteException {
        if (sensores.size() == 5)
            return 1;
        else {
            int band = 0;
            for (IntEsclavo i : sensores) {
                if (sensor.getIdResidencia() == i.getIdResidencia())
                    band = -1;
            }
            if (band == 0) {
                sensores.add(sensor);
            }
            return band;
        }
    }

    public double getLecturaSensor(int id) throws RemoteException {
        double lectura = -1;
        for (IntEsclavo i : sensores) {
            if (i.getIdResidencia() == id) {
                lectura = i.getLectura();
            }
        }
        return lectura;
    }

    public String getDireccionResidencia(int id) throws RemoteException {
        String direccion = null;
        for (IntEsclavo i : sensores) {
            if (i.getIdResidencia() == id) {
                direccion = i.getDireccion();
            }
        }
        return direccion;
    }

    public String getNombreUsuario(int id) throws RemoteException {
        String nombre = null;
        for (IntEsclavo i : sensores) {
            if (i.getIdResidencia() == id) {
                nombre = i.getNombreUsuario();
            }
        }
        return nombre;
    }

    public List<Integer> getIdentificadores() throws RemoteException {
        List<Integer> idSensores = new ArrayList();
        for (IntEsclavo i : sensores) {
            idSensores.add(i.getIdResidencia());
        }
        return idSensores;
    }

    public boolean setNombreUsuario(String nom, int id) throws RemoteException {
        boolean band = false;
        for (IntEsclavo i : sensores) {
            if (i.getIdResidencia() == id) {
                i.setNombreUsuario(nom);
                band = true;
            }
        }
        return band;
    }

    public boolean setDireccion(String dir, int id) throws RemoteException {
        boolean band = false;
        for (IntEsclavo i : sensores) {
            if (i.getIdResidencia() == id) {
                i.setDireccion(dir);
                band = true;
            }
        }
        return band;
    }
}