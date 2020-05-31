package blocky.backend.service;

import blocky.backend.dao.SaveSubmitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveSubmitService {
    @Autowired
    private SaveSubmitDao saveSubmitDao;

    public boolean saveSubmit(int student_id,int scene_id,int status){
        int history_id = saveSubmitDao.searchHistoryId(student_id,scene_id,"submit");

        int teacher_id = saveSubmitDao.searchTeacherId(scene_id);

        return saveSubmitDao.insertSubmit(student_id,teacher_id,status,history_id) > 0;
    }

    public boolean checkWhetherSubmit(int student_id,int scene_id){
        return saveSubmitDao.checkWhetherSubmit(student_id,scene_id,"submit") > 0;
    }
}
