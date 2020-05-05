package blocky.backend.service;

import blocky.backend.dao.LoginDao;
import blocky.backend.entity.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginDao loginDao;
    private UsersEntity searcherResultByIDAndPassword;

    public void searchUserByIDAndPassword(String username,String password){
        searcherResultByIDAndPassword = loginDao.searchUserByIDAndPassword(username,password);
    }

    public UsersEntity getSearcherResultByIDAndPassword() {
        return searcherResultByIDAndPassword;
    }

    public String getLoginResult(){
        return searcherResultByIDAndPassword != null?"ok":"Invalid username or password";
    }
}
