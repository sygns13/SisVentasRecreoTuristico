package modelIfz.dao;

import modelIfz.beans.Marca;

import java.util.List;
import java.util.Map;

public interface MarcaDAO extends DAO<Marca, Long> {

    List<Marca> listarPorParametros(Map parametros);
}
