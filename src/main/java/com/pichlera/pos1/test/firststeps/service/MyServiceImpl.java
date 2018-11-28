package com.pichlera.pos1.test.firststeps.service;

import com.pichlera.pos1.test.firststeps.model.Article;
import com.pichlera.pos1.test.firststeps.repository.ArticleMemRepository;
import com.pichlera.pos1.test.firststeps.repository.ArticleRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class MyServiceImpl implements MyFirstService {


    private ArticleRepository articleRespo;


    public MyServiceImpl(ArticleMemRepository articleRespo) {
        this.articleRespo = articleRespo;
    }

    @java.lang.Override
    public Optional<Article> getArticle(long id) {
        return articleRespo.findById(id);
    }

}
