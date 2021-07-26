package cs.lab;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class General {
    private static General singleton = null;
    private Map<String, CentroVacunacion> centrosDeVacunacion;
    private Map<String, Usuario> usuarios;
    private HashMap<String, Usuario> usuariosActivos;

    static final Logger logger = Logger.getLogger(General.class.getName());

    public static General getUniqueInstance(){
        if (singleton == null){
            singleton = new General();
        }
        return singleton;
    }

    public void login(String username, String pwd){
        if (usuariosActivos.get(username) != null){
            logger.info("Ya ha iniciado sesión");
        }
        else {
            if (usuarios.get(username) != null){
                if (usuarios.get(username).getPassword().equals(pwd)) {
                    usuariosActivos.put(username, usuarios.get(username));
                } else {
                    logger.info("Contraseña Incorrecta");
                }
            }
            else{
                logger.info("Usuario no registrado");
            }
        }
    }

    public void logout(String username){
        usuariosActivos.remove(username);
    }

    public void addUsers (String username){
        if (usuarios.get(username) == null) {
            var newUser = new Usuario(username);
            usuarios.put(username,newUser);
        }
        else{
            logger.info("Usuario ya existente");
        }
    }

    public void addCentrosdeVacunacion (String name){
        if (usuarios.get(name) == null) {
            var newCentro = new CentroVacunacion(name);
            centrosDeVacunacion.put(name,newCentro);
        }
        else{
            logger.info("Centro de vacunacion ya existente");
        }
    }

    public void darDeAlta(String username, String name) {
        if (usuariosActivos.get(username) == null) {
            logger.info("No ha iniciado sesión");
        } else {
            if (centrosDeVacunacion.get(name) != null){
                centrosDeVacunacion.get(name).setDeAlta(true);
            }
        }
    }

    public void darDeBaja(String username, String name) {
        if (usuariosActivos.get(username) == null) {
            logger.info("No ha iniciado sesión");
        } else {
            if (centrosDeVacunacion.get(name) != null){
                centrosDeVacunacion.get(name).setDeAlta(false);
            }
        }
    }


}
