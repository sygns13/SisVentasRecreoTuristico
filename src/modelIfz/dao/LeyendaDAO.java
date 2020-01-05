package modelIfz.dao;

import modelIfz.beans.Leyenda;

import java.util.List;
import java.util.Map;

public interface LeyendaDAO extends DAO<Leyenda, Long> {

    List<Leyenda> listarPorParametros(Map parametros);
}
