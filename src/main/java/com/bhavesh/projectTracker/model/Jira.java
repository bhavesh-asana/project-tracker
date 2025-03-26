package com.bhavesh.projectTracker.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
@Data
@Table(name = "jira")
public class Jira {

  private int id;

  @Id
  private Long jiraId;
  private String jiraKey;

  private Date createdOn;
  private Date readyForReviewOn;
  private Date doneOn;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "assignee")
  private List<User> assignees;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "reporter")
  private User reporter;
}
