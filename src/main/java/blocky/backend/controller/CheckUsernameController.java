package blocky.backend.controller;

import blocky.backend.service.CheckUsernameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blockyBackend/api/checkUsername")
public class CheckUsernameController {
    @Autowired
    private CheckUsernameService checkUsernameService;

    @RequestMapping(value = "/get/{username}",method = RequestMethod.GET)
    public String check(@PathVariable String username){
        System.out.println(username);
        System.out.println("username:" + username);
        return checkUsernameService.checkUsername(username);
    }
}
