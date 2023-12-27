package co.learn.spring.cms.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import co.learn.spring.cms.model.CategoryModel;

@Repository
@Mapper
public interface CategoryRepository {
    
    @Select("""
            SELECT * 
            FROM categories
            WHERE is_deleted = FALSE
            """)
    @Result(property = "isDeleted", column = "is_deleted")
    List<CategoryModel> select();
}
