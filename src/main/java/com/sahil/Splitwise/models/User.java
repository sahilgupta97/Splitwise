package com.sahil.Splitwise.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseModel {
  private String name;
  private String phone;
  private String email;
  private String password;

  @Enumerated(EnumType.ORDINAL)
  private UserStatus userStatus;

  @OneToMany
  private List<Group> groups;

}
