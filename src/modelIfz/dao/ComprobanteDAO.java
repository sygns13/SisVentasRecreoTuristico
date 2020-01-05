package modelIfz.dao;

import modelIfz.beans.Comprobante;

import java.util.List;
import java.util.Map;

public interface ComprobanteDAO extends DAO<Comprobante, Long> {

    List<Comprobante> listarPorParametros(Map parametros);
}
