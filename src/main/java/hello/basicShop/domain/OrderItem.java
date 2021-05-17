package hello.basicShop.domain;

import hello.basicShop.domain.items.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    // item 에서 조회 기능이 필요 없다
    // -> 주문서를 보고 item 을 찾지 item 보고 주문서를 찾지 않기 때문
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    private int orderPrice;
    private int count;

}
