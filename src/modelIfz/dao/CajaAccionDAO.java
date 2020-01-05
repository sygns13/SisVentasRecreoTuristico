package modelIfz.dao;

import modelIfz.beans.CajaAccion;

import java.util.List;
import java.util.Map;

public interface CajaAccionDAO extends DAO<CajaAccion, Long> {

    List<CajaAccion> listarPorParametros(Map parametros);
}
