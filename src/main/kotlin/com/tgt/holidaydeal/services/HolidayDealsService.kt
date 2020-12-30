package com.tgt.holidaydeal.services

import com.tgt.holidaydeal.domain.Item
import com.tgt.holidaydeal.repository.HolidayDealsRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HolidayDealsService {

    @Inject
    open lateinit var holidayDealsRepository: HolidayDealsRepository

    open fun save(item: Item): Item {
        log.info("Saving Item :{}", item)
        holidayDealsRepository.save(item)
        return item
    }

    open fun findById(id: Long): Item? {
        log.info("Finding deal :{}", id)
        return holidayDealsRepository.findById(id).orElse(null)
    }

    open fun findAll(): MutableIterable<Item> {
        log.info("Find All deals")
        return holidayDealsRepository.findAll()
    }

    open fun updateDealById(id: Long,item: Item): Item? {
        log.info("update deal :{}",id)
        item.deal_id = id;
        return holidayDealsRepository.update(item);
    }

    companion object {
        val log: Logger = LoggerFactory.getLogger(HolidayDealsService::class.java)
    }
}