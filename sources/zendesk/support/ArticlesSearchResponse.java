package zendesk.support;

import java.util.List;
import zendesk.core.User;

class ArticlesSearchResponse implements ArticlesResponse {
    private List<Category> categories;
    private String nextPage;
    private String previousPage;
    private List<Article> results;
    private List<Section> sections;
    private List<User> users;

    public List<Article> getArticles() {
        return kj0.m47112c(this.results);
    }

    public List<Category> getCategories() {
        return kj0.m47112c(this.categories);
    }

    public String getNextPage() {
        return this.nextPage;
    }

    public String getPreviousPage() {
        return this.previousPage;
    }

    public List<Section> getSections() {
        return kj0.m47112c(this.sections);
    }

    public List<User> getUsers() {
        return kj0.m47112c(this.users);
    }
}
