package modelIfz.dao;


import modelIfz.beans.User;

import java.util.List;
import java.util.Map;

public interface UserDAO extends DAO<User, Long> {

    List<User> listarPorParametros(Map parametros);
}
