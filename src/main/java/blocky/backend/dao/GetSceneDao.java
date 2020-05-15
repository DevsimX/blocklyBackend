package blocky.backend.dao;

import blocky.backend.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GetSceneDao {
    List<SceneListEntity> getSceneList();

    List<SceneEntity> getSceneById(@Param(value = "id") int id);

    List<SubmittedSceneEntity> getSubmittedSceneByStudentId(@Param(value = "student_id") int student_id);

    HistoryEntity getHistoryBySubmitId(@Param(value = "submit_id") int submit_id);

    List<HistoryEntity> getHistoryByStudentId(@Param(value = "student_id") int student_id);

    SubmitEntity getSubmitBySubmitId(@Param(value = "submit_id") int submit_id);

    SceneEntity getSceneBySubmitId(@Param(value = "submit_id") int submit_id);

    SceneEntity getPartSceneById(@Param(value = "scene_id") int scene_id);

    int searchStudentId(@Param(value = "student_id") int student_id);
}
