package com.bhavesh.projectTracker.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
@Data
@Table(name = "jira")
public class Jira {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private Long jiraId;
  private String jiraKey;

  private Date createdOn;
  private Date readyForReviewOn;
  private Date doneOn;

  @OneToOne
  @JoinColumn(name = "assignee")
  private User assignee;

  @OneToOne
  @JoinColumn(name = "reporter")
  private User reporter;

}
