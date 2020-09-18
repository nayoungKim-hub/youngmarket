package nyoung.youngmarket.repository;

import nyoung.youngmarket.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query("SELECT c FROM Category c WHERE c.id = ?1")
    List<Category> findCategoryById(int id);
}
