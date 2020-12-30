package com.tgt.holidaydeal.controller


import com.tgt.holidaydeal.domain.Item
import com.tgt.holidaydeal.services.HolidayDealsService
import io.micronaut.http.annotation.*
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.inject.Inject

@Controller("/deals/v1")
class HolidayDealsController {

    @Inject
    lateinit var holidayDealsService: HolidayDealsService

    @Post("/")
    fun save(@Body item: Item): Item {
        log.info("Saving new deal details :{}", item)
        return holidayDealsService.save(item)
    }

    @Get("/{dealId}")
    fun findById(dealId: Long): Item? {
        log.info("Finding deal: {}", dealId)
        return holidayDealsService.findById(dealId)
    }

    @Get("/")
    fun findAll(): MutableIterable<Item> {
        log.info("find All deals")
        return holidayDealsService.findAll()
    }

    @Put("/{dealId}")
    fun updateDealById(dealId: Long , @Body item: Item): Item? {
        log.info("updating deal: {}", dealId)
        return holidayDealsService.updateDealById(dealId,item)
    }

    companion object {
        val log: Logger = LoggerFactory.getLogger(HolidayDealsController::class.java)
    }
}