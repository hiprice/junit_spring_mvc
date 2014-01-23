package br.com.magazineluiza.garantiademargem.br.com.magazineluiza.garantiademargem.controller;

import br.com.magazineluiza.garantiademargem.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public User get(@PathVariable("id") Long id) {
        Map<Long, User> usuarios = new HashMap<Long, User>();
        usuarios.put(1l,  new User(1l, "daniel"));
        usuarios.put(2l,  new User(2l, "rafael"));
        usuarios.put(3l,  new User(3l, "cora"));
        usuarios.put(4l,  new User(4l, "freitas"));

        return usuarios.get(id);
    }
}
