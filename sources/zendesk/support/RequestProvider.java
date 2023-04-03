package zendesk.support;

import java.util.Date;
import java.util.List;

public interface RequestProvider {
    void addComment(String str, EndUserComment endUserComment, op7<Comment> op7);

    void createRequest(CreateRequest createRequest, op7<Request> op7);

    void getAllRequests(op7<List<Request>> op7);

    void getComments(String str, op7<CommentsResponse> op7);

    void getCommentsSince(String str, Date date, boolean z, op7<CommentsResponse> op7);

    void getRequest(String str, op7<Request> op7);

    void getRequests(String str, op7<List<Request>> op7);

    void getTicketFormsById(List<Long> list, op7<List<TicketForm>> op7);

    void getUpdatesForDevice(op7<RequestUpdates> op7);

    void markRequestAsRead(String str, int i);

    void markRequestAsUnread(String str);
}
