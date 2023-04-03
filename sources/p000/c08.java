package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Message;

@SuppressLint({"HandlerLeak"})
/* renamed from: c08 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class c08 extends s38 {

    /* renamed from: a */
    public final Context f21535a;

    /* renamed from: b */
    public final /* synthetic */ yh2 f21536b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c08(p000.yh2 r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f21536b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L_0x000d
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L_0x0011
        L_0x000d:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L_0x0011:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f21535a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.c08.<init>(yh2, android.content.Context):void");
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            return;
        }
        int i2 = this.f21536b.mo49669i(this.f21535a);
        if (this.f21536b.mo49671m(i2)) {
            this.f21536b.mo49675r(this.f21535a, i2);
        }
    }
}
