package blocky.backend.controller;

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
    public Map<String,Object> check(String username, String password, HttpServletResponse response) throws IOException {
        Gson gson = new Gson();
        Map<String,Object> result = new HashMap<>();
        loginService.searchUserByIDAndPassword(username,password);
        result.put("msg",loginService.getLoginResult());
        if(loginService.getSearcherResultByIDAndPassword() != null)
            result.put("user",gson.fromJson(loginService.getSearcherResultByIDAndPassword().toString(),result.getClass()));
        else
            response.setStatus(400);
        return result;
    }
}
