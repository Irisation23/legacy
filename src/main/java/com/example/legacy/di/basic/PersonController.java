package com.example.legacy.di.basic;

import java.util.List;
import java.util.Map;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PersonController {

    private List<Person> persons;
    private Set<Person> personSet;
    private Map<String, Person> personMap;
}
