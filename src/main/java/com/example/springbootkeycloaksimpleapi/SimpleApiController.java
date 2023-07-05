package com.example.springbootkeycloaksimpleapi;

import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleApiController {

    @GetMapping("/public")
    public String getPublic() {
        return "Hi World, I am a public endpoint";
    }

    @GetMapping("/secured")
    public String getSecured(JwtAuthenticationToken token) {
        return "Hi %s, I am a secured endpoint".formatted(token.getName());
    }
}
