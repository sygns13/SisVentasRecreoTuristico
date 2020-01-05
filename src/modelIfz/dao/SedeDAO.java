package modelIfz.dao;

import modelIfz.beans.Sede;

import java.util.List;
import java.util.Map;

public interface SedeDAO extends DAO<Sede, Long> {

    List<Sede> listarPorParametros(Map parametros);
}
