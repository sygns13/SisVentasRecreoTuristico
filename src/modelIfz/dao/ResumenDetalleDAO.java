package modelIfz.dao;

import modelIfz.beans.ResumenDetalle;

import java.util.List;
import java.util.Map;

public interface ResumenDetalleDAO extends DAO<ResumenDetalle, Long> {

    List<ResumenDetalle> listarPorParametros(Map parametros);
}
