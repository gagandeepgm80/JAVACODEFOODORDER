
import java.util.Scanner;
class Food
{
 static int pay = 0;
void totalamount(int amt)
	{
	pay = pay + amt;
	
	}

void bill()
{
 System.out.println(" THE TOTAL BILL IS :" +"----------------------"+pay);
}

 static void gst()
{
	
	int gst = 10;
	System.out.println("THE GST RATE  IS :" +"----------------------"+gst+"%");
	 int Amount = (pay * gst)/100;
	System.out.println("GST AMOUNT IS "+"---------------------- "+Amount);
	int x = pay + Amount;
	System.out.println("--------------------------------------");
	System.out.println("--------------------------------------");
	System.out.println("TOTAL BILL:" + "-----------------------"+ x);
	System.out.println("__________________________________________");
	System.out.println("__________________________________________");
}
}


class FoodApp
{
	public static void main(String[] args)
	{
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("FOOD COURT EAT THE TASTE");
		System.out.println("ENTER YOUR LOGIN ID");
		 n = scan.nextInt();
		 int i=4123;
		 
		 if(n==i)
		{
			 System.out.println("LOGIN SUCCESSFUL");
		
		 

		System.out.println("SELECT YOUR RESTAURANT");
		System.out.println("1. ADIGAS ");
		System.out.println("2. NANDANA PALACE");
		System.out.println("3. NAKSHATRA");
		System.out.println("4. HOT BREADS");
		System.out.println("5. CHOCOLATE ROOM");
		System.out.println("6. EXIT");
		while(true)
		{
		System.out.println("Enter your choice");
		n = scan.nextInt();
		switch(n)
		{
			case 1:
			    System.out.println(" ADIGAS RESTAURANT MENU CARD");
			System.out.println(" 1 .gobi");
			System.out.println( " 2.puri");
			System.out.println(" 3. TO PAY A BILL");
			System.out.println(" 4. exit");
			    Food f = new Food();
				while(true)

			{
				System.out.println(" Enter your choice for order");

				n = scan.nextInt();
				switch(n)
					{
			    case 1:
					System.out.println("1. gobi --------------------------------- 100rs");
				     int m =100;
				    f.totalamount(m);
				    break;
					 case 2:
						 System.out.println("2. puri --------------------------------- 100rs");
					  m = 100;
					 f.totalamount(m);
					 break;
					 case 3:
						 System.out.println("TO PAY A BILL");
					      f.bill();
						  f.gst();
						  break;
					 case 4:
						 System.out.println("EXIT");
					    
                      break;
					 default :
						 System.out.println("INVALID CHOICE");
				 break;
				}
				if(n==4)
				{
					break;
				}
				
			}
			break;
		
			case 2:
				System.out.println(" NANADANA PALACE RESTUARANTMENU CARD");
			break;
			case 3:
				System.out.println(" NAKSHATRA RESTAURANT MENU CARD");
			break;
			case 4:
				System.out.println(" HOT BREADS RESTAURANT MENU CARD");
			break;
			case 5:
				System.out.println(" CHOCOLATE ROOM RESTAURANT MENU CARD");
			break;
			case 6 :
				System.out.println("EXIT");
			     System.exit(0);
				 break;
			default :
				System.out.println("INVALID CHOICE");
			    break;
		}
		
		}
		}
		else 
		{
			 System.out.println("LOG ID NOT MATCHED");
		}
		
	}
}