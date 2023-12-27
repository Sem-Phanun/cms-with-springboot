package co.learn.spring.cms.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CategoryModel {
    private Integer id;
    private String name;
    private Boolean isDeleted;
}
