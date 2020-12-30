package com.tgt.holidaydeal.repository

import com.tgt.holidaydeal.domain.DealsVO
import com.tgt.holidaydeal.domain.Item
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import java.util.*


@Repository
interface HolidayDealsRepository : CrudRepository<Item, Long> {
    fun findById(id: Long?): Optional<Item?>?

    fun save(item: Item?): Item?

}