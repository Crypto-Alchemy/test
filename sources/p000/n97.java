package p000;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: n97 */
/* compiled from: VideoFrameReleaseHelper */
public final class n97 {

    /* renamed from: a */
    public final i32 f15385a = new i32();

    /* renamed from: b */
    public final C2873b f15386b;

    /* renamed from: c */
    public final C2877e f15387c;

    /* renamed from: d */
    public boolean f15388d;

    /* renamed from: e */
    public Surface f15389e;

    /* renamed from: f */
    public float f15390f;

    /* renamed from: g */
    public float f15391g;

    /* renamed from: h */
    public float f15392h;

    /* renamed from: i */
    public float f15393i;

    /* renamed from: j */
    public int f15394j;

    /* renamed from: k */
    public long f15395k;

    /* renamed from: l */
    public long f15396l;

    /* renamed from: m */
    public long f15397m;

    /* renamed from: n */
    public long f15398n;

    /* renamed from: o */
    public long f15399o;

    /* renamed from: p */
    public long f15400p;

    /* renamed from: q */
    public long f15401q;

    /* renamed from: n97$a */
    /* compiled from: VideoFrameReleaseHelper */
    public static final class C2872a {
        /* renamed from: a */
        public static void m22885a(Surface surface, float f) {
            int i;
            if (f == Utils.FLOAT_EPSILON) {
                i = 0;
            } else {
                i = 1;
            }
            try {
                surface.setFrameRate(f, i);
            } catch (IllegalStateException e) {
                gk3.m18127d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* renamed from: n97$b */
    /* compiled from: VideoFrameReleaseHelper */
    public interface C2873b {

        /* renamed from: n97$b$a */
        /* compiled from: VideoFrameReleaseHelper */
        public interface C2874a {
            /* renamed from: a */
            void mo22708a(Display display);
        }

        /* renamed from: a */
        void mo23557a(C2874a aVar);

        void unregister();
    }

    /* renamed from: n97$c */
    /* compiled from: VideoFrameReleaseHelper */
    public static final class C2875c implements C2873b {

        /* renamed from: a */
        public final WindowManager f15402a;

        public C2875c(WindowManager windowManager) {
            this.f15402a = windowManager;
        }

        /* renamed from: b */
        public static C2873b m22888b(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new C2875c(windowManager);
            }
            return null;
        }

        /* renamed from: a */
        public void mo23557a(C2873b.C2874a aVar) {
            aVar.mo22708a(this.f15402a.getDefaultDisplay());
        }

        public void unregister() {
        }
    }

    /* renamed from: n97$d */
    /* compiled from: VideoFrameReleaseHelper */
    public static final class C2876d implements C2873b, DisplayManager.DisplayListener {

        /* renamed from: a */
        public final DisplayManager f15403a;

        /* renamed from: b */
        public C2873b.C2874a f15404b;

        public C2876d(DisplayManager displayManager) {
            this.f15403a = displayManager;
        }

        /* renamed from: c */
        public static C2873b m22890c(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new C2876d(displayManager);
            }
            return null;
        }

        /* renamed from: a */
        public void mo23557a(C2873b.C2874a aVar) {
            this.f15404b = aVar;
            this.f15403a.registerDisplayListener(this, w67.m29384v());
            aVar.mo22708a(mo23559b());
        }

        /* renamed from: b */
        public final Display mo23559b() {
            return this.f15403a.getDisplay(0);
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            C2873b.C2874a aVar = this.f15404b;
            if (aVar != null && i == 0) {
                aVar.mo22708a(mo23559b());
            }
        }

        public void onDisplayRemoved(int i) {
        }

        public void unregister() {
            this.f15403a.unregisterDisplayListener(this);
            this.f15404b = null;
        }
    }

    /* renamed from: n97$e */
    /* compiled from: VideoFrameReleaseHelper */
    public static final class C2877e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: r */
        public static final C2877e f15405r = new C2877e();

        /* renamed from: a */
        public volatile long f15406a = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

        /* renamed from: d */
        public final Handler f15407d;

        /* renamed from: e */
        public final HandlerThread f15408e;

        /* renamed from: g */
        public Choreographer f15409g;

        /* renamed from: k */
        public int f15410k;

        public C2877e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f15408e = handlerThread;
            handlerThread.start();
            Handler u = w67.m29382u(handlerThread.getLooper(), this);
            this.f15407d = u;
            u.sendEmptyMessage(0);
        }

        /* renamed from: d */
        public static C2877e m22893d() {
            return f15405r;
        }

        /* renamed from: a */
        public void mo23563a() {
            this.f15407d.sendEmptyMessage(1);
        }

        /* renamed from: b */
        public final void mo23564b() {
            Choreographer choreographer = this.f15409g;
            if (choreographer != null) {
                int i = this.f15410k + 1;
                this.f15410k = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        /* renamed from: c */
        public final void mo23565c() {
            try {
                this.f15409g = Choreographer.getInstance();
            } catch (RuntimeException e) {
                gk3.m18133j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }

        public void doFrame(long j) {
            this.f15406a = j;
            ((Choreographer) C2725kr.m20985e(this.f15409g)).postFrameCallbackDelayed(this, 500);
        }

        /* renamed from: e */
        public void mo23567e() {
            this.f15407d.sendEmptyMessage(2);
        }

        /* renamed from: f */
        public final void mo23568f() {
            Choreographer choreographer = this.f15409g;
            if (choreographer != null) {
                int i = this.f15410k - 1;
                this.f15410k = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f15406a = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                }
            }
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                mo23565c();
                return true;
            } else if (i == 1) {
                mo23564b();
                return true;
            } else if (i != 2) {
                return false;
            } else {
                mo23568f();
                return true;
            }
        }
    }

    public n97(Context context) {
        C2877e eVar;
        C2873b f = m22870f(context);
        this.f15386b = f;
        if (f != null) {
            eVar = C2877e.m22893d();
        } else {
            eVar = null;
        }
        this.f15387c = eVar;
        this.f15395k = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f15396l = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f15390f = -1.0f;
        this.f15393i = 1.0f;
        this.f15394j = 0;
    }

    /* renamed from: c */
    public static boolean m22868c(long j, long j2) {
        if (Math.abs(j - j2) <= 20000000) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static long m22869e(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j5;
            j5 = j3 + j5;
            j4 = j6;
        }
        if (j5 - j < j - j4) {
            return j5;
        }
        return j4;
    }

    /* renamed from: f */
    public static C2873b m22870f(Context context) {
        C2873b bVar = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (w67.f19021a >= 17) {
            bVar = C2876d.m22890c(applicationContext);
        }
        if (bVar == null) {
            return C2875c.m22888b(applicationContext);
        }
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo23543b(long r11) {
        /*
            r10 = this;
            long r0 = r10.f15400p
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x002f
            i32 r0 = r10.f15385a
            boolean r0 = r0.mo21439e()
            if (r0 == 0) goto L_0x002f
            i32 r0 = r10.f15385a
            long r0 = r0.mo21435a()
            long r2 = r10.f15401q
            long r4 = r10.f15397m
            long r6 = r10.f15400p
            long r4 = r4 - r6
            long r0 = r0 * r4
            float r0 = (float) r0
            float r1 = r10.f15393i
            float r0 = r0 / r1
            long r0 = (long) r0
            long r2 = r2 + r0
            boolean r0 = m22868c(r11, r2)
            if (r0 == 0) goto L_0x002c
            r4 = r2
            goto L_0x0030
        L_0x002c:
            r10.mo23552n()
        L_0x002f:
            r4 = r11
        L_0x0030:
            long r11 = r10.f15397m
            r10.f15398n = r11
            r10.f15399o = r4
            n97$e r11 = r10.f15387c
            if (r11 == 0) goto L_0x0057
            long r0 = r10.f15395k
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L_0x0046
            goto L_0x0057
        L_0x0046:
            long r6 = r11.f15406a
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 != 0) goto L_0x004d
            return r4
        L_0x004d:
            long r8 = r10.f15395k
            long r11 = m22869e(r4, r6, r8)
            long r0 = r10.f15396l
            long r11 = r11 - r0
            return r11
        L_0x0057:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.n97.mo23543b(long):long");
    }

    /* renamed from: d */
    public final void mo23544d() {
        Surface surface;
        if (w67.f19021a >= 30 && (surface = this.f15389e) != null && this.f15394j != Integer.MIN_VALUE && this.f15392h != Utils.FLOAT_EPSILON) {
            this.f15392h = Utils.FLOAT_EPSILON;
            C2872a.m22885a(surface, Utils.FLOAT_EPSILON);
        }
    }

    /* renamed from: g */
    public void mo23545g(float f) {
        this.f15390f = f;
        this.f15385a.mo21441g();
        mo23555q();
    }

    /* renamed from: h */
    public void mo23546h(long j) {
        long j2 = this.f15398n;
        if (j2 != -1) {
            this.f15400p = j2;
            this.f15401q = this.f15399o;
        }
        this.f15397m++;
        this.f15385a.mo21440f(j * 1000);
        mo23555q();
    }

    /* renamed from: i */
    public void mo23547i(float f) {
        this.f15393i = f;
        mo23552n();
        mo23556r(false);
    }

    /* renamed from: j */
    public void mo23548j() {
        mo23552n();
    }

    /* renamed from: k */
    public void mo23549k() {
        this.f15388d = true;
        mo23552n();
        if (this.f15386b != null) {
            ((C2877e) C2725kr.m20985e(this.f15387c)).mo23563a();
            this.f15386b.mo23557a(new l97(this));
        }
        mo23556r(false);
    }

    /* renamed from: l */
    public void mo23550l() {
        this.f15388d = false;
        C2873b bVar = this.f15386b;
        if (bVar != null) {
            bVar.unregister();
            ((C2877e) C2725kr.m20985e(this.f15387c)).mo23567e();
        }
        mo23544d();
    }

    /* renamed from: m */
    public void mo23551m(Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        if (this.f15389e != surface) {
            mo23544d();
            this.f15389e = surface;
            mo23556r(true);
        }
    }

    /* renamed from: n */
    public final void mo23552n() {
        this.f15397m = 0;
        this.f15400p = -1;
        this.f15398n = -1;
    }

    /* renamed from: o */
    public void mo23553o(int i) {
        if (this.f15394j != i) {
            this.f15394j = i;
            mo23556r(true);
        }
    }

    /* renamed from: p */
    public final void mo23554p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f15395k = refreshRate;
            this.f15396l = (refreshRate * 80) / 100;
            return;
        }
        gk3.m18132i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.f15395k = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f15396l = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (java.lang.Math.abs(r0 - r7.f15391g) >= r1) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        if (r7.f15385a.mo21437c() >= 30) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23555q() {
        /*
            r7 = this;
            int r0 = p000.w67.f19021a
            r1 = 30
            if (r0 < r1) goto L_0x0073
            android.view.Surface r0 = r7.f15389e
            if (r0 != 0) goto L_0x000c
            goto L_0x0073
        L_0x000c:
            i32 r0 = r7.f15385a
            boolean r0 = r0.mo21439e()
            if (r0 == 0) goto L_0x001b
            i32 r0 = r7.f15385a
            float r0 = r0.mo21436b()
            goto L_0x001d
        L_0x001b:
            float r0 = r7.f15390f
        L_0x001d:
            float r2 = r7.f15391g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0024
            return
        L_0x0024:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0061
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0061
            i32 r1 = r7.f15385a
            boolean r1 = r1.mo21439e()
            if (r1 == 0) goto L_0x0049
            i32 r1 = r7.f15385a
            long r1 = r1.mo21438d()
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x0049
            r1 = r6
            goto L_0x004a
        L_0x0049:
            r1 = r5
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L_0x0052
        L_0x0050:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0052:
            float r2 = r7.f15391g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x005f
            goto L_0x006c
        L_0x005f:
            r6 = r5
            goto L_0x006c
        L_0x0061:
            if (r4 == 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            i32 r2 = r7.f15385a
            int r2 = r2.mo21437c()
            if (r2 < r1) goto L_0x005f
        L_0x006c:
            if (r6 == 0) goto L_0x0073
            r7.f15391g = r0
            r7.mo23556r(r5)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.n97.mo23555q():void");
    }

    /* renamed from: r */
    public final void mo23556r(boolean z) {
        Surface surface;
        if (w67.f19021a >= 30 && (surface = this.f15389e) != null && this.f15394j != Integer.MIN_VALUE) {
            float f = Utils.FLOAT_EPSILON;
            if (this.f15388d) {
                float f2 = this.f15391g;
                if (f2 != -1.0f) {
                    f = this.f15393i * f2;
                }
            }
            if (z || this.f15392h != f) {
                this.f15392h = f;
                C2872a.m22885a(surface, f);
            }
        }
    }
}
