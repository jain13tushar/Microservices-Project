package com.microservice.user.VO;

import com.microservice.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Data is a convenient shortcut annotation that bundles the features of
// @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together.
@Data

// @AllArgsConstructor generates a constructor with 1 parameter for each field in your class.
// Fields marked with @NonNull result in null checks on those parameters.
@AllArgsConstructor

// @NoArgsConstructor will generate a no arguments/default constructor,
// by default generated constructor will be public.
@NoArgsConstructor
public class ResponseTemplateVO {

    private User user;
    private Department department;
}
