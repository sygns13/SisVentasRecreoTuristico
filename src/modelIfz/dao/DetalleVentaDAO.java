package modelIfz.dao;

import modelIfz.beans.DetalleVenta;

import java.util.List;
import java.util.Map;

public interface DetalleVentaDAO extends DAO<DetalleVenta, Long> {

    List<DetalleVenta> listarPorParametros(Map parametros);
}
