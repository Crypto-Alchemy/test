package zendesk.support;

interface RequestService {
    @dk4("/api/mobile/requests/{id}.json?include=last_comment")
    k90<RequestResponse> addComment(@sm4("id") String str, @p30 UpdateRequestWrapper updateRequestWrapper);

    @ak4("/api/mobile/requests.json?include=last_comment")
    k90<RequestResponse> createRequest(@nl2("Mobile-Sdk-Identity") String str, @p30 CreateRequestWrapper createRequestWrapper);

    @le2("/api/mobile/requests.json?sort_by=updated_at&sort_order=desc")
    k90<RequestsResponse> getAllRequests(@sz4("status") String str, @sz4("include") String str2);

    @le2("/api/mobile/requests/{id}/comments.json?sort_order=desc")
    k90<CommentsResponse> getComments(@sm4("id") String str);

    @le2("/api/mobile/requests/{id}/comments.json?sort_order=desc")
    k90<CommentsResponse> getCommentsSince(@sm4("id") String str, @sz4("since") String str2, @sz4("role") String str3);

    @le2("/api/mobile/requests/show_many.json?sort_order=desc")
    k90<RequestsResponse> getManyRequests(@sz4("tokens") String str, @sz4("status") String str2, @sz4("include") String str3);

    @le2("/api/mobile/requests/{id}.json")
    k90<RequestResponse> getRequest(@sm4("id") String str, @sz4("include") String str2);

    @le2("/api/v2/ticket_forms/show_many.json?active=true")
    k90<RawTicketFormResponse> getTicketFormsById(@sz4("ids") String str, @sz4("include") String str2);
}
