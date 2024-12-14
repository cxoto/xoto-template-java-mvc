package cc.xoto.template.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping
    public Mono<ResponseEntity<Map<String, String>>> hello() {
        return Mono.just(ResponseEntity.ok(Map.of("message", "hello cc.")));
    }
}
