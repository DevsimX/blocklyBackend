package blocky.backend.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SaveObjectsAndScriptDao {
    int saveObjectsAndScript(@Param(value = "scene_id") int scene_id,
                             @Param(value = "objects") String objects,
                             @Param(value = "script") String script,
                             @Param(value = "picture") String picture);
}
