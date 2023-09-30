package com.example.demo.service

import com.example.demo.controller.DemoDto
import com.example.demo.mapper.DemoMapper
import com.example.demo.repository.DemoRepository
import org.springframework.stereotype.Service

@Service
class DemoService(private val demoRepository: DemoRepository, private val demoMapper: DemoMapper) {

    fun saveDemos(demoList: List<DemoDto>) {
        demoRepository.saveAll(demoList.map { demoDto -> demoMapper.map(demoDto) })
    }

    fun getDemos(): List<DemoDto> {
        return demoRepository.findAll().map { demoEntity -> demoMapper.map(demoEntity) }
    }

    fun deleteDemos() {
        demoRepository.deleteAll()
    }

}
