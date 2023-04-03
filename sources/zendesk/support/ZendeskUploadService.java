package zendesk.support;

import java.io.File;
import okhttp3.MediaType;
import okhttp3.RequestBody;

class ZendeskUploadService {
    private static final String LOG_TAG = "ZendeskUploadService";
    private final UploadService uploadService;

    public ZendeskUploadService(UploadService uploadService2) {
        this.uploadService = uploadService2;
    }

    public void deleteAttachment(String str, op7<Void> op7) {
        this.uploadService.deleteAttachment(str).mo50512X(new qg5(op7));
    }

    public void uploadAttachment(String str, File file, String str2, op7<UploadResponseWrapper> op7) {
        this.uploadService.uploadAttachment(str, RequestBody.create(MediaType.parse(str2), file)).mo50512X(new qg5(op7));
    }
}
