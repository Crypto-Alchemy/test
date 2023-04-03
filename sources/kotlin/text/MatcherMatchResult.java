package kotlin.text;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import p000.no3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, mo44877d2 = {"Lkotlin/text/MatcherMatchResult;", "Lno3;", "next", "Ljava/util/regex/Matcher;", "a", "Ljava/util/regex/Matcher;", "matcher", "", "b", "Ljava/lang/CharSequence;", "input", "Lmo3;", "c", "Lmo3;", "getGroups", "()Lmo3;", "groups", "", "", "d", "Ljava/util/List;", "groupValues_", "Lrw2;", "()Lrw2;", "range", "()Ljava/util/List;", "groupValues", "Ljava/util/regex/MatchResult;", "e", "()Ljava/util/regex/MatchResult;", "matchResult", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Regex.kt */
public final class MatcherMatchResult implements no3 {

    /* renamed from: a */
    public final Matcher f40336a;

    /* renamed from: b */
    public final CharSequence f40337b;

    /* renamed from: c */
    public final mo3 f40338c = new MatcherMatchResult$groups$1(this);

    /* renamed from: d */
    public List<String> f40339d;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0014\u0010\b\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, mo44877d2 = {"kotlin/text/MatcherMatchResult$a", "Li6;", "", "", "index", "k", "e", "()I", "size", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.text.MatcherMatchResult$a */
    /* compiled from: Regex.kt */
    public static final class C7746a extends C5946i6<String> {

        /* renamed from: d */
        public final /* synthetic */ MatcherMatchResult f40340d;

        public C7746a(MatcherMatchResult matcherMatchResult) {
            this.f40340d = matcherMatchResult;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return mo55420j((String) obj);
        }

        /* renamed from: e */
        public int mo11067e() {
            return this.f40340d.mo55418e().groupCount() + 1;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return mo55422n((String) obj);
        }

        /* renamed from: j */
        public /* bridge */ boolean mo55420j(String str) {
            return super.contains(str);
        }

        /* renamed from: k */
        public String get(int i) {
            String group = this.f40340d.mo55418e().group(i);
            if (group == null) {
                return "";
            }
            return group;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return mo55423q((String) obj);
        }

        /* renamed from: n */
        public /* bridge */ int mo55422n(String str) {
            return super.indexOf(str);
        }

        /* renamed from: q */
        public /* bridge */ int mo55423q(String str) {
            return super.lastIndexOf(str);
        }
    }

    public MatcherMatchResult(Matcher matcher, CharSequence charSequence) {
        vx2.m53591g(matcher, "matcher");
        vx2.m53591g(charSequence, "input");
        this.f40336a = matcher;
        this.f40337b = charSequence;
    }

    /* renamed from: a */
    public no3.C9000b mo55415a() {
        return no3.C8999a.m69892a(this);
    }

    /* renamed from: b */
    public List<String> mo55416b() {
        if (this.f40339d == null) {
            this.f40339d = new C7746a(this);
        }
        List<String> list = this.f40339d;
        vx2.m53588d(list);
        return list;
    }

    /* renamed from: c */
    public rw2 mo55417c() {
        return zb5.m74832h(mo55418e());
    }

    /* renamed from: e */
    public final MatchResult mo55418e() {
        return this.f40336a;
    }

    public no3 next() {
        int i;
        int end = mo55418e().end();
        if (mo55418e().end() == mo55418e().start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 > this.f40337b.length()) {
            return null;
        }
        Matcher matcher = this.f40336a.pattern().matcher(this.f40337b);
        vx2.m53590f(matcher, "matcher.pattern().matcher(input)");
        return zb5.m74830f(matcher, i2, this.f40337b);
    }
}
