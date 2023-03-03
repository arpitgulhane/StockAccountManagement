package Stock_Account_Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock_Account {
    public static ArrayList<Stock> stock_array=new ArrayList();

    public static void main(String[] args) {
        System.out.println("Enter N Number Of Stock : ");
        Scanner N_st=new Scanner(System.in);
        int Num=N_st.nextInt();

        int sharePrice,numberOfShare;
        String name;
        Scanner sc=new Scanner(System.in);


        for (int i=0;i<Num;i++){
//            Stock stock=new Stock();
            System.out.println("Enter Share Name,Number Of Share,Share Price :");
            name = sc.nextLine();
            sharePrice = sc.nextInt();
            numberOfShare = sc.nextInt();
            Stock stock = new Stock(name,numberOfShare,sharePrice);
//            stock(name,numberOfShare,sharePrice);
            stock_array.add(stock);
//            Name, Number of
//            Share, and Share Price
        }


    }
}

class Stock{
//    void StockCalculate(String name,int numberOfShare,int sharePrice){
        String shareName ;
        int numberShare;
        int sharePrise;
        int value;

    public Stock(String name, int numberOfShare, int sharePrice){
            this.shareName=shareName;
            this.numberShare=numberShare;
            this.sharePrise=sharePrise;
            this.value=numberShare*sharePrise;
    }

    public String getShareName(){
            return this.shareName;
    }
    public int getNumberDhare(){
            return this.numberShare;
    }
    public int getSharePrise(){
        return this.sharePrise;
    }
    public int getValue(){
        return this.value;
    }
//        int value=numberOfShare+sharePrice;
//        System.out.println(name+" Total : "+total);

    }

//    }

