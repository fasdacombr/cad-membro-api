package br.com.fasdacombr.cadmembroapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/ola")
    public String ola() {
        return "<h1>Olá Flávio</h1>";
    }
}
