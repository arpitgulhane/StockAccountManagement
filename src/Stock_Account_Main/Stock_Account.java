package Stock_Account_Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Stock_Account {
    public static ArrayList<Stock> stocks_array = new ArrayList<>();
    public static ArrayList<Stock> stock_array=new ArrayList<>();

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
            name = sc.next();
            sharePrice = sc.nextInt();
            numberOfShare = sc.nextInt();
            Stock buy = new Stock(name,numberOfShare,sharePrice);
//            stock(name,numberOfShare,sharePrice);
            stock_array.add(buy);
            System.out.println("Enter Share Name,Number Of Share,Share Price to sell:");
            name = sc.next();
            sharePrice = sc.nextInt();
            numberOfShare = sc.nextInt();
            sell(name,numberOfShare,sharePrice);
        }
        StockPortfolio();
    }

    //-----------------------------------------------
    public static void StockPortfolio() {
        double totalValue=0.0;
        System.out.println("Stock Report :");
    for(Stock stock : stock_array){
        System.out.println(stock.getShareName());
        System.out.println(stock.getSharePrise());
        System.out.println(stock.getNumberShare());
        totalValue = totalValue+stock.getValue();
        }
        System.out.println("Total Value of Stock :"+totalValue);
    }

    public static void Sell(String name,int numberOfShare,int sharePrice){
        for(Stock stock : stock_array){
            stock.setShareName(name);
            stock.setNumberShare(numberOfShare);
            stock.setSharePrise(sharePrice);
        }
        System.out.println("Stock sell..");
        }

    }
}



//-----------------------------------------------
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
    public int getNumberShare(){
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

    public String setShareName(String ShareName){
        this.shareName=shareName;
        return ShareName;
    }
    public int setNumberShare(int NumberShare){
        this.numberShare=NumberShare-numberShare;
        return numberShare;
    }
    public int setSharePrise(int sharePrise){
        this.sharePrise=sharePrise-sharePrise;
        return sharePrise;
    }
    public int setValue(int value){
        this.value=value-value;
        return this.value;
    }
    }

