package modelIfz.dao;

import modelIfz.beans.TipoUser;

import java.util.List;
import java.util.Map;

public interface TipoUserDAO extends DAO<TipoUser, Long> {

    List<TipoUser> listarPorParametros(Map parametros);
}
