package modelIfz.dao;

import modelIfz.beans.Lote;

import java.util.List;
import java.util.Map;

public interface LoteDAO extends DAO<Lote, Long> {

    List<Lote> listarPorParametros(Map parametros);
}
