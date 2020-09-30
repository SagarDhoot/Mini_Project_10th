import java.util.*;
public class Restauranrt_management
{
    public static void main(String args[])
    {
        Scanner SD=new Scanner(System.in);
        int vstr,tvstr=0,nvstr,tnvstr=0,vfd,tnvfd=0,d=0,tvfd=0,amt=0,tamt=0,totalamt=0,totald=0,damt=0,ch,fd,tfd;
        double vat=0;
        String str=" ",ans,choice="Y";
        System.out.println("Welcome to the Multi Colored Restaurant");
        System.out.println("Starter:1");
        System.out.println("Main Cource:2");
        System.out.println("Desert:3");
        System.out.println();
        System.out.println("Press 1 for Starter");
        System.out.println("Press 2 for Main Cource");
        System.out.println("Press 3 for Cool with Derset");
        System.out.println();
        System.out.println("Enter your choice");
        ch=SD.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Welcome to Starter Menu!!!");
            System.out.println("Enter 'VS' for veg starter and 'NVS' for non-veg");
            str=SD.next();
            if(str.equalsIgnoreCase("VS"))
            {
                System.out.println("Starters\t\t\tPrice in Rs.");
                System.out.println("1.Paneer Tikka\t\t\t110");
                System.out.println("2.Veg Seekh Kebabt\t\t110");
                System.out.println("3.Hara Bhara Kabab\t\t110");
                System.out.println("4.American Corn\t\t\t150");
                System.out.println("5.Crispy Corn\t\t\t150");
                System.out.println("6.Crispy Baby Corn\t\t140");
                System.out.println("7.Crispy Mushroom\t\t120");
                System.out.println("8.Crispy American Corn\t\t140");
                System.out.println("9.Crispy Chilly Potato\t\t120");
                System.out.println("10.Crispy Chilly Chana\t\t150");
                System.out.println();
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.println("Chose your Starter from the above list by entering number:");
                    vstr=SD.nextInt();
                    System.out.println("Enter the totla number of starters you want");
                    tvstr=SD.nextInt();
                    if(vstr>=1&&vstr<=3)
                    amt=tvstr*110;
                    if(vstr==4&&vstr==5)
                    amt=tvstr*150;
                    if(vstr==6&&vstr==7)
                    amt=tvstr*140;
                    if(vstr==8&&vstr==9)
                    amt=tvstr*120;
                    if(vstr==10)
                    amt=tvstr*150;
                    tamt=tamt+amt;
                    System.out.println("Do u want to place more order?Enter Y/N");
                    choice=SD.next();
                }
            }
            if(str.equalsIgnoreCase("NVS"))
            {
                 System.out.println("NON-VEG STARTER\t\t\tPrice in Rs.");
                 System.out.println();
                 System.out.println("1.Chicken\t\t\t170");
                 System.out.println("2.Murg Reshmi\t\t\t170");
                 System.out.println("3.Murg Chili\t\t\t160");
                 System.out.println("4.Chicken Seekh\t\t\t180");
                 System.out.println("5.Tangadi kabab\t\t\t180");
                 System.out.println("6.Murg Tandoori\t\t\t190");
                 System.out.println("7.Fish Ajwani\t\t\t190");
                 System.out.println("8.Chilli Chicken\t\t160");
                 System.out.println("9.Chicken Lolipop\t\t180");
                 System.out.println("10.Shanghai Chicken\t\t180");
                 System.out.println(choice.equalsIgnoreCase("Y"));
                 {
                     System.out.println("Choose Your Starter from above list by entering number");
                     nvstr=SD.nextInt();
                     System.out.println("Enter the totla number fo starters you want");
                     tnvstr=SD.nextInt();
                     if(nvstr==1||nvstr==2)
                     amt=tnvstr*170;
                     if(nvstr==3)
                     amt=tnvstr*160;
                     if(nvstr==4||nvstr==5)
                     amt=tnvstr*180;
                     if(nvstr==8)
                     amt=tnvstr*190;
                     if(nvstr==9||nvstr==10)
                     amt=tnvstr*180;
                     tamt=tamt+amt;
                     System.out.println("Do u want to place any more order?Enter Y/N");
                     choice=SD.next();
                    }
                }
                System.out.println("********MULTI COLORED RESTAURANT********");
                System.out.println("********       BILL             ********");
                System.out.println("Total Cost=Rs."+amt);
                vat=Math.round(14.f/100.0*tamt);
                System.out.println("VAT=14.5%");
                System.out.println("Total VAT=Rs."+vat);
                System.out.println("Amount to be paid=RS"+(tamt+amt));
                System.out.println();
                break;
                case 2:
                System.out.println("MAIN COURCE: INDIAN AND CHINESE DISHES!");
                System.out.println("ENTER'V' FOR INDIAN VEG DISHES,'NV' FOR INDIAN NON VEG DISHES AND'C' FOR CHINESE DISHES");
                str=SD.next();
                if(str.equalsIgnoreCase("V"))
                {
                    System.out.println("WELCOME TO INDIAN VEG DISHES");
                    System.out.println("INDIAN VEG DISHES\t\t\tTPRICE IN Rs.");
                    System.out.println("1.SHAHI PANEER\t\t\t180");
                    System.out.println("2.Navretna Korma\t\t\t180");
                    System.out.println("3.Kadahi Paneer\t\t\t150");
                    System.out.println("4.Malai Kofta\t\t\t140");
                    System.out.println("5.Khadhi Vegetable\t\t\t140");
                    System.out.println("6.Vegetable Pakeeza\t\t\t140");
                    System.out.println("7.Shabnam Curry\t\t\t150");
                    System.out.println("8.makai Corn Palak\t\t\t150");
                    System.out.println("9.Veg. Pulao\t\t\t140");
                    System.out.println("10.Kashmiri Pulao\t\t\t140");
                    System.out.println("11.Butter Naan\t\t\t40");
                    System.out.println("12.Stuffed Kulcha\t\t\t60");
                    while(choice.equalsIgnoreCase("Y"))
                    {
                        System.out.println("Choose ur main veg course from the list by entering number: ");
                        vfd=SD.nextInt();
                        System.out.println("How many plates dou u want frm above list?");
                        tvfd=SD.nextInt();
                        if(vfd==1||vfd==2)
                        amt=tvfd*180;
                        if(vfd==3)
                        amt=tvfd*150;
                        if(vfd==4||vfd==5||vfd==6)
                        amt=tvfd*140;
                        if(vfd==7||vfd==8)
                        amt=tvfd*150;
                        if(vfd==9)
                        amt=tvfd*110;
                        if(vfd==10)
                        amt=tvfd*140;
                        if(vfd==11)
                        amt=tvfd*40;
                        if(vfd==12)
                        amt=tvfd*60;
                        totalamt=totalamt+amt;
                        System.out.println("Do u want to place more order?Enter Y/N");
                        choice=SD.next();
                    }
                }
                if(str.equalsIgnoreCase("NV"))
                {
                    System.out.println("Welcome to Indian NON-VEG Dishes");
                    System.out.println("Indian NON-VEG Dishes\t\t\t: Price in Rs.");
                    System.out.println("1.Chicken Tikka Masala\t\t\t180");
                    System.out.println("2.Chicken Tikka labadar\t\t\t180");
                    System.out.println("3.Chicken Bharata\t\t\t150");
                    System.out.println("4.Kadahi Chicken\t\t\t160");
                    System.out.println("5.Mughali chicken\t\t\t160");
                    System.out.println("6.Murg Navratan\t\t\t160");
                    System.out.println("7.Chicken Do Pyaza\t\t\t170");
                    System.out.println("8.Murg Masallam\t\t\t190");
                    System.out.println("9.Mutton\t\t\t190");
                    System.out.println("10.Prawn Malai Curry\t\t\t190");
                    System.out.println("11.Fish Sarsowala\t\t\t140");
                    System.out.println("12.Fish Dhaniawala\t\t\t160");
                    while(choice.equalsIgnoreCase("Y"))
                    {
                        System.out.println("Choose ur main Non-veg course frm the lit by entering number: ");
                        vfd=SD.nextInt();
                        System.out.println("How many plates do u want to place frm above list?");
                        tvfd=SD.nextInt();
                        if(vfd==1||vfd==2)
                        amt=tvfd*180;
                        if(vfd==3)
                        amt=tvfd*150;
                        if(vfd==4||vfd==5)
                        amt=tvfd*160;
                        if(vfd==7||vfd==8)
                        amt=tvfd*190;
                        if(vfd==9||vfd==10)
                        amt=tvfd*190;
                        if(vfd==11)
                        amt=tvfd*140;
                        if(vfd==12)
                        amt=tvfd*160;
                        totalamt=totalamt+amt;
                        System.out.println("Do u want to place any more order?Enter Y/N");
                        choice=SD.next();
                    }
                }
                if(str.equalsIgnoreCase("C"))
                {
                    System.out.println("Welcome to Chinease Dishes");
                    System.out.println("Chinese Dishes\t\t\t:Price in Rs.");
                    System.out.println("1.Shezwan Fried Rice\t\t\t240");
                    System.out.println("2.Shezwan Chicken\t\t\t280");
                    System.out.println("3.Chilly Chicken\t\t\t280");
                    System.out.println("4.Chicken Noodle\t\t\t210");
                    System.out.println("5.Veg.Hakka Noodle\t\t\t210");
                    System.out.println("6.Chicken Manchurian\t\t\t190");
                    System.out.println("7.Paneer MANCHURIAN\t\t\t190");
                    System.out.println("8.Chilly Paneer\t\t\t190");
                    System.out.println("9.Shangai Fried\t\t\t240");
                    System.out.println("10.Veg Fried Rice\t\t\t210");
                    System.out.println("1.Chicken Fried Rice\t\t\t210");
                    System.out.println("12.Kimchi Rice Veg.\t\t\t210");
                    while(choice.equalsIgnoreCase("Y"))
                    {
                        System.out.println("Choose your main cource from the above list by entering the number:");
                        fd=SD.nextInt();
                        System.out.println("How many Plates do you want to place frm the above list?");
                        tfd=SD.nextInt();
                        if(fd==1)
                        amt=tfd*240;
                        if(fd==2||fd==3)
                        amt=tfd*280;
                        if(fd==4||fd==5)
                        amt=tfd*210;
                        if(fd==6||fd==7||fd==8)
                        amt=tfd*190;
                        if(fd==9)
                        amt=tfd*240;
                        if(fd==10||fd==11||fd==12)
                        amt=tfd*210;
                        totalamt=totalamt+amt;
                        System.out.println("Do you want to place more order?Enter Y/N");
                        choice=SD.next();
                    }
                }
                System.out.println();
                System.out.println("******MULTI COLORED RESTAURNT******");
                System.out.println("**************BILL****************");
                System.out.println("Totla cost=Rs."+totalamt);
                System.out.println(14.5/100*totalamt);
                System.out.println("VAT=14.5%");
                System.out.println("Total VAT=Rs."+vat);
                System.out.println("Amount to be paid=Rs."+(totalamt+amt));
                System.out.println();
                break;
                case 3:
                System.out.println("Cool with Desert");
                System.out.println("Desert\t\t\t: Price in Rs.");
                System.out.println();
                System.out.println("1.Softy Pineapple\t\t\t110");
                System.out.println("2.Softy Crunchy Chocolate\t\t\t110");
                System.out.println("3.Chocolate Walnut Brownie\t\t\t90");
                System.out.println("4.Chocolate Doughnut\t\t\t90");
                System.out.println("5.Marble Cake\t\t\t70");
                System.out.println("6.Mocha Magic\t\t\t90");
                System.out.println("7.Black Forest\t\t\t90");
                System.out.println("8.Mango Shake\t\t\t80");
                System.out.println("9.Pineapple Shake\t\t\t80");
                System.out.println("10.Tooty Fruty\t\t\t120");
                while(choice.equalsIgnoreCase("Y"))
                {
                    System.out.println("Choose Your Desert by entering your number!!");
                    totald=SD.nextInt();
                    if(d==1||d==2)
                    damt=totald*110;
                    if(d==3||d==4)
                    damt=totald*90;
                    if(d==5)
                    damt=totald*70;
                    if(d==6||d==7)
                    damt=totald*90;
                    if(d==8||d==9)
                    damt=totald*80;
                    if(d==10)
                    damt=totald*120;
                    totalamt=totalamt+amt;
                    System.out.println("Do you want to place more order?Enter Y/N");
                    choice=SD.next();
                }
                System.out.println();
                System.out.println("******MULTI COLORED RESTAURNT******");
                System.out.println("**************BILL****************");
                System.out.println("Totla cost=Rs."+totalamt);
                System.out.println(14.5/100*totalamt);
                System.out.println("VAT=14.5%");
                System.out.println("Total VAT=Rs."+vat);
                System.out.println("Amount to be paid=Rs."+(totalamt+amt));
                System.out.println();
                break;
                default:
                System.out.println("You have entered wrong choice!!");
                System.out.println("You can enter in the MULTI COLORED RESTAURANT by executing the program again with the correct choice");
                System.out.println("Now'QUIT' the program");
            }
            System.out.println("To exit MULTI COLORED RESTAURANT WORLD,enter the word 'QUIT'!!");
            ans=SD.next();
            if(ans.equals("quit")||ans.equals("QUIT")||ans.equals("Quit"))
            {
                System.out.println("Thanks for coming to multi colored restaurant!!");
                System.out.println("YOUR PLEASURE OUR COMFORT");
                System.out.println("Visit Again!!!");
                System.out.println();
            }
        }
    }
        