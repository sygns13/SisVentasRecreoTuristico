package modelIfz.dao;

import modelIfz.beans.Venta;

import java.util.List;
import java.util.Map;

public interface VentaDAO extends DAO<Venta, Long> {

    List<Venta> listarPorParametros(Map parametros);
}
