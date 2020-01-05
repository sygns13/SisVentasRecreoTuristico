package modelIfz.dao;

import modelIfz.beans.TipoTarjeta;

import java.util.List;
import java.util.Map;

public interface TipoTarjetaDAO extends DAO<TipoTarjeta, Long> {

    List<TipoTarjeta> listarPorParametros(Map parametros);
}
