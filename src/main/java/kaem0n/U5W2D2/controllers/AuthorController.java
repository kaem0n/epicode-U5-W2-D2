package kaem0n.U5W2D2.controllers;

import kaem0n.U5W2D2.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    @Autowired
    public AuthorService as;
}
