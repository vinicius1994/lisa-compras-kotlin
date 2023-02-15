package com.lista.compras

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ComprasApplication

fun main(args: Array<String>) {
	runApplication<ComprasApplication>(*args)
}
