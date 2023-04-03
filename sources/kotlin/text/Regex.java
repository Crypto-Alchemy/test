package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.SequencesKt__SequencesKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 32\u00060\u0001j\u0002`\u0002:\u000245B\u0011\b\u0001\u0012\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b-\u0010.B\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020\u0014¢\u0006\u0004\b-\u0010/B\u0019\b\u0016\u0012\u0006\u0010)\u001a\u00020\u0014\u0012\u0006\u00100\u001a\u00020$¢\u0006\u0004\b-\u00101B\u001f\b\u0016\u0012\u0006\u0010)\u001a\u00020\u0014\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b-\u00102J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0004J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\nH\u0007J\u0016\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\"\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0017J\u0016\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\nJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\nH\u0007J\b\u0010\u001e\u001a\u00020\u0014H\u0016J\u0006\u0010 \u001a\u00020\u001fR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010)\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020$0#8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00066"}, mo44877d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "input", "", "matches", "containsMatchIn", "", "startIndex", "Lno3;", "find", "Lhw5;", "findAll", "matchEntire", "index", "matchAt", "matchesAt", "", "replacement", "replace", "Lkotlin/Function1;", "transform", "replaceFirst", "limit", "", "split", "splitToSequence", "toString", "Ljava/util/regex/Pattern;", "toPattern", "nativePattern", "Ljava/util/regex/Pattern;", "", "Lkotlin/text/RegexOption;", "_options", "Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "pattern", "getOptions", "()Ljava/util/Set;", "options", "<init>", "(Ljava/util/regex/Pattern;)V", "(Ljava/lang/String;)V", "option", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "(Ljava/lang/String;Ljava/util/Set;)V", "Companion", "a", "Serialized", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: Regex.kt */
public final class Regex implements Serializable {
    public static final C7748a Companion = new C7748a((DefaultConstructorMarker) null);
    private Set<? extends RegexOption> _options;
    /* access modifiers changed from: private */
    public final Pattern nativePattern;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0012B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo44877d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "", "pattern", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "", "flags", "I", "getFlags", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: Regex.kt */
    public static final class Serialized implements Serializable {
        public static final C7747a Companion = new C7747a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lkotlin/text/Regex$Serialized$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        /* renamed from: kotlin.text.Regex$Serialized$a */
        /* compiled from: Regex.kt */
        public static final class C7747a {
            public C7747a() {
            }

            public /* synthetic */ C7747a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Serialized(String str, int i) {
            vx2.m53591g(str, "pattern");
            this.pattern = str;
            this.flags = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            vx2.m53590f(compile, "compile(pattern, flags)");
            return new Regex(compile);
        }

        public final int getFlags() {
            return this.flags;
        }

        public final String getPattern() {
            return this.pattern;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, mo44877d2 = {"Lkotlin/text/Regex$a;", "", "", "flags", "b", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.text.Regex$a */
    /* compiled from: Regex.kt */
    public static final class C7748a {
        public C7748a() {
        }

        public /* synthetic */ C7748a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final int mo55446b(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }
    }

    public Regex(Pattern pattern) {
        vx2.m53591g(pattern, "nativePattern");
        this.nativePattern = pattern;
    }

    public static /* synthetic */ no3 find$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.find(charSequence, i);
    }

    public static /* synthetic */ hw5 findAll$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.findAll(charSequence, i);
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }

    public static /* synthetic */ hw5 splitToSequence$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.splitToSequence(charSequence, i);
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        vx2.m53590f(pattern, "nativePattern.pattern()");
        return new Serialized(pattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(CharSequence charSequence) {
        vx2.m53591g(charSequence, "input");
        return this.nativePattern.matcher(charSequence).find();
    }

    public final no3 find(CharSequence charSequence, int i) {
        vx2.m53591g(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        vx2.m53590f(matcher, "nativePattern.matcher(input)");
        return zb5.m74830f(matcher, i, charSequence);
    }

    public final hw5<no3> findAll(CharSequence charSequence, int i) {
        vx2.m53591g(charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            return SequencesKt__SequencesKt.m63014i(new Regex$findAll$1(this, charSequence, i), Regex$findAll$2.INSTANCE);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
    }

    public final Set<RegexOption> getOptions() {
        Set<? extends RegexOption> set = this._options;
        if (set != null) {
            return set;
        }
        int flags = this.nativePattern.flags();
        EnumSet<E> allOf = EnumSet.allOf(RegexOption.class);
        vx2.m53590f(allOf, "fromInt$lambda$1");
        hk0.m45273H(allOf, new Regex$special$$inlined$fromInt$1(flags));
        Set<? extends RegexOption> unmodifiableSet = Collections.unmodifiableSet(allOf);
        vx2.m53590f(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        this._options = unmodifiableSet;
        return unmodifiableSet;
    }

    public final String getPattern() {
        String pattern = this.nativePattern.pattern();
        vx2.m53590f(pattern, "nativePattern.pattern()");
        return pattern;
    }

    public final no3 matchAt(CharSequence charSequence, int i) {
        vx2.m53591g(charSequence, "input");
        Matcher region = this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (!region.lookingAt()) {
            return null;
        }
        vx2.m53590f(region, "this");
        return new MatcherMatchResult(region, charSequence);
    }

    public final no3 matchEntire(CharSequence charSequence) {
        vx2.m53591g(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        vx2.m53590f(matcher, "nativePattern.matcher(input)");
        return zb5.m74831g(matcher, charSequence);
    }

    public final boolean matches(CharSequence charSequence) {
        vx2.m53591g(charSequence, "input");
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final boolean matchesAt(CharSequence charSequence, int i) {
        vx2.m53591g(charSequence, "input");
        return this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length()).lookingAt();
    }

    public final String replace(CharSequence charSequence, String str) {
        vx2.m53591g(charSequence, "input");
        vx2.m53591g(str, "replacement");
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        vx2.m53590f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final String replaceFirst(CharSequence charSequence, String str) {
        vx2.m53591g(charSequence, "input");
        vx2.m53591g(str, "replacement");
        String replaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        vx2.m53590f(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    public final List<String> split(CharSequence charSequence, int i) {
        vx2.m53591g(charSequence, "input");
        StringsKt__StringsKt.m63118w0(i);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return bk0.m32598e(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0) {
            i2 = d75.m43385g(i, 10);
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        int i4 = i - 1;
        do {
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            if ((i4 >= 0 && arrayList.size() == i4) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public final hw5<String> splitToSequence(CharSequence charSequence, int i) {
        vx2.m53591g(charSequence, "input");
        StringsKt__StringsKt.m63118w0(i);
        return kw5.m63631b(new Regex$splitToSequence$1(this, charSequence, i, (ns0<? super Regex$splitToSequence$1>) null));
    }

    public final Pattern toPattern() {
        return this.nativePattern;
    }

    public String toString() {
        String pattern = this.nativePattern.toString();
        vx2.m53590f(pattern, "nativePattern.toString()");
        return pattern;
    }

    public final String replace(CharSequence charSequence, rc2<? super no3, ? extends CharSequence> rc2) {
        vx2.m53591g(charSequence, "input");
        vx2.m53591g(rc2, "transform");
        int i = 0;
        no3 find$default = find$default(this, charSequence, 0, 2, (Object) null);
        if (find$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, find$default.mo55417c().mo47512e().intValue());
            sb.append((CharSequence) rc2.invoke(find$default));
            i = find$default.mo55417c().mo47513k().intValue() + 1;
            find$default = find$default.next();
            if (i >= length) {
                break;
            }
        } while (find$default != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            p000.vx2.m53591g(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            p000.vx2.m53590f(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(java.lang.String r2, kotlin.text.RegexOption r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            p000.vx2.m53591g(r2, r0)
            java.lang.String r0 = "option"
            p000.vx2.m53591g(r3, r0)
            kotlin.text.Regex$a r0 = Companion
            int r3 = r3.getValue()
            int r3 = r0.mo55446b(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureUnicodeCase(option.value))"
            p000.vx2.m53590f(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, kotlin.text.RegexOption):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(java.lang.String r2, java.util.Set<? extends kotlin.text.RegexOption> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            p000.vx2.m53591g(r2, r0)
            java.lang.String r0 = "options"
            p000.vx2.m53591g(r3, r0)
            kotlin.text.Regex$a r0 = Companion
            int r3 = p000.zb5.m74834j(r3)
            int r3 = r0.mo55446b(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureU…odeCase(options.toInt()))"
            p000.vx2.m53590f(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, java.util.Set):void");
    }
}
