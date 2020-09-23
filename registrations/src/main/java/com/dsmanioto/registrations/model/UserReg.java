package com.dsmanioto.registrations.model;

import com.dsmanioto.registrations.util.PasswordEncoder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.dom4j.tree.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@ToString
@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserReg extends AbstractEntity {

    @Id
    @Column(unique = true)
    @NotEmpty
    private String login;

    @NotEmpty
    @JsonIgnore
    private String password;

    private Boolean admin;

    public void setPassword(String password) {
        this.password = PasswordEncoder.encoder(password);
    }
}
