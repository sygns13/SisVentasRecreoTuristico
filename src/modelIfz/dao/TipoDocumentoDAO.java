package modelIfz.dao;

import modelIfz.beans.TipoDocumento;

import java.util.List;
import java.util.Map;

public interface TipoDocumentoDAO extends DAO<TipoDocumento, Long> {

    List<TipoDocumento> listarPorParametros(Map parametros);
}
