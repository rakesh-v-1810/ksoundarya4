package com.bridgelab.inventorymanager

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.io.File

fun main() {
    val objectMapper = jacksonObjectMapper()

    val fileName = "/home/user/IdeaProjects/KotlinPrograms/src/main/kotlin/com/bridgelab/inventorymanager/inventory.json"
    val file = File(fileName)

    val inventory  : InventoryFactory = objectMapper.readValue(src = file)
    println(inventory)
}