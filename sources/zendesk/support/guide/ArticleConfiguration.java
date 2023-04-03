package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import zendesk.configurations.Configuration;
import zendesk.messaging.Engine;
import zendesk.messaging.EngineListRegistry;
import zendesk.support.Article;

public class ArticleConfiguration implements Configuration {
    public static final int ARTICLE_ID = 1;
    public static final int ARTICLE_MODEL = 2;
    public static final int UNKNOWN = -1;
    private final ArticleViewModel article;
    private final long articleId;
    private final int configurationState;
    private final List<Configuration> configurations;
    private final boolean contactUsVisible;
    /* access modifiers changed from: private */
    public final String engineRegistryId;

    public static class Builder {
        /* access modifiers changed from: private */
        public ArticleViewModel article;
        /* access modifiers changed from: private */
        public long articleId;
        /* access modifiers changed from: private */
        public int configurationState;
        /* access modifiers changed from: private */
        public List<Configuration> configurations;
        /* access modifiers changed from: private */
        public boolean contactUsVisible;
        private List<Engine> engines;

        public Builder(long j) {
            this.contactUsVisible = true;
            this.configurations = Collections.emptyList();
            this.engines = Collections.emptyList();
            this.articleId = j;
            this.configurationState = 1;
        }

        private void setConfigurations(List<Configuration> list) {
            if (kj0.m47118i(list)) {
                this.configurations = list;
                ArticleConfiguration articleConfiguration = (ArticleConfiguration) ro0.m75294h().mo67439e(list, ArticleConfiguration.class);
                if (articleConfiguration != null) {
                    this.contactUsVisible = articleConfiguration.isContactUsButtonVisible();
                    this.engines = EngineListRegistry.INSTANCE.retrieveEngineList(articleConfiguration.engineRegistryId);
                }
            }
        }

        public Configuration config() {
            return new ArticleConfiguration(this, EngineListRegistry.INSTANCE.register(this.engines));
        }

        public Intent intent(Context context, Configuration... configurationArr) {
            return intent(context, (List<Configuration>) Arrays.asList(configurationArr));
        }

        public void show(Context context, Configuration... configurationArr) {
            context.startActivity(intent(context, configurationArr));
        }

        public Builder withContactUsButtonVisible(boolean z) {
            this.contactUsVisible = z;
            return this;
        }

        public Builder withEngines(List<Engine> list) {
            this.engines = list;
            return this;
        }

        public Intent intent(Context context, List<Configuration> list) {
            setConfigurations(list);
            Configuration config = config();
            Intent intent = new Intent(context, ViewArticleActivity.class);
            ro0.m75294h().mo67437c(intent, config);
            return intent;
        }

        public void show(Context context, List<Configuration> list) {
            context.startActivity(intent(context, list));
        }

        public Builder withEngines(Engine... engineArr) {
            return withEngines((List<Engine>) Arrays.asList(engineArr));
        }

        public Builder(Article article2) {
            this.contactUsVisible = true;
            this.configurations = Collections.emptyList();
            this.engines = Collections.emptyList();
            this.article = new ArticleViewModel(article2);
            this.configurationState = 2;
        }

        public Builder() {
            this.contactUsVisible = true;
            this.configurations = Collections.emptyList();
            this.engines = Collections.emptyList();
            this.configurationState = -1;
        }
    }

    public ArticleViewModel getArticle() {
        return this.article;
    }

    public long getArticleId() {
        return this.articleId;
    }

    public int getConfigurationState() {
        return this.configurationState;
    }

    @SuppressLint({"RestrictedApi"})
    public List<Configuration> getConfigurations() {
        return ro0.m75294h().mo67435a(this.configurations, this);
    }

    public List<Engine> getEngines() {
        return EngineListRegistry.INSTANCE.retrieveEngineList(this.engineRegistryId);
    }

    public boolean isContactUsButtonVisible() {
        return this.contactUsVisible;
    }

    private ArticleConfiguration(Builder builder, String str) {
        this.configurationState = builder.configurationState;
        this.article = builder.article;
        this.articleId = builder.articleId;
        this.contactUsVisible = builder.contactUsVisible;
        this.configurations = builder.configurations;
        this.engineRegistryId = str;
    }
}
