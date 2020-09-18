package nyoung.youngmarket.service;

import java.util.List;

import nyoung.youngmarket.domain.Category;
import nyoung.youngmarket.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public List<Category> findCategoryById(int id){
        return categoryRepository.findCategoryById(id);
    }
}
