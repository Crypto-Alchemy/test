package zendesk.support.requestlist;

import java.util.List;
import zendesk.core.MemoryCache;
import zendesk.support.AggregatedCallback;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportSdkSettings;
import zendesk.support.SupportSettingsProvider;

class RequestListModel {
    public static final String REQUEST_LIST_ITEMS_CACHE_KEY = "request_list_items";
    public static final String SETTINGS_CACHE_KEY = "request_list_settings";
    private final SupportBlipsProvider blipsProvider;
    /* access modifiers changed from: private */
    public final MemoryCache cache;
    /* access modifiers changed from: private */
    public final lp7<RequestInfo, RequestListItem> mapper = new lp7<RequestInfo, RequestListItem>() {
        public RequestListItem apply(RequestInfo requestInfo) {
            return new RequestListItem(requestInfo);
        }
    };
    private final RequestInfoDataSource requestInfoDataSource;
    private final AggregatedCallback<SupportSdkSettings> settingsAggregatedCallback = new AggregatedCallback<>();
    private final SupportSettingsProvider settingsProvider;

    public RequestListModel(RequestInfoDataSource requestInfoDataSource2, MemoryCache memoryCache, SupportBlipsProvider supportBlipsProvider, SupportSettingsProvider supportSettingsProvider) {
        this.requestInfoDataSource = requestInfoDataSource2;
        this.cache = memoryCache;
        this.blipsProvider = supportBlipsProvider;
        this.settingsProvider = supportSettingsProvider;
    }

    /* access modifiers changed from: private */
    public List<RequestInfo> filterClosedRequests(List<RequestInfo> list, boolean z) {
        if (z) {
            return list;
        }
        return kj0.m47115f(list, new lp7<RequestInfo, Boolean>() {
            public Boolean apply(RequestInfo requestInfo) {
                return Boolean.valueOf(!requestInfo.isClosed());
            }
        });
    }

    public void cacheSupportSdkSettings(SupportSdkSettings supportSdkSettings) {
        this.cache.put(SETTINGS_CACHE_KEY, supportSdkSettings);
    }

    public void cleanup() {
        this.cache.remove(SETTINGS_CACHE_KEY);
        this.cache.remove(REQUEST_LIST_ITEMS_CACHE_KEY);
    }

    public List<RequestListItem> getCachedRequestInfos() {
        return (List) this.cache.get(REQUEST_LIST_ITEMS_CACHE_KEY);
    }

    public SupportSdkSettings getCachedSettings() {
        return (SupportSdkSettings) this.cache.get(SETTINGS_CACHE_KEY);
    }

    public void loadItems(boolean z, final SupportSdkSettings supportSdkSettings, final op7<List<RequestListItem>> op7) {
        if (z || getCachedRequestInfos() == null) {
            this.requestInfoDataSource.load(new op7<List<RequestInfo>>() {
                public void onError(hr1 hr1) {
                    op7.onError(hr1);
                }

                public void onSuccess(List<RequestInfo> list) {
                    List k = kj0.m47120k(RequestListModel.this.filterClosedRequests(list, supportSdkSettings.isShowClosedRequests()), RequestListModel.this.mapper);
                    RequestListModel.this.cache.put(RequestListModel.REQUEST_LIST_ITEMS_CACHE_KEY, k);
                    op7.onSuccess(k);
                }
            });
        } else {
            op7.onSuccess(getCachedRequestInfos());
        }
    }

    public void loadSettings(op7<SupportSdkSettings> op7) {
        if (this.settingsAggregatedCallback.add(op7)) {
            this.settingsProvider.getSettings(this.settingsAggregatedCallback);
        }
    }

    public void trackRequestListViewed() {
        this.blipsProvider.requestListViewed();
    }
}
