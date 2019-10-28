package com.yxf.commons.pojo;



public class EmpDto extends Emp {
    private String dname;

    public EmpDto(){

    }
    public EmpDto(Integer id,String ename,Integer age,String phone,String dname) {
        super(id,ename,age,phone);
        this.dname = dname;
    }

    @Override
    public String toString() {
        super.toString();
        return "EmpDto{" +
                "dname='" + dname + '\'' +
                '}';
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
