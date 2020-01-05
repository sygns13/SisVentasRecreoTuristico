package modelIfz.dao;

import modelIfz.beans.IngresoSalidaCaja;

import java.util.List;
import java.util.Map;

public interface IngresoSalidaCajaDAO extends DAO<IngresoSalidaCaja, Long> {

    List<IngresoSalidaCaja> listarPorParametros(Map parametros);
}
