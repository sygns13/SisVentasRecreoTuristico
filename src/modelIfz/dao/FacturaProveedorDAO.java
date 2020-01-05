package modelIfz.dao;

import modelIfz.beans.FacturaProveedor;

import java.util.List;
import java.util.Map;

public interface FacturaProveedorDAO extends DAO<FacturaProveedor, Long> {

    List<FacturaProveedor> listarPorParametros(Map parametros);
}
