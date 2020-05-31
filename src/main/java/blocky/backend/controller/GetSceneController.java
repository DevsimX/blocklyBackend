package blocky.backend.controller;

import blocky.backend.entity.SceneEntity;
import blocky.backend.entity.SubmittedSceneEntity;
import blocky.backend.service.GetSceneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@ResponseBody
public class GetSceneController {
    @Autowired
    private GetSceneService getSceneService;

    @GetMapping("/scenes/getList")
    public Map<String,Object> getSceneList(){
        Map<String,Object> result = new HashMap<>();
        result.put("msg",getSceneService.getSceneListMsg());
        result.put("list",getSceneService.getSceneList());
        return result;
    }

    @GetMapping("/scenes/getScene")
    public Map<String,Object> getSceneByID(int id, HttpServletResponse response) throws IOException {
        Map<String,Object> result = new HashMap<>();
        List<SceneEntity> sceneEntityList = getSceneService.getSceneEntityList(id);

        if(sceneEntityList.isEmpty()){
            result.put("msg","scene not found");
            response.setStatus(400);
        }else {
            result.put("msg","ok");
            result.put("list",sceneEntityList);
        }
        return result;
    }
    @GetMapping("/scenes/submits")
    public Map<String,Object> getSubmittedSceneByStudentID(int student_id,HttpServletResponse response) throws IOException {
        Map<String,Object> result = new HashMap<>();
        List<SubmittedSceneEntity> submittedSceneEntityList = getSceneService.getSubmittedSceneByStudentId(student_id);

        if(!getSceneService.searchStudentByStudentId(student_id)){
            result.put("msg","student not found");
            response.setStatus(400);
        }else {
            result.put("msg","ok");
            result.put("list",submittedSceneEntityList);
        }
        return result;
    }
    @GetMapping("/scenes/submit")
    public Map<String,Object> getSubmittedSceneBySubmitID(int submit_id, HttpServletResponse response) throws IOException {
        Map<String,Object> result = getSceneService.getAllBySubmitId(submit_id);
        if(!result.get("msg").equals("ok")){
            response.setStatus(400);
        }
        return result;
    }
    @GetMapping("/scenes/save")
    public Map<String,Object> getSavedSceneBySubmitID(int student_id, HttpServletResponse response) throws IOException {

        Map<String,Object> result = new HashMap<>();
        if(!getSceneService.searchStudentByStudentId(student_id)){
            result.put("msg","student not found");
            response.setStatus(400);
        }else {
            result = getSceneService.getRecentSaveByStudentId(student_id);
        }
        return result;
    }
    @GetMapping("/scenes/getSceneByTeacherId")
    public Map<String,Object> getSceneByTeacherId(int teacher_id, HttpServletResponse response) throws IOException {

        Map<String,Object> result = getSceneService.getSceneByTeacherId(teacher_id);
        if(!result.containsValue("ok")){
            response.setStatus(400);
        }
        return result;
    }
}
