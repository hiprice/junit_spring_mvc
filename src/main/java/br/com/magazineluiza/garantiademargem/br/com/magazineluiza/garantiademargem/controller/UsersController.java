package br.com.magazineluiza.garantiademargem.br.com.magazineluiza.garantiademargem.controller;


import br.com.magazineluiza.garantiademargem.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public List<User> list() {
        return Arrays.asList(new User(1l, "daniel"),
                new User(2l, "rafael"),
                new User(3l, "cora"),
                new User(4l, "freitas"));
    }
}
