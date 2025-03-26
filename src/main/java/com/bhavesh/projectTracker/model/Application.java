package com.bhavesh.projectTracker.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "applications")
public class Application {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(unique = true)
  private String appName;

  private String appType;

  private String appDescription;

  @Column(unique = true)
  private String appUrl;
}
