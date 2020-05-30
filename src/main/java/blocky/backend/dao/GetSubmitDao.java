package blocky.backend.dao;


import blocky.backend.entity.SubmitWithSceneIdEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GetSubmitDao {
    List<SubmitWithSceneIdEntity> getSubmitByTeacherId(@Param("teacher_id") int teacher_id);

    int searchTeacherByTeacherId(@Param("teacher_id") int teacher_id);
}
