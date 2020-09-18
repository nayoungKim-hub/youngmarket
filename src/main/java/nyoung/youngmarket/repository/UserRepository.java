package nyoung.youngmarket.repository;

import nyoung.youngmarket.domain.User;
import nyoung.youngmarket.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Integer>{

    User findByid(String id);
}
