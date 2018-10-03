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
}
