package modelIfz.dao;

import modelIfz.beans.PlatosVenta;

import java.util.List;
import java.util.Map;

public interface PlatosVentaDAO extends DAO<PlatosVenta, Long> {

    List<PlatosVenta> listarPorParametros(Map parametros);
}
