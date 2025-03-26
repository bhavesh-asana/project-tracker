package com.bhavesh.projectTracker.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "codebase")
public class Codebase {

  private int id;

  @Id
  @Column(unique = true)
  private String branchName;

  private String pullRequestUrl;

  private Date createdAt;
}
