package com.tnl.vop.sales.service.api;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "vop-sales-service-api")
@RefreshScope
public class SalesServiceApiProperties {

  @NotNull
  private String env;

  @NotNull
  private String propSource;

  @NotNull
  private String sampleProperty;

  @NotNull
  private String password;

  @NotNull
  private String[] orIgIns;

  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public String getPropSource() {
    return propSource;
  }

  public void setPropSource(String propSource) {
    this.propSource = propSource;
  }

  public String getSampleProperty() {
    return sampleProperty;
  }

  public void setSampleProperty(String sampleProperty) {
    this.sampleProperty = sampleProperty;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String[] getOrIgIns() {
    return orIgIns;
  }

  public void setOrIgIns(String[] orIgIns) {
    this.orIgIns = orIgIns;
  }
}