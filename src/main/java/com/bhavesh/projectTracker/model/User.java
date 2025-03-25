package com.bhavesh.projectTracker.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Data
@Table(name = "user")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(unique = true, nullable = false)
  private String userId;

  private String firstName;

  private String lastName;

  @Column(nullable = true)
  private String displayName;

  @Column(unique = true, nullable = false)
  private String email;

  private String organization;

  @OneToOne(mappedBy = "assignee")
  private Jira jiraAssignee;

  @OneToOne(mappedBy = "reporter")
  private Jira jiraReporter;

}
