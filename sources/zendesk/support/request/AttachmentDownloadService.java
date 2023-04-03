package zendesk.support.request;

import java.io.IOException;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import zendesk.belvedere.MediaResult;

class AttachmentDownloadService {
    private final Executor executor;
    private final OkHttpClient okHttpClient;

    public static class SaveToFileTask implements Runnable {
        private final op7<MediaResult> callback;
        private final MediaResult destFile;
        private final ResponseBody responseBody;

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                r0 = 0
                zendesk.belvedere.MediaResult r1 = r8.destFile     // Catch:{ IOException -> 0x0028, all -> 0x0023 }
                java.io.File r1 = r1.mo73696e()     // Catch:{ IOException -> 0x0028, all -> 0x0023 }
                s36 r1 = p000.sg4.m71931f(r1)     // Catch:{ IOException -> 0x0028, all -> 0x0023 }
                v40 r1 = p000.sg4.m71928c(r1)     // Catch:{ IOException -> 0x0028, all -> 0x0023 }
                okhttp3.ResponseBody r2 = r8.responseBody     // Catch:{ IOException -> 0x0021 }
                w40 r2 = r2.source()     // Catch:{ IOException -> 0x0021 }
                r1.mo56029L0(r2)     // Catch:{ IOException -> 0x0021 }
                zendesk.support.Streams.closeQuietly(r1)
                okhttp3.ResponseBody r1 = r8.responseBody
                zendesk.support.Streams.closeQuietly(r1)
                goto L_0x004f
            L_0x0021:
                r0 = move-exception
                goto L_0x002c
            L_0x0023:
                r1 = move-exception
                r7 = r1
                r1 = r0
                r0 = r7
                goto L_0x0060
            L_0x0028:
                r1 = move-exception
                r7 = r1
                r1 = r0
                r0 = r7
            L_0x002c:
                java.lang.String r2 = "RequestActivity"
                java.lang.String r3 = "Unable to save attachment to disk. Error: '%s'"
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x005f }
                r5 = 0
                java.lang.String r6 = r0.getMessage()     // Catch:{ all -> 0x005f }
                r4[r5] = r6     // Catch:{ all -> 0x005f }
                com.zendesk.logger.Logger.m43081e(r2, r3, r4)     // Catch:{ all -> 0x005f }
                ir1 r2 = new ir1     // Catch:{ all -> 0x005f }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x005f }
                r2.<init>(r0)     // Catch:{ all -> 0x005f }
                zendesk.support.Streams.closeQuietly(r1)
                okhttp3.ResponseBody r0 = r8.responseBody
                zendesk.support.Streams.closeQuietly(r0)
                r0 = r2
            L_0x004f:
                op7<zendesk.belvedere.MediaResult> r1 = r8.callback
                if (r1 == 0) goto L_0x005e
                if (r0 != 0) goto L_0x005b
                zendesk.belvedere.MediaResult r0 = r8.destFile
                r1.onSuccess(r0)
                goto L_0x005e
            L_0x005b:
                r1.onError(r0)
            L_0x005e:
                return
            L_0x005f:
                r0 = move-exception
            L_0x0060:
                zendesk.support.Streams.closeQuietly(r1)
                okhttp3.ResponseBody r1 = r8.responseBody
                zendesk.support.Streams.closeQuietly(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.support.request.AttachmentDownloadService.SaveToFileTask.run():void");
        }

        private SaveToFileTask(ResponseBody responseBody2, MediaResult mediaResult, op7<MediaResult> op7) {
            this.responseBody = responseBody2;
            this.destFile = mediaResult;
            this.callback = op7;
        }
    }

    public AttachmentDownloadService(OkHttpClient okHttpClient2, Executor executor2) {
        this.okHttpClient = okHttpClient2;
        this.executor = executor2;
    }

    public void downloadAttachment(String str, final op7<ResponseBody> op7) {
        this.okHttpClient.newCall(new Request.Builder().get().url(str).build()).enqueue(new Callback() {
            public void onFailure(Call call, IOException iOException) {
                op7.onError(new ir1(iOException.getMessage()));
            }

            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    op7.onSuccess(response.body());
                } else {
                    op7.onError(new ir1(response.message()));
                }
            }
        });
    }

    public void storeAttachment(ResponseBody responseBody, MediaResult mediaResult, op7<MediaResult> op7) {
        this.executor.execute(new SaveToFileTask(responseBody, mediaResult, op7));
    }
}
