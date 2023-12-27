package co.learn.spring.cms.model;

import java.time.LocalDateTime;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserModel {
    private Integer id;
    private String uuid;
    private String username;
    private String password;
    private String displayName;
    private Boolean isDeleted;
    private LocalDateTime createAt;
}