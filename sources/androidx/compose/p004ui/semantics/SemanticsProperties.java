package androidx.compose.p004ui.semantics;

import androidx.compose.p004ui.state.ToggleableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bQ\u0010)R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\r\u0010\bR \u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\u0018\u0010\bR&\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u0012\u0004\b(\u0010)\u001a\u0004\b#\u0010\bR\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b.\u0010\bR\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\bR\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b3\u0010\bR \u00107\u001a\b\u0012\u0004\u0012\u0002050\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b0\u0010\bR\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b8\u0010\bR#\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u00030\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b;\u0010\bR\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\u00028\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b\u0010\u0010\bR \u0010@\u001a\b\u0012\u0004\u0012\u00020>0\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b?\u0010\bR \u0010C\u001a\b\u0012\u0004\u0012\u00020A0\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\b \u0010\bR\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020&0\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b6\u0010\bR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020E0\u00028\u0006¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bB\u0010\bR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00130\u00028\u0006¢\u0006\f\n\u0004\bH\u0010\u0006\u001a\u0004\b,\u0010\bR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010\u0006\u001a\u0004\b\u0014\u0010\bR)\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020M0L0\u00028\u0006¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, mo44877d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "c", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "ContentDescription", "s", "StateDescription", "Lmw4;", "d", "o", "ProgressBarRangeInfo", "e", "m", "PaneTitle", "Lr37;", "f", "q", "SelectableGroup", "Lgj0;", "g", "a", "CollectionInfo", "Lhj0;", "h", "CollectionItemInfo", "i", "Heading", "j", "Disabled", "Lri3;", "k", "l", "LiveRegion", "", "Focused", "getInvisibleToUser$annotations", "()V", "InvisibleToUser", "Lrn5;", "n", "HorizontalScrollAxisRange", "x", "VerticalScrollAxisRange", "p", "getIsPopup", "IsPopup", "getIsDialog", "IsDialog", "Lhh5;", "r", "Role", "t", "TestTag", "Lrl;", "u", "Text", "EditableText", "Lao6;", "v", "TextSelectionRange", "Lis2;", "w", "ImeAction", "Selected", "Landroidx/compose/ui/state/ToggleableState;", "y", "ToggleableState", "z", "Password", "A", "Error", "Lkotlin/Function1;", "", "B", "getIndexForKey", "IndexForKey", "<init>", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.semantics.SemanticsProperties */
/* compiled from: SemanticsProperties.kt */
public final class SemanticsProperties {

    /* renamed from: A */
    public static final SemanticsPropertyKey<String> f2123A = new SemanticsPropertyKey<>("Error", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: B */
    public static final SemanticsPropertyKey<rc2<Object, Integer>> f2124B = new SemanticsPropertyKey<>("IndexForKey", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: a */
    public static final SemanticsProperties f2125a = new SemanticsProperties();

    /* renamed from: b */
    public static final SemanticsPropertyKey<List<String>> f2126b = new SemanticsPropertyKey<>("ContentDescription", SemanticsProperties$ContentDescription$1.INSTANCE);

    /* renamed from: c */
    public static final SemanticsPropertyKey<String> f2127c = new SemanticsPropertyKey<>("StateDescription", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final SemanticsPropertyKey<mw4> f2128d = new SemanticsPropertyKey<>("ProgressBarRangeInfo", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final SemanticsPropertyKey<String> f2129e = new SemanticsPropertyKey<>("PaneTitle", SemanticsProperties$PaneTitle$1.INSTANCE);

    /* renamed from: f */
    public static final SemanticsPropertyKey<r37> f2130f = new SemanticsPropertyKey<>("SelectableGroup", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final SemanticsPropertyKey<gj0> f2131g = new SemanticsPropertyKey<>("CollectionInfo", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: h */
    public static final SemanticsPropertyKey<hj0> f2132h = new SemanticsPropertyKey<>("CollectionItemInfo", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: i */
    public static final SemanticsPropertyKey<r37> f2133i = new SemanticsPropertyKey<>("Heading", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: j */
    public static final SemanticsPropertyKey<r37> f2134j = new SemanticsPropertyKey<>("Disabled", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: k */
    public static final SemanticsPropertyKey<ri3> f2135k = new SemanticsPropertyKey<>("LiveRegion", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: l */
    public static final SemanticsPropertyKey<Boolean> f2136l = new SemanticsPropertyKey<>("Focused", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: m */
    public static final SemanticsPropertyKey<r37> f2137m = new SemanticsPropertyKey<>("InvisibleToUser", SemanticsProperties$InvisibleToUser$1.INSTANCE);

    /* renamed from: n */
    public static final SemanticsPropertyKey<rn5> f2138n = new SemanticsPropertyKey<>("HorizontalScrollAxisRange", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: o */
    public static final SemanticsPropertyKey<rn5> f2139o = new SemanticsPropertyKey<>("VerticalScrollAxisRange", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: p */
    public static final SemanticsPropertyKey<r37> f2140p = new SemanticsPropertyKey<>("IsPopup", SemanticsProperties$IsPopup$1.INSTANCE);

    /* renamed from: q */
    public static final SemanticsPropertyKey<r37> f2141q = new SemanticsPropertyKey<>("IsDialog", SemanticsProperties$IsDialog$1.INSTANCE);

    /* renamed from: r */
    public static final SemanticsPropertyKey<hh5> f2142r = new SemanticsPropertyKey<>("Role", SemanticsProperties$Role$1.INSTANCE);

    /* renamed from: s */
    public static final SemanticsPropertyKey<String> f2143s = new SemanticsPropertyKey<>("TestTag", SemanticsProperties$TestTag$1.INSTANCE);

    /* renamed from: t */
    public static final SemanticsPropertyKey<List<C3205rl>> f2144t = new SemanticsPropertyKey<>("Text", SemanticsProperties$Text$1.INSTANCE);

    /* renamed from: u */
    public static final SemanticsPropertyKey<C3205rl> f2145u = new SemanticsPropertyKey<>("EditableText", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: v */
    public static final SemanticsPropertyKey<ao6> f2146v = new SemanticsPropertyKey<>("TextSelectionRange", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final SemanticsPropertyKey<is2> f2147w = new SemanticsPropertyKey<>("ImeAction", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final SemanticsPropertyKey<Boolean> f2148x = new SemanticsPropertyKey<>("Selected", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: y */
    public static final SemanticsPropertyKey<ToggleableState> f2149y = new SemanticsPropertyKey<>("ToggleableState", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: z */
    public static final SemanticsPropertyKey<r37> f2150z = new SemanticsPropertyKey<>("Password", (fd2) null, 2, (DefaultConstructorMarker) null);

    /* renamed from: a */
    public final SemanticsPropertyKey<gj0> mo4022a() {
        return f2131g;
    }

    /* renamed from: b */
    public final SemanticsPropertyKey<hj0> mo4023b() {
        return f2132h;
    }

    /* renamed from: c */
    public final SemanticsPropertyKey<List<String>> mo4024c() {
        return f2126b;
    }

    /* renamed from: d */
    public final SemanticsPropertyKey<r37> mo4025d() {
        return f2134j;
    }

    /* renamed from: e */
    public final SemanticsPropertyKey<C3205rl> mo4026e() {
        return f2145u;
    }

    /* renamed from: f */
    public final SemanticsPropertyKey<String> mo4027f() {
        return f2123A;
    }

    /* renamed from: g */
    public final SemanticsPropertyKey<Boolean> mo4028g() {
        return f2136l;
    }

    /* renamed from: h */
    public final SemanticsPropertyKey<r37> mo4029h() {
        return f2133i;
    }

    /* renamed from: i */
    public final SemanticsPropertyKey<rn5> mo4030i() {
        return f2138n;
    }

    /* renamed from: j */
    public final SemanticsPropertyKey<is2> mo4031j() {
        return f2147w;
    }

    /* renamed from: k */
    public final SemanticsPropertyKey<r37> mo4032k() {
        return f2137m;
    }

    /* renamed from: l */
    public final SemanticsPropertyKey<ri3> mo4033l() {
        return f2135k;
    }

    /* renamed from: m */
    public final SemanticsPropertyKey<String> mo4034m() {
        return f2129e;
    }

    /* renamed from: n */
    public final SemanticsPropertyKey<r37> mo4035n() {
        return f2150z;
    }

    /* renamed from: o */
    public final SemanticsPropertyKey<mw4> mo4036o() {
        return f2128d;
    }

    /* renamed from: p */
    public final SemanticsPropertyKey<hh5> mo4037p() {
        return f2142r;
    }

    /* renamed from: q */
    public final SemanticsPropertyKey<r37> mo4038q() {
        return f2130f;
    }

    /* renamed from: r */
    public final SemanticsPropertyKey<Boolean> mo4039r() {
        return f2148x;
    }

    /* renamed from: s */
    public final SemanticsPropertyKey<String> mo4040s() {
        return f2127c;
    }

    /* renamed from: t */
    public final SemanticsPropertyKey<String> mo4041t() {
        return f2143s;
    }

    /* renamed from: u */
    public final SemanticsPropertyKey<List<C3205rl>> mo4042u() {
        return f2144t;
    }

    /* renamed from: v */
    public final SemanticsPropertyKey<ao6> mo4043v() {
        return f2146v;
    }

    /* renamed from: w */
    public final SemanticsPropertyKey<ToggleableState> mo4044w() {
        return f2149y;
    }

    /* renamed from: x */
    public final SemanticsPropertyKey<rn5> mo4045x() {
        return f2139o;
    }
}
