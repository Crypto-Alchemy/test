package p000;

import android.graphics.Canvas;
import android.view.MotionEvent;

/* renamed from: aj1 */
/* compiled from: DrawController */
public class aj1 {

    /* renamed from: a */
    public c87 f20957a;

    /* renamed from: b */
    public dk1 f20958b;

    /* renamed from: c */
    public zt2 f20959c;

    /* renamed from: d */
    public C3817b f20960d;

    /* renamed from: aj1$a */
    /* compiled from: DrawController */
    public static /* synthetic */ class C3816a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20961a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.rd.animation.type.AnimationType[] r0 = com.p011rd.animation.type.AnimationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20961a = r0
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20961a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.COLOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20961a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.SCALE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20961a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.WORM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f20961a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.SLIDE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f20961a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.FILL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f20961a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.THIN_WORM     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f20961a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.DROP     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f20961a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.SWAP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f20961a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.rd.animation.type.AnimationType r1 = com.p011rd.animation.type.AnimationType.SCALE_DOWN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.aj1.C3816a.<clinit>():void");
        }
    }

    /* renamed from: aj1$b */
    /* compiled from: DrawController */
    public interface C3817b {
        /* renamed from: a */
        void mo28997a(int i);
    }

    public aj1(zt2 zt2) {
        this.f20959c = zt2;
        this.f20958b = new dk1(zt2);
    }

    /* renamed from: a */
    public void mo28990a(Canvas canvas) {
        int c = this.f20959c.mo49947c();
        for (int i = 0; i < c; i++) {
            mo28991b(canvas, i, qt0.m50861g(this.f20959c, i), qt0.m50862h(this.f20959c, i));
        }
    }

    /* renamed from: b */
    public final void mo28991b(Canvas canvas, int i, int i2, int i3) {
        boolean z;
        boolean z2 = this.f20959c.mo49970z();
        int q = this.f20959c.mo49961q();
        int r = this.f20959c.mo49962r();
        int f = this.f20959c.mo49950f();
        boolean z3 = true;
        if (z2 || !(i == q || i == f)) {
            z = false;
        } else {
            z = true;
        }
        if (!z2 || !(i == q || i == r)) {
            z3 = false;
        }
        boolean z4 = z | z3;
        this.f20958b.mo41942k(i, i2, i3);
        if (this.f20957a == null || !z4) {
            this.f20958b.mo41932a(canvas, z4);
        } else {
            mo28992c(canvas);
        }
    }

    /* renamed from: c */
    public final void mo28992c(Canvas canvas) {
        switch (C3816a.f20961a[this.f20959c.mo49946b().ordinal()]) {
            case 1:
                this.f20958b.mo41932a(canvas, true);
                return;
            case 2:
                this.f20958b.mo41933b(canvas, this.f20957a);
                return;
            case 3:
                this.f20958b.mo41936e(canvas, this.f20957a);
                return;
            case 4:
                this.f20958b.mo41941j(canvas, this.f20957a);
                return;
            case 5:
                this.f20958b.mo41938g(canvas, this.f20957a);
                return;
            case 6:
                this.f20958b.mo41935d(canvas, this.f20957a);
                return;
            case 7:
                this.f20958b.mo41940i(canvas, this.f20957a);
                return;
            case 8:
                this.f20958b.mo41934c(canvas, this.f20957a);
                return;
            case 9:
                this.f20958b.mo41939h(canvas, this.f20957a);
                return;
            case 10:
                this.f20958b.mo41937f(canvas, this.f20957a);
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    public final void mo28993d(float f, float f2) {
        int d;
        if (this.f20960d != null && (d = qt0.m50858d(this.f20959c, f, f2)) >= 0) {
            this.f20960d.mo28997a(d);
        }
    }

    /* renamed from: e */
    public void mo28994e(C3817b bVar) {
        this.f20960d = bVar;
    }

    /* renamed from: f */
    public void mo28995f(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            mo28993d(motionEvent.getX(), motionEvent.getY());
        }
    }

    /* renamed from: g */
    public void mo28996g(c87 c87) {
        this.f20957a = c87;
    }
}
