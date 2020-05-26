package blocky.backend.service;

import blocky.backend.dao.SaveHistoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveHistoryService {
    @Autowired
    private SaveHistoryDao saveHistoryDao;

    public boolean saveHistory(int user_id,
                               int scene_id,
                               String script,
                               int level,
                               String action,
                               String objects){
        return saveHistoryDao.saveHistory(user_id, scene_id, script, level,action, objects) > 0;
    }
}
