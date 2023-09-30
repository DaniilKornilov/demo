package com.example.demo.controller

import com.example.demo.service.DemoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("demo")
class DemoController(private val demoService: DemoService) {

    @GetMapping
    fun getDemos(): List<DemoDto> {
        return demoService.getDemos()
    }

}
