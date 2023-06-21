package day10_OOP.entity;

public class PayrollDetail {
    private ArticleType articleType;
    private int articleNumber;

    public PayrollDetail(ArticleType articleType, int articleNumber) {
        this.articleType = articleType;
        this.articleNumber = articleNumber;
    }

    public PayrollDetail() {
    }

    public ArticleType getArticleType() {
        return articleType;
    }

    public void setArticleType(ArticleType articleType) {
        this.articleType = articleType;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(int articleNumber) {
        this.articleNumber = articleNumber;
    }

    @Override
    public String toString() {
        return "PayrollDetail{" +
                "articleType=" + articleType +
                ", articleNumber=" + articleNumber +
                '}';
    }
}
