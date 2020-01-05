package modelImp.DAO;

import modelIfz.beans.Almacen;
import modelIfz.dao.AlmacenDAO;
import org.joda.time.DateTime;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.logging.Level;

public class AlmacenImpDAO implements AlmacenDAO {

    final String INSERT = "INSERT INTO almacens(nombre, direccion, empresa_id, user_id, activo, borrado, created_at, updated_at) VALUES(?,?,?,?,?,?,?,?)";
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
        ResultSet rs = null;

        java.util.Date dt = a.getCreated_at();
        java.util.Date dt2 = a.getUpdated_at();

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String currentTime = sdf.format(dt);
        String currentTime2 = sdf.format(dt2);
        try {
            stat = conn.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            stat.setString(1, a.getNombre());
            stat.setString(2,a.getDireccion());
            stat.setLong(3,a.getEmpresa_id());
            stat.setLong(4,a.getUser_id());
            stat.setInt(5,a.getActivo());
            stat.setInt(6,a.getBorrado());
            stat.setString(7, currentTime);
            stat.setString(8, currentTime2);

            if(stat.executeUpdate()==0)
            {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, "No se realizó la insersión");
            }

            rs=stat.getGeneratedKeys();
            if(rs.next()){
                a.setId(rs.getLong(1));
            }
            else{
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, "Error al consultar Almacen Creado");
            }


        } catch (Exception ex) {
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

    }

    private Almacen convertir(ResultSet rs) throws SQLException {
        Almacen almacen = new Almacen();

        almacen.setId(rs.getLong("id"));
        almacen.setNombre(rs.getString("nombre"));
        almacen.setDireccion(rs.getString("direccion"));
        almacen.setEmpresa_id(rs.getLong("empresa_id"));
        almacen.setUser_id(rs.getLong("user_id"));
        almacen.setActivo(rs.getInt("activo"));
        almacen.setBorrado(rs.getInt("borrado"));
        almacen.setCreated_at(rs.getDate("created_at"));
        almacen.setUpdated_at(rs.getDate("updated_at"));


        return almacen;
    }

    @Override
    public List<Almacen> listarTodos() {
        List<Almacen> almacens= new ArrayList<>();
        PreparedStatement stat=null;
        ResultSet rs=null;
        try {
            stat = conn.prepareStatement(GETALL);

            rs=stat.executeQuery();

            while (rs.next()){
                almacens.add(convertir(rs));
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
        return almacens;
    }

    @Override
    public void eliminar(Almacen a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETELOGICO);
            stat.setLong(1,a.getUser_id());
            stat.setDate(2, new Date(a.getUpdated_at().getTime()));
            stat.setLong(3,a.getId());

            if(stat.executeUpdate()==0)
            {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, "No se realizó la eliminación");
            }

        } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
            System.out.println("error1 = " + ex);
        }finally {
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

    }

    @Override
    public void modificar(Almacen a) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);

            stat.setString(1, a.getNombre());
            stat.setString(2,a.getDireccion());
            stat.setLong(3,a.getEmpresa_id());
            stat.setLong(4,a.getUser_id());
            stat.setInt(5,a.getActivo());
            stat.setDate(6, new Date(a.getUpdated_at().getTime()));
            stat.setLong(7,a.getId());

            if(stat.executeUpdate()==0)
            {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, "No se realizó la insersión");
            }

        } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
            System.out.println("error1 = " + ex);
        }finally {
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

    }

    @Override
    public Almacen obtenerPorId(Long id) {
        Almacen a= null;
        PreparedStatement stat=null;
        ResultSet rs=null;
        try {
            stat = conn.prepareStatement(GETONE);
            stat.setLong(1,id);
            rs=stat.executeQuery();

            if(rs.next()){
                a= convertir(rs);
            }
            else{
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, "No se encontró el Registro Almacen");
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
        return a;
    }

    public static void main(String[] args) throws SQLException {
        Connection conn= null;

        java.util.Date dt = new java.util.Date();



        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn=DriverManager.getConnection("jdbc:mysql://localhost/bdhuertolazaro","root","13111991");
            AlmacenDAO dao = new AlmacenImpDAO(conn);
            Almacen almacen = new Almacen("nombre","direccion",Long.parseLong("1"),Long.parseLong("1"),1,0, dt,dt);
            dao.insertar(almacen);
            System.out.println("almacen.getId() = " + almacen.getId());
        }catch (Exception e){
            System.out.println("e = " + e);
        }
        finally {
            if(conn!=null){
                conn.close();
            }
        }
    }
}
