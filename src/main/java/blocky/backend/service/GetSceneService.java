package blocky.backend.service;

import blocky.backend.dao.GetSceneDao;
import blocky.backend.dao.GetSubmitDao;
import blocky.backend.entity.*;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GetSceneService {
    @Autowired
    private GetSceneDao getSceneDao;
    @Autowired
    private GetSubmitDao getSubmitDao;

    public List<SceneListEntity> getSceneList(){
        return getSceneDao.getSceneList();
    }


    public List<SceneEntity> getSceneEntityList(int id){
        return getSceneDao.getSceneById(id);
    }

    public List<SubmittedSceneEntity> getSubmittedSceneByStudentId(int student_id){
        return getSceneDao.getSubmittedSceneByStudentId(student_id);
    }

    public Map<String,Object> getAllBySubmitId(int submit_id){
        Map<String,Object> result = new HashMap<>();
        SubmitEntity submitEntity = getSceneDao.getSubmitBySubmitId(submit_id);
        if(submitEntity != null){
            Gson gson = new Gson();
            result.put("msg","ok");
            result.put("history",gson.fromJson(getSceneDao.getHistoryBySubmitId(submit_id).toString(),result.getClass()));
            result.put("scene",gson.fromJson(getSceneDao.getSceneBySubmitId(submit_id).toString(),result.getClass()));
            result.put("submit",gson.fromJson(submitEntity.toString(),result.getClass()));
        }else {
            result.put("msg","submit not found");
        }
        return result;
    }

    public Map<String,Object> getRecentSaveByStudentId(int student_id){
        Map<String,Object> result = new HashMap<>();
        Gson gson = new Gson();
        List<HistoryEntity> historyEntityList = getSceneDao.getHistoryByStudentId(student_id);
        result.put("msg","ok");
        if(!historyEntityList.isEmpty()){
            HistoryEntity recentlyHistoryEntity = historyEntityList.get(0);
            SceneEntity sceneEntity = getSceneDao.getPartSceneById(recentlyHistoryEntity.getSceneId());
            String data = "{" + "scene: " + sceneEntity.toString() + ", history: " + recentlyHistoryEntity.toString() + "}";
            result.put("data",gson.fromJson(data,result.getClass()));
        }else {
            result.put("data",gson.fromJson("{scene: [], history: []}",result.getClass()));
        }
        return result;
    }

    public Map<String,Object> getSceneByTeacherId(int teacher_id){
        Map<String,Object> result = new HashMap<>();
        if(getSubmitDao.searchTeacherByTeacherId(teacher_id) == 0){
            result.put("msg","teacher not found");
        }else {
            List<SceneEntity> sceneEntityList = getSceneDao.getSceneByTeacherId(teacher_id);
            result.put("list",sceneEntityList);
            result.put("msg","ok");
        }
        return result;
    }



    public Boolean searchStudentByStudentId(int student_id){
        return getSceneDao.searchStudentId(student_id) != 0;
    }

    public String getSceneListMsg(){
        return "ok";
    }
}
