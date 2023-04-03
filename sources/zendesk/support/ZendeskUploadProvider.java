package zendesk.support;

import java.io.File;

class ZendeskUploadProvider implements UploadProvider {
    private final ZendeskUploadService uploadService;

    public ZendeskUploadProvider(ZendeskUploadService zendeskUploadService) {
        this.uploadService = zendeskUploadService;
    }

    public void deleteAttachment(String str, op7<Void> op7) {
        this.uploadService.deleteAttachment(str, op7);
    }

    public void uploadAttachment(String str, File file, String str2, final op7<UploadResponse> op7) {
        this.uploadService.uploadAttachment(str, file, str2, new ZendeskCallbackSuccess<UploadResponseWrapper>(op7) {
            public void onSuccess(UploadResponseWrapper uploadResponseWrapper) {
                op7 op7 = op7;
                if (op7 != null) {
                    op7.onSuccess(uploadResponseWrapper.getUpload());
                }
            }
        });
    }
}
