package zendesk.support;

public interface HelpCenterBlipsProvider {
    void articleView(Article article);

    void articleVote(Long l, int i);

    void helpCenterSearch(String str);
}
