package org.launchcode.controllers;

import org.launchcode.models.Category;
import org.launchcode.models.data.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryDao categoryD;

    @RequestMapping("")
    public String index(Model model){
        Iterable<Category> categories = categoryD.findAll();
        model.addAttribute("title", "Categories");
        model.addAttribute("categories", categories);
        return "category/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String addCategoryForm(Model model){
       model.addAttribute(new Category());
       model.addAttribute("title", "Add Category");
       return "category/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddCategoryForm(Model model, @ModelAttribute @Valid  Category category, Errors errors){
        if(errors.hasErrors()){
            return "category/add";
        }
        categoryD.save(category);
        return "redirect:";
    }




}
