package co.learn.spring.cms.model;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserRoleModel {
    private Integer id;
    private Integer userId;
    private Integer roleId;
}
