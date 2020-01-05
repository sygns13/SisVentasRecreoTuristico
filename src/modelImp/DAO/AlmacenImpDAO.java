package modelImp.DAO;

import modelIfz.beans.Almacen;
import modelIfz.dao.AlmacenDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.logging.Level;

public class AlmacenImpDAO implements AlmacenDAO {

    final String INSERT = "INSERT INTO almacens(id, nombre, direccion, empresa_id, user_id, activo, borrado, created_at, updated_at) VALUES(?,?,?,?,?,?,?,?,?)";
    final String UPDATE ="UPDATE almacens SET nombre=?, direccion=?, empresa_id=?, user_id=?, activo=?, updated_at=? WHERE id=?;";
    final String DELETE = "DELETE FROM almacens where id=?;";
    final String DELETELOGICO = "UPDATE almacens SET borrado='1', user_id=?, updated_at=?  where id=?;";
    final String GETALL = "SELECT id, nombre, direccion, empresa_id, user_id, activo, borrado, created_at, updated_at FROM almacens where borrado='0';";
    final String GETONE = "SELECT id, nombre, direccion, empresa_id, user_id, activo, borrado, created_at, updated_at FROM almacens where borrado='0' AND id=?;";

    private Connection conn;

    public AlmacenImpDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Almacen> listarPorParametros(Map parametros) {
        return null;
    }

    @Override
    public void insertar(Almacen a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setLong(1,a.getId());
            stat.setString(2, a.getNombre());
            stat.setString(3,a.getDireccion());
            stat.setLong(4,a.getEmpresa_id());
            stat.setLong(5,a.getUser_id());
            stat.setLong(5,a.getUser_id());

        } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
            System.out.println("error = " + ex);
        }finally {

        }

    }

    @Override
    public List<Almacen> listarTodos() {
        return null;
    }

    @Override
    public void eliminar(Almacen a) {

    }

    @Override
    public void modificar(Almacen a) {

    }

    @Override
    public Almacen obtenerPorId(Long id) {
        return null;
    }
}
