public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(double a,int b,String c){
    balance=a;
    accountID=b;
    password=c;
  }
  public void setBalance(double x){
    balance=x;
  }
  public void setAccountID (int y){
    accountID=y;
  }
  public double getBalance(){
    return balance;
  }
  public int getAccountID (){
    return accountID;
  }
  public String toString(){
    return ""+accountID+"\t"+balance;
  }
  public boolean deposit(double addmoney){
    if (addmoney>0){
      balance+=addmoney;
      return true;
    }
    return false;
  }
  public boolean withdraw(double takemoney){
    if (balance>=takemoney){
      balance-=takemoney;
      return true;
    }
    return false;
  }
  private boolean authenticate(String password){
    return (this.password.equals(password));
  }
  public boolean transferTo(BankAccount other, double amount,String password){
    return this.authenticate(password)&& amount<=this.balance&& amount>0;
    }
  }
