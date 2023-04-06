package com.hexus.Web_Hexus.controller

import model.html.HexusResource
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HexusStatusContoller {

    @PostMapping("status/receive")
    fun receiveStatus(@RequestBody resource: HexusResource): HexusResource{
        println(resource)
        return resource
    }



}