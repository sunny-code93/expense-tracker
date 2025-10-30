package com.expensetracker.service;

import com.expensetracker.model.Expense;
import com.expensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExpenseService {
    
    @Autowired
    private ExpenseRepository expenseRepository;
    
    public List<Expense> getAllExpenses() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return expenseRepository.findAll().stream()
                .filter(expense -> expense.getUsername().equals(username))
                .collect(Collectors.toList());
    }
    
    public Expense saveExpense(Expense expense) {
        expense.setUsername(SecurityContextHolder.getContext().getAuthentication().getName());
        return expenseRepository.save(expense);
    }
    
    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }
    
    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}