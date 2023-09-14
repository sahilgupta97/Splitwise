package com.sahil.Splitwise.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Group extends BaseModel {
  private String name;
  private String description;

  @OneToMany
  List<User> users;

  @OneToMany
  List<Expense> expenses;
}
