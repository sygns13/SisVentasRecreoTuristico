package modelIfz.dao;

import modelIfz.beans.Config;

import java.util.List;
import java.util.Map;

public interface ConfigDAO extends DAO<Config, Long> {

    List<Config> listarPorParametros(Map parametros);
}
