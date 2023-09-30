package com.example.demo.repository

import org.springframework.data.mongodb.repository.MongoRepository

interface DemoRepository : MongoRepository<DemoEntity, String>
