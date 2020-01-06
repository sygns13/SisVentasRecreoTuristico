package modelImp.DAO;

import modelIfz.beans.Almacen;
import modelIfz.beans.User;
import modelIfz.dao.UserDAO;
import resources.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserImpDAO implements UserDAO {

    public static ConexionBD Base = ConexionBD.getInstance();

    final String INSERT = "INSERT INTO users(name, email, password, user_id, empresa_id, activo, borrado, created_at, updated_at, tipo_user_id, clave) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE ="UPDATE users SET name=?, email=?, password=?, activo=?, tipo_user_id=?, clave=?, updated_at=? WHERE id=?;";
    final String DELETE = "DELETE FROM users where id=?;";
    final String DELETELOGICO = "UPDATE users SET borrado='1', user_id=?, updated_at=?  where id=?;";
    final String GETALL = "SELECT id, name, email, password, user_id, empresa_id,  activo, borrado, created_at, updated_at, tipo_user_id, clave FROM users where borrado='0';";
    final String GETONE = "SELECT id, name, email, password, user_id, empresa_id,  activo, borrado, created_at, updated_at, tipo_user_id, clave FROM users where borrado='0' AND id=?;";
    String SQL ="";

    private Connection conn=Base.conec;

   /* public UserImpDAO(Connection conn) {
        this.conn = conn;
    }*/

    @Override
    public List<User> listarPorParametros(Map parametros) {
        SQL="SELECT id, name, email, password, user_id, empresa_id,  activo, borrado, created_at, updated_at, tipo_user_id, clave FROM users ";

        //INICIO AGREGANDO PARÁMETROS A LA CONSULTA
        if(!parametros.isEmpty()){
            String sqlAux=" where ";
            int cont=0;

            if (parametros.containsKey("name")){
                if(cont>0)
                    sqlAux+=" and ";
                sqlAux+=" name='"+parametros.get("name")+"' ";
                cont++;
            }

            if (parametros.containsKey("password")){
                if(cont>0)
                    sqlAux+=" and ";
                sqlAux+=" password='"+parametros.get("password")+"' ";
                cont++;
            }

            SQL+=sqlAux;
        }
        //FIN AGREGANDO PARÁMETROS A LA CONSULTA

        List<User> users= new ArrayList<>();
        PreparedStatement stat=null;
        ResultSet rs=null;
        try {
            stat = conn.prepareStatement(SQL);

            rs=stat.executeQuery();

            while (rs.next()){
                users.add(convertir(rs));
            }

        }catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
            System.out.println("error1 = " + ex);
        }finally {
            if(rs!=null)
            {
                try {
                    rs.close();
                }catch (Exception ex){
                    Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                    System.out.println("error2 = " + ex);
                }
            }
            if(stat!=null)
            {
                try {
                    stat.close();
                }catch (Exception ex){
                    Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                    System.out.println("error2 = " + ex);
                }
            }

        }
        return users;
    }

    private User convertir(ResultSet rs) throws SQLException {
        User user = new User();

        user.setId(rs.getLong("id"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));

        try {
            user.setUser_id(rs.getLong("user_id"));
        }
        catch (Exception e)
        {
            System.out.println("e = " + e);
        }
        try {
            user.setEmpresa_id(rs.getLong("empresa_id"));
        }
        catch (Exception e)
        {
            System.out.println("e = " + e);
        }
        user.setActivo(rs.getInt("activo"));
        user.setBorrado(rs.getInt("borrado"));
        user.setTipo_user_id(rs.getLong("tipo_user_id"));
        user.setClave(rs.getString("clave"));

        user.setCreated_at(rs.getDate("created_at"));
        user.setUpdated_at(rs.getDate("updated_at"));


        return user;
    }



    @Override
    public void insertar(User a) {

    }

    @Override
    public List<User> listarTodos() {
        return null;
    }

    @Override
    public void eliminar(User a) {

    }

    @Override
    public void modificar(User a) {

    }

    @Override
    public User obtenerPorId(Long id) {
        return null;
    }
}
