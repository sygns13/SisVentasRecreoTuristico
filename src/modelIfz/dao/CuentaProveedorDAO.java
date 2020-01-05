package modelIfz.dao;

import modelIfz.beans.CuentaProveedor;

import java.util.List;
import java.util.Map;

public interface CuentaProveedorDAO extends DAO<CuentaProveedor, Long> {

    List<CuentaProveedor> listarPorParametros(Map parametros);
}
