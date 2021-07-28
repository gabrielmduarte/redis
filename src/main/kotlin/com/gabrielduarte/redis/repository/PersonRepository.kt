package com.gabrielduarte.redis.repository

import com.gabrielduarte.redis.entity.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person, Long>
