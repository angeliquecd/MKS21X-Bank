public class Driver{
public static void main(String[] args){
  BankAccount mine = new BankAccount(45.2,1173,"Hello");
  BankAccount yours = new BankAccount (100,1234, "yo");
  System.out.println("Bank Account #:"
  +mine.getAccountID()+" has a balance of:$"+mine.getBalance());
  mine.setAccountID(4435);
  mine.setBalance(100.70);
  System.out.println(mine);
  if (mine.withdraw(200)){
    System.out.println("Withdrawal successful!");
  }
  else{
    System.out.println("Withdrawal failure!");
  }
  System.out.println(mine);
  mine.deposit(400);
  if (mine.withdraw(200)){
    System.out.println("Withdrawal successful!");
  }
  else{
    System.out.println("Withdrawal failure!");
  }
  System.out.println(mine);
  System.out.println(mine.transferTo(yours, 20, "Hello"));
  System.out.println(yours.transferTo(mine, 100, "Yo"));
}
}
