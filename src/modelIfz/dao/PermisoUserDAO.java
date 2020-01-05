package modelIfz.dao;

import modelIfz.beans.PermisosUser;

import java.util.List;
import java.util.Map;

public interface PermisoUserDAO extends DAO<PermisosUser, Long> {

    List<PermisosUser> listarPorParametros(Map parametros);
}
