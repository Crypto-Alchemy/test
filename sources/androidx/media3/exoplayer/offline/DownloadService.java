package androidx.media3.exoplayer.offline;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;

public abstract class DownloadService extends Service {

    /* renamed from: A */
    public static final HashMap<Class<? extends DownloadService>, C0951a> f5146A = new HashMap<>();

    /* renamed from: a */
    public final String f5147a;

    /* renamed from: d */
    public final int f5148d;

    /* renamed from: e */
    public final int f5149e;

    /* renamed from: g */
    public C0951a f5150g;

    /* renamed from: k */
    public int f5151k;

    /* renamed from: r */
    public boolean f5152r;

    /* renamed from: s */
    public boolean f5153s;

    /* renamed from: x */
    public boolean f5154x;

    /* renamed from: y */
    public boolean f5155y;

    /* renamed from: androidx.media3.exoplayer.offline.DownloadService$a */
    public static final class C0951a {

        /* renamed from: a */
        public DownloadService f5156a;

        /* renamed from: b */
        public void mo7536b(DownloadService downloadService) {
            boolean z;
            if (this.f5156a == null) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20987g(z);
            this.f5156a = downloadService;
            throw null;
        }

        /* renamed from: c */
        public void mo7537c(DownloadService downloadService) {
            boolean z;
            if (this.f5156a == downloadService) {
                z = true;
            } else {
                z = false;
            }
            C2725kr.m20987g(z);
            this.f5156a = null;
        }
    }

    /* renamed from: a */
    public abstract ri1 mo7530a();

    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public void onCreate() {
        String str = this.f5147a;
        if (str != null) {
            sb4.m26840a(this, str, this.f5148d, this.f5149e, 2);
        }
        C0951a aVar = f5146A.get(getClass());
        if (aVar != null) {
            this.f5150g = aVar;
            aVar.mo7536b(this);
            return;
        }
        int i = w67.f19021a;
        mo7530a();
        throw null;
    }

    public void onDestroy() {
        this.f5155y = true;
        ((C0951a) C2725kr.m20985e(this.f5150g)).mo7537c(this);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        if (r2.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD") == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r8, int r9, int r10) {
        /*
            r7 = this;
            r7.f5151k = r10
            r9 = 0
            r7.f5153s = r9
            java.lang.String r10 = "androidx.media3.exoplayer.downloadService.action.RESTART"
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x002d
            java.lang.String r2 = r8.getAction()
            java.lang.String r3 = "content_id"
            java.lang.String r3 = r8.getStringExtra(r3)
            boolean r4 = r7.f5152r
            java.lang.String r5 = "foreground"
            boolean r5 = r8.getBooleanExtra(r5, r9)
            if (r5 != 0) goto L_0x0028
            boolean r5 = r10.equals(r2)
            if (r5 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r5 = r9
            goto L_0x0029
        L_0x0028:
            r5 = r0
        L_0x0029:
            r4 = r4 | r5
            r7.f5152r = r4
            goto L_0x002f
        L_0x002d:
            r2 = r1
            r3 = r2
        L_0x002f:
            java.lang.String r4 = "androidx.media3.exoplayer.downloadService.action.INIT"
            if (r2 != 0) goto L_0x0034
            r2 = r4
        L_0x0034:
            androidx.media3.exoplayer.offline.DownloadService$a r5 = r7.f5150g
            java.lang.Object r5 = p000.C2725kr.m20985e(r5)
            androidx.media3.exoplayer.offline.DownloadService$a r5 = (androidx.media3.exoplayer.offline.DownloadService.C0951a) r5
            p000.ri1 unused = r5.getClass()
            r5 = -1
            int r6 = r2.hashCode()
            switch(r6) {
                case -2068303304: goto L_0x009d;
                case -1192305801: goto L_0x0094;
                case -659421309: goto L_0x008b;
                case -238450692: goto L_0x0082;
                case 32678949: goto L_0x0077;
                case 464223742: goto L_0x006c;
                case 829812082: goto L_0x0061;
                case 845668953: goto L_0x0056;
                case 1746253622: goto L_0x004a;
                default: goto L_0x0047;
            }
        L_0x0047:
            r0 = r5
            goto L_0x00a7
        L_0x004a:
            java.lang.String r10 = "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x0053
            goto L_0x0047
        L_0x0053:
            r0 = 8
            goto L_0x00a7
        L_0x0056:
            java.lang.String r10 = "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x005f
            goto L_0x0047
        L_0x005f:
            r0 = 7
            goto L_0x00a7
        L_0x0061:
            java.lang.String r10 = "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x006a
            goto L_0x0047
        L_0x006a:
            r0 = 6
            goto L_0x00a7
        L_0x006c:
            java.lang.String r10 = "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x0075
            goto L_0x0047
        L_0x0075:
            r0 = 5
            goto L_0x00a7
        L_0x0077:
            java.lang.String r10 = "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x0080
            goto L_0x0047
        L_0x0080:
            r0 = 4
            goto L_0x00a7
        L_0x0082:
            boolean r10 = r2.equals(r4)
            if (r10 != 0) goto L_0x0089
            goto L_0x0047
        L_0x0089:
            r0 = 3
            goto L_0x00a7
        L_0x008b:
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x0092
            goto L_0x0047
        L_0x0092:
            r0 = 2
            goto L_0x00a7
        L_0x0094:
            java.lang.String r10 = "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x00a7
            goto L_0x0047
        L_0x009d:
            java.lang.String r10 = "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x00a6
            goto L_0x0047
        L_0x00a6:
            r0 = r9
        L_0x00a7:
            java.lang.String r10 = "stop_reason"
            java.lang.String r4 = "DownloadService"
            switch(r0) {
                case 0: goto L_0x0100;
                case 1: goto L_0x00f7;
                case 2: goto L_0x0111;
                case 3: goto L_0x0111;
                case 4: goto L_0x00f6;
                case 5: goto L_0x00f5;
                case 6: goto L_0x00db;
                case 7: goto L_0x00c4;
                case 8: goto L_0x00c3;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "Ignored unrecognized action: "
            r8.append(r10)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            p000.gk3.m18126c(r4, r8)
            goto L_0x0111
        L_0x00c3:
            throw r1
        L_0x00c4:
            java.lang.Object r8 = p000.C2725kr.m20985e(r8)
            android.content.Intent r8 = (android.content.Intent) r8
            java.lang.String r10 = "requirements"
            android.os.Parcelable r8 = r8.getParcelableExtra(r10)
            androidx.media3.exoplayer.scheduler.Requirements r8 = (androidx.media3.exoplayer.scheduler.Requirements) r8
            if (r8 != 0) goto L_0x00da
            java.lang.String r8 = "Ignored SET_REQUIREMENTS: Missing requirements extra"
            p000.gk3.m18126c(r4, r8)
            goto L_0x0111
        L_0x00da:
            throw r1
        L_0x00db:
            java.lang.Object r0 = p000.C2725kr.m20985e(r8)
            android.content.Intent r0 = (android.content.Intent) r0
            java.lang.String r2 = "download_request"
            android.os.Parcelable r0 = r0.getParcelableExtra(r2)
            androidx.media3.exoplayer.offline.DownloadRequest r0 = (androidx.media3.exoplayer.offline.DownloadRequest) r0
            if (r0 != 0) goto L_0x00f1
            java.lang.String r8 = "Ignored ADD_DOWNLOAD: Missing download_request extra"
            p000.gk3.m18126c(r4, r8)
            goto L_0x0111
        L_0x00f1:
            r8.getIntExtra(r10, r9)
            throw r1
        L_0x00f5:
            throw r1
        L_0x00f6:
            throw r1
        L_0x00f7:
            if (r3 != 0) goto L_0x00ff
            java.lang.String r8 = "Ignored REMOVE_DOWNLOAD: Missing content_id extra"
            p000.gk3.m18126c(r4, r8)
            goto L_0x0111
        L_0x00ff:
            throw r1
        L_0x0100:
            java.lang.Object r0 = p000.C2725kr.m20985e(r8)
            android.content.Intent r0 = (android.content.Intent) r0
            boolean r0 = r0.hasExtra(r10)
            if (r0 != 0) goto L_0x011c
            java.lang.String r8 = "Ignored SET_STOP_REASON: Missing stop_reason extra"
            p000.gk3.m18126c(r4, r8)
        L_0x0111:
            int r8 = p000.w67.f19021a
            r10 = 26
            if (r8 < r10) goto L_0x0119
            boolean r8 = r7.f5152r
        L_0x0119:
            r7.f5154x = r9
            throw r1
        L_0x011c:
            r8.getIntExtra(r10, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.offline.DownloadService.onStartCommand(android.content.Intent, int, int):int");
    }

    public void onTaskRemoved(Intent intent) {
        this.f5153s = true;
    }
}
