package com.example.eurekaclient2

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "eureka-client-1")
interface FeignClientInterface {
    @GetMapping("/eureka-client-1/hello")
    fun eurekaclient(): String
}