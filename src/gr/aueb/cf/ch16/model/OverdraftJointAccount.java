package gr.aueb.cf.ch16.model;

import gr.aueb.cf.ch16.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch16.exceptions.SsnNotValidException;

public class OverdraftJointAccount extends JointAccount {
    public OverdraftJointAccount(){}

    public OverdraftJointAccount(User firstHolder, User secondHolder, String iban, double balance) {
        super(firstHolder, secondHolder, iban, balance);
    }

    @Override
    public void withdraw(double amount, String ssn) throws SsnNotValidException {
            try {
                if (!isSsnValid(ssn)) {
                    throw new SsnNotValidException(ssn);
                }
                setBalance(getBalance() - amount);
            }catch (SsnNotValidException e) {
                System.err.println("Error in ssn withdraw " + e);
                throw e;
            }
        }
    }

