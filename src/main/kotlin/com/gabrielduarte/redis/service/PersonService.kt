package com.gabrielduarte.redis.service

import com.gabrielduarte.redis.entity.Person
import com.gabrielduarte.redis.repository.PersonRepository
import org.springframework.cache.annotation.Cacheable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class PersonService(
    private val personRepository: PersonRepository
) {

//    @Cacheable(value = ["persons"], key = "#root.methodName")
    fun findALl(): List<Person> = personRepository.findAll()

    @Cacheable(value = ["personUnityCache"], key = "#id")
    fun findOne(id: Long) = personRepository.findByIdOrNull(id)

}
