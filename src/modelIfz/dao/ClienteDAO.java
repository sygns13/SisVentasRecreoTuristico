package modelIfz.dao;

import modelIfz.beans.Cliente;

import java.util.List;
import java.util.Map;

public interface ClienteDAO extends DAO<Cliente, Long> {

    List<Cliente> listarPorParametros(Map parametros);
}
