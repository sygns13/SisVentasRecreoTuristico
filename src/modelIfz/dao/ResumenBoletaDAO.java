package modelIfz.dao;

import modelIfz.beans.ResumenBoleta;

import java.util.List;
import java.util.Map;

public interface ResumenBoletaDAO extends DAO<ResumenBoleta, Long> {

    List<ResumenBoleta> listarPorParametros(Map parametros);
}
