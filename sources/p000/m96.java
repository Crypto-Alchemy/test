package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.C5459q;
import com.squareup.picasso.Picasso;

/* renamed from: m96 */
/* compiled from: Stats */
public class m96 {

    /* renamed from: a */
    public final HandlerThread f31585a;

    /* renamed from: b */
    public final c80 f31586b;

    /* renamed from: c */
    public final Handler f31587c;

    /* renamed from: d */
    public long f31588d;

    /* renamed from: e */
    public long f31589e;

    /* renamed from: f */
    public long f31590f;

    /* renamed from: g */
    public long f31591g;

    /* renamed from: h */
    public long f31592h;

    /* renamed from: i */
    public long f31593i;

    /* renamed from: j */
    public long f31594j;

    /* renamed from: k */
    public long f31595k;

    /* renamed from: l */
    public int f31596l;

    /* renamed from: m */
    public int f31597m;

    /* renamed from: n */
    public int f31598n;

    /* renamed from: m96$a */
    /* compiled from: Stats */
    public static class C6238a extends Handler {

        /* renamed from: a */
        public final m96 f31599a;

        /* renamed from: m96$a$a */
        /* compiled from: Stats */
        public class C6239a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Message f31600a;

            public C6239a(Message message) {
                this.f31600a = message;
            }

            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f31600a.what);
            }
        }

        public C6238a(Looper looper, m96 m96) {
            super(looper);
            this.f31599a = m96;
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f31599a.mo45715j();
            } else if (i == 1) {
                this.f31599a.mo45716k();
            } else if (i == 2) {
                this.f31599a.mo45713h((long) message.arg1);
            } else if (i == 3) {
                this.f31599a.mo45714i((long) message.arg1);
            } else if (i != 4) {
                Picasso.f26774p.post(new C6239a(message));
            } else {
                this.f31599a.mo45717l((Long) message.obj);
            }
        }
    }

    public m96(c80 c80) {
        this.f31586b = c80;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f31585a = handlerThread;
        handlerThread.start();
        C5459q.m41880h(handlerThread.getLooper());
        this.f31587c = new C6238a(handlerThread.getLooper(), this);
    }

    /* renamed from: g */
    public static long m48182g(int i, long j) {
        return j / ((long) i);
    }

    /* renamed from: a */
    public o96 mo45707a() {
        return new o96(this.f31586b.mo29630a(), this.f31586b.size(), this.f31588d, this.f31589e, this.f31590f, this.f31591g, this.f31592h, this.f31593i, this.f31594j, this.f31595k, this.f31596l, this.f31597m, this.f31598n, System.currentTimeMillis());
    }

    /* renamed from: b */
    public void mo45708b(Bitmap bitmap) {
        mo45718m(bitmap, 2);
    }

    /* renamed from: c */
    public void mo45709c(Bitmap bitmap) {
        mo45718m(bitmap, 3);
    }

    /* renamed from: d */
    public void mo45710d() {
        this.f31587c.sendEmptyMessage(0);
    }

    /* renamed from: e */
    public void mo45711e() {
        this.f31587c.sendEmptyMessage(1);
    }

    /* renamed from: f */
    public void mo45712f(long j) {
        Handler handler = this.f31587c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j)));
    }

    /* renamed from: h */
    public void mo45713h(long j) {
        int i = this.f31597m + 1;
        this.f31597m = i;
        long j2 = this.f31591g + j;
        this.f31591g = j2;
        this.f31594j = m48182g(i, j2);
    }

    /* renamed from: i */
    public void mo45714i(long j) {
        this.f31598n++;
        long j2 = this.f31592h + j;
        this.f31592h = j2;
        this.f31595k = m48182g(this.f31597m, j2);
    }

    /* renamed from: j */
    public void mo45715j() {
        this.f31588d++;
    }

    /* renamed from: k */
    public void mo45716k() {
        this.f31589e++;
    }

    /* renamed from: l */
    public void mo45717l(Long l) {
        this.f31596l++;
        long longValue = this.f31590f + l.longValue();
        this.f31590f = longValue;
        this.f31593i = m48182g(this.f31596l, longValue);
    }

    /* renamed from: m */
    public final void mo45718m(Bitmap bitmap, int i) {
        int i2 = C5459q.m41881i(bitmap);
        Handler handler = this.f31587c;
        handler.sendMessage(handler.obtainMessage(i, i2, 0));
    }
}
