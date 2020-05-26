package blocky.backend.controller;
import blocky.backend.service.SaveHistoryService;
import blocky.backend.service.SaveSceneService;
import blocky.backend.service.SaveSubmitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@ResponseBody
public class InsertController {
    @Autowired
    private SaveHistoryService saveHistoryService;
    @Autowired
    private SaveSceneService saveSceneService;
    @Autowired
    private SaveSubmitService saveSubmitService;

    @PostMapping("/insert/saveScene")
    public Map<String,Object> saveScene(String title,
                                        int create_id,
                                        String script,
                                        int three_id,
                                        String l1,
                                        String l2,
                                        String l3,
                                        String l4,
                                        String l5,
                                        String l6,
                                        String l7,
                                        String l8,
                                        String description,
                                        int level_number,
                                        String objects,
                                        HttpServletResponse response
                                        ){
        Map<String,Object> result = new HashMap<>();
        if(saveSceneService.saveScene(title, create_id, script, three_id, l1, l2, l3, l4, l5, l6, l7, l8, description, level_number, objects)){
            result.put("msg","ok");
        }else {
            result.put("msg","Database operations fail");
            response.setStatus(400);
        }
        return result;
    }

    @PostMapping("insert/saveHistory")
    public Map<String,Object> saveHistory(int user_id,
                                          int scene_id,
                                          String script,
                                          int level,
                                          String objects,
                                          HttpServletResponse response
                                          ){
        Map<String,Object> result = new HashMap<>();
        if(saveHistoryService.saveHistory(user_id, scene_id, script, level,"save", objects)){
            result.put("msg","ok");
        }else {
            result.put("msg","Database operations fail");
            response.setStatus(400);
        }
        return result;
    }

    @PostMapping("insert/saveSubmit")
    public Map<String,Object> saveSubmit(int student_id,
                                          int scene_id,
                                          String script,
                                          int level,
                                          String objects,
                                          int status,
                                          HttpServletResponse response
    ){
        Map<String,Object> result = new HashMap<>();
        if(saveHistoryService.saveHistory(student_id,scene_id,script,level,"submit",objects) && saveSubmitService.saveSubmit(student_id,scene_id,status)){
            result.put("msg","ok");
        }else {
            result.put("msg","Database operations fail");
            response.setStatus(400);
        }
        return result;
    }
}