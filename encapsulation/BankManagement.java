package encapsulation;

public class BankManagement {
	private String accountNo;
	private String accountHolderName;
	private String accountType;
	private String ifscCode;
	private String branchId;
	private String branchName;
	private String mobileNo;
	private String email;
	private double balance;
	
	BankManagement(String accountNo,String accountHolderName, String accountType, String ifscCode, String branchId, String branchName, String mobileNo, String email,double balance)
	{
		this.accountNo = accountNo; 
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.ifscCode = ifscCode;
		this.branchId = branchId;
		this.branchName = branchName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.balance = balance;
	}
	
	public String getAccountNo() {
        return accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public String getBranchName() {
        return branchName;
    }
    
    public String getBranchId() {
		return branchId;
	}

    public String getMobileNo() {
        return mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } 
        else {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }

    public void displayAccountDetails() {

        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Branch: " + branchName);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("Email: " + email);
        System.out.println("Balance: " + balance);
    }
}
