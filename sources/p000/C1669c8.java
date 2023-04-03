package p000;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00142\u00020\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, mo44877d2 = {"Lc8;", "Lb8;", "", "text", "Lr37;", "e", "", "current", "", "a", "b", "Ljava/util/Locale;", "locale", "i", "Ljava/text/BreakIterator;", "c", "Ljava/text/BreakIterator;", "impl", "<init>", "(Ljava/util/Locale;)V", "d", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: c8 */
/* compiled from: AccessibilityIterators.android.kt */
public class C1669c8 extends C1610b8 {

    /* renamed from: d */
    public static final C1670a f8363d = new C1670a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f8364e = 8;

    /* renamed from: f */
    public static C1669c8 f8365f;

    /* renamed from: c */
    public BreakIterator f8366c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo44877d2 = {"Lc8$a;", "", "Ljava/util/Locale;", "locale", "Lc8;", "a", "instance", "Lc8;", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: c8$a */
    /* compiled from: AccessibilityIterators.android.kt */
    public static final class C1670a {
        public C1670a() {
        }

        public /* synthetic */ C1670a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C1669c8 mo12017a(Locale locale) {
            vx2.m53591g(locale, "locale");
            if (C1669c8.f8365f == null) {
                C1669c8.f8365f = new C1669c8(locale, (DefaultConstructorMarker) null);
            }
            C1669c8 g = C1669c8.f8365f;
            vx2.m53589e(g, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return g;
        }
    }

    public C1669c8(Locale locale) {
        mo12016i(locale);
    }

    public /* synthetic */ C1669c8(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    /* renamed from: a */
    public int[] mo12014a(int i) {
        int length = mo11430d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.f8366c;
            if (breakIterator == null) {
                vx2.m53605u("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f8366c;
                if (breakIterator2 == null) {
                    vx2.m53605u("impl");
                    breakIterator2 = null;
                }
                i = breakIterator2.following(i);
            } else {
                BreakIterator breakIterator3 = this.f8366c;
                if (breakIterator3 == null) {
                    vx2.m53605u("impl");
                    breakIterator3 = null;
                }
                int following = breakIterator3.following(i);
                if (following == -1) {
                    return null;
                }
                return mo11429c(i, following);
            }
        } while (i != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f8366c;
            if (breakIterator == null) {
                vx2.m53605u("impl");
                breakIterator = null;
            }
            if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f8366c;
                if (breakIterator2 == null) {
                    vx2.m53605u("impl");
                    breakIterator2 = null;
                }
                i = breakIterator2.preceding(i);
            } else {
                BreakIterator breakIterator3 = this.f8366c;
                if (breakIterator3 == null) {
                    vx2.m53605u("impl");
                    breakIterator3 = null;
                }
                int preceding = breakIterator3.preceding(i);
                if (preceding == -1) {
                    return null;
                }
                return mo11429c(preceding, i);
            }
        } while (i != -1);
        return null;
    }

    /* renamed from: e */
    public void mo11431e(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_TEXT);
        super.mo11431e(str);
        BreakIterator breakIterator = this.f8366c;
        if (breakIterator == null) {
            vx2.m53605u("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    /* renamed from: i */
    public final void mo12016i(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        vx2.m53590f(characterInstance, "getCharacterInstance(locale)");
        this.f8366c = characterInstance;
    }
}
