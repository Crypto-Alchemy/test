package p000;

import android.graphics.Typeface;
import android.os.Handler;
import p000.l72;
import p000.s72;

/* renamed from: r90 */
/* compiled from: CallbackWithHandler */
public class r90 {

    /* renamed from: a */
    public final s72.C3251c f17214a;

    /* renamed from: b */
    public final Handler f17215b;

    /* renamed from: r90$a */
    /* compiled from: CallbackWithHandler */
    public class C3189a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ s72.C3251c f17216a;

        /* renamed from: d */
        public final /* synthetic */ Typeface f17217d;

        public C3189a(s72.C3251c cVar, Typeface typeface) {
            this.f17216a = cVar;
            this.f17217d = typeface;
        }

        public void run() {
            this.f17216a.mo20336b(this.f17217d);
        }
    }

    /* renamed from: r90$b */
    /* compiled from: CallbackWithHandler */
    public class C3190b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ s72.C3251c f17219a;

        /* renamed from: d */
        public final /* synthetic */ int f17220d;

        public C3190b(s72.C3251c cVar, int i) {
            this.f17219a = cVar;
            this.f17220d = i;
        }

        public void run() {
            this.f17219a.mo20335a(this.f17220d);
        }
    }

    public r90(s72.C3251c cVar, Handler handler) {
        this.f17214a = cVar;
        this.f17215b = handler;
    }

    /* renamed from: a */
    public final void mo25352a(int i) {
        this.f17215b.post(new C3190b(this.f17214a, i));
    }

    /* renamed from: b */
    public void mo25353b(l72.C2747e eVar) {
        if (eVar.mo22676a()) {
            mo25354c(eVar.f14442a);
        } else {
            mo25352a(eVar.f14443b);
        }
    }

    /* renamed from: c */
    public final void mo25354c(Typeface typeface) {
        this.f17215b.post(new C3189a(this.f17214a, typeface));
    }
}
