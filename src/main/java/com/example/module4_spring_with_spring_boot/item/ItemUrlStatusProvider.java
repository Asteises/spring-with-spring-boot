package com.example.module4_spring_with_spring_boot.item;

import org.springframework.http.HttpStatus;

public interface ItemUrlStatusProvider {

    HttpStatus getItemUrlStatus(Long itemId);
}
