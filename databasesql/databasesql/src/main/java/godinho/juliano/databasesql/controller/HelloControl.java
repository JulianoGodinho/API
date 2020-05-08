package godinho.juliano.databasesql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {

    @GetMapping("/")
    public String index(){
        return "Seja Bem vindo ao sistema API teste";
    }
}
