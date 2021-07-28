package com.gabrielduarte.redis.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
data class Person(

    @Id
    private val id: Long,

    @Column(nullable = false)
    private val name: String

) : Serializable