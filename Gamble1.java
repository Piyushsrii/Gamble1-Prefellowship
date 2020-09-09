Gamble Program

public class Gamble1
{
    static int stakeMoney=100;
    static int betMoney=1;
    static int wonMoney;
    static int lossMoney;
    static int total_Won_Money=0;
    static int total_loss_Money=0;
}


////////Usercase2////////

int randomNum = (int)Math.round(Math.random()*1+1);


////////UserCase3////////

 while(stakeMoney>=50)
           {
                 //int randomNumber = (int)Math.round(Math.random()*1+1);
                  if(randomNumber == 1)
                  {
                        betMoney=betMoney+1;
                        wonMoney=betMoney;
                        if(wonMoney==2)
                        {
                            System.out.println("you win Rs="+wonMoney);
                        }
                            stakeMoney -= 1;
                  }
                 else
                  {
                            betMoney=betMoney-1;
                            lossMoney=betMoney;
                        if(lossMoney==0)
                        {
                            System.out.println("you loss yur money="+lossMoney);
                            stakeMoney -= 1;
                         }
                  }
           }


////////////UserCase4/////////////

 for(int i=1;i<20;i++)
{
     while(stakeMoney<50)
      {
         //Use all the code of UserCase 3 to find the 20 days winner and losser.
      }
}

