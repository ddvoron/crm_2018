package com.voronovich.common;

import javax.persistence.*;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @Column(name = "ID", updatable = false, nullable = false)
    private String id = id();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED", updatable = false, nullable = false)
    private Date created = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATED", nullable = false)
    private Date updated = new Date();

    private static String id() {
        Random random = new Random();
        return new UUID(random.nextLong(), random.nextLong()).toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "AbstractEntity{" +
                "id='" + id + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }

}