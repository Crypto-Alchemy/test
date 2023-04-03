package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzp;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: xo8 */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class xo8 implements ServiceConnection {

    /* renamed from: a */
    public int f35665a;

    /* renamed from: d */
    public final Messenger f35666d;

    /* renamed from: e */
    public cd9 f35667e;

    /* renamed from: g */
    public final Queue<tg9<?>> f35668g;

    /* renamed from: k */
    public final SparseArray<tg9<?>> f35669k;

    /* renamed from: r */
    public final /* synthetic */ pl8 f35670r;

    public xo8(pl8 pl8) {
        this.f35670r = pl8;
        this.f35665a = 0;
        this.f35666d = new Messenger(new ml8(Looper.getMainLooper(), new ny8(this)));
        this.f35668g = new ArrayDeque();
        this.f35669k = new SparseArray<>();
    }

    /* renamed from: a */
    public final void mo49521a() {
        this.f35670r.f32731b.execute(new h19(this));
    }

    /* renamed from: b */
    public final synchronized void mo49522b(int i) {
        tg9 tg9 = this.f35669k.get(i);
        if (tg9 != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            this.f35669k.remove(i);
            tg9.mo48112b(new zzp(3, "Timed out waiting for response"));
            mo49526f();
        }
    }

    /* renamed from: c */
    public final synchronized void mo49523c(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            }
        }
        int i2 = this.f35665a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.f35665a = 4;
            rp0.m51209b().mo47467c(this.f35670r.f32730a, this);
            zzp zzp = new zzp(i, str);
            for (tg9<?> b : this.f35668g) {
                b.mo48112b(zzp);
            }
            this.f35668g.clear();
            for (int i3 = 0; i3 < this.f35669k.size(); i3++) {
                this.f35669k.valueAt(i3).mo48112b(zzp);
            }
            this.f35669k.clear();
        } else if (i2 == 3) {
            this.f35665a = 4;
        } else if (i2 != 4) {
            int i4 = this.f35665a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r1.mo48112b(new com.google.android.gms.cloudmessaging.zzp(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        r1.mo45802a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        return true;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49524d(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L_0x001a
            r1 = 41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Received response to request: "
            r2.append(r1)
            r2.append(r0)
        L_0x001a:
            monitor-enter(r4)
            android.util.SparseArray<tg9<?>> r1 = r4.f35669k     // Catch:{ all -> 0x005d }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x005d }
            tg9 r1 = (p000.tg9) r1     // Catch:{ all -> 0x005d }
            r2 = 1
            if (r1 != 0) goto L_0x0037
            r5 = 50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r1.<init>(r5)     // Catch:{ all -> 0x005d }
            java.lang.String r5 = "Received response for unknown request: "
            r1.append(r5)     // Catch:{ all -> 0x005d }
            r1.append(r0)     // Catch:{ all -> 0x005d }
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            return r2
        L_0x0037:
            android.util.SparseArray<tg9<?>> r3 = r4.f35669k     // Catch:{ all -> 0x005d }
            r3.remove(r0)     // Catch:{ all -> 0x005d }
            r4.mo49526f()     // Catch:{ all -> 0x005d }
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r3 = 0
            boolean r0 = r5.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.cloudmessaging.zzp r5 = new com.google.android.gms.cloudmessaging.zzp
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.mo48112b(r5)
            goto L_0x005c
        L_0x0059:
            r1.mo45802a(r5)
        L_0x005c:
            return r2
        L_0x005d:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xo8.mo49524d(android.os.Message):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        return true;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo49525e(p000.tg9<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f35665a     // Catch:{ all -> 0x008e }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r3) goto L_0x003a
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008e }
            int r0 = r5.f35665a     // Catch:{ all -> 0x008e }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r2.<init>(r1)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x008e }
            r2.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x008e }
            r6.<init>(r0)     // Catch:{ all -> 0x008e }
            throw r6     // Catch:{ all -> 0x008e }
        L_0x002e:
            monitor-exit(r5)
            return r2
        L_0x0030:
            java.util.Queue<tg9<?>> r0 = r5.f35668g     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            r5.mo49521a()     // Catch:{ all -> 0x008e }
            monitor-exit(r5)
            return r3
        L_0x003a:
            java.util.Queue<tg9<?>> r0 = r5.f35668g     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            monitor-exit(r5)
            return r3
        L_0x0041:
            java.util.Queue<tg9<?>> r0 = r5.f35668g     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            int r6 = r5.f35665a     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x004c
            r6 = r3
            goto L_0x004d
        L_0x004c:
            r6 = r2
        L_0x004d:
            p000.cu4.m43225o(r6)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x008e }
            r5.f35665a = r3     // Catch:{ all -> 0x008e }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x008e }
            rp0 r0 = p000.rp0.m51209b()     // Catch:{ all -> 0x008e }
            pl8 r1 = r5.f35670r     // Catch:{ all -> 0x008e }
            android.content.Context r1 = r1.f32730a     // Catch:{ all -> 0x008e }
            boolean r6 = r0.mo47466a(r1, r6, r5, r3)     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x007a
            java.lang.String r6 = "Unable to bind to service"
            r5.mo49523c(r2, r6)     // Catch:{ all -> 0x008e }
            goto L_0x008c
        L_0x007a:
            pl8 r6 = r5.f35670r     // Catch:{ all -> 0x008e }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f32731b     // Catch:{ all -> 0x008e }
            jv8 r0 = new jv8     // Catch:{ all -> 0x008e }
            r0.<init>(r5)     // Catch:{ all -> 0x008e }
            r1 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x008e }
            r6.schedule(r0, r1, r4)     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r5)
            return r3
        L_0x008e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.xo8.mo49525e(tg9):boolean");
    }

    /* renamed from: f */
    public final synchronized void mo49526f() {
        if (this.f35665a == 2 && this.f35668g.isEmpty() && this.f35669k.size() == 0) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.f35665a = 3;
            rp0.m51209b().mo47467c(this.f35670r.f32730a, this);
        }
    }

    /* renamed from: g */
    public final synchronized void mo49527g() {
        if (this.f35665a == 1) {
            mo49523c(1, "Timed out while binding");
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f35670r.f32731b.execute(new h49(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f35670r.f32731b.execute(new k99(this));
    }
}
