package com.project.CRUD.basic.Repositoory;

import com.project.CRUD.basic.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
