package modelIfz.dao;

import modelIfz.beans.Unidad;

import java.util.List;
import java.util.Map;

public interface UnidadDAO extends DAO<Unidad, Long> {

    List<Unidad> listarPorParametros(Map parametros);
}
