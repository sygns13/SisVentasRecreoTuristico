package modelIfz.dao;

import java.util.List;

public interface DAO<Model, typeKey> {

    void insertar(Model a);

    List<Model> listarTodos();

    void eliminar(Model a);

    void modificar(Model a);

    Model obtenerPorId(typeKey id);

}
