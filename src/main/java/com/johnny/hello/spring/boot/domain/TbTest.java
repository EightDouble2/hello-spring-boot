package com.johnny.hello.spring.boot.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_test")
public class TbTest implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TbTest{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}