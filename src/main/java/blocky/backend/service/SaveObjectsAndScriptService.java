package blocky.backend.service;

import blocky.backend.dao.SaveObjectsAndScriptDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveObjectsAndScriptService {
    @Autowired
    private SaveObjectsAndScriptDao saveObjectsAndScriptDao;

    public boolean saveObjectsAndScript(int scene_id,String objects,String script, String picture){
        return saveObjectsAndScriptDao.saveObjectsAndScript(scene_id,objects,script,picture) > 0;
    }
}
