package com.example.module4_spring_with_spring_boot.item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.time.LocalDate;
import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long>, QuerydslPredicateExecutor<Item> {

    List<Item> findByUserId(long userId);

    Item save(Item item);

    void deleteByUserIdAndItemId(long userId, long itemId);

    // Так строятся кастомные запросы на JPQL
    // Для получения результата запроса вместо интерфейса мы использовали класс. Поэтому в самом запросе нам нужен был конструктор
    @Query("select new com.example.module4_spring_with_spring_boot.item.ItemCountByUser(it.userId, count(it.id))" +
            "from Item as it "+
            "where it.url like ?1 "+ //Тут передаем первый параметр метода (it.userId)
            "group by it.userId "+
            "order by count(it.id) desc")
    List<ItemCountByUser> countItemsByUser(String urlPart);

    @Query(value = "select it.user_id, count(it.id) as count "+
            "from items as it left join users as us on it.user_id = us.id "+
            "where (cast(us.registration_date as date)) between ?1 and ?2 "+
            "group by it.user_id", nativeQuery = true)
    List<ItemCountByUser> countByUserRegistered(LocalDate dateFrom, LocalDate dateTo);
}
