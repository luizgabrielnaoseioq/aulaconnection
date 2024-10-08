package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PessoaController {
    @GetMapping("/pessoa/criar")
    private String criar(){
        return "pessoa/criacao";
    }

    @PostMapping("/pessoa/salvar")
    private String salvar() {
        return "";
    }
}
