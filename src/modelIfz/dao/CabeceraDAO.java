package modelIfz.dao;

import modelIfz.beans.Cabecera;

import java.util.List;
import java.util.Map;

public interface CabeceraDAO extends DAO<Cabecera, Long> {

    List<Cabecera> listarPorParametros(Map parametros);
}
