package blocky.backend.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SaveSubmitDao {
    int insertSubmit(@Param(value = "student_id")int student_id,
                     @Param(value = "teacher_id")int teacher_id,
                     @Param(value = "status")int status,
                     @Param(value = "history_id")int history_id
                     );

    int searchHistoryId(@Param(value = "student_id")int student_id,
                        @Param(value = "scene_id")int scene_id,
                        @Param(value = "action")String action);

    int searchTeacherId(@Param(value = "scene_id")int scene_id);

    int checkWhetherSubmit(@Param(value = "student_id")int student_id,
                           @Param(value = "scene_id")int scene_id,
                           @Param(value = "action")String action);
}
