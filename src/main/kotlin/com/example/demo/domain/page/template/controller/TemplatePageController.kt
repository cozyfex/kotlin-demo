package com.example.demo.domain.page.template.controller

import com.example.demo.global.common.controller.BaseController
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class TemplatePageController : BaseController() {
    @GetMapping("/template")
    fun template(): String {
        return "template"
    }
}
