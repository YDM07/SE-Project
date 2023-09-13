
import java.util.*;
import java.text.*;
import java.io.*;

public class SpartanElectronics
{
    //Master File
    static int e_id[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,0,0,0,0,0,0,0,0,0,0};

    static int e_qty[]={30,30,30,30,
            30,30,30,30,
            30,30,30,30,
            30,30,30,30,
            30,30,30,30,
            0,0,0,0,0,0,0,0,0,0};
    static String e_cat[]={"Mobile        ","Mobile        ","Mobile        ","Mobile        ",
            "Laptop        ","Laptop        ","Laptop        ","Laptop        ",
            "Gaming Console","Gaming Console","Gaming Console","Gaming Console",
            "Refrigerator  ","Refrigerator  ","Refrigerator  ","Refrigerator  ",
            "Television    ","Television    ","Television    ","Television    ",
            "","","","","","","","","",""};

    static String e_prod[]={"Vivo V11 Pro             ","iPhone XS Max            ","Oppo Realme2             ","One Plus 6T              ",
            "Lenovo Legion Y720       ","HP Omen 17               ","Alienware 17 R4          ","Macbook Pro              ",
            "Play Station4            ","X-Box 1X                 ","X-Box 360                ","Nintendo Switch          ",
            "Haier Double Door        ","Samsung Double Door      ","Whirlpool Double Door    ","Whirlpool Triple Door    ",
            "Mi LED Smart TV 80cm     ","Samsung 24K 59cm         ","Samsung Full HD LED 108cm","Panasonic LED 80cm       ",
            "","","","","","","","","",""};
    static int e_cost[]={23990,99899,14999,35999,
            149899,83499,402999,100900,
            34999,32999,27999,35999,
            23699,17999,26799,31399,
            13999,7999,42990,23990,
            0,0,0,0,0,0,0,0,0,0};
    int len=e_prod.length;

    //Transaction File
    static int t_cid[]={1,2,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    static String t_eprod[]={"Vivo V11 Pro             ","One Plus 6T              ","Oppo Realme2             ","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
    static int t_eqty[]={2,4,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    static int t_cost[]={23990,35999,14999,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    static double t_gst[]={8636.4,25919.28,8099.46,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    static int t_totamt[]={56616,169915,53096,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    static int t_amt[]={23990*2,35999*4,14999*3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    static int cind=3;
    static int index=3;
    int cindx=cind;
    int again =0;  
    static int ch;
    int n1;
    int n;
    static int ti=3;
    String nm="";
    long mno=0;
    int newindex=20;
    int newid=20;
    DateFormat dtf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date now=new Date();
    static Date now1=new Date();
    static Scanner sc= new Scanner(System.in);
    void design()
    {
        System.out.println("\t\t\t\t\tSSSSSSSSS   EEEEEEEEE");
        System.out.println("\t\t\t\t\tSSSSSSSSS   EEEEEEEEE ");
        System.out.println("\t\t\t\t\tSSSS        EEEE  ");
        System.out.println("\t\t\t\t\tSSSS        EEEE  ");
        System.out.println("\t\t\t\t\tSSSSSSSSS   EEEEEEEEE");
        System.out.println("\t\t\t\t\tSSSSSSSSS   EEEEEEEEE");
        System.out.println("\t\t\t\t\t     SSSS   EEEE  ");
        System.out.println("\t\t\t\t\t     SSSS   EEEE  ");
        System.out.println("\t\t\t\t\tSSSSSSSSS   EEEEEEEEE  ");
        System.out.println("\t\t\t\t\tSSSSSSSSS   EEEEEEEEE");
        System.out.println("\t\t\t\t\t SPARTAN   ELECTRONICS™");
        System.out.println("\t\t\t\t =====================================");
        System.out.println("\t\t\t\t\t"+dtf.format(now));
        System.out.println("\t\t\t\t =====================================");
    }

    public static void main(String[] args)
    {
        SpartanElectronics ob= new SpartanElectronics();
        char conti='n';
        do
        {
            ob.design();
            System.out.println();
            System.out.println();
            System.out.println("\t\t\t\t\t      WELCOME");
            System.out.println("\t\t\t\t =====================================");
            System.out.println();
            System.out.println("\t\t\t\t\t");
            int ch=ob.choice();

            System.out.print("\t\t\t\t\tLoading");

            for(int i=0;i<5;i++)
            {
                System.out.print(".");
                for(long j=0;j<10000000;j++)
                {}
            }
            System.out.println("\u000c");
            ob.design();

            switch(ch)
            {
                case 1:
                ob.stkstm();
                break;

                case 2:
                ob.sell();
                break;

                case 3:
                ob.add();
                break;

                case 4:
                ob.remove();
                break;

                case 5:
                ob.modify();
                break;

                case 6:
                ob.salsum();
                break;

                case 7:
                for(int i=cind;i<ob.t_eqty.length;i++)
                {
                    if(ob.t_eqty[i]!=0)
                        ob.info();
                    else
                    {
                        System.out.println("\t\t\t\t Please select something to sell first");
                        for(int j=0;j<1000000000;j++);
                        for(int j=0;j<1000000000;j++);
                        System.out.println("\t\t\t\t  You will be redirected to Main Menu");
                        for(int j=0;j<1000000000;j++);
                        System.out.print("\t\t\t\t  Loading");

                        for(int k=0;k<5;k++)
                        {
                            System.out.print(".");
                            for(long j=0;j<10000000;j++)
                            {}
                        }
                        System.out.println("\f");
                        break;
                    }

                }

                break;                

                case 8:
                ob.exit();
                break;

                default:
                System.out.println("\f");
                System.out.println("\t\t\t\t\tEnter 1 to return to Main menu");
                ob.again=sc.nextInt();
                if(ob.again==1)
                {
                    System.out.println("\f");

                }
                else
                {
                    ob.exit();
                }

            }

        }while(true);
    }

    int choice()
    {

        System.out.println("\t\t\t\t\t1.Stock Statement");
        System.out.println("\t\t\t\t\t2.Sell");
        System.out.println("\t\t\t\t\t3.Add Product");
        System.out.println("\t\t\t\t\t4.Remove Product");
        System.out.println("\t\t\t\t\t5.Modify Cost");
        System.out.println("\t\t\t\t\t6.Sales Summary");
        System.out.println("\t\t\t\t\t7.Bill");
        System.out.println("\t\t\t\t\t8.Exit");
        System.out.print("\t\t\t\t\tEnter your choice---> ");
        int ch;

        while(true)
        {
            try
            {
                ch=sc.nextInt();
                break;
            }

            catch(Exception ex)
            {
                System.out.println("\t\t\t\t\tEnter only integer");
                String db= sc.nextLine();
            }
        }
        System.out.println("\u000c");
        return ch;
    }

    void stkstm()
    {
        System.out.println("\f" );
        design();
        System.out.println("\nProductid\tCategory \t\tProduct\t\t\t\t\tCost\t\t\tQty.");
        for(int i=0;i<len;i++)
        {
            if(e_id[i]!=0)
                System.out.println(e_id[i]+"\t\t"+e_cat[i]+"\t\t"+e_prod[i]+"\t\t"+e_cost[i]+"\t\t\t"+e_qty[i]);
        }

        System.out.println("Enter 1 to return to Main menu");
        int x=sc.nextInt();
        if(x==1)
        {
            System.out.println("\f");

        }
        else
        {
            exit();

        }
    }

    void sell()
    {
        boolean flag=false;
        int conti=0;
        System.out.println("\f" );
        design();
        System.out.println("Customer ID: "+(++index));

        do
        {
            flag=false;
            System.out.println("\nProductid\tCategory \t\tProduct\t\t\t\tCost\t\t\tQty.");
            for(int i=0;i<len;i++)
            {            
                if(e_id[i]!=0)
                    System.out.println(""+e_id[i]+"\t\t"+e_cat[i]+"\t\t"+e_prod[i]+"\t"+e_cost[i]+"\t\t\t"+e_qty[i]);
            }
            System.out.println();
            System.out.println();
            System.out.println();

            System.out.println("\t\t\t\t\tEnter 0 To Return to Main Menu");
            System.out.print("\t\t\t\t\tEnter your choice--->");
            while(true)
            {
                try
                {
                    ch=sc.nextInt();
                    break;
                }

                catch(Exception ex)
                {
                    System.out.println("\t\t\t\t\t\tEnter only integer");
                    String db= sc.nextLine();
                }
            }
            if(ch!=0)
            {
                for(int i=0;i<len;i++)
                {
                    if(e_id[i]==ch)
                    {
                        flag=true;
                        System.out.println("\t\t\t\t\tEnter the quantity");
                        System.out.print("\t\t\t\t\t");
                        n1=sc.nextInt();
                        if(e_qty[i]<n1)
                        {
                            System.out.println("\t\t\t\t\t\tRequested Quantity Not Available");
                            if(e_qty[i]>0)
                            {
                                System.out.println("\t\t\t\t\t   Currently in stock  :"+e_qty[i]);
                            }
                            System.out.println();
                            System.out.println();

                            if(e_qty[i]>0)
                            {
                                System.out.println("\t\t\t\t\tSell the above quantity?(Y/N)");

                                while(true)
                                {
                                    try
                                    {
                                        conti=sc.nextLine().charAt(0);
                                        if(conti=='Y'||conti=='y'||conti=='N'||conti=='n')
                                        {
                                            break;                     
                                        }
                                        System.out.println("\t\t\t\t\tEnter your choice only in Y/N");
                                    }

                                    catch(Exception ex)
                                    {

                                    }  
                                }
                                if(conti=='Y'||conti=='y')
                                {
                                    n1=e_qty[i];

                                }
                                else if(conti=='N'||conti=='n')
                                {
                                }
                            }

                        }
                        e_qty[i]-=n1;
                        t_cid[cind]=index;
                        t_eprod[cind]=e_prod[i];
                        t_amt[cind]=e_cost[i]*n1;
                        t_cost[cind]=e_cost[i];
                        t_eqty[cind]=n1;

                        ++cind;
                        n++;
                    }
                }
            }
            else
            {
                break;
            }

            if(flag==false)
            {
                System.out.println("\t\t\t\t\tProduct ID not present");
            }

            System.out.println("\t\t\t\t\tDo you want to add any more products(Y/N) ");

            while(true)
            {
                try
                {
                    conti=sc.nextLine().charAt(0);
                    if(conti=='Y'||conti=='y'||conti=='N'||conti=='n')
                    {
                        break;                     
                    }
                    System.out.println("\t\t\t\t\tEnter your choice only in Y/N");
                }

                catch(Exception ex)
                {

                }  
            }
            System.out.println("\f");
        }while(conti=='y'||conti=='Y');
        if(ch!=0)
            bill();
    }

    void add()
    {
        System.out.println("\f");
        
        int cont=0;
        do
        {
            design();
            System.out.println("\t\t\t\t\tPRODUCT ID: "+(++newid));

            System.out.println("\t\t\t\t\tENTER PRODUCT CATEGORY: ");
            System.out.print("\t\t\t\t\t");
            String db= sc.nextLine();
            e_cat[newindex]=sc.nextLine();
            e_id[newindex]=newid;
            for(int i=e_cat[newindex].length();i<10;i++)
            {
                e_cat[newindex]=e_cat[newindex]+" ";                
            }
            if(e_cat[newindex]!="")
            {

                System.out.println("\t\t\t\t\tENTER PRODUCT NAME: ");
                System.out.print("\t\t\t\t\t");
                e_prod[newindex]=sc.nextLine();

                for(int i=e_prod[newindex].length();i<24;i++)
                {
                    e_prod[newindex]=e_prod[newindex]+" ";
                }

                System.out.println("\t\t\t\t\tENTER PRODUCT COST : ");
                System.out.print("\t\t\t\t\t");

                while(true)
                {
                    try
                    {
                        e_cost[newindex]=sc.nextInt();
                        break;
                    }
                    catch(Exception er)
                    {
                        System.out.println("\t\t\t\t\tEnter Integer Value Only!! ");
                        System.out.println("\t\t\t\t\tEnter Cost Again");

                    }
                }

                System.out.println("\t\t\t\t\tENTER QUANTITY OF PRODUCT : ");
                while(true)
                {
                    try
                    {
                        System.out.print("\t\t\t\t\t");
                        e_qty[newindex]=sc.nextInt();
                        break;
                    }
                    catch(Exception e)
                    {
                        System.out.println("\t\t\t\t\tWrong Input!!");
                        System.out.println("\t\t\t\t\tEnter Cost Again");
                        e_qty[newindex]=sc.nextInt();
                    }
                }
                
                System.out.println("\f");
                design();
                System.out.println("\t\t\tProduct added successfully!!");
                for(int i=0;i<len;i++)
                {
                    if(e_id[i]!=0)
                    {
                        System.out.println(e_id[i]+"\t\t"+e_cat[i]+"\t\t"+e_prod[i]+"\t"+e_cost[i]+"\t\t"+e_qty[i]);
                    }
                }

                newindex++;
            }
            System.out.println();
            System.out.println("\t\t\t\t\tEnter 1 to remain in Add Process");
            cont=0;
            while(true)
            {
                try
                {
                    cont=sc.nextInt();
                    break;
                }
                catch(Exception er)
                {
                    System.out.println("\t\t\t\t\t\tEnter only Integer");
                }
            }
            System.out.println("\f");
        }while(cont==1);

        System.out.println("\f");
    }

    void remove()
    {
        
        System.out.println("\f");
        for(int i=0;i<len;i++)
        {
            if(e_id[i]!=0)
                System.out.println(e_id[i]+"\t\t"+e_cat[i]+"\t\t"+e_prod[i]+"\t"+e_cost[i]+"\t\t"+e_qty[i]);
        }
        

        int rmv;
        System.out.println("\t\t\t\t\tENTER PRODUCT ID: ");
        System.out.print("\t\t\t\t\t");
        while(true)
        {
            try
            {
                rmv=sc.nextInt();
                break;
            }
            catch(Exception e)
            {
                System.out.println("\t\t\t\t\tWrong Input!! ");
                System.out.println("\t\t\t\t\tEnter Product Id Again");

            }
        }
        for(int i =0;i<e_id.length;i++)
        {

            if(rmv==e_id[i])
            {
                e_id[i]=0;
            }
        }

        System.out.println("\t\t\t\t\tEnter 1 to confirm");
        int conf=0;
        while(true)
        {
            try
            {
                conf=sc.nextInt();
                break;
            }
            catch(Exception er)
            {
                System.out.println("\t\t\t\t\tEnter only Integer");
            }
        }

        if(conf==1)
        {
            stkstm();
        }
        else
        {
            System.out.println("Product Not Added");
            System.out.println("\t\t\t\t\tEnter 1 to return to main menu");
            int cont=0;
            while(true)
            {
                try
                {
                    cont=sc.nextInt();
                    break;
                }
                catch(Exception er)
                {
                    System.out.println("\t\t\t\t\tEnter only Integer");
                }
            }

            if(cont==1)
            {
                System.out.println("\f");
            }
            else
            {
                exit();
            }
        }

        
    }

    void modify()
    {
        System.out.println("\f");
        String cat;

        design();
        String name;
        int confirm=0;
        for(int i=0;i<len;i++)
        {
            if(e_id[i]!=0)
                System.out.println(e_id[i]+"\t\t"+e_cat[i]+"\t\t"+e_prod[i]+"\t"+e_cost[i]+"\t\t"+e_qty[i]);
        }

        System.out.println("\t\t\t\t\tEnter the id of the product you want to modify");
        System.out.print("\t\t\t\t\t");
        int cid=sc.nextInt();
        System.out.println("\t\t\t\t\tEnter the new cost of the product");
        System.out.print("\t\t\t\t\t");
        int cost=sc.nextInt();

        System.out.println("\t\t\t\t\tEnter 1 to confirm");
        try
        {
            confirm=sc.nextInt();
        }
        catch(Exception er)
        {
            System.out.println("\t\t\t\t\tEnter only Integer");
        }
        if(confirm==1)
        {
            e_cost[cid-1]=cost;
            System.out.println("\t\t\t\t\tCost is modified");
        }
        else
        {
            System.out.println("\t\t\t\t\tCost is not modified");
        }
        for(int i=0;i<100000000;i++);        
        System.out.println("\f");

    }   

    void salsum()
    {
        int i;

        double gtot = 0;

        System.out.println("\f");
        design();
        System.out.println("\t\t\t\t\tSales Summary Report\n");
        System.out.println("\t\tInvoice No.\t     Product\t\t            Qty.\t Value");                    
        for(i=0;i<t_cid.length;i++)
        {
            if(t_cid[i]>0)
            {
                System.out.println("\t\t"+t_cid[i]+"\t\t     " + t_eprod[i] + "\t    " + t_eqty[i] + "\t         "+ t_amt[i]); 
                gtot = gtot + t_amt[i];
                
            }
        }

        System.out.println("\n\t\t\t\t\tTotal Earnings -----------> " + gtot );
        System.out.println("\t\t\t\t\tEnter 1 to return to Main menu");
        System.out.print("\t\t\t\t\t\t");
        int conti=0;
        while(true)
        {
            try
            {
                conti=sc.nextInt();
                break;
            }
            catch(Exception er)
            {
                System.out.println("\t\t\t\t\t\tEnter only Integer");
            }
        }
        System.out.println("\f");

        if(conti==1)
        {

        }
        else
        {
            exit();
        }
    }

    void info()
    {
        System.out.println("\f");
        design();
        System.out.println("\t\t\t\t\tEnter your name");
        System.out.print("\t\t\t\t\t");
        nm=sc.next();

        while(true)
        {
            System.out.println("\t\t\t\t\tEnter the Mobile No. : ");
            while(true)
            {
                try
                {
                    String db= sc.nextLine();
                    System.out.print("\t\t\t\t\t");
                    mno=sc.nextLong();
                    break;
                }
                catch(Exception e)
                {
                    System.out.println("\t\t\t\t\tENTER INTEGER VALUES ONLY !!!!");
                    continue;
                }
            }

            long t=mno;
            int d=0;

            while(t!=0)
            {
                t=t/10;
                d++;
            }

            if(d==10)
            {
                break;
            }
            else
            {
                System.out.println("\t\t\t\t\tEnter a valid Mobile No.");
            }
        }

    }

    void exit()
    {
        System.out.println("\f");
        design();

        System.out.println("\t\t\t\t\t1.Return to Main menu");
        System.out.println("\t\t\t\t\t2.Continue Selling");
        System.out.println("\t\t\t\t\tAny other number to Exit");
        System.out.print("\t\t\t\t\tEnter your choice---->");
        int ch;
        while(true)
        {
            try
            {
                ch=sc.nextInt();
                break;
            }

            catch(Exception ex)
            {
                System.out.println("\t\t\t\t\tEnter only integer");
                String db= sc.nextLine();
            }
        }
        System.out.println("\f");
        if(ch==1)
        {

        }
        else if(ch==2)
        {
            sell();
        }
        else
        {
            exit1();
        }

    }

    void exit1()
    {
        design();
        System.out.println("\t\t\t\t\tThank You");
        System.out.println("\f");
        design();
        System.exit(0);
    }

   /**
     * 
     */
     void bill()
    {
        DecimalFormat df = new DecimalFormat(".##");
        info();
        System.out.println("\f");
        design();
        int i=0;

        for(i=cindx;i<t_gst.length;i++)
        {
            t_gst[i]=0.18*t_amt[i];
        }

        System.out.println("\t\t\t\t\t     TAX INVOICE");
        System.out.println("\t\t\t\t\t     Invoice No."+ ++ti);
        System.out.println("\t       ==========================================================================");
        System.out.println("\t\t\t\t\tName        : "+nm);
        System.out.println("\t\t\t\t\tMobile No.  : "+mno);
        System.out.println("\t       ==========================================================================");

        System.out.println("\t\t\t\t\tGSTIN: 27ADEWF63456SAW");
        System.out.println("\t       ==========================================================================");
        System.out.println("\t\tProduct\t\t\t\tCost\t\tQty.\t\tPrice(INR)");
        System.out.println("\t\t\t\t");

        double gst = 0;
        double sumamt = 0;
        for(i=cindx;i<t_cost.length;i++)
        {
            if(t_eqty[i]!=0)
            {
                System.out.println("\t\t"+t_eprod[i]+"\t"+t_cost[i]+"\t\t "+t_eqty[i]+"\t\t"+t_amt[i]);
            }
            gst = gst + t_gst[i];
            sumamt = sumamt + t_amt[i];            

        }
        double totamt=gst+sumamt;
        System.out.println("\t       ==========================================================================");
        System.out.println("\t\t\t\t\t\t                      CGST@9%:  "+df.format(gst/2.0));
        System.out.println("\t\t\t\t\t\t                      SGST@9%:  "+df.format(gst/2.0));
        System.out.println("\t       ==========================================================================");
        System.out.println("\t\t\t\t\t\t                        Total: "+df.format(totamt));
        System.out.println("\t       ==========================================================================");
        long finamt=Math.round(totamt);
        double dec=0.0;

        if(finamt>totamt)
        {
            dec=finamt-totamt;
            System.out.println("\t\t\t\t\t\t                                   +0"+df.format(dec));
        }
        else if(totamt>finamt)
        {
            dec=totamt-finamt;
            System.out.println("\t\t\t\t\t\t                                   -0"+df.format(dec));
        } 

        System.out.println("\t       ==========================================================================");
        System.out.println("\t\t\t\t\t\t               Amount Payable: "+ finamt);
        System.out.println("\t       ==========================================================================");
        System.out.println("");
        System.out.println("\t\t\t\t\t1.Return to Main Menu");
        System.out.println("\t\t\t\t\t2.Exit");
        for(i=cindx;i<t_totamt.length;i++)
        {
            t_totamt[i]=(int)t_amt[i];
        }
        int conti=sc.nextInt(); 

        String thnx[]={"T","H","A","N","K","Y","O","U"};
        if(conti==1)
        {
            System.out.println("\f");
            main(thnx);
        }
        else if(conti==2)
        {
            System.out.println("\f");
            System.out.print("\t\t\t\t\t\t\t");
            for(i=0;i<thnx.length;i++)
            {
                System.out.print(thnx[i]);

                for(int j=0;j<1000000;j++)
                {
                }

            }

            for(i=0;i<10000000;i++)
            {
            }

            for(i=0;i<1000000000;i++)
            {

            }
            System.exit(0);
        }
    }
}