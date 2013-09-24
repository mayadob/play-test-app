package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonIgnore;

import play.db.jpa.JPA;

@Entity
public class flixster_user {
       @Id
       public Long user_id;
       
       public String username;
       
       @JsonIgnore
       public String status;
       
       
       public static flixster_user findById(Long id) {
          return JPA.em().find(flixster_user.class, id);
       }

}
