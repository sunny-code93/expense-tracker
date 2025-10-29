package com.expensetracker.service;

import com.expensetracker.model.Expense;
import com.expensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    
    @Autowired
    private ExpenseRepository expenseRepository;
    
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
    
    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }
    
    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }
    
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}