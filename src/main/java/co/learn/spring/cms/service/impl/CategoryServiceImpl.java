package co.learn.spring.cms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.learn.spring.cms.model.CategoryModel;
import co.learn.spring.cms.repository.CategoryRepository;
import co.learn.spring.cms.service.CategoryService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    @Override
    public List<CategoryModel> findCategories() {
        
        return categoryRepository.select();
    }
    
    
}
