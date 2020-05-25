package com.anand.opps.bank.atm;

public class AccountHolder implements Runnable {
	private Account account;
	
	public AccountHolder(Account account) {
		// TODO Auto-generated constructor stub
		this.account=account;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++)
		{
			makeWithDrawale(2000);
		if(account.getBalance()<0)
		{
			System.out.println("account is pverwith drawn");
		}
			
		}
	}
	private synchronized void makeWithDrawale(int withdrawAmount) {
		// TODO Auto-generated method stub
		
		if((account.getBalance()>=withdrawAmount))
		{
			System.out.println(Thread.currentThread().getName()+"go to withdraw "+withdrawAmount);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			account.withdrow(withdrawAmount);
			System.out.println(Thread.currentThread().getName()+"complete the withdrowal of $ "+" "+withdrawAmount);
		}
		else
			System.out.println("no enogh amount of "+Thread.currentThread().getName()+"to withdrow "+account.getBalance());
	}

}
