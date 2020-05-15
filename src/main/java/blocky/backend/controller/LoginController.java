package blocky.backend.controller;

import blocky.backend.entity.UsersEntity;
import blocky.backend.service.LoginService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@ResponseBody
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/users/login")
    public Map<String,Object> login(String username, String password, HttpServletResponse response) throws IOException {
        Gson gson = new Gson();
        Map<String,Object> result = new HashMap<>();

        UsersEntity usersEntity = loginService.getSearcherResultByIDAndPassword(username,password);
        if(usersEntity == null){
            result.put("msg","Invalid username or password");
            response.setStatus(400);
        }else {
            result.put("msg","ok");
            result.put("user",gson.fromJson(usersEntity.toString(),result.getClass()));
        }
        return result;
    }
}
