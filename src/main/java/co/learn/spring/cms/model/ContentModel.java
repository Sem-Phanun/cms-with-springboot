package co.learn.spring.cms.model;
import java.time.LocalDateTime;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ContentModel {
    private Integer id;
    private String uuid;
    private String slug;
    private String title;
    private String description;
    private String thumbnail;
    private String keyword;
    private String editor;
    private Boolean isDeleted;
    private LocalDateTime createdAt;
}
