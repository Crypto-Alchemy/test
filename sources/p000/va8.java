package p000;

import android.os.Looper;
import android.os.Message;

/* renamed from: va8 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class va8 extends iy8 {

    /* renamed from: a */
    public final /* synthetic */ C6462ry f34898a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public va8(C6462ry ryVar, Looper looper) {
        super(looper);
        this.f34898a = ryVar;
    }

    /* renamed from: a */
    public static final void m53318a(Message message) {
        qe8 qe8 = (qe8) message.obj;
        qe8.mo47094b();
        qe8.mo47097e();
    }

    /* renamed from: b */
    public static final boolean m53319b(Message message) {
        int i = message.what;
        if (i == 2 || i == 1 || i == 7) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            ry r0 = r7.f34898a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f33657p1
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = m53319b(r8)
            if (r0 == 0) goto L_0x0015
            m53318a(r8)
        L_0x0015:
            return
        L_0x0016:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x002e
            r4 = 7
            if (r0 == r4) goto L_0x002e
            if (r0 != r1) goto L_0x002a
            ry r0 = r7.f34898a
            boolean r0 = r0.mo47563y()
            if (r0 == 0) goto L_0x002e
        L_0x002a:
            int r0 = r8.what
            if (r0 != r3) goto L_0x0036
        L_0x002e:
            ry r0 = r7.f34898a
            boolean r0 = r0.mo47549e()
            if (r0 == 0) goto L_0x0120
        L_0x0036:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x007e
            ry r0 = r7.f34898a
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r1.<init>(r8)
            r0.f33648b1 = r1
            ry r8 = r7.f34898a
            boolean r8 = p000.C6462ry.m51381m0(r8)
            if (r8 == 0) goto L_0x005f
            ry r8 = r7.f34898a
            boolean r0 = r8.f33652e1
            if (r0 == 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            r8.mo47556n0(r5, (android.os.IInterface) null)
            return
        L_0x005f:
            ry r8 = r7.f34898a
            com.google.android.gms.common.ConnectionResult r0 = r8.f33648b1
            if (r0 == 0) goto L_0x006c
            com.google.android.gms.common.ConnectionResult r8 = r8.f33648b1
            goto L_0x0071
        L_0x006c:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0071:
            ry r0 = r7.f34898a
            ry$c r0 = r0.f33640M
            r0.mo45313a(r8)
            ry r0 = r7.f34898a
            r0.mo47536Q(r8)
            return
        L_0x007e:
            if (r0 != r3) goto L_0x009f
            ry r8 = r7.f34898a
            com.google.android.gms.common.ConnectionResult r0 = r8.f33648b1
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.common.ConnectionResult r8 = r8.f33648b1
            goto L_0x0092
        L_0x008d:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0092:
            ry r0 = r7.f34898a
            ry$c r0 = r0.f33640M
            r0.mo45313a(r8)
            ry r0 = r7.f34898a
            r0.mo47536Q(r8)
            return
        L_0x009f:
            if (r0 != r5) goto L_0x00be
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00aa
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00aa:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            ry r8 = r7.f34898a
            ry$c r8 = r8.f33640M
            r8.mo45313a(r0)
            ry r8 = r7.f34898a
            r8.mo47536Q(r0)
            return
        L_0x00be:
            r1 = 6
            if (r0 != r1) goto L_0x00e4
            ry r0 = r7.f34898a
            r0.mo47556n0(r3, (android.os.IInterface) null)
            ry r0 = r7.f34898a
            ry$a r1 = r0.f33645Y
            if (r1 == 0) goto L_0x00d7
            ry$a r0 = r0.f33645Y
            int r1 = r8.arg2
            r0.onConnectionSuspended(r1)
        L_0x00d7:
            ry r0 = r7.f34898a
            int r8 = r8.arg2
            r0.mo47537R(r8)
            ry r8 = r7.f34898a
            p000.C6462ry.m51380l0(r8, r3, r2, r6)
            return
        L_0x00e4:
            r1 = 2
            if (r0 != r1) goto L_0x00f4
            ry r0 = r7.f34898a
            boolean r0 = r0.mo47545b()
            if (r0 == 0) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            m53318a(r8)
            return
        L_0x00f4:
            boolean r0 = m53319b(r8)
            if (r0 == 0) goto L_0x0102
            java.lang.Object r8 = r8.obj
            qe8 r8 = (p000.qe8) r8
            r8.mo47095c()
            return
        L_0x0102:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r0, r8)
            return
        L_0x0120:
            m53318a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.va8.handleMessage(android.os.Message):void");
    }
}
