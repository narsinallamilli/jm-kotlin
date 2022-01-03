package com.ex.jm

import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired
import com.ex.jm.JmService
import org.springframework.web.bind.annotation.GetMapping

@RestController
class JmController {
    @Autowired
    private val jmService: JmService? = null
    @GetMapping("/hello")
    fun greeting(): String {
        println(jmService!!.camelContext)
        return "ok"
    }
}