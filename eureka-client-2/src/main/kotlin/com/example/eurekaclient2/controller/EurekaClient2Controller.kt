package com.example.eurekaclient2.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EurekaClient2Controller {
    @GetMapping("/eureka-client-2/hello")
    fun eurekaclient(): String {
        return "eureka-client-2"
    }
}