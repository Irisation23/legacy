package com.example.legacy.di.basic;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class PersonControllerTest {

    static final ApplicationContext applicationContext = new GenericXmlApplicationContext("appConfig.xml");
    static PersonController personController;

    static {
        personController = applicationContext.getBean("pc1", PersonController.class);
    }

    @Test
    @DisplayName("리스트로 관리되는 스프링 빈")
    void listOfSpringBeans() {
        Person testPerson = new Person("석진성", 26);
        List<Person> persons = personController.getPersons();

        boolean flag = false;
        for (Person person : persons) {
            if (testPerson.equals(person)) {
                flag = true;
                break;
            }
        }

        assertThat(flag).isTrue();
    }

    @Test
    @DisplayName("Set 으로 관리되는 스프링 빈")
    void setOfSpringBeans() {
        Person testPerson = new Person("김가영", 23, "부산시 수영구 민락동");
        Set<Person> persons = personController.getPersonSet();

        boolean flag = false;
        for (Person person : persons) {
            if (testPerson.equals(person)) {
                flag = true;
                break;
            }
        }

        assertThat(flag).isTrue();
    }

    @Test
    @DisplayName("Map 으로 관리되는 스프링 빈, 해당 Map에 key를 입력하면 Bean이 반환되는 구조로 작성")
    void mapOfSpringBeans() {
        Person person = new Person("석진성");

        Map<String, Person> personMap = personController.getPersonMap();

        Person findByKey = personMap.get("person3");

        assertThat(findByKey).isEqualTo(person);
    }
}