package p000;

import android.os.SystemClock;

/* renamed from: t82 */
/* compiled from: Fps */
public class t82 {

    /* renamed from: a */
    public long f18033a;

    /* renamed from: b */
    public long f18034b;

    /* renamed from: c */
    public int f18035c;

    /* renamed from: a */
    public void mo26286a() {
        if (of2.m23786b()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f18033a = uptimeMillis;
            this.f18034b = uptimeMillis;
            this.f18035c = 0;
        }
    }

    /* renamed from: b */
    public void mo26287b() {
        if (of2.m23786b()) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.f18033a;
            if (uptimeMillis > 40) {
                StringBuilder sb = new StringBuilder();
                sb.append("Frame time: ");
                sb.append(uptimeMillis);
            } else if (uptimeMillis > 20) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Frame time: ");
                sb2.append(uptimeMillis);
            }
            this.f18035c++;
            this.f18033a = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: c */
    public void mo26288c() {
        if (of2.m23786b() && this.f18035c > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Average FPS: ");
            sb.append(Math.round((((float) this.f18035c) * 1000.0f) / ((float) ((int) (SystemClock.uptimeMillis() - this.f18034b)))));
        }
    }
}
