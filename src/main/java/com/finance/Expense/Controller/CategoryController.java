package com.finance.Expense.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.Expense.DTO.CategoryDTO;
import com.finance.Expense.Service.CategoryService;
import com.finance.Expense.constants.ControllerConstants;

@RestController
@RequestMapping(ControllerConstants.BASE_URL + ControllerConstants.CATEGORY_URL)
@CrossOrigin(ControllerConstants.CROSS_ORIGIN)
public class CategoryController extends BaseController<CategoryDTO> {

    
    protected CategoryController(CategoryService service) {
        super(service);
    }

}
