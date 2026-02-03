package com.ecommerce.project.service;

import com.ecommerce.project.Exception.APiException;
import com.ecommerce.project.Exception.ResourceNotFoundException;
import com.ecommerce.project.model.Category;
import com.ecommerce.project.repositories.CategoryRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImp implements CategoryService{
    private final CategoryRepositories categoryRepositories;

    public CategoryServiceImp(CategoryRepositories categoryRepositories) {
        this.categoryRepositories = categoryRepositories;
    }

    @Override
    public List<Category> getAllCategories() {
        List<Category> allCetagory = categoryRepositories.findAll();
        if (allCetagory.isEmpty()){
            throw new APiException("Categories is not found");
        }
        return allCetagory;
    }

    @Override
    public void createCategories(Category category) {
        Category savedCategory = categoryRepositories.findByCategoryName(category.getCategoryName());
        if(savedCategory != null)
            throw new APiException("Category with the same " + category.getCategoryName() + " already exist");
        categoryRepositories.save(category);

    }

    @Override
    public String deleteCategory(Long categoryId) {
       Category deleteCategory = categoryRepositories.findById(categoryId)
                       .orElseThrow(()-> new ResourceNotFoundException("Category", categoryId, "categoryId"));
        categoryRepositories.delete(deleteCategory);
        return "Category with getCategoryId " + categoryId + " deleted succesfully ";
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {
        Category savedCategory = categoryRepositories.findById(categoryId)
                .orElseThrow(()-> new ResourceNotFoundException("Category", categoryId, "categoryId"));
        category.setCategoryId(categoryId);
        savedCategory = categoryRepositories.save(category);
        return savedCategory;


 }
}
