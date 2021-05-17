package hello.basicShop.domain.category;

import hello.basicShop.domain.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter @Setter
public class Category {

    @Id @GeneratedValue
    private Long id;

    private String name;

    //SelfMapping N:1 은 mappedBy가 없다 → 연관관계 주인이 되어야한다.
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parent;
    @OneToMany(mappedBy = "parent")
    private List<Category> child = new ArrayList<>();

    // 이건 쓰면 안됨 (그냥 예시로)
    @ManyToMany
    @JoinTable(name = "category_item",
            joinColumns =@JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "Item_Id")
    )
    private List<Item> items = new ArrayList<>();
}