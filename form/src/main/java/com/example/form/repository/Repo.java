package com.example.form.repository;

import com.example.form.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo extends JpaRepository<Form,String> {
    Form findByUsername(String username);
@Query(nativeQuery = true,value = "select * from form")
    List<Form> getall();




@Query(nativeQuery = true,value = "select f.username,f.password,f.physics " +
        "from form as f " +
        "inner join valid as v " +
        "on f.username=v.name " +
        "where v.name=:username")
    List<Object[]> getjoin(@Param( "username") String username);





@Query(nativeQuery = true,value = "select count(*) as count from form")
    int getcount();




@Query(nativeQuery = true,value="select (physics+chemistry+maths) from form " +
        "where username=:username")
    int getmarks(@Param("username") String username);





@Query(nativeQuery = true,value="SELECT  (physics + chemistry + maths) AS marks FROM form " +
        "order by marks desc")
    List<Form> list();



}
