package com.example.module4_spring_with_spring_boot.item;

import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.*;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

/**
 * QItem is a Querydsl query type for Item
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItem extends EntityPathBase<Item> {

    private static final long serialVersionUID = 2084451991L;

    public static final QItem item = new QItem("item");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<String, StringPath> tags = this.<String, StringPath>createSet("tags", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath url = createString("url");

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QItem(String variable) {
        super(Item.class, forVariable(variable));
    }

    public QItem(Path<? extends Item> path) {
        super(path.getType(), path.getMetadata());
    }

    public QItem(PathMetadata metadata) {
        super(Item.class, metadata);
    }

}
