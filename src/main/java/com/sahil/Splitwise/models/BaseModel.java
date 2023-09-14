package com.sahil.Splitwise.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

@MappedSuperclass
@Getter
@Setter
public class BaseModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @UpdateTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt;

  @UpdateTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  private Date lastModifiedAt;

}
