package modelIfz.dao;

import modelIfz.beans.DatosUser;

import java.util.List;
import java.util.Map;

public interface DatosUserDAO extends DAO<DatosUser, Long> {

    List<DatosUser> listarPorParametros(Map parametros);
}
