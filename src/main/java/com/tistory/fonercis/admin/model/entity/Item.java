package com.tistory.fonercis.admin.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer price;

    private String content;

    // LAZY = 지연로딩(연관관계의 get메서드를 호출 하지 않는 이상 select하지 않음) - 1:N or OneToMany의 다건에 추천, 
    // EAGER = 즉시로딩(즉시 모든 연관관계 로딩) - 1:1 or ManyToOne 등의 한건만 존재할 때 사용 추천

    // LAZY = SELECT * FROM item where id = ?
    // EAGER =
    // item_id = order_detail.item_id
    // user_id = order_detail.user_id
    // where item.id = ?
    // JOIN item
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
    private List<OrderDetail> orderDetailList;

}