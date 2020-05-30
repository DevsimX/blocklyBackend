package blocky.backend.controller;
import blocky.backend.service.GetSubmitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@ResponseBody
public class GetSubmitController {
    @Autowired
    private GetSubmitService getSubmitService;

    @GetMapping("/getSubmit/getSubmitByTeacherId")
    public Map<String,Object> saveScene(int teacher_id,
                                        HttpServletResponse response
    ){
        Map<String,Object> result = getSubmitService.getSubmitByTeacherID(teacher_id);
        if(!result.containsValue("ok"))
            response.setStatus(400);
        return result;
    }
}
