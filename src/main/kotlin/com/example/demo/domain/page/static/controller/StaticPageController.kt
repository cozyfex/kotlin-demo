package com.example.demo.domain.page.static.controller

import com.example.demo.global.common.controller.BaseController
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class StaticPageController : BaseController() {
    @GetMapping("/")
    fun index(): String {
        return "index"
    }

    @GetMapping("hello")
    fun hello(): String {
        return "hello"
    }
}
