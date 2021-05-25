package com.example.blog

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {

    @Bean
    fun databaseInitializer(userRepository: UserRepository,
                            articleRepository: ArticleRepository) = ApplicationRunner {
        val smaldini = userRepository.save(User("smaldini", "Stephane", "Maldini"))
        val riley = userRepository.save(User("riley", "riley", "sohn"))
        articleRepository.save(Article(
            title = "Reactor Bismuth is out",
            headline = "Lorem ipsum",
            content = "dolor sit amet",
            author = smaldini
        ))
        articleRepository.save(Article(
            title = "Reactor Aluminium has landed",
            headline = "Lorem ipsum",
            content = "dolor ist amet",
            author = smaldini
        ))
        articleRepository.save(Article(
            title = "BuildCenter test",
            headline = "kotlin springboot",
            content = "dolor ist amet",
            author = riley
        ))
    }
}