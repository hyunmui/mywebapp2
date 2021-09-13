package app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue
    private Long no;

    private String title;

    private String content;
}
