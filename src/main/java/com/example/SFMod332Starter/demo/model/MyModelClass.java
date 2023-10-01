package com.example.SFMod332Starter.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MyModelClass {

    /**
     * Какое-нибудь имя
     */
    private String name;

    /**
     * Количество чего-нибудь
     */
    private Integer amount;

    /**
     * Наше что-то будет иметь коллекцию атрибутов
     */
    private List<String> attributes;
}
