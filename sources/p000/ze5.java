package p000;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.List;
import zendesk.belvedere.C9833i;
import zendesk.belvedere.MediaResult;

/* renamed from: ze5 */
/* compiled from: ResolveUriTask */
public class ze5 extends AsyncTask<Uri, Void, List<MediaResult>> {

    /* renamed from: a */
    public final WeakReference<n90<List<MediaResult>>> f46592a;

    /* renamed from: b */
    public final Context f46593b;

    /* renamed from: c */
    public final aa6 f46594c;

    /* renamed from: d */
    public final String f46595d;

    public ze5(Context context, aa6 aa6, n90<List<MediaResult>> n90, String str) {
        this.f46593b = context;
        this.f46594c = aa6;
        this.f46595d = str;
        this.f46592a = new WeakReference<>(n90);
    }

    /* renamed from: c */
    public static void m75337c(Context context, aa6 aa6, n90<List<MediaResult>> n90, List<Uri> list) {
        m75338d(context, aa6, n90, list, (String) null);
    }

    /* renamed from: d */
    public static void m75338d(Context context, aa6 aa6, n90<List<MediaResult>> n90, List<Uri> list, String str) {
        new ze5(context, aa6, n90, str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Uri[]) list.toArray(new Uri[list.size()]));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0160, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0161, code lost:
        zendesk.belvedere.C9833i.m75553c("Belvedere", "Error closing InputStream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x016b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x016c, code lost:
        zendesk.belvedere.C9833i.m75553c("Belvedere", "Error closing FileOutputStream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        r1 = r0;
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        r25 = r15;
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a6, code lost:
        r25 = r15;
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0167 A[SYNTHETIC, Splitter:B:103:0x0167] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0152 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098 A[ExcHandler: all (r0v33 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:11:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0112 A[SYNTHETIC, Splitter:B:71:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x011d A[SYNTHETIC, Splitter:B:76:0x011d] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x013e A[SYNTHETIC, Splitter:B:87:0x013e] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0149 A[SYNTHETIC, Splitter:B:92:0x0149] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x015c A[SYNTHETIC, Splitter:B:98:0x015c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<zendesk.belvedere.MediaResult> doInBackground(android.net.Uri... r27) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            java.lang.String r3 = "Error closing FileOutputStream"
            java.lang.String r4 = "Error closing InputStream"
            java.lang.String r5 = "Belvedere"
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 1048576(0x100000, float:1.469368E-39)
            byte[] r7 = new byte[r0]
            int r8 = r2.length
            r0 = 0
            r10 = r0
            r11 = r10
            r12 = 0
        L_0x0018:
            if (r12 >= r8) goto L_0x0171
            r15 = r2[r12]
            android.content.Context r0 = r1.f46593b     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x00fc }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x00fc }
            java.io.InputStream r10 = r0.openInputStream(r15)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x00fc }
            aa6 r0 = r1.f46594c     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x00fc }
            android.content.Context r13 = r1.f46593b     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x00fc }
            java.lang.String r14 = r1.f46595d     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x00fc }
            java.io.File r14 = r0.mo67411f(r13, r15, r14)     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x00fc }
            r0 = 2
            if (r10 == 0) goto L_0x00ba
            if (r14 == 0) goto L_0x00ba
            java.util.Locale r13 = java.util.Locale.US     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x00fc }
            java.lang.String r9 = "Copying media file into private cache - Uri: %s - Dest: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x00fc }
            r17 = 0
            r0[r17] = r15     // Catch:{ FileNotFoundException -> 0x0128, IOException -> 0x00fc }
            r16 = 1
            r0[r16] = r14     // Catch:{ FileNotFoundException -> 0x00b3, IOException -> 0x00ad }
            java.lang.String r0 = java.lang.String.format(r13, r9, r0)     // Catch:{ FileNotFoundException -> 0x00b3, IOException -> 0x00ad }
            zendesk.belvedere.C9833i.m75551a(r5, r0)     // Catch:{ FileNotFoundException -> 0x00b3, IOException -> 0x00ad }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00b3, IOException -> 0x00ad }
            r9.<init>(r14)     // Catch:{ FileNotFoundException -> 0x00b3, IOException -> 0x00ad }
        L_0x004f:
            int r0 = r10.read(r7)     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x009d, all -> 0x0098 }
            if (r0 <= 0) goto L_0x0060
            r11 = 0
            r9.write(r7, r11, r0)     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x005a, all -> 0x0098 }
            goto L_0x004f
        L_0x005a:
            r0 = move-exception
            r11 = r9
            goto L_0x00ae
        L_0x005d:
            r0 = move-exception
            r11 = r9
            goto L_0x00b4
        L_0x0060:
            android.content.Context r0 = r1.f46593b     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x009d, all -> 0x0098 }
            zendesk.belvedere.MediaResult r0 = p000.aa6.m75257j(r0, r15)     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x009d, all -> 0x0098 }
            zendesk.belvedere.MediaResult r11 = new zendesk.belvedere.MediaResult     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x009d, all -> 0x0098 }
            aa6 r13 = r1.f46594c     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x009d, all -> 0x0098 }
            android.content.Context r2 = r1.f46593b     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x009d, all -> 0x0098 }
            android.net.Uri r2 = r13.mo67413i(r2, r14)     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x009d, all -> 0x0098 }
            java.lang.String r17 = r14.getName()     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x009d, all -> 0x0098 }
            java.lang.String r18 = r0.mo73699g()     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x009d, all -> 0x0098 }
            long r19 = r0.mo73703l()     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x009d, all -> 0x0098 }
            long r21 = r0.mo73705o()     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x009d, all -> 0x0098 }
            long r23 = r0.mo73698f()     // Catch:{ FileNotFoundException -> 0x00a5, IOException -> 0x009d, all -> 0x0098 }
            r13 = r11
            r1 = r16
            r25 = r15
            r15 = r2
            r16 = r25
            r13.<init>(r14, r15, r16, r17, r18, r19, r21, r23)     // Catch:{ FileNotFoundException -> 0x0096, IOException -> 0x0094, all -> 0x0098 }
            r6.add(r11)     // Catch:{ FileNotFoundException -> 0x0096, IOException -> 0x0094, all -> 0x0098 }
            r11 = r9
            goto L_0x00e1
        L_0x0094:
            r0 = move-exception
            goto L_0x00a2
        L_0x0096:
            r0 = move-exception
            goto L_0x00aa
        L_0x0098:
            r0 = move-exception
            r1 = r0
            r11 = r9
            goto L_0x015a
        L_0x009d:
            r0 = move-exception
            r25 = r15
            r1 = r16
        L_0x00a2:
            r11 = r9
            goto L_0x0100
        L_0x00a5:
            r0 = move-exception
            r25 = r15
            r1 = r16
        L_0x00aa:
            r11 = r9
            goto L_0x012c
        L_0x00ad:
            r0 = move-exception
        L_0x00ae:
            r25 = r15
            r1 = r16
            goto L_0x0100
        L_0x00b3:
            r0 = move-exception
        L_0x00b4:
            r25 = r15
            r1 = r16
            goto L_0x012c
        L_0x00ba:
            r25 = r15
            r1 = 1
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ FileNotFoundException -> 0x00f7, IOException -> 0x00f5 }
            java.lang.String r9 = "Unable to resolve uri. InputStream null = %s, File null = %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ FileNotFoundException -> 0x00f7, IOException -> 0x00f5 }
            if (r10 != 0) goto L_0x00c7
            r13 = r1
            goto L_0x00c8
        L_0x00c7:
            r13 = 0
        L_0x00c8:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ FileNotFoundException -> 0x00f7, IOException -> 0x00f5 }
            r15 = 0
            r0[r15] = r13     // Catch:{ FileNotFoundException -> 0x00f7, IOException -> 0x00f5 }
            if (r14 != 0) goto L_0x00d3
            r14 = r1
            goto L_0x00d4
        L_0x00d3:
            r14 = 0
        L_0x00d4:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r14)     // Catch:{ FileNotFoundException -> 0x00f7, IOException -> 0x00f5 }
            r0[r1] = r13     // Catch:{ FileNotFoundException -> 0x00f7, IOException -> 0x00f5 }
            java.lang.String r0 = java.lang.String.format(r2, r9, r0)     // Catch:{ FileNotFoundException -> 0x00f7, IOException -> 0x00f5 }
            zendesk.belvedere.C9833i.m75555e(r5, r0)     // Catch:{ FileNotFoundException -> 0x00f7, IOException -> 0x00f5 }
        L_0x00e1:
            if (r10 == 0) goto L_0x00ec
            r10.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00ec
        L_0x00e7:
            r0 = move-exception
            r1 = r0
            zendesk.belvedere.C9833i.m75553c(r5, r4, r1)
        L_0x00ec:
            if (r11 == 0) goto L_0x0126
            r11.close()     // Catch:{ IOException -> 0x00f2 }
            goto L_0x0126
        L_0x00f2:
            r0 = move-exception
            r1 = r0
            goto L_0x0123
        L_0x00f5:
            r0 = move-exception
            goto L_0x0100
        L_0x00f7:
            r0 = move-exception
            goto L_0x012c
        L_0x00f9:
            r0 = move-exception
            r1 = r0
            goto L_0x015a
        L_0x00fc:
            r0 = move-exception
            r25 = r15
            r1 = 1
        L_0x0100:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x00f9 }
            java.lang.String r9 = "IO Error copying file, uri: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00f9 }
            r13 = 0
            r1[r13] = r25     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = java.lang.String.format(r2, r9, r1)     // Catch:{ all -> 0x00f9 }
            zendesk.belvedere.C9833i.m75553c(r5, r1, r0)     // Catch:{ all -> 0x00f9 }
            if (r10 == 0) goto L_0x011b
            r10.close()     // Catch:{ IOException -> 0x0116 }
            goto L_0x011b
        L_0x0116:
            r0 = move-exception
            r1 = r0
            zendesk.belvedere.C9833i.m75553c(r5, r4, r1)
        L_0x011b:
            if (r11 == 0) goto L_0x0126
            r11.close()     // Catch:{ IOException -> 0x0121 }
            goto L_0x0126
        L_0x0121:
            r0 = move-exception
            r1 = r0
        L_0x0123:
            zendesk.belvedere.C9833i.m75553c(r5, r3, r1)
        L_0x0126:
            r13 = 0
            goto L_0x0152
        L_0x0128:
            r0 = move-exception
            r25 = r15
            r1 = 1
        L_0x012c:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x00f9 }
            java.lang.String r9 = "File not found error copying file, uri: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00f9 }
            r13 = 0
            r1[r13] = r25     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = java.lang.String.format(r2, r9, r1)     // Catch:{ all -> 0x00f9 }
            zendesk.belvedere.C9833i.m75553c(r5, r1, r0)     // Catch:{ all -> 0x00f9 }
            if (r10 == 0) goto L_0x0147
            r10.close()     // Catch:{ IOException -> 0x0142 }
            goto L_0x0147
        L_0x0142:
            r0 = move-exception
            r1 = r0
            zendesk.belvedere.C9833i.m75553c(r5, r4, r1)
        L_0x0147:
            if (r11 == 0) goto L_0x0152
            r11.close()     // Catch:{ IOException -> 0x014d }
            goto L_0x0152
        L_0x014d:
            r0 = move-exception
            r1 = r0
            zendesk.belvedere.C9833i.m75553c(r5, r3, r1)
        L_0x0152:
            int r12 = r12 + 1
            r1 = r26
            r2 = r27
            goto L_0x0018
        L_0x015a:
            if (r10 == 0) goto L_0x0165
            r10.close()     // Catch:{ IOException -> 0x0160 }
            goto L_0x0165
        L_0x0160:
            r0 = move-exception
            r2 = r0
            zendesk.belvedere.C9833i.m75553c(r5, r4, r2)
        L_0x0165:
            if (r11 == 0) goto L_0x0170
            r11.close()     // Catch:{ IOException -> 0x016b }
            goto L_0x0170
        L_0x016b:
            r0 = move-exception
            r2 = r0
            zendesk.belvedere.C9833i.m75553c(r5, r3, r2)
        L_0x0170:
            throw r1
        L_0x0171:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ze5.doInBackground(android.net.Uri[]):java.util.List");
    }

    /* renamed from: b */
    public void onPostExecute(List<MediaResult> list) {
        super.onPostExecute(list);
        n90 n90 = this.f46592a.get();
        if (n90 != null) {
            n90.internalSuccess(list);
        } else {
            C9833i.m75555e("Belvedere", "Callback null");
        }
    }
}
