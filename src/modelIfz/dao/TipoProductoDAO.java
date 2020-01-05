package modelIfz.dao;

import modelIfz.beans.TipoProducto;

import java.util.List;
import java.util.Map;

public interface TipoProductoDAO extends DAO<TipoProducto, Long> {

    List<TipoProducto> listarPorParametros(Map parametros);
}
