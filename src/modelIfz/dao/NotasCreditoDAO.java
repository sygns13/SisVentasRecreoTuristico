package modelIfz.dao;

import modelIfz.beans.NotasCredito;

import java.util.List;
import java.util.Map;

public interface NotasCreditoDAO extends DAO<NotasCredito, Long> {

    List<NotasCredito> listarPorParametros(Map parametros);
}
