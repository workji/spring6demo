package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Employee;

public interface EmployeeMapper {

    Employee queryById(@Param("id") Integer id, @Param("key") String key);
}
