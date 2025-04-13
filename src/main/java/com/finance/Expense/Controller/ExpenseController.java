package com.finance.Expense.Controller;



import org.springframework.web.bind.annotation.*;

import com.finance.Expense.DTO.ExpenseDTO;
import com.finance.Expense.Service.ExpenseService;
import com.finance.Expense.constants.ControllerConstants;


@RestController
@RequestMapping(ControllerConstants.BASE_URL + ControllerConstants.EXPENSE_URL)
@CrossOrigin(origins = ControllerConstants.CROSS_ORIGIN) 
public class ExpenseController extends BaseController<ExpenseDTO> {

    public ExpenseController(ExpenseService service) {
        super(service);
    }
    

}
