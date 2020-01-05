package modelIfz.dao;

import modelIfz.beans.Empresa;

import java.util.List;
import java.util.Map;

public interface EmpresaDAO extends DAO<Empresa, Long> {

    List<Empresa> listarPorParametros(Map parametros);
}
