package com.example.module4_spring_with_spring_boot.item;

import org.springframework.http.HttpStatus;

public class ItemInfoWithUrlState implements ItemInfo {

    private final ItemInfo itemInfo;

    private final HttpStatus status;

    @Override
    public Long getId() {
        return itemInfo.getId();
    }

    @Override
    public String getUrl() {
        return itemInfo.getUrl();
    }

    public HttpStatus getStatus() {
        return status;
    }

    public ItemInfoWithUrlState(ItemInfo itemInfo, HttpStatus status) {
        this.itemInfo = itemInfo;
        this.status = status;
    }
}
