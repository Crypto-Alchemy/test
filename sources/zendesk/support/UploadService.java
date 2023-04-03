package zendesk.support;

import okhttp3.RequestBody;

interface UploadService {
    @mz0("/api/mobile/uploads/{token}.json")
    k90<Void> deleteAttachment(@sm4("token") String str);

    @ak4("/api/mobile/uploads.json")
    k90<UploadResponseWrapper> uploadAttachment(@sz4("filename") String str, @p30 RequestBody requestBody);
}
