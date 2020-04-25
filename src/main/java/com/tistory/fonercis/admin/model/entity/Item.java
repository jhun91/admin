package com.tistory.fonercis.admin.model.entity;

import com.tistory.fonercis.admin.model.enumclass.ItemStatus;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(exclude = {"orderDetailList", "partner"})
@EntityListeners(AuditingEntityListener.class)
@Builder
@Accessors(chain = true)
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ItemStatus status;  // 등록 / 해지 / 검수중(등록대기중)...

    private String name;

    private String title;

    private String content;

    private BigDecimal price;

    private String brandName;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;

    @CreatedDate
    private LocalDateTime createdAt;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @LastModifiedBy
    private String updatedBy;

    // Item N : 1 Partner
    @ManyToOne
    private Partner partner;

    // Item 1 : N OrderDetail
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
    private List<OrderDetail> orderDetailList;

//    // LAZY = 지연로딩(연관관계의 get메서드를 호출 하지 않는 이상 select하지 않음) - 1:N or OneToMany의 다건에 추천,
//    // EAGER = 즉시로딩(즉시 모든 연관관계 로딩) - 1:1 or ManyToOne 등의 한건만 존재할 때 사용 추천
//
//    // LAZY = SELECT * FROM item where id = ?
//    // EAGER =
//    // item_id = order_detail.item_id
//    // user_id = order_detail.user_id
//    // where item.id = ?
//    // JOIN item
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
//    private List<OrderDetail> orderDetailList;

}