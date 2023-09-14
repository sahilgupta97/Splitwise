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
public class Expense extends BaseModel {
  private int amount;
  private String description;

  @Enumerated(EnumType.ORDINAL)
  private ExpenseType expenseType;

  @ManyToOne
  private User createdBy;

  @ManyToOne
  private Group group;
}
