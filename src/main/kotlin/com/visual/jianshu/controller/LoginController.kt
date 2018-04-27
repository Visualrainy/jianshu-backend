package com.visual.jianshu.controller

import com.visual.jianshu.domain.LoginResponse
import org.springframework.web.bind.annotation.*

@RestController
class LoginController {

    @PostMapping(value = ["/login"])
    fun login(@RequestParam("username") username: String, @RequestParam password: String): LoginResponse {
        if (username == "Visual" && password == "123") {
            return LoginResponse("Visual", "1ksjdf")
        }
        return LoginResponse("xxx", "xxx")
    }
}