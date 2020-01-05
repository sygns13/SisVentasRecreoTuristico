package modelIfz.dao;

import modelIfz.beans.Detalle;

import java.util.List;
import java.util.Map;

public interface DetalleDAO extends DAO<Detalle, Long> {

    List<Detalle> listarPorParametros(Map parametros);
}
