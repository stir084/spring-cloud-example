package com.example.eurekaclient2.controller

import com.example.eurekaclient2.FeignClientInterface
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EurekaClient2Controller(
    @Autowired private val feignClientInterface: FeignClientInterface
){
    @GetMapping("/eureka-client-2/hello")
    fun eurekaclient(): String {
        return "eureka-client-2"
    }

    @GetMapping("/eureka-client-2/test")
    fun test(): String {
        println(feignClientInterface.eurekaclient())
        println("짜란")
        return "test"
    }
}