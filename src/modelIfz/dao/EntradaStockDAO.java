package modelIfz.dao;

import modelIfz.beans.EntradaStock;

import java.util.List;
import java.util.Map;

public interface EntradaStockDAO extends DAO<EntradaStock, Long> {

    List<EntradaStock> listarPorParametros(Map parametros);
}
