package modelIfz.dao;

import modelIfz.beans.Proveedor;

import java.util.List;
import java.util.Map;

public interface ProveedorDAO extends DAO<Proveedor, Long> {

    List<Proveedor> listarPorParametros(Map parametros);
}
