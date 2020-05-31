package blocky.backend.service;

import blocky.backend.dao.SaveSceneDao;
import blocky.backend.entity.SceneEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveSceneService {
    @Autowired
    private SaveSceneDao saveSceneDao;

    public boolean saveScene(SceneEntity sceneEntity){
        return saveSceneDao.saveScene(sceneEntity) > 0;
    }
}
