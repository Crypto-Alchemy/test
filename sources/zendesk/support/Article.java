package zendesk.support;

import com.zendesk.logger.Logger;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import zendesk.core.User;

public class Article implements Serializable {
    private static final String LOG_TAG = "Article";
    public static final int UNKNOWN_VOTE_COUNT = -1;
    private User author;
    private Long authorId;
    private String body;
    private boolean commentsDisabled;
    private Date createdAt;
    private boolean draft;
    private String htmlUrl;

    /* renamed from: id */
    private Long f46817id;
    private List<String> labelNames;
    private String locale;
    private boolean outdated;
    private Integer position;
    private Long sectionId;
    private String sourceLocale;
    private String title;
    private Date updatedAt;
    private String url;
    private Integer voteCount;
    private Integer voteSum;

    public User getAuthor() {
        return this.author;
    }

    public Long getAuthorId() {
        return this.authorId;
    }

    public String getBody() {
        return this.body;
    }

    public Date getCreatedAt() {
        if (this.createdAt == null) {
            return null;
        }
        return new Date(this.createdAt.getTime());
    }

    public int getDownvoteCount() {
        Integer num = this.voteSum;
        if (num != null && this.voteCount != null) {
            return Math.abs(num.intValue() - this.voteCount.intValue()) / 2;
        }
        Logger.m43081e(LOG_TAG, "Cannot determine vote count because vote_sum and / or vote_count are null", new Object[0]);
        return -1;
    }

    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public Long getId() {
        return this.f46817id;
    }

    public List<String> getLabelNames() {
        return kj0.m47112c(this.labelNames);
    }

    public String getLocale() {
        return this.locale;
    }

    public Integer getPosition() {
        int i;
        Integer num = this.position;
        if (num == null) {
            i = 0;
        } else {
            i = num.intValue();
        }
        return Integer.valueOf(i);
    }

    public Long getSectionId() {
        return this.sectionId;
    }

    public String getSourceLocale() {
        return this.sourceLocale;
    }

    public String getTitle() {
        return this.title;
    }

    public Date getUpdatedAt() {
        if (this.updatedAt == null) {
            return null;
        }
        return new Date(this.updatedAt.getTime());
    }

    public int getUpvoteCount() {
        Integer num = this.voteSum;
        if (num != null && this.voteCount != null) {
            return (num.intValue() + this.voteCount.intValue()) / 2;
        }
        Logger.m43081e(LOG_TAG, "Cannot determine vote count because vote_sum and / or vote_count are null", new Object[0]);
        return -1;
    }

    public String getUrl() {
        return this.url;
    }

    public int getVoteCount() {
        Integer num = this.voteCount;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int getVoteSum() {
        Integer num = this.voteSum;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public boolean isCommentsDisabled() {
        return this.commentsDisabled;
    }

    public boolean isDraft() {
        return this.draft;
    }

    public boolean isOutdated() {
        return this.outdated;
    }

    public void setAuthor(User user) {
        this.author = user;
    }
}
