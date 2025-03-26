package com.bhavesh.projectTracker.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Data
@Table(name = "users")
public class User {

  private int id;

  @Id
  @Column(unique = true)
  private String userId;

  private String firstName;

  private String lastName;

  private String displayName;

  @Column(unique = true, nullable = false)
  private String email;

  private String organization;

  @ManyToOne(cascade = CascadeType.ALL)
  private Jira jira;
}
