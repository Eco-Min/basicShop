package hello.basicShop.domain;

import hello.basicShop.domain.base.BaseEntity;
import hello.basicShop.domain.embedded.Address;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Delivery{

    @Id
    @GeneratedValue
    private Long id;

    @Embedded
    private Address address;
    private DeliveryStatus status;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "delivery")
    private Order order;
}