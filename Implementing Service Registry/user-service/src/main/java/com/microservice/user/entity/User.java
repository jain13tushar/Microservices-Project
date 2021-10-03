package com.microservice.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// @Entity annotation specifies that the class is an entity
// and is mapped to a database table.
@Entity

// @Data is a convenient shortcut annotation that bundles the features of
// @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together.
@Data

// @AllArgsConstructor generates a constructor with 1 parameter for each field in your class.
// Fields marked with @NonNull result in null checks on those parameters.
@AllArgsConstructor

// @NoArgsConstructor will generate a no arguments/default constructor,
// by default generated constructor will be public.
@NoArgsConstructor
public class User {

    // @Id annotation specifies the primary key of an entity.
    @Id

    // @GeneratedValue provides for the specification of generation strategies for the values of primary keys.
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private Long departmentId;
}
