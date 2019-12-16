package br.com.mecommerce.controller;

import br.com.mecommerce.entity.User;
import br.com.mecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(name = "/", produces = "application/json",params = {"login","password"})
    public ResponseEntity authUser(@RequestParam(name = "login") String login,@RequestParam(name = "password") String password) {
        Optional<User> user = userRepository.findByLoginAndPassword(login,password);
        if(user.isPresent())
            ResponseEntity.ok(user.get());
        return ResponseEntity.notFound().build();
    }

}
