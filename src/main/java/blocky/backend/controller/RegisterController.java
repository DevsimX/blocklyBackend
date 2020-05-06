package blocky.backend.controller;

import blocky.backend.entity.UsersEntity;
import blocky.backend.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@ResponseBody
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping("/users/register")
    public Map<String,Object> register(String username,
                                       String password,
                                       String name,
                                       String email,
                                       String user_type,
                                       HttpServletResponse response) throws IOException {
        Map<String,Object> result = new HashMap<>();
        String msg;

        if((!user_type.equals("student") && !user_type.equals("teacher")) ||
                !registerService.checkUsernameWhetherUsable(username)){
            msg = "failed";
            result.put("msg",msg);
            response.setStatus(400);
            return result;
        }

        long role = user_type.equals("student")? 1:0;
        UsersEntity usersEntity = new UsersEntity(username,password,role,name,email);
        if (!registerService.insertIntoUsers(usersEntity)) {
            msg = "insert operation failed";
            result.put("msg",msg);
            response.setStatus(400);
            return result;
        }else {
            msg = "ok";
            result.put("msg",msg);
            return result;
        }
    }
}
