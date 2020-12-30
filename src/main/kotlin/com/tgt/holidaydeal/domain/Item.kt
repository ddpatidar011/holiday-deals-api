package com.tgt.holidaydeal.domain

import javax.persistence.*

@Entity(name = "Item")
@Table(name = "Item")
class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    var deal_id: Long? = null
    @Column
    val item_id: Long? = null
    @Column
    val retailer: String? = null
    @Column
    val price: Float? = null
    @Column
    val url_of_deal: String? = null

}