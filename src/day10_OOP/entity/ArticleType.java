package day10_OOP.entity;

import java.util.Scanner;

public class ArticleType {
    private static int AUTO_ARTICLEID = 100;
    private int articleID;
    private String articleTypeName;
    private double price;

    public ArticleType(int articleID, String articleTypeName, double price) {
        this.articleID = articleID;
        this.articleTypeName = articleTypeName;
        this.price = price;
    }

    public ArticleType() {
        this.articleID = AUTO_ARTICLEID;
        AUTO_ARTICLEID++;
    }

    public int getArticleID() {
        return articleID;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }

    public String getArticleTypeName() {
        return articleTypeName;
    }

    public void setArticleTypeName(String articleTypeName) {
        this.articleTypeName = articleTypeName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ArticleType{" +
                "articleID=" + articleID +
                ", articleName='" + articleTypeName + '\'' +
                ", price=" + price +
                '}';
    }

    public void inputArticleTypeInfo() {
        System.out.print("Nhập tên kiểu bài viết: ");
        this.setArticleTypeName(new Scanner(System.in).nextLine());
        System.out.print("Nhập đơn giá cho bài viết: ");
        this.setPrice(new Scanner(System.in).nextDouble());
    }
}
