import java.util.*;
public class storage
{
    static int e_id[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,0,0,0,0,0,0,0,0,0,0};
    int e_catid[]={1,2,3,4,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
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
    static String e_scrap[]={"n","n","n","n","n","n","n","n","n","n","n","n","n","n","n","n","n","n","n","n","","","","","","","","","",""};
    String e_mob[]={"Vivo V11 Pro         ","iPhone XS Max          ","Oppo Realme2         ","One Plus 6T          "};
    String e_lap[]={"Lenovo Legion Y720   ","HP Omen 17             ","Alienware 17 R4      ","Macbook Pro          "};
    String e_gc[]={"Play Station4        ","X-Box 1X             ","X-Box 360            ","Nintendo Switch      "};
    String e_ref[]={"Haier Double Door    ","Samsung Double Door  ","Whirlpool Double Door","Whirlpool Triple Door"};
    String e_tv[]={"Mi LED Smart TV 80cm     ","Samsung 24K 59cm         ","Samsung Full HD LED 108cm","Panasonic LED 80cm       "};
    String e_cat1[]={"Mobile        ","Laptop        ","Gaming Console","Refrigerator  ","Television    ","","","","","","","","",""};
    int len=e_prod.length;

    //Transaction File
    int t_cid[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    String t_eprod[]={"","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
    int t_eqty[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int t_amt[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    double t_gst[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int t_totamt[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int t_cost[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    int no=0;

    int out=0;
    int again =0;
    int t_cidno=0;
    int t_cind=0;

    static double tp;
    static int ch;


    int n1;
    int n;

    static int ti=1;

    String nm="";

    long mno=0;

    int newindex=20;
    int newid=20;

    //InputStreamReader read= new InputStreamReader();
    static Scanner sc= new Scanner(System.in);
    void storage()
    {
        System.out.println("\t\t\t\t\t\tEnter the quantity");
        System.out.print("\t\t\t\t\t\t");
        n1=sc.nextInt();
        
        if(e_qty[ch-1]-n1<0)
        {
            System.out.println("\t\t\t\t\t\tRequested Quantity Not Available");
            if(e_qty[ch-1]>0)
            {
                System.out.println("\t\t\t\t\t\t   Currently in stock  :"+e_qty[ch-1]);
            }
            else
            {

                System.out.println("\t\t\t\t\t\tOut of stock");
                System.out.println("\t\t\t\t\t\tPress 1 to return to sell menu");
                int c= sc.nextInt();
            }
                //if(c==1)
                //sell();
                //else
                //exit();
                   

                System.out.println();
                System.out.println();
                char conti;
                if(e_qty[ch-1]>0)
                {
                    System.out.println("\t\t\t\t\t\tSell the above quantity?(Y/N)");

                    while(true)
                    {
                        try
                        {
                            conti=sc.nextLine().charAt(0);

                            break;
                        }

                        catch(Exception ex)
                        {

                        }  
                    }
                    if(conti=='Y'||conti=='y')
                    {
                        n1=e_qty[ch-1];

                    }
                    else if(conti=='N'||conti=='n')
                    {
                    }
                }
                else
                {

                    System.out.println("Out of stock");
                    System.out.println("Press 1 to return to sell menu");
                    int c= sc.nextInt();
                }
                    /*if(c==1)
                        sell();
                    else
                        exit();
                }*/

            }
            e_qty[ch-1]-=n1;
            t_eprod[t_cind]=e_prod[ch-1];
            t_cid[t_cind]=1;
            t_amt[t_cind]=e_cost[ch-1]*n1;
            t_cost[t_cind]=e_cost[ch-1];
            t_eqty[t_cind]=n1;
            t_cind++;
            n++;

        }
    }