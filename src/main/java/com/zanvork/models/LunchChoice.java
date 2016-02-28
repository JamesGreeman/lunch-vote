package com.zanvork.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Database entity representing a choice of lunch location.
 * Contains the name of the venue.
 * @author James
 */
@Entity
public class LunchChoice {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    /**
     * Package protected constructor.
     * Expected for use by the DAO only.
     */
    LunchChoice(){}

    /**
     * Constructor specifying all parameters within the entity.
     * @param id
     *      An auto-generated integer id.
     * @param name
     *      The name of the lunch choice.
     */
    public LunchChoice(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
