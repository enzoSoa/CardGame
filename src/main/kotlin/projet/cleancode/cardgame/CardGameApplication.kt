package projet.cleancode.cardgame

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class CardGameApplication

fun main(args: Array<String>) {
    runApplication<CardGameApplication>(*args)
}

@RestController
class MessageController {
    @GetMapping
    fun index() = "Hello World!"
}