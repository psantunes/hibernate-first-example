package dev.pw2.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Message extends PanacheEntity {

  private String text;

  public Long getId() {
    return id;
}

  public void setId(Long id) {
      this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  

}
