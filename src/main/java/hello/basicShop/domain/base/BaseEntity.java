package hello.basicShop.domain.base;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {
    private String createdBy;
    private String modifiedBy;
    private LocalDateTime createDate;
    private LocalDateTime modifiedDate;
}
