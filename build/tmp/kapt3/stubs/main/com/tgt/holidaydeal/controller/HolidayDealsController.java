package com.tgt.holidaydeal.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0012\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u000bH\u0007J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000bH\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/tgt/holidaydeal/controller/HolidayDealsController;", "", "()V", "holidayDealsService", "Lcom/tgt/holidaydeal/services/HolidayDealsService;", "getHolidayDealsService", "()Lcom/tgt/holidaydeal/services/HolidayDealsService;", "setHolidayDealsService", "(Lcom/tgt/holidaydeal/services/HolidayDealsService;)V", "findAll", "", "Lcom/tgt/holidaydeal/domain/Item;", "findById", "dealId", "", "save", "item", "updateDealById", "Companion", "holidaydealsapi"})
@io.micronaut.http.annotation.Controller(value = "/deals/v1")
public final class HolidayDealsController {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.tgt.holidaydeal.services.HolidayDealsService holidayDealsService;
    @org.jetbrains.annotations.NotNull()
    private static final org.slf4j.Logger log = null;
    public static final com.tgt.holidaydeal.controller.HolidayDealsController.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tgt.holidaydeal.services.HolidayDealsService getHolidayDealsService() {
        return null;
    }
    
    public final void setHolidayDealsService(@org.jetbrains.annotations.NotNull()
    com.tgt.holidaydeal.services.HolidayDealsService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post(value = "/")
    public final com.tgt.holidaydeal.domain.Item save(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    com.tgt.holidaydeal.domain.Item item) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Get(value = "/{dealId}")
    public final com.tgt.holidaydeal.domain.Item findById(long dealId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/")
    public final java.lang.Iterable<com.tgt.holidaydeal.domain.Item> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Put(value = "/{dealId}")
    public final com.tgt.holidaydeal.domain.Item updateDealById(long dealId, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    com.tgt.holidaydeal.domain.Item item) {
        return null;
    }
    
    public HolidayDealsController() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tgt/holidaydeal/controller/HolidayDealsController$Companion;", "", "()V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "holidaydealsapi"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.slf4j.Logger getLog() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}