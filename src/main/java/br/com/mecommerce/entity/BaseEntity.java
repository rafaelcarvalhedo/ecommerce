package br.com.mecommerce.entity;

import java.io.Serializable;

public abstract class BaseEntity implements Serializable {

    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
