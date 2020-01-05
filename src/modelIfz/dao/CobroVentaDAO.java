package modelIfz.dao;

import modelIfz.beans.CobroVenta;

import java.util.List;
import java.util.Map;

public interface CobroVentaDAO extends DAO<CobroVenta, Long> {

    List<CobroVenta> listarPorParametros(Map parametros);
}
