package serviceImp.service;

import modelIfz.beans.User;
import modelIfz.dao.UserDAO;
import modelImp.DAO.UserImpDAO;
import resources.UserLogeado;
import serviceIfz.service.InicioSesionService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InicioSesionServiceImp implements InicioSesionService {
    UserImpDAO userDAO = new UserImpDAO();
    @Override
    public HashMap<String,String> controlAcceso(String name, String password) {
        HashMap<String, String> resultado = new HashMap<String, String>();

        List<User> users = new ArrayList<>();
        User user= new User();
        Map<String, Object> parametros = new HashMap<String, Object>();

        parametros.put("name",name);
        parametros.put("password",password);

        users=userDAO.listarPorParametros(parametros);

        if(users.size()>0)
        {
            user=users.get(0);
            UserLogeado.getInstance().setId(user.getId());
            UserLogeado.getInstance().setName(user.getName());
            UserLogeado.getInstance().setEmail(user.getEmail());
            UserLogeado.getInstance().setPassword(user.getPassword());
            if(user.getUser_id()!=null)
                UserLogeado.getInstance().setUser_id(user.getUser_id());

            if(user.getEmpresa_id()!=null)
                UserLogeado.getInstance().setUser_id(user.getEmpresa_id());

            UserLogeado.getInstance().setActivo(user.getActivo());
            UserLogeado.getInstance().setBorrado(user.getBorrado());
            UserLogeado.getInstance().setCreated_at(user.getCreated_at());
            UserLogeado.getInstance().setUpdated_at(user.getUpdated_at());
            UserLogeado.getInstance().setTipo_user_id(user.getTipo_user_id());
            UserLogeado.getInstance().setClave(user.getClave());

            if(UserLogeado.getInstance().getActivo()==1)
            {
                resultado.put("key","1");
                resultado.put("msj","Acceso Concedido, Bienvenido al Sistema");
            } else if(UserLogeado.getInstance().getActivo()==0){
                resultado.put("key","2");
                resultado.put("msj","Credenciales de Acceso Correctas, Usuario Desactivado, por favor consulte con el administrador");
            }
        }
        else{
            resultado.put("key","0");
            resultado.put("msj","Credenciales de Acceso Incorrectas, por favor intentar nuevamente");
        }

        return resultado;

    }
}
