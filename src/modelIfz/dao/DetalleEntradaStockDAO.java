package modelIfz.dao;

import modelIfz.beans.DetalleEntradaStock;

import java.util.List;
import java.util.Map;

public interface DetalleEntradaStockDAO extends DAO<DetalleEntradaStock, Long> {

    List<DetalleEntradaStock> listarPorParametros(Map parametros);
}
