package com.yxf.commons.pojo;

import javax.persistence.*;

@Entity(name = "t_emp")
public class Emp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String ename;
    @Column
    private Integer age;
    @Column
    private String phone;
    @ManyToOne
    @JoinColumn(name = "did")
    private Dept dept;

    public Emp(){

    }

    public Emp(Integer id, String ename, Integer age, String phone) {
        this.id = id;
        this.ename = ename;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + ename + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", dept=" + dept +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
