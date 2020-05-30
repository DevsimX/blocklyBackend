package blocky.backend.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SubmitEvaluationDao {
    int submitEvaluation(@Param(value = "history_id")int history_id,
                         @Param(value = "student_id")int student_id,
                         @Param(value = "score")int score,
                         @Param(value = "feedback")String feedback);
}
