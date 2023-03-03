package Stock_Account_Main;

import java.util.Scanner;

public class Stock_Account {
    public static void main(String[] args) {
        System.out.println("Enter N Number Of Stock : ");
        Scanner N_st=new Scanner(System.in);
        int Num=N_st.nextInt();
        Stock st=new Stock();

        int sharePrice,numberOfShare;
        String name;
        Scanner sc=new Scanner(System.in);

        for (int i=0;i<Num;i++){
            System.out.println("Enter Share Name,Number Of Share,Share Price :");
            name = sc.nextLine();
            sharePrice = sc.nextInt();
            numberOfShare = sc.nextInt();
            st.StockCalculate(name,numberOfShare,sharePrice);
//            Name, Number of
//            Share, and Share Price
        }


    }
}

class Stock{

    void StockCalculate(String name,int numberOfShare,int sharePrice){
        int total=numberOfShare+sharePrice;
        System.out.println(name+" Total : "+total);

    }

    }

