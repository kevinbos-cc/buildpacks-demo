package com.codecentric.buildpacksdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BuildpacksDemoApplication

fun main(args: Array<String>) {
	runApplication<BuildpacksDemoApplication>(*args)
}
