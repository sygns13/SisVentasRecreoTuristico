package modelIfz.dao;

import modelIfz.beans.DetalleUnidadProducto;

import java.util.List;
import java.util.Map;

public interface DetalleUnidadProductoDAO extends DAO<DetalleUnidadProducto, Long> {

    List<DetalleUnidadProducto> listarPorParametros(Map parametros);
}
