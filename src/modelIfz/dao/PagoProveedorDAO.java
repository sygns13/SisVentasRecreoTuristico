package modelIfz.dao;

import modelIfz.beans.PagoProveedor;

import java.util.List;
import java.util.Map;

public interface PagoProveedorDAO extends DAO<PagoProveedor, Long> {

    List<PagoProveedor> listarPorParametros(Map parametros);
}
