package models;

import com.wordnik.swagger.annotations.*;

@ApiModel(parent = Pet.class)
public interface Cat extends Pet {
  Integer getClawCount();
  void setClawCount(Integer name);
}