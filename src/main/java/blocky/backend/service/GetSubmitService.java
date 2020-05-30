package blocky.backend.service;

import blocky.backend.dao.GetSubmitDao;
import blocky.backend.entity.SubmitWithSceneIdTitleStudentNameEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GetSubmitService {
    @Autowired
    private GetSubmitDao getSubmitDao;

    public Map<String,Object> getSubmitByTeacherID(int teacher_id){
        Map<String,Object> result = new HashMap<>();
        if(getSubmitDao.searchTeacherByTeacherId(teacher_id) == 0){
            result.put("msg","teacher not found");
        }else {
            result.put("msg","ok");
            List<SubmitWithSceneIdTitleStudentNameEntity> submitEntityList;
            submitEntityList = getSubmitDao.getSubmitByTeacherId(teacher_id);
            result.put("data",submitEntityList);
        }
        return result;
    }
}
