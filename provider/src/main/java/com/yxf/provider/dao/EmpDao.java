package com.yxf.provider.dao;


import com.yxf.commons.pojo.Emp;
import com.yxf.commons.pojo.EmpDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmpDao extends JpaRepository<Emp, Integer> {

    @Query(value = "select new com.yxf.commons.pojo.EmpDto(e.id,e.ename,e.age,e.phone,d.dname) from com.yxf.commons.pojo.Emp e inner join e.dept d order by e.id")
    Page<EmpDto> selAll(Pageable pageable);
}
