package org.ohgiraffers.gitpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitPracticeApplication {

    public static void main(String[] args) {
        System.out.println("hello world!"); //기능 추가
        SpringApplication.run(GitPracticeApplication.class, args);
    }

}
