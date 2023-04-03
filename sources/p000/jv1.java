package p000;

import android.content.Context;
import android.os.Looper;
import androidx.media3.common.C0778b;
import androidx.media3.common.C0821o;
import androidx.media3.exoplayer.source.C0961d;
import androidx.media3.exoplayer.source.C0973i;
import p000.x81;

/* renamed from: jv1 */
/* compiled from: ExoPlayer */
public interface jv1 extends C0821o {

    /* renamed from: jv1$a */
    /* compiled from: ExoPlayer */
    public interface C2634a {
        /* renamed from: E */
        void mo22088E(boolean z);
    }

    /* renamed from: jv1$b */
    /* compiled from: ExoPlayer */
    public static final class C2635b {

        /* renamed from: A */
        public boolean f13850A;

        /* renamed from: B */
        public boolean f13851B;

        /* renamed from: a */
        public final Context f13852a;

        /* renamed from: b */
        public dh0 f13853b;

        /* renamed from: c */
        public long f13854c;

        /* renamed from: d */
        public rd6<qd5> f13855d;

        /* renamed from: e */
        public rd6<C0973i.C0974a> f13856e;

        /* renamed from: f */
        public rd6<ft6> f13857f;

        /* renamed from: g */
        public rd6<ti3> f13858g;

        /* renamed from: h */
        public rd6<C2332fx> f13859h;

        /* renamed from: i */
        public hd2<dh0, C3142qf> f13860i;

        /* renamed from: j */
        public Looper f13861j;

        /* renamed from: k */
        public hv4 f13862k;

        /* renamed from: l */
        public C0778b f13863l;

        /* renamed from: m */
        public boolean f13864m;

        /* renamed from: n */
        public int f13865n;

        /* renamed from: o */
        public boolean f13866o;

        /* renamed from: p */
        public boolean f13867p;

        /* renamed from: q */
        public int f13868q;

        /* renamed from: r */
        public int f13869r;

        /* renamed from: s */
        public boolean f13870s;

        /* renamed from: t */
        public ys5 f13871t;

        /* renamed from: u */
        public long f13872u;

        /* renamed from: v */
        public long f13873v;

        /* renamed from: w */
        public qi3 f13874w;

        /* renamed from: x */
        public long f13875x;

        /* renamed from: y */
        public long f13876y;

        /* renamed from: z */
        public boolean f13877z;

        public C2635b(Context context) {
            this(context, new kv1(context), new lv1(context));
        }

        /* renamed from: f */
        public static /* synthetic */ qd5 m20407f(Context context) {
            return new l91(context);
        }

        /* renamed from: g */
        public static /* synthetic */ C0973i.C0974a m20408g(Context context) {
            return new C0961d(context, (ny1) new d81());
        }

        /* renamed from: h */
        public static /* synthetic */ ft6 m20409h(Context context) {
            return new na1(context);
        }

        /* renamed from: e */
        public jv1 mo22089e() {
            C2725kr.m20987g(!this.f13851B);
            this.f13851B = true;
            return new ow1(this, (C0821o) null);
        }

        public C2635b(Context context, rd6<qd5> rd6, rd6<C0973i.C0974a> rd62) {
            this(context, rd6, rd62, new mv1(context), new nv1(), new ov1(context), new pv1());
        }

        public C2635b(Context context, rd6<qd5> rd6, rd6<C0973i.C0974a> rd62, rd6<ft6> rd63, rd6<ti3> rd64, rd6<C2332fx> rd65, hd2<dh0, C3142qf> hd2) {
            this.f13852a = context;
            this.f13855d = rd6;
            this.f13856e = rd62;
            this.f13857f = rd63;
            this.f13858g = rd64;
            this.f13859h = rd65;
            this.f13860i = hd2;
            this.f13861j = w67.m29318M();
            this.f13863l = C0778b.f4142s;
            this.f13865n = 0;
            this.f13868q = 1;
            this.f13869r = 0;
            this.f13870s = true;
            this.f13871t = ys5.f20335g;
            this.f13872u = 5000;
            this.f13873v = yt6.DEFAULT_POLLING_FREQUENCY;
            this.f13874w = new x81.C3580b().mo27697a();
            this.f13853b = dh0.f10712a;
            this.f13875x = 500;
            this.f13876y = 2000;
            this.f13850A = true;
        }
    }
}
