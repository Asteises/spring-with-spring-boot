package com.example.module4_spring_with_spring_boot.item;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

public interface ItemService {

    List<ItemDto> getItems(long userId);

    ItemDto addNewItem(long userId, ItemDto itemDto);

    void deleteItem(long userId, long itemId);

    @Transactional(readOnly = true)
    List<ItemDto> getItems(long userId, Set<String> tags);

}
