package com.example.eurekaclient2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class EurekaClient2Application

fun main(args: Array<String>) {
	runApplication<EurekaClient2Application>(*args)
}
