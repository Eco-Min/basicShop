package hello.basicShop;

import hello.basicShop.domain.Member;
import hello.basicShop.domain.items.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Component
@RequiredArgsConstructor
public class Init {

    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.dbInit1();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {
        private final EntityManager em;
        public void dbInit1() {
            Book book = new Book();
            book.setName("JPA");
            book.setAuthor("민경재");

            em.persist(book);
        }

    }
}
