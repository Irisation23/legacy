package com.example.legacy.di.basic2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class BookStoreTest {

    static Book book1Bean;
    static Book book2Bean;
    static Book book3Bean;
    static BookStore bookStore = new BookStore(new Book("박송주", 7000, "뭐야무야", "뭐야뭐야뭐야뭐야"));

    static {
        ApplicationContext applicationContext = new GenericXmlApplicationContext("basic2.xml");
        book1Bean = applicationContext.getBean("book1", Book.class);
        book2Bean = applicationContext.getBean("book2", Book.class);
        book3Bean = applicationContext.getBean("book3", Book.class);
    }

    @Test
    @DisplayName("BookStore 필드 주입 테스트")
    void bookStoreInjectionTest() {
        Book injectedBookBean = bookStore.getBook();

        Assertions.assertThat(injectedBookBean).isEqualTo(book2Bean);
    }
}