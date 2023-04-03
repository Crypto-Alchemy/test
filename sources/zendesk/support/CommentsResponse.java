package zendesk.support;

import java.util.List;

public class CommentsResponse extends ResponseWrapper {
    private List<CommentResponse> comments;
    private List<Object> organizations;
    private List<User> users;

    public List<CommentResponse> getComments() {
        return kj0.m47112c(this.comments);
    }

    public List<Object> getOrganizations() {
        return kj0.m47112c(this.organizations);
    }

    public List<User> getUsers() {
        return kj0.m47112c(this.users);
    }
}
