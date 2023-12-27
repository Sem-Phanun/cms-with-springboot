package co.learn.spring.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.learn.spring.cms.service.CategoryService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {
    
    private final CategoryService categoryService;
    @GetMapping
    public String viewCategory(ModelMap modelMap){
        modelMap.addAttribute("categories",categoryService.findCategories());
        return "category/category";
    }

    @GetMapping("/form")
    public String viewCategoryForm(){
        return "category/form";
    }
}
