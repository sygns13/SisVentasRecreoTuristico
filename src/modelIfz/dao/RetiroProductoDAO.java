package modelIfz.dao;

import modelIfz.beans.RetiroProducto;

import java.util.List;
import java.util.Map;

public interface RetiroProductoDAO extends DAO<RetiroProducto, Long> {

    List<RetiroProducto> listarPorParametros(Map parametros);
}
