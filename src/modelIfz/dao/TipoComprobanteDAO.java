package modelIfz.dao;

import modelIfz.beans.TipoComprobante;

import java.util.List;
import java.util.Map;

public interface TipoComprobanteDAO extends DAO<TipoComprobante, Long> {

    List<TipoComprobante> listarPorParametros(Map parametros);
}
