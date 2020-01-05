package modelIfz.dao;

import modelIfz.beans.Producto;

import java.util.List;
import java.util.Map;

public interface ProductoDAO extends DAO<Producto, Long> {

    List<Producto> listarPorParametros(Map parametros);
}
