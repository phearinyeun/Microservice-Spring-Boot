package com.microservice.spring.Microservice.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Rating {
    private long id;
    private Long BookId;
    private int stars;
}
