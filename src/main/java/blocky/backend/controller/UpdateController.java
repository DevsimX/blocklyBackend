package blocky.backend.controller;
import blocky.backend.service.SaveObjectsAndScriptService;
import blocky.backend.service.SubmitEvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@ResponseBody
public class UpdateController {
    @Autowired
    private SubmitEvaluationService submitEvaluationService;
    @Autowired
    private SaveObjectsAndScriptService saveObjectsAndScriptService;

    @PostMapping("/update/submitEvaluation")
    public Map<String,Object> submitEvaluation(int scene_id,
                                        int student_id,
                                        int score,
                                        String feedback,
                                        HttpServletResponse response
    ){
        Map<String,Object> result = new HashMap<>();
        if(submitEvaluationService.submitEvaluation(scene_id,student_id,score,feedback)){
            result.put("msg","ok");
        }else {
            response.setStatus(400);
            result.put("msg","Database operations fail");
        }
        return result;
    }

    @PostMapping("/update/saveObjectsAndScript")
    public Map<String,Object> saveObjectsAndScript(int scene_id,
                                               String objects,
                                               String script,
                                               HttpServletResponse response
    ){
        Map<String,Object> result = new HashMap<>();
        if(saveObjectsAndScriptService.saveObjectsAndScript(scene_id,objects,script)){
            result.put("msg","ok");
        }else {
            response.setStatus(400);
            result.put("msg","Database operations fail");
        }
        return result;
    }
}
