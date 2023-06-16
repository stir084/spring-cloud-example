package com.example.eurekaclient1.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EurekaClient1Controller {
    @GetMapping("/eureka-client-1/hello")
    fun eurekaclient(): String {
        return "eureka-client-1"
    }
}