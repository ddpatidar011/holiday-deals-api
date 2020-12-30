package com.tgt.holidaydeal.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J!\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H&\u00a8\u0006\n"}, d2 = {"Lcom/tgt/holidaydeal/repository/HolidayDealsRepository;", "Lio/micronaut/data/repository/CrudRepository;", "Lcom/tgt/holidaydeal/domain/Item;", "", "findById", "Ljava/util/Optional;", "id", "(Ljava/lang/Long;)Ljava/util/Optional;", "save", "item", "holidaydealsapi"})
@io.micronaut.data.annotation.Repository()
public abstract interface HolidayDealsRepository extends io.micronaut.data.repository.CrudRepository<com.tgt.holidaydeal.domain.Item, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.Optional<com.tgt.holidaydeal.domain.Item> findById(@org.jetbrains.annotations.Nullable()
    java.lang.Long id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.tgt.holidaydeal.domain.Item save(@org.jetbrains.annotations.Nullable()
    com.tgt.holidaydeal.domain.Item item);
}