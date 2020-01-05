package modelIfz.dao;

import modelIfz.beans.Caja;

import java.util.List;
import java.util.Map;

public interface CajaDAO extends DAO<Caja, Long> {

    List<Caja> listarPorParametros(Map parametros);
}
