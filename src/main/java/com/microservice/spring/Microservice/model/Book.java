package com.microservice.spring.Microservice.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
    private long id;
    private String title;
    private String author;

}
