package p000;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B¶\u0001\b\u0000\u0012\u0006\u0010+\u001a\u00020'\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\\ø\u0001\u0001¢\u0006\u0004\b^\u0010_B¬\u0001\b\u0016\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dø\u0001\u0001¢\u0006\u0004\b^\u0010`J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0002J³\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\"\u0010#J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020\u0011H\u0016R\u001a\u0010+\u001a\u00020'8\u0000X\u0004¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b)\u0010*R \u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010\u0013\u001a\u00020\u00078\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\bD\u0010/R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bB\u0010E\u001a\u0004\b8\u0010FR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b.\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b6\u0010J\u001a\u0004\bK\u0010LR \u0010\u001a\u001a\u00020\u00058\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b4\u0010/R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b2\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bD\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010\u0006\u001a\u00020\u00058Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b@\u0010/R\u001c\u0010W\u001a\u0004\u0018\u00010S8GX\u0004¢\u0006\f\u0012\u0004\bU\u0010V\u001a\u0004\b<\u0010TR\u001a\u0010[\u001a\u00020X8GX\u0004¢\u0006\f\u0012\u0004\bZ\u0010V\u001a\u0004\b0\u0010Y\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006a"}, mo44877d2 = {"Lc66;", "", "other", "", "t", "Luk0;", "color", "Lgo6;", "fontSize", "Lr72;", "fontWeight", "Ln72;", "fontStyle", "Lo72;", "fontSynthesis", "Lz62;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Lsz;", "baselineShift", "Lqn6;", "textGeometricTransform", "Lsj3;", "localeList", "background", "Lfn6;", "textDecoration", "Lnz5;", "shadow", "a", "(JJLr72;Ln72;Lo72;Lz62;Ljava/lang/String;JLsz;Lqn6;Lsj3;JLfn6;Lnz5;)Lc66;", "equals", "s", "(Lc66;)Z", "", "hashCode", "toString", "Lnn6;", "Lnn6;", "getTextForegroundStyle$ui_text_release", "()Lnn6;", "textForegroundStyle", "b", "J", "j", "()J", "c", "Lr72;", "m", "()Lr72;", "d", "Ln72;", "k", "()Ln72;", "e", "Lo72;", "l", "()Lo72;", "f", "Lz62;", "h", "()Lz62;", "g", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "n", "Lsz;", "()Lsz;", "Lqn6;", "r", "()Lqn6;", "Lsj3;", "o", "()Lsj3;", "Lfn6;", "q", "()Lfn6;", "Lnz5;", "p", "()Lnz5;", "Li40;", "()Li40;", "getBrush$annotations", "()V", "brush", "", "()F", "getAlpha$annotations", "alpha", "Lqp4;", "platformStyle", "<init>", "(Lnn6;JLr72;Ln72;Lo72;Lz62;Ljava/lang/String;JLsz;Lqn6;Lsj3;JLfn6;Lnz5;Lqp4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLr72;Ln72;Lo72;Lz62;Ljava/lang/String;JLsz;Lqn6;Lsj3;JLfn6;Lnz5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: c66 */
/* compiled from: SpanStyle.kt */
public final class c66 {

    /* renamed from: a */
    public final nn6 f8349a;

    /* renamed from: b */
    public final long f8350b;

    /* renamed from: c */
    public final r72 f8351c;

    /* renamed from: d */
    public final n72 f8352d;

    /* renamed from: e */
    public final o72 f8353e;

    /* renamed from: f */
    public final z62 f8354f;

    /* renamed from: g */
    public final String f8355g;

    /* renamed from: h */
    public final long f8356h;

    /* renamed from: i */
    public final C3313sz f8357i;

    /* renamed from: j */
    public final qn6 f8358j;

    /* renamed from: k */
    public final sj3 f8359k;

    /* renamed from: l */
    public final long f8360l;

    /* renamed from: m */
    public final fn6 f8361m;

    /* renamed from: n */
    public final nz5 f8362n;

    public /* synthetic */ c66(long j, long j2, r72 r72, n72 n72, o72 o72, z62 z62, String str, long j3, C3313sz szVar, qn6 qn6, sj3 sj3, long j4, fn6 fn6, nz5 nz5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, r72, n72, o72, z62, str, j3, szVar, qn6, sj3, j4, fn6, nz5);
    }

    public c66(nn6 nn6, long j, r72 r72, n72 n72, o72 o72, z62 z62, String str, long j2, C3313sz szVar, qn6 qn6, sj3 sj3, long j3, fn6 fn6, nz5 nz5, qp4 qp4) {
        this.f8349a = nn6;
        this.f8350b = j;
        this.f8351c = r72;
        this.f8352d = n72;
        this.f8353e = o72;
        this.f8354f = z62;
        this.f8355g = str;
        this.f8356h = j2;
        this.f8357i = szVar;
        this.f8358j = qn6;
        this.f8359k = sj3;
        this.f8360l = j3;
        this.f8361m = fn6;
        this.f8362n = nz5;
    }

    public /* synthetic */ c66(nn6 nn6, long j, r72 r72, n72 n72, o72 o72, z62 z62, String str, long j2, C3313sz szVar, qn6 qn6, sj3 sj3, long j3, fn6 fn6, nz5 nz5, qp4 qp4, DefaultConstructorMarker defaultConstructorMarker) {
        this(nn6, j, r72, n72, o72, z62, str, j2, szVar, qn6, sj3, j3, fn6, nz5, qp4);
    }

    /* renamed from: b */
    public static /* synthetic */ c66 m11723b(c66 c66, long j, long j2, r72 r72, n72 n72, o72 o72, z62 z62, String str, long j3, C3313sz szVar, qn6 qn6, sj3 sj3, long j4, fn6 fn6, nz5 nz5, int i, Object obj) {
        c66 c662 = c66;
        int i2 = i;
        return c66.mo11988a((i2 & 1) != 0 ? c66.mo11994g() : j, (i2 & 2) != 0 ? c662.f8350b : j2, (i2 & 4) != 0 ? c662.f8351c : r72, (i2 & 8) != 0 ? c662.f8352d : n72, (i2 & 16) != 0 ? c662.f8353e : o72, (i2 & 32) != 0 ? c662.f8354f : z62, (i2 & 64) != 0 ? c662.f8355g : str, (i2 & 128) != 0 ? c662.f8356h : j3, (i2 & 256) != 0 ? c662.f8357i : szVar, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? c662.f8358j : qn6, (i2 & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 0 ? c662.f8359k : sj3, (i2 & 2048) != 0 ? c662.f8360l : j4, (i2 & 4096) != 0 ? c662.f8361m : fn6, (i2 & 8192) != 0 ? c662.f8362n : nz5);
    }

    /* renamed from: a */
    public final c66 mo11988a(long j, long j2, r72 r72, n72 n72, o72 o72, z62 z62, String str, long j3, C3313sz szVar, qn6 qn6, sj3 sj3, long j4, fn6 fn6, nz5 nz5) {
        nn6 nn6;
        long j5 = j;
        if (uk0.m28331h(j5, mo11994g())) {
            nn6 = this.f8349a;
        } else {
            nn6 = nn6.f15629a.mo23755a(j5);
        }
        return new c66(nn6, j2, r72, n72, o72, z62, str, j3, szVar, qn6, sj3, j4, fn6, nz5, (qp4) null, (DefaultConstructorMarker) null);
    }

    /* renamed from: c */
    public final float mo11989c() {
        return this.f8349a.mo19954b();
    }

    /* renamed from: d */
    public final long mo11990d() {
        return this.f8360l;
    }

    /* renamed from: e */
    public final C3313sz mo11991e() {
        return this.f8357i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c66)) {
            return false;
        }
        c66 c66 = (c66) obj;
        if (!mo12007s(c66) || !mo12008t(c66)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final i40 mo11993f() {
        this.f8349a.mo19955c();
        return null;
    }

    /* renamed from: g */
    public final long mo11994g() {
        return this.f8349a.mo19953a();
    }

    /* renamed from: h */
    public final z62 mo11995h() {
        return this.f8354f;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        mo11993f();
        int n = ((((((uk0.m28337n(mo11994g()) * 31) + 0) * 31) + Float.floatToIntBits(mo11989c())) * 31) + go6.m18279i(this.f8350b)) * 31;
        r72 r72 = this.f8351c;
        if (r72 != null) {
            i = r72.hashCode();
        } else {
            i = 0;
        }
        int i11 = (n + i) * 31;
        n72 n72 = this.f8352d;
        if (n72 != null) {
            i2 = n72.m22834f(n72.mo23529h());
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 31;
        o72 o72 = this.f8353e;
        if (o72 != null) {
            i3 = o72.m23697e(o72.mo23911i());
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 31;
        z62 z62 = this.f8354f;
        if (z62 != null) {
            i4 = z62.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 31;
        String str = this.f8355g;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (((i14 + i5) * 31) + go6.m18279i(this.f8356h)) * 31;
        C3313sz szVar = this.f8357i;
        if (szVar != null) {
            i6 = C3313sz.m27201d(szVar.mo25999f());
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 31;
        qn6 qn6 = this.f8358j;
        if (qn6 != null) {
            i7 = qn6.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 31;
        sj3 sj3 = this.f8359k;
        if (sj3 != null) {
            i8 = sj3.hashCode();
        } else {
            i8 = 0;
        }
        int n2 = (((i17 + i8) * 31) + uk0.m28337n(this.f8360l)) * 31;
        fn6 fn6 = this.f8361m;
        if (fn6 != null) {
            i9 = fn6.hashCode();
        } else {
            i9 = 0;
        }
        int i18 = (n2 + i9) * 31;
        nz5 nz5 = this.f8362n;
        if (nz5 != null) {
            i10 = nz5.hashCode();
        } else {
            i10 = 0;
        }
        return ((i18 + i10) * 31) + 0;
    }

    /* renamed from: i */
    public final String mo11997i() {
        return this.f8355g;
    }

    /* renamed from: j */
    public final long mo11998j() {
        return this.f8350b;
    }

    /* renamed from: k */
    public final n72 mo11999k() {
        return this.f8352d;
    }

    /* renamed from: l */
    public final o72 mo12000l() {
        return this.f8353e;
    }

    /* renamed from: m */
    public final r72 mo12001m() {
        return this.f8351c;
    }

    /* renamed from: n */
    public final long mo12002n() {
        return this.f8356h;
    }

    /* renamed from: o */
    public final sj3 mo12003o() {
        return this.f8359k;
    }

    /* renamed from: p */
    public final nz5 mo12004p() {
        return this.f8362n;
    }

    /* renamed from: q */
    public final fn6 mo12005q() {
        return this.f8361m;
    }

    /* renamed from: r */
    public final qn6 mo12006r() {
        return this.f8358j;
    }

    /* renamed from: s */
    public final boolean mo12007s(c66 c66) {
        vx2.m53591g(c66, "other");
        if (this == c66) {
            return true;
        }
        if (go6.m18275e(this.f8350b, c66.f8350b) && vx2.m53586b(this.f8351c, c66.f8351c) && vx2.m53586b(this.f8352d, c66.f8352d) && vx2.m53586b(this.f8353e, c66.f8353e) && vx2.m53586b(this.f8354f, c66.f8354f) && vx2.m53586b(this.f8355g, c66.f8355g) && go6.m18275e(this.f8356h, c66.f8356h) && vx2.m53586b(this.f8357i, c66.f8357i) && vx2.m53586b(this.f8358j, c66.f8358j) && vx2.m53586b(this.f8359k, c66.f8359k) && uk0.m28331h(this.f8360l, c66.f8360l) && vx2.m53586b((Object) null, (Object) null)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean mo12008t(c66 c66) {
        if (vx2.m53586b(this.f8349a, c66.f8349a) && vx2.m53586b(this.f8361m, c66.f8361m) && vx2.m53586b(this.f8362n, c66.f8362n)) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SpanStyle(color=");
        sb.append(uk0.m28338o(mo11994g()));
        sb.append(", brush=");
        mo11993f();
        sb.append((Object) null);
        sb.append(", alpha=");
        sb.append(mo11989c());
        sb.append(", fontSize=");
        sb.append(go6.m18280j(this.f8350b));
        sb.append(", fontWeight=");
        sb.append(this.f8351c);
        sb.append(", fontStyle=");
        sb.append(this.f8352d);
        sb.append(", fontSynthesis=");
        sb.append(this.f8353e);
        sb.append(", fontFamily=");
        sb.append(this.f8354f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f8355g);
        sb.append(", letterSpacing=");
        sb.append(go6.m18280j(this.f8356h));
        sb.append(", baselineShift=");
        sb.append(this.f8357i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f8358j);
        sb.append(", localeList=");
        sb.append(this.f8359k);
        sb.append(", background=");
        sb.append(uk0.m28338o(this.f8360l));
        sb.append(", textDecoration=");
        sb.append(this.f8361m);
        sb.append(", shadow=");
        sb.append(this.f8362n);
        sb.append(", platformStyle=");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c66(long r20, long r22, p000.r72 r24, p000.n72 r25, p000.o72 r26, p000.z62 r27, java.lang.String r28, long r29, p000.C3313sz r31, p000.qn6 r32, p000.sj3 r33, long r34, p000.fn6 r36, p000.nz5 r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r19 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000d
            uk0$a r1 = p000.uk0.f18515b
            long r1 = r1.mo26824d()
            goto L_0x000f
        L_0x000d:
            r1 = r20
        L_0x000f:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x001a
            go6$a r3 = p000.go6.f12519b
            long r3 = r3.mo20729a()
            goto L_0x001c
        L_0x001a:
            r3 = r22
        L_0x001c:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r24
        L_0x0024:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x002a
            r7 = 0
            goto L_0x002c
        L_0x002a:
            r7 = r25
        L_0x002c:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = r26
        L_0x0034:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x003a
            r9 = 0
            goto L_0x003c
        L_0x003a:
            r9 = r27
        L_0x003c:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0042
            r10 = 0
            goto L_0x0044
        L_0x0042:
            r10 = r28
        L_0x0044:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004f
            go6$a r11 = p000.go6.f12519b
            long r11 = r11.mo20729a()
            goto L_0x0051
        L_0x004f:
            r11 = r29
        L_0x0051:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0057
            r13 = 0
            goto L_0x0059
        L_0x0057:
            r13 = r31
        L_0x0059:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005f
            r14 = 0
            goto L_0x0061
        L_0x005f:
            r14 = r32
        L_0x0061:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0067
            r15 = 0
            goto L_0x0069
        L_0x0067:
            r15 = r33
        L_0x0069:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0074
            uk0$a r6 = p000.uk0.f18515b
            long r16 = r6.mo26824d()
            goto L_0x0076
        L_0x0074:
            r16 = r34
        L_0x0076:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x007c
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r36
        L_0x007e:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0084
            r0 = 0
            goto L_0x0086
        L_0x0084:
            r0 = r37
        L_0x0086:
            r18 = 0
            r39 = r18
            r20 = r19
            r21 = r1
            r23 = r3
            r25 = r5
            r26 = r7
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r16
            r37 = r6
            r38 = r0
            r20.<init>((long) r21, (long) r23, (p000.r72) r25, (p000.n72) r26, (p000.o72) r27, (p000.z62) r28, (java.lang.String) r29, (long) r30, (p000.C3313sz) r32, (p000.qn6) r33, (p000.sj3) r34, (long) r35, (p000.fn6) r37, (p000.nz5) r38, (kotlin.jvm.internal.DefaultConstructorMarker) r39)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.c66.<init>(long, long, r72, n72, o72, z62, java.lang.String, long, sz, qn6, sj3, long, fn6, nz5, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c66(long j, long j2, r72 r72, n72 n72, o72 o72, z62 z62, String str, long j3, C3313sz szVar, qn6 qn6, sj3 sj3, long j4, fn6 fn6, nz5 nz5) {
        this(nn6.f15629a.mo23755a(j), j2, r72, n72, o72, z62, str, j3, szVar, qn6, sj3, j4, fn6, nz5, (qp4) null, (DefaultConstructorMarker) null);
        long j5 = j2;
    }
}
