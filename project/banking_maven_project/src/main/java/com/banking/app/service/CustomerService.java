package com.banking.app.service;

import java.util.List;

import com.banking.app.exception.BusinessException;
import com.banking.app.model.Account;
import com.banking.app.model.Customer;
import com.banking.app.model.Transaction;

public interface CustomerService {
	
	//Accounts
	public Account getAccount(int accountId, int customerId) throws BusinessException;
	public Account getAccountById(int accountId) throws BusinessException;
	public List<Account> getAllAccounts(int customerId) throws BusinessException;
	public void newAccount(Account account,int customerId, int accountId) throws BusinessException;
	public List<Integer> getAllAccountIds() throws BusinessException;
	
	//Bank Transactions
	public List<Transaction> getAllTransactionsForAccount(int accountId, int customerId) throws BusinessException;
	public void withdrawFromAccount(int accountId, int customerId, double amount) throws BusinessException;
	public void depositInAccount(int accountId, int customerId, double amount) throws BusinessException;
	public void makeTransfer(int accountId, int customerId, int transferToAccountId, double amount) throws BusinessException;
	public void makeNewTransaction(Transaction transaction,int transactionId, int accountId) throws BusinessException;
	public List<Integer> getAllTransactionIds() throws BusinessException;
	
	//Customer Methods
	public Customer customerLogIn(String username, String password) throws BusinessException;
	public void newCustomer(String newUsername, String newPassword, String firstName, String lastName, boolean approvalStatus) throws BusinessException;
	
}
