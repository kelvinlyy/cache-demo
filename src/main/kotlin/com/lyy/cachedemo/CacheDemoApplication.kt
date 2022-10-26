/*
File: CacheDemoApplication.kt
Author: Kelvin LYY
Summary: Main file for starting the spring boot application

*/

package com.lyy.cachedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CacheDemoApplication

fun main(args: Array<String>) {
    runApplication<CacheDemoApplication>(*args)
}
