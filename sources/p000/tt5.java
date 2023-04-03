package p000;

import androidx.compose.p004ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1;
import androidx.compose.p004ui.semantics.SemanticsPropertyKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b4\u00105R5\u0010\f\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR)\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR)\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000bR5\u0010\u0018\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u00140\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000bR/\u0010\u001c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000bR/\u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\u001d\u0010\u000bR;\u0010!\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001f0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b \u0010\u000bR/\u0010$\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b#\u0010\u000bR)\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b\b\u0010\u000bR)\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\t\u001a\u0004\b\u0011\u0010\u000bR)\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b%\u0010\u000bR)\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001a\u0010\u000bR)\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b+\u0010\u000bR)\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b\u0016\u0010\u000bR)\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\t\u001a\u0004\b'\u0010\u000bR#\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u00066"}, mo44877d2 = {"Ltt5;", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lx7;", "Lkotlin/Function1;", "", "Lxn6;", "", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "g", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "GetTextLayoutResult", "Lkotlin/Function0;", "c", "h", "OnClick", "d", "i", "OnLongClick", "Lkotlin/Function2;", "", "e", "l", "ScrollBy", "", "f", "getScrollToIndex", "ScrollToIndex", "m", "SetProgress", "Lkotlin/Function3;", "n", "SetSelection", "Lrl;", "o", "SetText", "j", "CopyText", "k", "CutText", "PasteText", "Expand", "a", "Collapse", "Dismiss", "p", "RequestFocus", "", "Lvx0;", "q", "CustomActions", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: tt5 */
/* compiled from: SemanticsProperties.kt */
public final class tt5 {

    /* renamed from: a */
    public static final tt5 f18260a = new tt5();

    /* renamed from: b */
    public static final SemanticsPropertyKey<C3574x7<rc2<List<xn6>, Boolean>>> f18261b;

    /* renamed from: c */
    public static final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> f18262c;

    /* renamed from: d */
    public static final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> f18263d;

    /* renamed from: e */
    public static final SemanticsPropertyKey<C3574x7<fd2<Float, Float, Boolean>>> f18264e;

    /* renamed from: f */
    public static final SemanticsPropertyKey<C3574x7<rc2<Integer, Boolean>>> f18265f;

    /* renamed from: g */
    public static final SemanticsPropertyKey<C3574x7<rc2<Float, Boolean>>> f18266g;

    /* renamed from: h */
    public static final SemanticsPropertyKey<C3574x7<id2<Integer, Integer, Boolean, Boolean>>> f18267h;

    /* renamed from: i */
    public static final SemanticsPropertyKey<C3574x7<rc2<C3205rl, Boolean>>> f18268i;

    /* renamed from: j */
    public static final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> f18269j;

    /* renamed from: k */
    public static final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> f18270k;

    /* renamed from: l */
    public static final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> f18271l;

    /* renamed from: m */
    public static final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> f18272m;

    /* renamed from: n */
    public static final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> f18273n;

    /* renamed from: o */
    public static final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> f18274o;

    /* renamed from: p */
    public static final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> f18275p;

    /* renamed from: q */
    public static final SemanticsPropertyKey<List<vx0>> f18276q = new SemanticsPropertyKey<>("CustomActions", (fd2) null, 2, (DefaultConstructorMarker) null);

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = SemanticsPropertiesKt$ActionPropertyKey$1.INSTANCE;
        f18261b = new SemanticsPropertyKey<>("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        f18262c = new SemanticsPropertyKey<>("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        f18263d = new SemanticsPropertyKey<>("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        f18264e = new SemanticsPropertyKey<>("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        f18265f = new SemanticsPropertyKey<>("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$1);
        f18266g = new SemanticsPropertyKey<>("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        f18267h = new SemanticsPropertyKey<>("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        f18268i = new SemanticsPropertyKey<>("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        f18269j = new SemanticsPropertyKey<>("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        f18270k = new SemanticsPropertyKey<>("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        f18271l = new SemanticsPropertyKey<>("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        f18272m = new SemanticsPropertyKey<>("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        f18273n = new SemanticsPropertyKey<>("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        f18274o = new SemanticsPropertyKey<>("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        f18275p = new SemanticsPropertyKey<>("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
    }

    /* renamed from: a */
    public final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> mo26553a() {
        return f18273n;
    }

    /* renamed from: b */
    public final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> mo26554b() {
        return f18269j;
    }

    /* renamed from: c */
    public final SemanticsPropertyKey<List<vx0>> mo26555c() {
        return f18276q;
    }

    /* renamed from: d */
    public final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> mo26556d() {
        return f18270k;
    }

    /* renamed from: e */
    public final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> mo26557e() {
        return f18274o;
    }

    /* renamed from: f */
    public final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> mo26558f() {
        return f18272m;
    }

    /* renamed from: g */
    public final SemanticsPropertyKey<C3574x7<rc2<List<xn6>, Boolean>>> mo26559g() {
        return f18261b;
    }

    /* renamed from: h */
    public final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> mo26560h() {
        return f18262c;
    }

    /* renamed from: i */
    public final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> mo26561i() {
        return f18263d;
    }

    /* renamed from: j */
    public final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> mo26562j() {
        return f18271l;
    }

    /* renamed from: k */
    public final SemanticsPropertyKey<C3574x7<pc2<Boolean>>> mo26563k() {
        return f18275p;
    }

    /* renamed from: l */
    public final SemanticsPropertyKey<C3574x7<fd2<Float, Float, Boolean>>> mo26564l() {
        return f18264e;
    }

    /* renamed from: m */
    public final SemanticsPropertyKey<C3574x7<rc2<Float, Boolean>>> mo26565m() {
        return f18266g;
    }

    /* renamed from: n */
    public final SemanticsPropertyKey<C3574x7<id2<Integer, Integer, Boolean, Boolean>>> mo26566n() {
        return f18267h;
    }

    /* renamed from: o */
    public final SemanticsPropertyKey<C3574x7<rc2<C3205rl, Boolean>>> mo26567o() {
        return f18268i;
    }
}
