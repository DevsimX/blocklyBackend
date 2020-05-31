package blocky.backend.dao;

import blocky.backend.entity.SceneEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SaveSceneDao {
    int saveScene(SceneEntity sceneEntity);
}
