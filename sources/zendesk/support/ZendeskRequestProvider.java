package zendesk.support;

import com.zendesk.logger.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.AuthenticationType;
import zendesk.core.Identity;

final class ZendeskRequestProvider implements RequestProvider {
    private static final String ALL_REQUEST_STATUSES = "new,open,pending,hold,solved,closed";
    private static final String GET_REQUESTS_SIDE_LOAD = "public_updated_at,last_commenting_agents,last_comment,first_comment";
    private static final String LOG_TAG = "ZendeskRequestProvider";
    private static final int MAX_TICKET_FIELDS = 5;
    /* access modifiers changed from: private */
    public final AuthenticationProvider authenticationProvider;
    /* access modifiers changed from: private */
    public final SupportBlipsProvider blipsProvider;
    /* access modifiers changed from: private */
    public final SupportSdkMetadata metadata;
    /* access modifiers changed from: private */
    public final ZendeskRequestService requestService;
    /* access modifiers changed from: private */
    public final RequestSessionCache requestSessionCache;
    /* access modifiers changed from: private */
    public final RequestStorage requestStorage;
    private final SupportSettingsProvider settingsProvider;
    /* access modifiers changed from: private */
    public final ZendeskTracker zendeskTracker;

    public ZendeskRequestProvider(SupportSettingsProvider supportSettingsProvider, ZendeskRequestService zendeskRequestService, AuthenticationProvider authenticationProvider2, RequestStorage requestStorage2, RequestSessionCache requestSessionCache2, ZendeskTracker zendeskTracker2, SupportSdkMetadata supportSdkMetadata, SupportBlipsProvider supportBlipsProvider) {
        this.settingsProvider = supportSettingsProvider;
        this.requestService = zendeskRequestService;
        this.authenticationProvider = authenticationProvider2;
        this.requestStorage = requestStorage2;
        this.requestSessionCache = requestSessionCache2;
        this.zendeskTracker = zendeskTracker2;
        this.metadata = supportSdkMetadata;
        this.blipsProvider = supportBlipsProvider;
    }

    /* access modifiers changed from: private */
    public void addCommentInternal(final String str, EndUserComment endUserComment, final op7<Comment> op7) {
        this.requestService.addComment(str, endUserComment, new ZendeskCallbackSuccess<Request>(op7) {
            public void onSuccess(Request request) {
                ZendeskRequestProvider.this.zendeskTracker.requestUpdated();
                ZendeskRequestProvider.this.blipsProvider.requestUpdated(str);
                if (request.getId() == null || request.getCommentCount() == null) {
                    Logger.m43087k(ZendeskRequestProvider.LOG_TAG, "The ID and / or comment count was missing. Cannot store comment totalUpdates.", new Object[0]);
                } else {
                    ZendeskRequestProvider.this.requestStorage.updateRequestData(Collections.singletonList(request));
                }
                op7 op7 = op7;
                if (op7 != null) {
                    op7.onSuccess(request.getLastComment());
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void addServerTags(CreateRequest createRequest, SupportSdkSettings supportSdkSettings) {
        List b = kj0.m47111b(createRequest.getTags(), supportSdkSettings.getContactZendeskTags());
        if (kj0.m47118i(b)) {
            Logger.m43078b(LOG_TAG, "Adding tags to feedback...", new Object[0]);
            createRequest.setTags(b);
        }
    }

    /* access modifiers changed from: private */
    public static void answerCallbackOnConversationsDisabled(op7 op7) {
        Logger.m43078b(LOG_TAG, "Conversations disabled, this feature is not available on your plan or was disabled.", new Object[0]);
        if (op7 != null) {
            op7.onError(new ir1("Access Denied"));
        }
    }

    /* access modifiers changed from: private */
    public static boolean areConversationsEnabled(SupportSdkSettings supportSdkSettings) {
        if (supportSdkSettings == null) {
            return false;
        }
        return supportSdkSettings.isConversationsEnabled();
    }

    /* access modifiers changed from: private */
    public static RequestUpdates calcRequestUpdates(List<RequestData> list) {
        HashMap hashMap = new HashMap(list.size());
        for (RequestData next : list) {
            int unreadComments = next.unreadComments();
            if (unreadComments != 0) {
                hashMap.put(next.getId(), Integer.valueOf(unreadComments));
            }
        }
        return new RequestUpdates(hashMap);
    }

    /* access modifiers changed from: private */
    public static List<TicketForm> convertTicketFormResponse(List<RawTicketForm> list, List<RawTicketField> list2) {
        ArrayList arrayList = new ArrayList();
        Map<Long, TicketField> createTicketFieldMap = createTicketFieldMap(list2);
        for (RawTicketForm createTicketFormFromResponse : list) {
            arrayList.add(createTicketFormFromResponse(createTicketFormFromResponse, createTicketFieldMap));
        }
        return arrayList;
    }

    private static Map<Long, TicketField> createTicketFieldMap(List<RawTicketField> list) {
        HashMap hashMap = new HashMap(list.size());
        for (RawTicketField next : list) {
            hashMap.put(Long.valueOf(next.getId()), TicketField.create(next));
        }
        return hashMap;
    }

    private static TicketForm createTicketFormFromResponse(RawTicketForm rawTicketForm, Map<Long, TicketField> map) {
        ArrayList arrayList = new ArrayList();
        for (Long next : rawTicketForm.getTicketFieldIds()) {
            if (!(next == null || map.get(next) == null)) {
                arrayList.add(map.get(next));
            }
        }
        return RawTicketForm.create(rawTicketForm, arrayList);
    }

    /* access modifiers changed from: private */
    public void getAllRequestsInternal(String str, AuthenticationType authenticationType, final op7<List<Request>> op7) {
        if (kb6.m46951d(str)) {
            str = ALL_REQUEST_STATUSES;
        }
        C100043 r0 = new ZendeskCallbackSuccess<List<Request>>(op7) {
            public void onSuccess(List<Request> list) {
                ZendeskRequestProvider.this.requestStorage.updateRequestData(list);
                op7 op7 = op7;
                if (op7 != null) {
                    op7.onSuccess(list);
                }
            }
        };
        if (authenticationType == AuthenticationType.ANONYMOUS) {
            List<RequestData> requestData = this.requestStorage.getRequestData();
            ArrayList arrayList = new ArrayList(requestData.size());
            for (RequestData id : requestData) {
                arrayList.add(id.getId());
            }
            if (kj0.m47116g(arrayList)) {
                Logger.m43087k(LOG_TAG, "getAllRequestsInternal: There are no requests to fetch", new Object[0]);
                if (op7 != null) {
                    op7.onSuccess(new ArrayList());
                    return;
                }
                return;
            }
            this.requestService.getAllRequests(kb6.m46953f(arrayList), str, GET_REQUESTS_SIDE_LOAD, r0);
            return;
        }
        this.requestService.getAllRequests(str, GET_REQUESTS_SIDE_LOAD, r0);
    }

    /* access modifiers changed from: private */
    public void internalCreateRequest(CreateRequest createRequest, AuthenticationType authenticationType, Identity identity, final op7<Request> op7) {
        C100032 r0 = new ZendeskCallbackSuccess<Request>(op7) {
            public void onSuccess(Request request) {
                if (request == null || request.getId() == null) {
                    onError(new ir1("The request was created, but the ID is unknown."));
                    return;
                }
                ZendeskRequestProvider.this.zendeskTracker.requestCreated();
                ZendeskRequestProvider.this.blipsProvider.requestCreated(request.getId());
                ZendeskRequestProvider.this.requestStorage.updateRequestData(Collections.singletonList(request));
                op7 op7 = op7;
                if (op7 != null) {
                    op7.onSuccess(request);
                }
            }
        };
        if (authenticationType != AuthenticationType.ANONYMOUS || identity == null || !(identity instanceof AnonymousIdentity)) {
            this.requestService.createRequest((String) null, createRequest, r0);
            return;
        }
        this.requestService.createRequest(((AnonymousIdentity) identity).getSdkGuid(), createRequest, r0);
    }

    public void addComment(String str, EndUserComment endUserComment, op7<Comment> op7) {
        final String str2 = str;
        final EndUserComment endUserComment2 = endUserComment;
        final op7<Comment> op72 = op7;
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(op7) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.addCommentInternal(str2, endUserComment2, op72);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(op72);
                }
            }
        });
    }

    public void createRequest(final CreateRequest createRequest, final op7<Request> op7) {
        boolean z;
        if (createRequest == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Logger.m43081e(LOG_TAG, "configuration is invalid: request null", new Object[0]);
            if (op7 != null) {
                op7.onError(new ir1("configuration is invalid: request null"));
                return;
            }
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(op7) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                createRequest.setMetadata(ZendeskRequestProvider.this.metadata.getDeviceInfoAsMapForMetaData());
                ZendeskRequestProvider.this.addServerTags(createRequest, supportSdkSettings);
                ZendeskRequestProvider.this.internalCreateRequest(createRequest, supportSdkSettings.getAuthenticationType(), ZendeskRequestProvider.this.authenticationProvider.getIdentity(), op7);
            }
        });
    }

    public void getAllRequests(op7<List<Request>> op7) {
        getRequests((String) null, op7);
    }

    public void getComments(final String str, final op7<CommentsResponse> op7) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(op7) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getComments(str, op7);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(op7);
                }
            }
        });
    }

    public void getCommentsSince(String str, Date date, boolean z, op7<CommentsResponse> op7) {
        final String str2 = str;
        final Date date2 = date;
        final boolean z2 = z;
        final op7<CommentsResponse> op72 = op7;
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(op7) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getCommentsSince(str2, date2, z2, op72);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(op72);
                }
            }
        });
    }

    public void getRequest(final String str, final op7<Request> op7) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(op7) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getRequest(str, ZendeskRequestProvider.GET_REQUESTS_SIDE_LOAD, op7);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(op7);
                }
            }
        });
    }

    public void getRequests(final String str, final op7<List<Request>> op7) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(op7) {
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.getAllRequestsInternal(str, supportSdkSettings.getAuthenticationType(), op7);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(op7);
                }
            }
        });
    }

    public void getTicketFormsById(List<Long> list, final op7<List<TicketForm>> op7) {
        if (!kj0.m47116g(list)) {
            final ArrayList arrayList = new ArrayList();
            if (list.size() > 5) {
                arrayList.addAll(list.subList(0, 5));
                Logger.m43078b(LOG_TAG, "Maximum number of allowed ticket fields: %d.", 5);
            } else {
                arrayList.addAll(list);
            }
            if (!this.requestSessionCache.containsAllTicketForms(arrayList)) {
                this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(op7) {
                    public void onSuccess(SupportSdkSettings supportSdkSettings) {
                        if (supportSdkSettings.isTicketFormSupportAvailable()) {
                            ZendeskRequestProvider.this.requestService.getTicketFormsById(kb6.m46955h(arrayList), new ZendeskCallbackSuccess<RawTicketFormResponse>(op7) {
                                public void onSuccess(RawTicketFormResponse rawTicketFormResponse) {
                                    List access$1200 = ZendeskRequestProvider.convertTicketFormResponse(rawTicketFormResponse.getTicketForms(), rawTicketFormResponse.getTicketFields());
                                    ZendeskRequestProvider.this.requestSessionCache.updateTicketFormCache(access$1200);
                                    op7 op7 = op7;
                                    if (op7 != null) {
                                        op7.onSuccess(access$1200);
                                    }
                                }
                            });
                            return;
                        }
                        op7 op7 = op7;
                        if (op7 != null) {
                            op7.onError(new ir1("Ticket form support disabled."));
                        }
                    }
                });
            } else if (op7 != null) {
                op7.onSuccess(this.requestSessionCache.getTicketFormsById(arrayList));
            }
        } else if (op7 != null) {
            op7.onError(new ir1("Ticket forms must at least contain 1 Id"));
        }
    }

    public void getUpdatesForDevice(final op7<RequestUpdates> op7) {
        if (!this.requestStorage.isRequestDataExpired()) {
            op7.onSuccess(calcRequestUpdates(this.requestStorage.getRequestData()));
        } else {
            this.settingsProvider.getSettings(new op7<SupportSdkSettings>() {
                public void onError(hr1 hr1) {
                    op7.onError(hr1);
                }

                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!supportSdkSettings.isConversationsEnabled()) {
                        ZendeskRequestProvider.answerCallbackOnConversationsDisabled(op7);
                    } else {
                        ZendeskRequestProvider.this.getAllRequestsInternal((String) null, supportSdkSettings.getAuthenticationType(), new ZendeskCallbackSuccess<List<Request>>(op7) {
                            public void onSuccess(List<Request> list) {
                                op7.onSuccess(ZendeskRequestProvider.calcRequestUpdates(ZendeskRequestProvider.this.requestStorage.getRequestData()));
                            }
                        });
                    }
                }
            });
        }
    }

    public void markRequestAsRead(String str, int i) {
        this.requestStorage.markRequestAsRead(str, i);
    }

    public void markRequestAsUnread(String str) {
        this.requestStorage.markRequestAsUnread(str);
    }
}
