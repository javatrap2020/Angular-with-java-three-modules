package backend.springbootjavatrap2020.repository;

import backend.springbootjavatrap2020.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UsersRepository extends JpaRepository<Users,Long>, JpaSpecificationExecutor<Users> {
}
