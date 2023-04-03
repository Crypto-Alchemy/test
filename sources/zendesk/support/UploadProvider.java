package zendesk.support;

import java.io.File;

public interface UploadProvider {
    void deleteAttachment(String str, op7<Void> op7);

    void uploadAttachment(String str, File file, String str2, op7<UploadResponse> op7);
}
