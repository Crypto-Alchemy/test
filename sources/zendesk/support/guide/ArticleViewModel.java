package zendesk.support.guide;

import java.io.Serializable;
import java.util.Date;
import zendesk.support.Article;

class ArticleViewModel implements Serializable {
    private final String authorName;
    private final String body;
    private final Date createdAt;

    /* renamed from: id */
    private final long f46842id;
    private final String title;

    public ArticleViewModel(Article article) {
        String str;
        this.f46842id = article.getId().longValue();
        this.title = article.getTitle();
        this.body = article.getBody();
        this.createdAt = article.getCreatedAt();
        if (article.getAuthor() == null) {
            str = null;
        } else {
            str = article.getAuthor().getName();
        }
        this.authorName = str;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getBody() {
        return this.body;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public long getId() {
        return this.f46842id;
    }

    public String getTitle() {
        return this.title;
    }
}
