package blocky.backend.service;

import blocky.backend.dao.LoginDao;
import blocky.backend.entity.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;

    public UsersEntity getSearcherResultByIDAndPassword(String username,String password) {
        return loginDao.searchUserByIDAndPassword(username,password);
    }
}
