package com.myawsdemo.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class GetController {

    @GetMapping("/")
    fun getStuff(): String{
        return "HELLOO IM KOTLION"
    }


}