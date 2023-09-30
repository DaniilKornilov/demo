package com.example.demo.configuration

import com.example.demo.controller.DemoDto
import com.example.demo.service.DemoService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DemoConfiguration(private val demoService: DemoService) {

    @Bean
    fun fillInDemos() {
        demoService.deleteDemos()
        demoService.saveDemos(listOf(DemoDto(name = "demo1"), DemoDto(name = "demo2"), DemoDto(name = "demo3")))
    }

}
