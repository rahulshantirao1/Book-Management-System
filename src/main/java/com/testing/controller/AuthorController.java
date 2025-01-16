package com.testing.controller;

import com.testing.service.AuthorService;

public class AuthorController
{

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


}
