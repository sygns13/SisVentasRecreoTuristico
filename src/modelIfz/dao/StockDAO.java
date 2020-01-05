package modelIfz.dao;

import modelIfz.beans.Stock;

import java.util.List;
import java.util.Map;

public interface StockDAO extends DAO<Stock, Long> {

    List<Stock> listarPorParametros(Map parametros);
}
