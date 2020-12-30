package com.tgt.holidaydeal.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/tgt/holidaydeal/domain/DealsVO;", "", "()V", "id", "", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "name", "", "getName", "()Ljava/lang/String;", "holidaydealsapi"})
@javax.persistence.Table(name = "DealsVO")
@javax.persistence.Entity(name = "DealsVO")
public final class DealsVO {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE)
    @javax.persistence.Id()
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column()
    private final java.lang.String name = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public DealsVO() {
        super();
    }
}