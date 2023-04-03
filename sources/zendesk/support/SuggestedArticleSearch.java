package zendesk.support;

import java.util.Locale;

public class SuggestedArticleSearch {
    /* access modifiers changed from: private */
    public Long categoryId;
    /* access modifiers changed from: private */
    public String labelNames;
    /* access modifiers changed from: private */
    public Locale locale;
    /* access modifiers changed from: private */
    public String query;
    /* access modifiers changed from: private */
    public Long sectionId;

    public Long getCategoryId() {
        return this.categoryId;
    }

    public String getLabelNames() {
        return this.labelNames;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public String getQuery() {
        return this.query;
    }

    public Long getSectionId() {
        return this.sectionId;
    }

    private SuggestedArticleSearch() {
    }
}
