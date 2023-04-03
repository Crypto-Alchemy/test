package p000;

import android.net.Uri;
import androidx.media3.common.C0792h;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import p000.dt5;

/* renamed from: xd5 */
/* compiled from: Representation */
public abstract class xd5 {

    /* renamed from: a */
    public final long f19809a;

    /* renamed from: b */
    public final C0792h f19810b;

    /* renamed from: c */
    public final ImmutableList<C3018oz> f19811c;

    /* renamed from: d */
    public final long f19812d;

    /* renamed from: e */
    public final List<sc1> f19813e;

    /* renamed from: f */
    public final List<sc1> f19814f;

    /* renamed from: g */
    public final List<sc1> f19815g;

    /* renamed from: h */
    public final b75 f19816h;

    /* renamed from: xd5$b */
    /* compiled from: Representation */
    public static class C3593b extends xd5 implements h11 {

        /* renamed from: i */
        public final dt5.C2197a f19817i;

        public C3593b(long j, C0792h hVar, List<C3018oz> list, dt5.C2197a aVar, List<sc1> list2, List<sc1> list3, List<sc1> list4) {
            super(j, hVar, list, aVar, list2, list3, list4);
            this.f19817i = aVar;
        }

        /* renamed from: a */
        public String mo27724a() {
            return null;
        }

        /* renamed from: b */
        public h11 mo27725b() {
            return this;
        }

        /* renamed from: c */
        public long mo20916c(long j) {
            return this.f19817i.mo18938j(j);
        }

        /* renamed from: d */
        public long mo20917d(long j, long j2) {
            return this.f19817i.mo18936h(j, j2);
        }

        /* renamed from: e */
        public long mo20918e(long j, long j2) {
            return this.f19817i.mo18932d(j, j2);
        }

        /* renamed from: f */
        public long mo20919f(long j, long j2) {
            return this.f19817i.mo18934f(j, j2);
        }

        /* renamed from: g */
        public b75 mo20920g(long j) {
            return this.f19817i.mo18939k(this, j);
        }

        /* renamed from: h */
        public long mo20921h(long j, long j2) {
            return this.f19817i.mo18937i(j, j2);
        }

        /* renamed from: i */
        public long mo20922i(long j) {
            return this.f19817i.mo18935g(j);
        }

        /* renamed from: j */
        public boolean mo20923j() {
            return this.f19817i.mo18940l();
        }

        /* renamed from: k */
        public long mo20924k() {
            return this.f19817i.mo18933e();
        }

        /* renamed from: l */
        public long mo20925l(long j, long j2) {
            return this.f19817i.mo18931c(j, j2);
        }

        /* renamed from: m */
        public b75 mo27726m() {
            return null;
        }
    }

    /* renamed from: xd5$c */
    /* compiled from: Representation */
    public static class C3594c extends xd5 {

        /* renamed from: i */
        public final Uri f19818i;

        /* renamed from: j */
        public final long f19819j;

        /* renamed from: k */
        public final String f19820k;

        /* renamed from: l */
        public final b75 f19821l;

        /* renamed from: m */
        public final o36 f19822m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3594c(long j, C0792h hVar, List<C3018oz> list, dt5.C2201e eVar, List<sc1> list2, List<sc1> list3, List<sc1> list4, String str, long j2) {
            super(j, hVar, list, eVar, list2, list3, list4);
            o36 o36;
            List<C3018oz> list5 = list;
            this.f19818i = Uri.parse(list.get(0).f16254a);
            b75 c = eVar.mo18943c();
            this.f19821l = c;
            this.f19820k = str;
            this.f19819j = j2;
            if (c != null) {
                o36 = null;
            } else {
                o36 = new o36(new b75((String) null, 0, j2));
            }
            this.f19822m = o36;
        }

        /* renamed from: a */
        public String mo27724a() {
            return this.f19820k;
        }

        /* renamed from: b */
        public h11 mo27725b() {
            return this.f19822m;
        }

        /* renamed from: m */
        public b75 mo27726m() {
            return this.f19821l;
        }
    }

    /* renamed from: o */
    public static xd5 m30036o(long j, C0792h hVar, List<C3018oz> list, dt5 dt5, List<sc1> list2, List<sc1> list3, List<sc1> list4, String str) {
        dt5 dt52 = dt5;
        if (dt52 instanceof dt5.C2201e) {
            return new C3594c(j, hVar, list, (dt5.C2201e) dt52, list2, list3, list4, str, -1);
        } else if (dt52 instanceof dt5.C2197a) {
            return new C3593b(j, hVar, list, (dt5.C2197a) dt52, list2, list3, list4);
        } else {
            throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        }
    }

    /* renamed from: a */
    public abstract String mo27724a();

    /* renamed from: b */
    public abstract h11 mo27725b();

    /* renamed from: m */
    public abstract b75 mo27726m();

    /* renamed from: n */
    public b75 mo27727n() {
        return this.f19816h;
    }

    public xd5(long j, C0792h hVar, List<C3018oz> list, dt5 dt5, List<sc1> list2, List<sc1> list3, List<sc1> list4) {
        List<sc1> list5;
        C2725kr.m20981a(!list.isEmpty());
        this.f19809a = j;
        this.f19810b = hVar;
        this.f19811c = ImmutableList.copyOf(list);
        if (list2 == null) {
            list5 = Collections.emptyList();
        } else {
            list5 = Collections.unmodifiableList(list2);
        }
        this.f19813e = list5;
        this.f19814f = list3;
        this.f19815g = list4;
        this.f19816h = dt5.mo18929a(this);
        this.f19812d = dt5.mo18930b();
    }
}
