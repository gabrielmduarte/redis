package com.gabrielduarte.redis.controller

import com.gabrielduarte.redis.entity.Person
import com.gabrielduarte.redis.service.PersonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/redis")
class PersonController (
    private val personService: PersonService
) {

    @GetMapping
    fun findAll(): List<Person> = personService.findALl()

    @GetMapping("/{id}")
    fun findOne(@PathVariable id: Long): Person? = personService.findOne(id)

}