package zendesk.support.request;

import android.annotation.SuppressLint;
import android.net.Uri;
import com.zendesk.logger.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zendesk.belvedere.C9800a;
import zendesk.belvedere.MediaResult;
import zendesk.support.Attachment;
import zendesk.support.UploadProvider;
import zendesk.support.UploadResponse;

class AttachmentUploadService {
    private final C9800a belvedere;
    private final List<StateRequestAttachment> errorItems;
    private final List<StateRequestAttachment> itemsForUpload;
    /* access modifiers changed from: private */
    public final Map<Long, Long> localToRemoteMap;
    private final Object lock = new Object();
    private final List<StateRequestAttachment> processedItems;
    private List<ResolveCallback> resolveCallbacks;
    private op7<AttachmentUploadResult> resultListener;
    private String subDirectory;
    /* access modifiers changed from: private */
    public final UploadProvider uploadProvider;

    public static class AttachmentUploadResult {
        private final Map<Long, Long> localToRemoteIdMap;
        private final List<StateRequestAttachment> requestAttachments;

        public AttachmentUploadResult(List<StateRequestAttachment> list, Map<Long, Long> map) {
            this.requestAttachments = list;
            this.localToRemoteIdMap = map;
        }

        public Map<Long, Long> getLocalToRemoteIdMap() {
            return this.localToRemoteIdMap;
        }

        public List<StateRequestAttachment> getRequestAttachments() {
            return this.requestAttachments;
        }
    }

    public class AttachmentsCallback extends op7<UploadResponse> {
        private final StateRequestAttachment requestAttachment;

        public AttachmentsCallback(StateRequestAttachment stateRequestAttachment) {
            this.requestAttachment = stateRequestAttachment;
        }

        public void onError(hr1 hr1) {
            Logger.m43087k(RequestActivity.LOG_TAG, "Error uploading file: %s | Error: %s", this.requestAttachment, hr1.mo43366h());
            AttachmentUploadService.this.errorUpload(this.requestAttachment);
        }

        public void onSuccess(UploadResponse uploadResponse) {
            Logger.m43078b(RequestActivity.LOG_TAG, "Successfully uploaded file: %s | Result: %s", this.requestAttachment, uploadResponse);
            AttachmentUploadService.this.localToRemoteMap.put(Long.valueOf(this.requestAttachment.getId()), uploadResponse.getAttachment().getId());
            AttachmentUploadService.this.uploadSuccess(this.requestAttachment, uploadResponse);
        }
    }

    public class ResolveCallback extends n90<List<MediaResult>> {
        private final StateRequestAttachment requestAttachment;

        private ResolveCallback(StateRequestAttachment stateRequestAttachment) {
            this.requestAttachment = stateRequestAttachment;
        }

        public void success(List<MediaResult> list) {
            Uri parsedLocalUri = this.requestAttachment.getParsedLocalUri();
            if (list.size() <= 0 || AttachmentUploadService.this.isUploadFinished()) {
                Logger.m43087k(RequestActivity.LOG_TAG, "Unable to resolve attachment: %s", parsedLocalUri);
                AttachmentUploadService.this.errorUpload(this.requestAttachment);
                return;
            }
            Logger.m43087k(RequestActivity.LOG_TAG, "Successfully resolved attachment: %s", parsedLocalUri);
            StateRequestAttachment access$200 = AttachmentUploadService.this.updateRequestAttachment(this.requestAttachment, list.get(0));
            AttachmentUploadService.this.uploadProvider.uploadAttachment(access$200.getName(), access$200.getLocalFile(), access$200.getMimeType(), new AttachmentsCallback(access$200));
        }
    }

    @SuppressLint({"UseSparseArrays"})
    public AttachmentUploadService(UploadProvider uploadProvider2, C9800a aVar, List<StateRequestAttachment> list) {
        this.uploadProvider = uploadProvider2;
        this.belvedere = aVar;
        this.itemsForUpload = list;
        this.resolveCallbacks = new ArrayList(list.size());
        this.subDirectory = UtilsAttachment.getTemporaryRequestCacheDir();
        this.processedItems = new ArrayList(list.size());
        this.errorItems = new ArrayList(list.size());
        this.localToRemoteMap = new HashMap();
    }

    /* access modifiers changed from: private */
    public void errorUpload(StateRequestAttachment stateRequestAttachment) {
        synchronized (this.lock) {
            this.errorItems.add(stateRequestAttachment);
        }
        notifyIfFinished();
    }

    /* access modifiers changed from: private */
    public boolean isUploadFinished() {
        boolean z;
        boolean z2;
        synchronized (this.lock) {
            boolean i = kj0.m47118i(this.errorItems);
            z = true;
            if (this.processedItems.size() == this.itemsForUpload.size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!i) {
                if (!z2) {
                    z = false;
                }
            }
        }
        return z;
    }

    private void notifyIfFinished() {
        Logger.m43078b(RequestActivity.LOG_TAG, "Notify if finished. Listener: %s, isUploadFinished: %s", this.resultListener, Boolean.valueOf(isUploadFinished()));
        if (isUploadFinished() && this.resultListener != null) {
            if (kj0.m47116g(this.errorItems)) {
                this.resultListener.onSuccess(new AttachmentUploadResult(kj0.m47112c(this.processedItems), this.localToRemoteMap));
            } else {
                this.resultListener.onError(new ir1("Error uploading attachments."));
            }
            this.resultListener = null;
        }
    }

    private MediaResult renameFile(File file, long j) {
        MediaResult d = this.belvedere.mo73725d(UtilsAttachment.getAttachmentSubDir(this.subDirectory, j), file.getName());
        Logger.m43078b(RequestActivity.LOG_TAG, "Rename local file: %s -> %s", file.getAbsolutePath(), d.mo73696e().getAbsolutePath());
        if (file.renameTo(d.mo73696e())) {
            return d;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public StateRequestAttachment updateRequestAttachment(StateRequestAttachment stateRequestAttachment, MediaResult mediaResult) {
        return stateRequestAttachment.newBuilder().setLocalFile(mediaResult.mo73696e()).setName(mediaResult.mo73700h()).setMimeType(mediaResult.mo73699g()).setLocalUri(mediaResult.mo73704m().toString()).build();
    }

    private void uploadAttachment(StateRequestAttachment stateRequestAttachment) {
        Uri parsedLocalUri = stateRequestAttachment.getParsedLocalUri();
        if (parsedLocalUri == null || isUploadFinished()) {
            Logger.m43087k(RequestActivity.LOG_TAG, "Unable to parse uri, skipping. | %s", stateRequestAttachment.getLocalUri());
            errorUpload(stateRequestAttachment);
            return;
        }
        ResolveCallback resolveCallback = new ResolveCallback(stateRequestAttachment);
        this.resolveCallbacks.add(resolveCallback);
        this.belvedere.mo73729h(Collections.singletonList(parsedLocalUri), this.subDirectory, resolveCallback);
    }

    /* access modifiers changed from: private */
    public void uploadSuccess(StateRequestAttachment stateRequestAttachment, UploadResponse uploadResponse) {
        String str;
        File file;
        Attachment attachment = uploadResponse.getAttachment();
        MediaResult renameFile = renameFile(stateRequestAttachment.getLocalFile(), attachment.getId().longValue());
        if (renameFile != null) {
            str = renameFile.mo73704m().toString();
            file = renameFile.mo73696e();
        } else {
            str = stateRequestAttachment.getLocalUri();
            file = stateRequestAttachment.getLocalFile();
        }
        StateRequestAttachment build = stateRequestAttachment.newBuilder().setLocalUri(str).setLocalFile(file).setToken(uploadResponse.getToken()).setUrl(attachment.getContentUrl()).setMimeType(attachment.getContentType()).setName(attachment.getFileName()).build();
        synchronized (this.lock) {
            this.processedItems.add(build);
        }
        notifyIfFinished();
    }

    public void setResultListener(op7<AttachmentUploadResult> op7) {
        this.resultListener = op7;
        notifyIfFinished();
    }

    public void start(String str) {
        if (kb6.m46949b(str)) {
            this.subDirectory = UtilsAttachment.getCacheDirForRequestId(str);
        }
        Logger.m43078b(RequestActivity.LOG_TAG, "Start uploading attachments", new Object[0]);
        for (StateRequestAttachment uploadAttachment : this.itemsForUpload) {
            uploadAttachment(uploadAttachment);
        }
    }
}
