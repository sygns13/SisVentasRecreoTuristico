package serviceIfz.service;

import modelIfz.beans.User;

import java.util.HashMap;

public interface InicioSesionService {

    public HashMap<String,String> controlAcceso(String usuario, String clave);
}
