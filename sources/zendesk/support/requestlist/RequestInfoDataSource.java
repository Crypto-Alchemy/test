package zendesk.support.requestlist;

import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import zendesk.support.Attachment;
import zendesk.support.Comment;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.RequestUpdates;
import zendesk.support.SupportUiStorage;
import zendesk.support.User;
import zendesk.support.requestlist.RequestInfo;

public interface RequestInfoDataSource {
    public static final String LOCAL = "local_request_infos";
    public static final String REMOTE = "remote_request_infos";

    public static class Disk implements RequestInfoDataSource {
        private final Executor backgroundThreadExecutor;
        /* access modifiers changed from: private */
        public final String cacheKey;
        /* access modifiers changed from: private */
        public final Executor mainThreadExecutor;
        /* access modifiers changed from: private */
        public final SupportUiStorage supportUiStorage;

        public Disk(Executor executor, Executor executor2, SupportUiStorage supportUiStorage2, String str) {
            this.mainThreadExecutor = executor;
            this.backgroundThreadExecutor = executor2;
            this.supportUiStorage = supportUiStorage2;
            this.cacheKey = str;
        }

        public void load(final op7<List<RequestInfo>> op7) {
            this.backgroundThreadExecutor.execute(new Runnable() {
                public void run() {
                    final List list = (List) Disk.this.supportUiStorage.read(Disk.this.cacheKey, new TypeToken<List<RequestInfo>>() {
                    }.getType());
                    Disk.this.mainThreadExecutor.execute(new Runnable() {
                        public void run() {
                            op7.onSuccess(kj0.m47114e(list));
                        }
                    });
                }
            });
        }

        public void save(final List<RequestInfo> list, final op7<List<RequestInfo>> op7) {
            this.backgroundThreadExecutor.execute(new Runnable() {
                public void run() {
                    Disk.this.supportUiStorage.write(Disk.this.cacheKey, list);
                    if (op7 != null) {
                        Disk.this.mainThreadExecutor.execute(new Runnable() {
                            public void run() {
                                C101342 r0 = C101342.this;
                                op7.onSuccess(list);
                            }
                        });
                    }
                }
            });
        }
    }

    public static class LocalDataSource implements RequestInfoDataSource {
        /* access modifiers changed from: private */
        public static final Comparator<RequestInfo> REQUEST_INFO_COMPARATOR = new RequestInfo.LastUpdatedComparator();
        /* access modifiers changed from: private */
        public final Disk disk;

        public LocalDataSource(Disk disk2) {
            this.disk = disk2;
        }

        public void insert(final RequestInfo requestInfo, final op7<List<RequestInfo>> op7) {
            this.disk.load(new op7<List<RequestInfo>>() {
                public void onError(hr1 hr1) {
                    op7 op7 = op7;
                    if (op7 != null) {
                        op7.onError(hr1);
                    }
                }

                public void onSuccess(List<RequestInfo> list) {
                    List<TypeT> a = kj0.m47110a(list, requestInfo, new mp7<RequestInfo, RequestInfo, Boolean>() {
                        public Boolean apply(RequestInfo requestInfo, RequestInfo requestInfo2) {
                            boolean equals = requestInfo2.getLocalId().equals(requestInfo.getLocalId());
                            boolean z = true;
                            boolean z2 = kb6.m46949b(requestInfo2.getRemoteId()) && requestInfo2.getRemoteId().equals(requestInfo.getRemoteId());
                            if (!equals && !z2) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    });
                    Collections.sort(a, LocalDataSource.REQUEST_INFO_COMPARATOR);
                    LocalDataSource.this.disk.save(a, op7);
                }
            });
        }

        public void load(op7<List<RequestInfo>> op7) {
            this.disk.load(op7);
        }

        public void remove(final String str, final op7<List<RequestInfo>> op7) {
            this.disk.load(new op7<List<RequestInfo>>() {
                public void onError(hr1 hr1) {
                    op7 op7 = op7;
                    if (op7 != null) {
                        op7.onError(hr1);
                    }
                }

                public void onSuccess(List<RequestInfo> list) {
                    LocalDataSource.this.disk.save(kj0.m47115f(list, new lp7<RequestInfo, Boolean>() {
                        public Boolean apply(RequestInfo requestInfo) {
                            return Boolean.valueOf(!str.equals(requestInfo.getLocalId()));
                        }
                    }), op7);
                }
            });
        }
    }

    public static class Network implements RequestInfoDataSource {
        /* access modifiers changed from: private */
        public final RequestProvider requestProvider;

        public Network(RequestProvider requestProvider2) {
            this.requestProvider = requestProvider2;
        }

        /* access modifiers changed from: private */
        public RequestInfo map(Request request, boolean z) {
            Comment firstComment = request.getFirstComment();
            Comment lastComment = request.getLastComment();
            return new RequestInfo("", request.getId(), request.getStatus(), z, request.getPublicUpdatedAt(), kj0.m47120k(kj0.m47115f(request.getLastCommentingAgents(), new lp7<User, Boolean>() {
                public Boolean apply(User user) {
                    return Boolean.valueOf(user != null);
                }
            }), new lp7<User, RequestInfo.AgentInfo>() {
                public RequestInfo.AgentInfo apply(User user) {
                    Attachment photo = user.getPhoto();
                    return new RequestInfo.AgentInfo(String.valueOf(user.getId()), user.getName(), photo != null ? photo.getContentUrl() : "");
                }
            }), new RequestInfo.MessageInfo(String.valueOf(firstComment.getId()), firstComment.getCreatedAt(), firstComment.getBody()), new RequestInfo.MessageInfo(String.valueOf(lastComment.getId()), lastComment.getCreatedAt(), lastComment.getBody()), new HashSet());
        }

        public void load(final op7<List<RequestInfo>> op7) {
            this.requestProvider.getAllRequests(new op7<List<Request>>() {
                public void onError(hr1 hr1) {
                    op7.onError(hr1);
                }

                public void onSuccess(final List<Request> list) {
                    Network.this.requestProvider.getUpdatesForDevice(new op7<RequestUpdates>() {
                        public void onError(hr1 hr1) {
                            op7.onError(hr1);
                        }

                        public void onSuccess(final RequestUpdates requestUpdates) {
                            op7.onSuccess(kj0.m47120k(list, new lp7<Request, RequestInfo>() {
                                public RequestInfo apply(Request request) {
                                    return Network.this.map(request, requestUpdates.isRequestUnread(request.getId()));
                                }
                            }));
                        }
                    });
                }
            });
        }
    }

    public static class RemoteDataSource implements RequestInfoDataSource {
        /* access modifiers changed from: private */
        public final Disk disk;
        private final Network network;

        public RemoteDataSource(Network network2, Disk disk2) {
            this.network = network2;
            this.disk = disk2;
        }

        public void load(final op7<List<RequestInfo>> op7) {
            this.network.load(new op7<List<RequestInfo>>() {
                public void onError(final hr1 hr1) {
                    RemoteDataSource.this.disk.load(new op7<List<RequestInfo>>() {
                        public void onError(hr1 hr1) {
                            op7.onError(hr1);
                        }

                        public void onSuccess(List<RequestInfo> list) {
                            op7.onSuccess(list);
                            op7.onError(hr1);
                        }
                    });
                }

                public void onSuccess(List<RequestInfo> list) {
                    RemoteDataSource.this.disk.save(list, op7);
                }
            });
        }
    }

    public static class Repository implements RequestInfoDataSource {
        private final RequestInfoDataSource localDataSource;
        /* access modifiers changed from: private */
        public final RequestInfoMerger merger;
        /* access modifiers changed from: private */
        public final RequestInfoDataSource remoteDataSource;

        public Repository(RequestInfoDataSource requestInfoDataSource, RequestInfoDataSource requestInfoDataSource2, RequestInfoMerger requestInfoMerger) {
            this.localDataSource = requestInfoDataSource;
            this.remoteDataSource = requestInfoDataSource2;
            this.merger = requestInfoMerger;
        }

        public void load(final op7<List<RequestInfo>> op7) {
            this.localDataSource.load(new op7<List<RequestInfo>>() {
                public void onError(hr1 hr1) {
                }

                public void onSuccess(final List<RequestInfo> list) {
                    Repository.this.remoteDataSource.load(new op7<List<RequestInfo>>() {
                        public void onError(hr1 hr1) {
                            op7.onError(hr1);
                        }

                        public void onSuccess(List<RequestInfo> list) {
                            C101471 r0 = C101471.this;
                            op7.onSuccess(Repository.this.merger.merge((List<RequestInfo>) list, list));
                        }
                    });
                }
            });
        }
    }

    void load(op7<List<RequestInfo>> op7);
}
