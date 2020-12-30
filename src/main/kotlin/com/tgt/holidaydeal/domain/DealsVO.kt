package com.tgt.holidaydeal.domain

import javax.persistence.*

@Entity(name="DealsVO")
@Table(name = "DealsVO")
class DealsVO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Long? = null
    @Column
    val name: String? = null
}