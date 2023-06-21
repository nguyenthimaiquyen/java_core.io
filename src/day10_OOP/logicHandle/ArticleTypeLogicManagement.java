package day10_OOP.logicHandle;

import day10_OOP.entity.ArticleType;

import java.util.Scanner;

public class ArticleTypeLogicManagement {
    private ArticleType[] articleTypes = new ArticleType[100];

    public ArticleType[] getArticleTypes() {
        return articleTypes;
    }

    public void showArticleType() {
        for (int i = 0; i < articleTypes.length; i++) {
            if (articleTypes[i] != null) {
                System.out.println(articleTypes[i]);
            }
        }
    }

    public void inputArticleType() {
        System.out.print("Bạn muốn nhập bao nhiêu kiểu bài viết: ");
        int articleTypeNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < articleTypeNumber; i++) {
            System.out.println("Nhập thông tin kiểu bài viết thứ "+ (i+1));
            ArticleType newArticleType = new ArticleType();
            newArticleType.inputArticleTypeInfo();
            saveArticleType(newArticleType);
        }
    }

    public void saveArticleType(ArticleType newArticleType) {
        for (int j = 0; j < articleTypes.length; j++) {
            if (articleTypes[j] == null) {
                articleTypes[j] = newArticleType;
                break;
            }
        }
    }

    public boolean articleTypesIsNotEmpty() {
        for (int i = 0; i < articleTypes.length; i++) {
            if (articleTypes[i] != null) {
                return true;
            }
        }
        return false;
    }

}
