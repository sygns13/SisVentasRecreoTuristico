package modelImp.DAO;

import modelIfz.beans.Producto;
import modelIfz.dao.ProductoDAO;

import java.util.List;
import java.util.Map;

public class ProductoImpDAO implements ProductoDAO {
    @Override
    public List<Producto> listarPorParametros(Map parametros) {
        return null;
    }

    @Override
    public void insertar(Producto a) {

    }

    @Override
    public List<Producto> listarTodos() {
        return null;
    }

    @Override
    public void eliminar(Producto a) {

    }

    @Override
    public void modificar(Producto a) {

    }

    @Override
    public Producto obtenerPorId(Long id) {
        return null;
    }
}
