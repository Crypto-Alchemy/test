package zendesk.support.request;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import zendesk.configurations.Configuration;
import zendesk.support.AttachmentFile;
import zendesk.support.CustomField;
import zendesk.support.DeepLinkingBroadcastReceiver;
import zendesk.support.Request;
import zendesk.support.RequestStatus;
import zendesk.support.requestlist.RequestInfo;

public class RequestConfiguration implements Configuration {
    public static final long NO_TICKET_FORM_ID = -1;
    private final List<Configuration> configurations;
    /* access modifiers changed from: private */
    public final List<CustomField> customFields;
    private final List<AttachmentFile> files;
    private final boolean hasAgentReplies;
    private final String localRequestId;
    private final String requestId;
    private final RequestStatus requestStatus;
    private final String requestSubject;
    private final List<String> tags;
    /* access modifiers changed from: private */
    public final long ticketFormId;

    public static class Builder {
        private List<Configuration> configurations = new ArrayList();
        private List<CustomField> customFields = new ArrayList(0);
        private List<AttachmentFile> files = new ArrayList(0);
        private boolean hasAgentReplies = false;
        private String localRequestId = "";
        private String requestId = "";
        private RequestStatus requestStatus = null;
        private String requestSubject = "";
        private List<String> tags = new ArrayList(0);
        private long ticketFormId = -1;

        private void setConfigurations(List<Configuration> list) {
            this.configurations = list;
            RequestConfiguration requestConfiguration = (RequestConfiguration) so0.m75306d(list, RequestConfiguration.class);
            if (requestConfiguration != null) {
                this.requestSubject = requestConfiguration.getRequestSubject();
                this.tags = requestConfiguration.getTags();
                this.ticketFormId = requestConfiguration.ticketFormId;
                this.customFields = requestConfiguration.customFields;
                this.files = requestConfiguration.getFilesAsAttachments();
            }
        }

        public Configuration config() {
            return new RequestConfiguration(this.requestSubject, this.tags, this.requestId, this.localRequestId, this.requestStatus, this.customFields, this.ticketFormId, this.files, this.hasAgentReplies, this.configurations);
        }

        public Intent deepLinkIntent(Context context, Intent... intentArr) {
            ArrayList arrayList = new ArrayList(Arrays.asList(intentArr));
            Intent intent = new Intent(context, DeepLinkingBroadcastReceiver.class);
            intent.putExtra(DeepLinkingBroadcastReceiver.EXTRA_REQUEST_INTENT, intent(context, new Configuration[0]));
            intent.putExtra(DeepLinkingBroadcastReceiver.EXTRA_BACK_STACK_ACTIVITIES, arrayList);
            return intent;
        }

        public Intent intent(Context context, Configuration... configurationArr) {
            return intent(context, (List<Configuration>) Arrays.asList(configurationArr));
        }

        public void show(Context context, Configuration... configurationArr) {
            context.startActivity(intent(context, configurationArr));
        }

        public Builder withCustomFields(List<CustomField> list) {
            this.customFields = list;
            return this;
        }

        public Builder withFiles(List<File> list) {
            ArrayList arrayList = new ArrayList(list.size());
            for (File next : list) {
                arrayList.add(new AttachmentFile(next.getName(), wv3.m54078b(f12.m44131a(next.getName())), next));
            }
            this.files = arrayList;
            return this;
        }

        public Builder withRequest(Request request) {
            this.requestId = request.getId();
            this.requestStatus = request.getStatus();
            this.hasAgentReplies = kj0.m47118i(request.getLastCommentingAgents());
            return this;
        }

        public Builder withRequestId(String str) {
            this.requestId = str;
            return this;
        }

        public Builder withRequestInfo(RequestInfo requestInfo) {
            String localId = requestInfo.getLocalId();
            if (kb6.m46949b(localId)) {
                this.localRequestId = localId;
            }
            String remoteId = requestInfo.getRemoteId();
            if (kb6.m46949b(remoteId)) {
                this.requestId = remoteId;
            }
            this.requestStatus = requestInfo.getRequestStatus();
            this.hasAgentReplies = kj0.m47118i(requestInfo.getAgentInfos());
            return this;
        }

        public Builder withRequestSubject(String str) {
            this.requestSubject = str;
            return this;
        }

        public Builder withTags(String... strArr) {
            this.tags = kj0.m47112c(Arrays.asList(strArr));
            return this;
        }

        public Builder withTicketForm(long j, List<CustomField> list) {
            this.ticketFormId = j;
            this.customFields = list;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<Configuration> list) {
            setConfigurations(list);
            Configuration config = config();
            Intent intent = new Intent(context, RequestActivity.class);
            so0.m75305c(intent, config);
            return intent;
        }

        public void show(Context context, List<Configuration> list) {
            context.startActivity(intent(context, list));
        }

        public Builder withTags(List<String> list) {
            this.tags = kj0.m47112c(list);
            return this;
        }

        public Intent deepLinkIntent(Context context, List<Configuration> list, Intent... intentArr) {
            ArrayList arrayList = new ArrayList(Arrays.asList(intentArr));
            Intent intent = new Intent(context, DeepLinkingBroadcastReceiver.class);
            intent.putExtra(DeepLinkingBroadcastReceiver.EXTRA_REQUEST_INTENT, intent(context, list));
            intent.putExtra(DeepLinkingBroadcastReceiver.EXTRA_BACK_STACK_ACTIVITIES, arrayList);
            return intent;
        }

        public Builder withFiles(File... fileArr) {
            return withFiles((List<File>) Arrays.asList(fileArr));
        }
    }

    public RequestConfiguration(String str, List<String> list, String str2, String str3, RequestStatus requestStatus2, List<CustomField> list2, long j, List<AttachmentFile> list3, boolean z, List<Configuration> list4) {
        this.requestSubject = str;
        this.tags = kj0.m47114e(list);
        this.requestId = str2;
        this.localRequestId = str3;
        this.requestStatus = requestStatus2;
        this.hasAgentReplies = z;
        this.customFields = list2;
        this.ticketFormId = j;
        this.files = list3;
        this.configurations = list4;
    }

    @SuppressLint({"RestrictedApi"})
    public List<Configuration> getConfigurations() {
        return so0.m75303a(this.configurations, this);
    }

    public List<CustomField> getCustomFields() {
        return this.customFields;
    }

    public List<StateRequestAttachment> getFiles() {
        ArrayList arrayList = new ArrayList(this.files.size());
        for (AttachmentFile convert : this.files) {
            arrayList.add(StateRequestAttachment.convert(convert));
        }
        return arrayList;
    }

    public List<AttachmentFile> getFilesAsAttachments() {
        return this.files;
    }

    public String getLocalRequestId() {
        return this.localRequestId;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public String getRequestSubject() {
        return this.requestSubject;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public StateRequestTicketForm getTicketForm() {
        return new StateRequestTicketForm(this.ticketFormId, this.customFields);
    }

    public long getTicketFormId() {
        return this.ticketFormId;
    }

    public boolean hasAgentReplies() {
        return this.hasAgentReplies;
    }
}
