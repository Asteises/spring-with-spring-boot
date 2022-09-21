package com.example.module4_spring_with_spring_boot.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ItemCountByUser {

    private Long userId;

    private Long count;

}
