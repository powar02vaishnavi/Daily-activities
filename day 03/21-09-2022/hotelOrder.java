import java.util.*;
public class hotelOrder {
public static void main(String[] args) {
	int menu,menu1 = 0;
	Scanner sc=new Scanner(System.in);
	do {
	System.out.println("Welcome to Krishna Hotel");
	System.out.println("1.Non veg");
	System.out.println("2.veg");
	System.out.println("3 Desert");
	System.out.println("Please enter your menu :");
	menu=sc.nextInt();
	switch(menu) {
	case 1:
		System.out.println("chicken Fried Rice");
		System.out.println("chicken Noodles");
		System.out.println("Chicken Soup");
		System.out.println("please select your menu");
		menu1=sc.nextInt();
		break;
	case 2:	
		System.out.println("veg Fried Rice");
		System.out.println("veg Noodles");
		System.out.println("veg Soup");
		System.out.println("please select your menu");
		menu1=sc.nextInt();
		break;
	case 3:	
		System.out.println("Mango Ice-Cream");
		System.out.println("gulab jamun");
		System.out.println("cheesecake");
		System.out.println("please select your menu");
		menu1=sc.nextInt();
		break;	
	default :
		System.out.println("Please select your order Again");
	}
	if(menu==1) {
		 if(menu1==1) {
			System.out.println("chicken Fried Rice is : 180rs ");
	    	}
		 else if(menu1==2) {
			 System.out.println("chicken Noodles is : 250rs");
		 }
		 else if(menu1==3) {
			 System.out.println("Chicken Soup is : 180rs");
		 }
		}
		else if(menu==2) {
			 if(menu1==1) {
					System.out.println("veg Fried Rice is : 80 rs");
			    	}
				 else if(menu1==2) {
					 System.out.println("veg Noodles is : 180rs");
				 }
				 else if(menu1==3) {
					 System.out.println("veg Soup is : 50rs");
				 }
		}
		else {
			 if(menu1==1) {
					  System.out.println("Mango Ice-Cream : 50rs ");
			    	}
				 else if(menu1==2) {
					  System.out.println("gulab jamun is : 100rs");
				 }
				 else if(menu1==3) {
					  System.out.println("cheesecake is : 80rs");
				 }
		}
	}
	while(menu==1);

}
}
