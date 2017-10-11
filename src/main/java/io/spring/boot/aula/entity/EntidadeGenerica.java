package io.spring.boot.aula.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Nataniel Paiva <nataniel.paiva@gmail.com>
 */
@Document
public class EntidadeGenerica {
    
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
}
