package org.xproce.mapperclass.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.mapperclass.dao.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
