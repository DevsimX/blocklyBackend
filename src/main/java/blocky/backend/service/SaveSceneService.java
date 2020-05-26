package blocky.backend.service;

import blocky.backend.dao.SaveSceneDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveSceneService {
    @Autowired
    private SaveSceneDao saveSceneDao;

    public boolean saveScene(String title,
                             int create_id,
                             String script,
                             int three_id,
                             String l1,
                             String l2,
                             String l3,
                             String l4,
                             String l5,
                             String l6,
                             String l7,
                             String l8,
                             String description,
                             int level_number,
                             String objects){
        return saveSceneDao.saveScene(title, create_id, script, three_id, l1, l2, l3, l4, l5, l6, l7, l8, description, level_number, objects) > 0;
    }
}
