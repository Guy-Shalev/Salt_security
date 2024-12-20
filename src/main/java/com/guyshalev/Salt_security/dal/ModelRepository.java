package com.guyshalev.Salt_security.dal;

import com.guyshalev.Salt_security.model.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
    Optional<Model> findByPathAndMethod(String path, String method);
}
