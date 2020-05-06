package blocky.backend.service;

import blocky.backend.dao.RegisterDao;
import blocky.backend.entity.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    @Autowired
    private RegisterDao registerDao;

    public boolean checkUsernameWhetherUsable(String username){
        return registerDao.searchUserByID(username) == null;
    }

    public boolean insertIntoUsers(UsersEntity usersEntity){
        return registerDao.insertUser(
                usersEntity.getUsername(),
                usersEntity.getPassword(),
                usersEntity.getRole(),
                usersEntity.getName(),
                usersEntity.getEmail()) > 0;
    }
}
