package blocky.backend.service;

import blocky.backend.dao.SaveSubmitDao;
import blocky.backend.dao.SubmitEvaluationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubmitEvaluationService {
    @Autowired
    private SubmitEvaluationDao submitEvaluationDao;
    @Autowired
    private SaveSubmitDao saveSubmitDao;

    public boolean submitEvaluation(int scene_id,
                                    int student_id,
                                    int score,
                                    String feedback){
        int history_id = saveSubmitDao.searchHistoryId(student_id,scene_id,"submit");
        return submitEvaluationDao.submitEvaluation(history_id,student_id,score,2,feedback) > 0;
    }
}
