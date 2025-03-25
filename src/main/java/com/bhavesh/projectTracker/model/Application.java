package com.bhavesh.projectTracker.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
