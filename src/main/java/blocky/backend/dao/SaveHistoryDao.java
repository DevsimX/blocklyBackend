package blocky.backend.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SaveHistoryDao {
    int saveHistory(@Param(value = "user_id") int user_id,
                    @Param(value = "scene_id") int scene_id,
                    @Param(value = "script") String script,
                    @Param(value = "level") int level,
                    @Param(value = "action") String action,
                    @Param(value = "objects") String objects);
}
