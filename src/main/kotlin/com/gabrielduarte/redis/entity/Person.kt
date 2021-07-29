package com.gabrielduarte.redis.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Person(

    @Id
    val id: Long,

    @Column(nullable = false)
    val name: String

) : Serializable