package com.sahil.Splitwise.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserExpense extends BaseModel {
  private int amount;

  @Enumerated(EnumType.ORDINAL)
  private UserExpenseType userExpenseType;

  @ManyToOne
  private User user;
  @ManyToOne
  private Expense expense;
}
