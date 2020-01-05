package modelIfz.dao;

import modelIfz.beans.ProductoPlato;

import java.util.List;
import java.util.Map;

public interface ProductoPlatoDAO extends DAO<ProductoPlato, Long> {

    List<ProductoPlato> listarPorParametros(Map parametros);
}
