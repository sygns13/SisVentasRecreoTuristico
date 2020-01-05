package modelIfz.dao;

import modelIfz.beans.Permiso;

import java.util.List;
import java.util.Map;

public interface PermisoDAO extends DAO<Permiso, Long> {

    List<Permiso> listarPorParametros(Map parametros);
}
