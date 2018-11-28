package com.pichlera.pos1.test.firststeps.controller;


import com.pichlera.pos1.test.firststeps.model.Article;
import com.pichlera.pos1.test.firststeps.service.MyFirstService;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class MyFirstController {


    private MyFirstService service;

    public MyFirstController(MyFirstService service) {
        this.service = service;
    }

    public Optional<Article> doUseCaseArticleById(long id){

        return service.getArticle(id);
    }
}
