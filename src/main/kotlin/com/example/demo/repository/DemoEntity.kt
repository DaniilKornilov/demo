package com.example.demo.repository

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.UUID

@Document(collection = "demos")
data class DemoEntity(@Id val id: String = UUID.randomUUID().toString(), val name: String)
