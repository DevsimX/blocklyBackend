package blocky.backend.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SaveSceneDao {
    int saveScene(@Param(value = "title") String title,
                  @Param(value = "create_id") int create_id,
                  @Param(value = "script") String script,
                  @Param(value = "three_id") int three_id,
                  @Param(value = "l1") String l1,
                  @Param(value = "l2") String l2,
                  @Param(value = "l3") String l3,
                  @Param(value = "l4") String l4,
                  @Param(value = "l5") String l5,
                  @Param(value = "l6") String l6,
                  @Param(value = "l7") String l7,
                  @Param(value = "l8") String l8,
                  @Param(value = "description") String description,
                  @Param(value = "level_number") int level_number,
                  @Param(value = "objects") String objects);
}
