package modelIfz.dao;

import modelIfz.beans.Almacen;

import java.util.List;
import java.util.Map;

public interface AlmacenDAO extends DAO<Almacen,Long> {

    List<Almacen> listarPorParametros(Map parametros);
}
