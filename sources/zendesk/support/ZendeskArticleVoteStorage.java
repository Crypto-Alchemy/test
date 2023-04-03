package zendesk.support;

import java.util.HashMap;
import java.util.Map;
import zendesk.core.BaseStorage;

class ZendeskArticleVoteStorage implements ArticleVoteStorage {
    private static final String ARTICLE_VOTE_KEY = "help_center_stored_article_votes";
    private final BaseStorage baseStorage;

    public static class ArticleVoteMapWrapper {
        public Map<Long, ArticleVote> map;
    }

    public ZendeskArticleVoteStorage(BaseStorage baseStorage2) {
        this.baseStorage = baseStorage2;
    }

    private Map<Long, ArticleVote> getStoredArticleVotes() {
        ArticleVoteMapWrapper articleVoteMapWrapper = (ArticleVoteMapWrapper) this.baseStorage.get(ARTICLE_VOTE_KEY, ArticleVoteMapWrapper.class);
        if (articleVoteMapWrapper != null) {
            return articleVoteMapWrapper.map;
        }
        return null;
    }

    private void storeArticleVoteHolder(Map<Long, ArticleVote> map) {
        ArticleVoteMapWrapper articleVoteMapWrapper = new ArticleVoteMapWrapper();
        articleVoteMapWrapper.map = map;
        this.baseStorage.put(ARTICLE_VOTE_KEY, (Object) articleVoteMapWrapper);
    }

    public ArticleVote getStoredArticleVote(Long l) {
        Map<Long, ArticleVote> storedArticleVotes = getStoredArticleVotes();
        if (storedArticleVotes == null || !storedArticleVotes.containsKey(l)) {
            return null;
        }
        return storedArticleVotes.get(l);
    }

    public void removeStoredArticleVote(Long l) {
        Map<Long, ArticleVote> storedArticleVotes;
        if (l != null && (storedArticleVotes = getStoredArticleVotes()) != null && storedArticleVotes.containsKey(l)) {
            storedArticleVotes.remove(l);
            storeArticleVoteHolder(storedArticleVotes);
        }
    }

    public void storeArticleVote(Long l, ArticleVote articleVote) {
        Map storedArticleVotes = getStoredArticleVotes();
        if (storedArticleVotes == null) {
            storedArticleVotes = new HashMap();
        }
        if (articleVote != null) {
            storedArticleVotes.put(l, articleVote);
            storeArticleVoteHolder(storedArticleVotes);
        }
    }
}
