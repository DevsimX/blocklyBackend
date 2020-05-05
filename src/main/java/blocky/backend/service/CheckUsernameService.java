package blocky.backend.service;

import blocky.backend.dao.CheckUsernameDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckUsernameService {
    @Autowired
    private CheckUsernameDao checkUsernameDao;

    public String checkUsername(String username){
        return checkUsernameDao.checkUsername(username);
    }
}
