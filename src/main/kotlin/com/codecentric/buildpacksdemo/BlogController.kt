package com.codecentric.buildpacksdemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class BlogController {

    @GetMapping("hello")
    fun hello(): String =
         "Hello, is it me you're looking for?"
}