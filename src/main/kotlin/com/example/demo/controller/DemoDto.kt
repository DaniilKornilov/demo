package com.example.demo.controller

import java.util.UUID

data class DemoDto(val id: String = UUID.randomUUID().toString(), val name: String)
