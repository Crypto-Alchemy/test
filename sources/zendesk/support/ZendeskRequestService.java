package zendesk.support;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p000.qg5;

class ZendeskRequestService {
    private static final String LOG_TAG = "ZendeskRequestService";
    private static final String ROLE_AGENT = "agent";
    private static final String ROLE_USER = "end_user";
    private static final String TICKET_FIELDS_INCLUDE = "ticket_fields";
    private final DateFormat iso8601;
    private final qg5.C6410b<RequestResponse, Request> requestExtractor = new qg5.C6410b<RequestResponse, Request>() {
        public Request extract(RequestResponse requestResponse) {
            return ZendeskRequestService.updateLastCommentingAgents(requestResponse.getRequest(), ZendeskRequestService.getAgentMap(requestResponse.getLastCommentingAgents()));
        }
    };
    private final RequestService requestService;
    private final qg5.C6410b<RequestsResponse, List<Request>> requestsExtractor = new qg5.C6410b<RequestsResponse, List<Request>>() {
        public List<Request> extract(RequestsResponse requestsResponse) {
            Map access$000 = ZendeskRequestService.getAgentMap(requestsResponse.getLastCommentingAgents());
            ArrayList arrayList = new ArrayList();
            for (Request access$100 : requestsResponse.getRequests()) {
                arrayList.add(ZendeskRequestService.updateLastCommentingAgents(access$100, access$000));
            }
            return arrayList;
        }
    };

    public ZendeskRequestService(RequestService requestService2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        this.iso8601 = simpleDateFormat;
        this.requestService = requestService2;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* access modifiers changed from: private */
    public static Map<Long, User> getAgentMap(List<User> list) {
        HashMap hashMap = new HashMap(list.size());
        for (User next : list) {
            hashMap.put(next.getId(), new User(next.getId(), next.getName(), next.getPhoto(), true, -1L, (List<String>) null, (Map<String, String>) null));
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static Request updateLastCommentingAgents(Request request, Map<Long, User> map) {
        ArrayList arrayList = new ArrayList(request.getLastCommentingAgentsIds().size());
        for (Long l : request.getLastCommentingAgentsIds()) {
            arrayList.add(map.get(l));
        }
        request.setLastCommentingAgents(arrayList);
        return request;
    }

    public void addComment(String str, EndUserComment endUserComment, op7<Request> op7) {
        UpdateRequestWrapper updateRequestWrapper = new UpdateRequestWrapper();
        Request request = new Request();
        request.setComment(endUserComment);
        updateRequestWrapper.setRequest(request);
        this.requestService.addComment(str, updateRequestWrapper).mo50512X(new qg5(op7, new qg5.C6410b<RequestResponse, Request>() {
            public Request extract(RequestResponse requestResponse) {
                return requestResponse.getRequest();
            }
        }));
    }

    public void createRequest(String str, CreateRequest createRequest, op7<Request> op7) {
        this.requestService.createRequest(str, new CreateRequestWrapper(createRequest)).mo50512X(new qg5(op7, new qg5.C6410b<RequestResponse, Request>() {
            public Request extract(RequestResponse requestResponse) {
                return requestResponse.getRequest();
            }
        }));
    }

    public void getAllRequests(String str, String str2, op7<List<Request>> op7) {
        this.requestService.getAllRequests(str, str2).mo50512X(new qg5(op7, this.requestsExtractor));
    }

    public void getComments(String str, op7<CommentsResponse> op7) {
        this.requestService.getComments(str).mo50512X(new qg5(op7));
    }

    public void getCommentsSince(String str, Date date, boolean z, op7<CommentsResponse> op7) {
        String str2;
        String format = this.iso8601.format(date);
        if (z) {
            str2 = ROLE_AGENT;
        } else {
            str2 = null;
        }
        this.requestService.getCommentsSince(str, format, str2).mo50512X(new qg5(op7));
    }

    public void getRequest(String str, String str2, op7<Request> op7) {
        this.requestService.getRequest(str, str2).mo50512X(new qg5(op7, this.requestExtractor));
    }

    public void getTicketFormsById(String str, op7<RawTicketFormResponse> op7) {
        this.requestService.getTicketFormsById(str, TICKET_FIELDS_INCLUDE).mo50512X(new qg5(op7));
    }

    public void getAllRequests(String str, String str2, String str3, op7<List<Request>> op7) {
        this.requestService.getManyRequests(str, str2, str3).mo50512X(new qg5(op7, this.requestsExtractor));
    }
}
