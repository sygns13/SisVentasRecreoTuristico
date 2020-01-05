package modelIfz.dao;

import modelIfz.beans.Banco;

import java.util.List;
import java.util.Map;

public interface BancoDAO extends DAO<Banco,Long> {

    List<Banco> listarPorParametros(Map parametros);
}
