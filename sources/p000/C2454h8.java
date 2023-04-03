package p000;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, mo44877d2 = {"Lh8;", "Lb8;", "", "text", "Lr37;", "e", "", "current", "", "a", "b", "Ljava/util/Locale;", "locale", "l", "index", "", "k", "i", "j", "Ljava/text/BreakIterator;", "c", "Ljava/text/BreakIterator;", "impl", "<init>", "(Ljava/util/Locale;)V", "d", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: h8 */
/* compiled from: AccessibilityIterators.android.kt */
public final class C2454h8 extends C1610b8 {

    /* renamed from: d */
    public static final C2455a f12763d = new C2455a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f12764e = 8;

    /* renamed from: f */
    public static C2454h8 f12765f;

    /* renamed from: c */
    public BreakIterator f12766c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo44877d2 = {"Lh8$a;", "", "Ljava/util/Locale;", "locale", "Lh8;", "a", "instance", "Lh8;", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: h8$a */
    /* compiled from: AccessibilityIterators.android.kt */
    public static final class C2455a {
        public C2455a() {
        }

        public /* synthetic */ C2455a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2454h8 mo20985a(Locale locale) {
            vx2.m53591g(locale, "locale");
            if (C2454h8.f12765f == null) {
                C2454h8.f12765f = new C2454h8(locale, (DefaultConstructorMarker) null);
            }
            C2454h8 g = C2454h8.f12765f;
            vx2.m53589e(g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return g;
        }
    }

    public C2454h8(Locale locale) {
        mo20984l(locale);
    }

    public /* synthetic */ C2454h8(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    /* renamed from: a */
    public int[] mo12014a(int i) {
        if (mo11430d().length() <= 0 || i >= mo11430d().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!mo20982j(i) && !mo20983k(i)) {
            BreakIterator breakIterator = this.f12766c;
            if (breakIterator == null) {
                vx2.m53605u("impl");
                breakIterator = null;
            }
            i = breakIterator.following(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f12766c;
        if (breakIterator2 == null) {
            vx2.m53605u("impl");
            breakIterator2 = null;
        }
        int following = breakIterator2.following(i);
        if (following == -1 || !mo20981i(following)) {
            return null;
        }
        return mo11429c(i, following);
    }

    /* renamed from: b */
    public int[] mo12015b(int i) {
        int length = mo11430d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && !mo20982j(i - 1) && !mo20981i(i)) {
            BreakIterator breakIterator = this.f12766c;
            if (breakIterator == null) {
                vx2.m53605u("impl");
                breakIterator = null;
            }
            i = breakIterator.preceding(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f12766c;
        if (breakIterator2 == null) {
            vx2.m53605u("impl");
            breakIterator2 = null;
        }
        int preceding = breakIterator2.preceding(i);
        if (preceding == -1 || !mo20983k(preceding)) {
            return null;
        }
        return mo11429c(preceding, i);
    }

    /* renamed from: e */
    public void mo11431e(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_TEXT);
        super.mo11431e(str);
        BreakIterator breakIterator = this.f12766c;
        if (breakIterator == null) {
            vx2.m53605u("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    /* renamed from: i */
    public final boolean mo20981i(int i) {
        if (i <= 0 || !mo20982j(i - 1) || (i != mo11430d().length() && mo20982j(i))) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo20982j(int i) {
        if (i < 0 || i >= mo11430d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(mo11430d().codePointAt(i));
    }

    /* renamed from: k */
    public final boolean mo20983k(int i) {
        if (!mo20982j(i) || (i != 0 && mo20982j(i - 1))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final void mo20984l(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        vx2.m53590f(wordInstance, "getWordInstance(locale)");
        this.f12766c = wordInstance;
    }
}
