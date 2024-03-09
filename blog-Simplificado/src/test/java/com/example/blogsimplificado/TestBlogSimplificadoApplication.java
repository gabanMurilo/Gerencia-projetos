package com.example.blogsimplificado;

import com.blog.blogsimplificado.BlogSimplificadoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestBlogSimplificadoApplication {

    public static void main(String[] args) {
        SpringApplication.from(BlogSimplificadoApplication::main).with(TestBlogSimplificadoApplication.class).run(args);
    }

}
