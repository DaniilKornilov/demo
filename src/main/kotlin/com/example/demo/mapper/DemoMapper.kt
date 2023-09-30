package com.example.demo.mapper

import com.example.demo.controller.DemoDto
import com.example.demo.repository.DemoEntity
import org.springframework.stereotype.Component

@Component
class DemoMapper {
    fun map(demoDto: DemoDto): DemoEntity = DemoEntity(demoDto.id, demoDto.name)

    fun map(demoEntity: DemoEntity): DemoDto = DemoDto(demoEntity.id, demoEntity.name)
}
