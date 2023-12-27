package co.learn.spring.cms.service;

import java.util.List;
import co.learn.spring.cms.model.CategoryModel;

public interface CategoryService {
    List<CategoryModel> findCategories();
}