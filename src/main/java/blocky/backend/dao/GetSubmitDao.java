package blocky.backend.dao;


import blocky.backend.entity.SubmitWithSceneIdTitleStudentNameEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GetSubmitDao {
    List<SubmitWithSceneIdTitleStudentNameEntity> getSubmitByTeacherId(@Param("teacher_id") int teacher_id);

    int searchTeacherByTeacherId(@Param("teacher_id") int teacher_id);
}
