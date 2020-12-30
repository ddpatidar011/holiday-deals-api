package com.tgt.holidaydeal.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014\u00a8\u0006\u0017"}, d2 = {"Lcom/tgt/holidaydeal/domain/Item;", "", "()V", "deal_id", "", "getDeal_id", "()Ljava/lang/Long;", "setDeal_id", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "item_id", "getItem_id", "price", "", "getPrice", "()Ljava/lang/Float;", "Ljava/lang/Float;", "retailer", "", "getRetailer", "()Ljava/lang/String;", "url_of_deal", "getUrl_of_deal", "holidaydealsapi"})
@javax.persistence.Table(name = "Item")
@javax.persistence.Entity(name = "Item")
public final class Item {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE)
    @javax.persistence.Id()
    private java.lang.Long deal_id;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column()
    private final java.lang.Long item_id = null;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column()
    private final java.lang.String retailer = null;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column()
    private final java.lang.Float price = null;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.Column()
    private final java.lang.String url_of_deal = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDeal_id() {
        return null;
    }
    
    public final void setDeal_id(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getItem_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRetailer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl_of_deal() {
        return null;
    }
    
    public Item() {
        super();
    }
}