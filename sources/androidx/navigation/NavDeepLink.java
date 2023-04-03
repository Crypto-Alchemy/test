package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0004\u001d\"\u0017#B'\b\u0000\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bA\u0010BJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J(\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0007J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J*\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0002R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b%\u0010 R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010'R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020)0(8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001d\u00101\u001a\u0004\u0018\u00010\u00158BX\u0002¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0016\u00105\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010\u001eR\u001d\u00107\u001a\u0004\u0018\u00010\u00158BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b4\u00100R*\u0010=\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u000e8G@@X\u000e¢\u0006\u0012\n\u0004\b9\u00102\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020>8@X\u0004¢\u0006\u0006\u001a\u0004\b*\u0010?¨\u0006C"}, mo44877d2 = {"Landroidx/navigation/NavDeepLink;", "", "", "mimeType", "", "h", "Landroid/net/Uri;", "deepLink", "", "Ld44;", "arguments", "Landroid/os/Bundle;", "f", "other", "", "equals", "hashCode", "uri", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "uriRegex", "Ljava/util/regex/Pattern;", "fillInPattern", "c", "bundle", "name", "value", "argument", "m", "a", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "uriPattern", "b", "d", "action", "g", "", "Ljava/util/List;", "", "Landroidx/navigation/NavDeepLink$d;", "e", "Ljava/util/Map;", "paramArgMap", "patternFinalRegex", "Lef3;", "j", "()Ljava/util/regex/Pattern;", "pattern", "Z", "isParameterizedQuery", "i", "isSingleQueryParamValueOnly", "mimeTypeFinalRegex", "mimeTypePattern", "<set-?>", "l", "()Z", "setExactDeepLink$navigation_common_release", "(Z)V", "isExactDeepLink", "", "()Ljava/util/List;", "argumentsNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: NavDeepLink.kt */
public final class NavDeepLink {

    /* renamed from: m */
    public static final C1121b f6029m = new C1121b((DefaultConstructorMarker) null);
    @Deprecated

    /* renamed from: n */
    public static final Pattern f6030n = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a */
    public final String f6031a;

    /* renamed from: b */
    public final String f6032b;

    /* renamed from: c */
    public final String f6033c;

    /* renamed from: d */
    public final List<String> f6034d = new ArrayList();

    /* renamed from: e */
    public final Map<String, C1123d> f6035e = new LinkedHashMap();

    /* renamed from: f */
    public String f6036f;

    /* renamed from: g */
    public final ef3 f6037g = C6169a.m47232a(new NavDeepLink$pattern$2(this));

    /* renamed from: h */
    public boolean f6038h;

    /* renamed from: i */
    public boolean f6039i;

    /* renamed from: j */
    public String f6040j;

    /* renamed from: k */
    public final ef3 f6041k = C6169a.m47232a(new NavDeepLink$mimeTypePattern$2(this));

    /* renamed from: l */
    public boolean f6042l;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\nB\t\b\u0017¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\u000e"}, mo44877d2 = {"Landroidx/navigation/NavDeepLink$a;", "", "", "uriPattern", "d", "action", "b", "mimeType", "c", "Landroidx/navigation/NavDeepLink;", "a", "Ljava/lang/String;", "<init>", "()V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavDeepLink$a */
    /* compiled from: NavDeepLink.kt */
    public static final class C1119a {

        /* renamed from: d */
        public static final C1120a f6043d = new C1120a((DefaultConstructorMarker) null);

        /* renamed from: a */
        public String f6044a;

        /* renamed from: b */
        public String f6045b;

        /* renamed from: c */
        public String f6046c;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Landroidx/navigation/NavDeepLink$a$a;", "", "<init>", "()V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
        /* renamed from: androidx.navigation.NavDeepLink$a$a */
        /* compiled from: NavDeepLink.kt */
        public static final class C1120a {
            public C1120a() {
            }

            public /* synthetic */ C1120a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        public final NavDeepLink mo8532a() {
            return new NavDeepLink(this.f6044a, this.f6045b, this.f6046c);
        }

        /* renamed from: b */
        public final C1119a mo8533b(String str) {
            boolean z;
            vx2.m53591g(str, "action");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f6045b = str;
                return this;
            }
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
        }

        /* renamed from: c */
        public final C1119a mo8534c(String str) {
            vx2.m53591g(str, "mimeType");
            this.f6046c = str;
            return this;
        }

        /* renamed from: d */
        public final C1119a mo8535d(String str) {
            vx2.m53591g(str, "uriPattern");
            this.f6044a = str;
            return this;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, mo44877d2 = {"Landroidx/navigation/NavDeepLink$b;", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "SCHEME_PATTERN", "Ljava/util/regex/Pattern;", "<init>", "()V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavDeepLink$b */
    /* compiled from: NavDeepLink.kt */
    public static final class C1121b {
        public C1121b() {
        }

        public /* synthetic */ C1121b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\nJ\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0002R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0011"}, mo44877d2 = {"Landroidx/navigation/NavDeepLink$c;", "", "other", "", "a", "", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "type", "d", "setSubType", "subType", "mimeType", "<init>", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavDeepLink$c */
    /* compiled from: NavDeepLink.kt */
    public static final class C1122c implements Comparable<C1122c> {

        /* renamed from: a */
        public String f6047a;

        /* renamed from: d */
        public String f6048d;

        public C1122c(String str) {
            List<T> list;
            boolean z;
            vx2.m53591g(str, "mimeType");
            List<String> split = new Regex("/").split(str, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (listIterator.previous().length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        list = CollectionsKt___CollectionsKt.m47305E0(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                this.f6047a = (String) list.get(0);
                this.f6048d = (String) list.get(1);
            }
            list = ck0.m33062j();
            this.f6047a = (String) list.get(0);
            this.f6048d = (String) list.get(1);
        }

        /* renamed from: a */
        public int compareTo(C1122c cVar) {
            int i;
            vx2.m53591g(cVar, "other");
            if (vx2.m53586b(this.f6047a, cVar.f6047a)) {
                i = 2;
            } else {
                i = 0;
            }
            if (vx2.m53586b(this.f6048d, cVar.f6048d)) {
                return i + 1;
            }
            return i;
        }

        /* renamed from: d */
        public final String mo8538d() {
            return this.f6048d;
        }

        /* renamed from: e */
        public final String mo8539e() {
            return this.f6047a;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo44877d2 = {"Landroidx/navigation/NavDeepLink$d;", "", "", "name", "Lr37;", "a", "", "index", "b", "f", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "paramRegex", "", "Ljava/util/List;", "c", "()Ljava/util/List;", "arguments", "<init>", "()V", "navigation-common_release"}, mo44878k = 1, mo44879mv = {1, 6, 0})
    /* renamed from: androidx.navigation.NavDeepLink$d */
    /* compiled from: NavDeepLink.kt */
    public static final class C1123d {

        /* renamed from: a */
        public String f6049a;

        /* renamed from: b */
        public final List<String> f6050b = new ArrayList();

        /* renamed from: a */
        public final void mo8540a(String str) {
            vx2.m53591g(str, PublicResolver.FUNC_NAME);
            this.f6050b.add(str);
        }

        /* renamed from: b */
        public final String mo8541b(int i) {
            return this.f6050b.get(i);
        }

        /* renamed from: c */
        public final List<String> mo8542c() {
            return this.f6050b;
        }

        /* renamed from: d */
        public final String mo8543d() {
            return this.f6049a;
        }

        /* renamed from: e */
        public final void mo8544e(String str) {
            this.f6049a = str;
        }

        /* renamed from: f */
        public final int mo8545f() {
            return this.f6050b.size();
        }
    }

    public NavDeepLink(String str, String str2, String str3) {
        boolean z;
        String str4 = str;
        this.f6031a = str4;
        this.f6032b = str2;
        this.f6033c = str3;
        if (str4 != null) {
            Uri parse = Uri.parse(str);
            if (parse.getQuery() != null) {
                z = true;
            } else {
                z = false;
            }
            this.f6038h = z;
            StringBuilder sb = new StringBuilder("^");
            if (!f6030n.matcher(str4).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f6038h) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str4);
                if (matcher.find()) {
                    String substring = str4.substring(0, matcher.start());
                    vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    vx2.m53590f(compile, "fillInPattern");
                    this.f6042l = mo8519c(substring, sb, compile);
                }
                for (String next : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(next);
                    if (queryParameter == null) {
                        this.f6039i = true;
                        queryParameter = next;
                    }
                    Matcher matcher2 = compile.matcher(queryParameter);
                    C1123d dVar = new C1123d();
                    int i = 0;
                    while (matcher2.find()) {
                        String group = matcher2.group(1);
                        if (group != null) {
                            dVar.mo8540a(group);
                            vx2.m53590f(queryParameter, "queryParam");
                            String substring2 = queryParameter.substring(i, matcher2.start());
                            vx2.m53590f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb2.append(Pattern.quote(substring2));
                            sb2.append("(.+?)?");
                            i = matcher2.end();
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    if (i < queryParameter.length()) {
                        vx2.m53590f(queryParameter, "queryParam");
                        String substring3 = queryParameter.substring(i);
                        vx2.m53590f(substring3, "this as java.lang.String).substring(startIndex)");
                        sb2.append(Pattern.quote(substring3));
                    }
                    String sb3 = sb2.toString();
                    vx2.m53590f(sb3, "argRegex.toString()");
                    dVar.mo8544e(yb6.m74332I(sb3, ".*", "\\E.*\\Q", false, 4, (Object) null));
                    Map<String, C1123d> map = this.f6035e;
                    vx2.m53590f(next, "paramName");
                    map.put(next, dVar);
                }
            } else {
                vx2.m53590f(compile, "fillInPattern");
                this.f6042l = mo8519c(str4, sb, compile);
            }
            String sb4 = sb.toString();
            vx2.m53590f(sb4, "uriRegex.toString()");
            this.f6036f = yb6.m74332I(sb4, ".*", "\\E.*\\Q", false, 4, (Object) null);
        }
        if (this.f6033c == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f6033c).matches()) {
            C1122c cVar = new C1122c(this.f6033c);
            this.f6040j = yb6.m74332I("^(" + cVar.mo8539e() + "|[*]+)/(" + cVar.mo8538d() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, (Object) null);
            return;
        }
        throw new IllegalArgumentException(("The given mimeType " + this.f6033c + " does not match to required \"type/subtype\" format").toString());
    }

    /* renamed from: c */
    public final boolean mo8519c(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !StringsKt__StringsKt.m63081R(str, ".*", false, 2, (Object) null);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                this.f6034d.add(group);
                String substring = str.substring(i, matcher.start());
                vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(substring));
                sb.append("([^/]+?)");
                i = matcher.end();
                z = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (i < str.length()) {
            String substring2 = str.substring(i);
            vx2.m53590f(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(substring2));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z;
    }

    /* renamed from: d */
    public final String mo8520d() {
        return this.f6032b;
    }

    /* renamed from: e */
    public final List<String> mo8521e() {
        List<String> list = this.f6034d;
        Collection<C1123d> values = this.f6035e.values();
        ArrayList arrayList = new ArrayList();
        for (C1123d c : values) {
            hk0.m45275z(arrayList, c.mo8542c());
        }
        return CollectionsKt___CollectionsKt.m47350u0(list, arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof NavDeepLink)) {
            return false;
        }
        NavDeepLink navDeepLink = (NavDeepLink) obj;
        if (!vx2.m53586b(this.f6031a, navDeepLink.f6031a) || !vx2.m53586b(this.f6032b, navDeepLink.f6032b) || !vx2.m53586b(this.f6033c, navDeepLink.f6033c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final Bundle mo8523f(Uri uri, Map<String, d44> map) {
        Matcher matcher;
        boolean z;
        Matcher matcher2;
        String str;
        Uri uri2 = uri;
        Map<String, d44> map2 = map;
        vx2.m53591g(uri2, "deepLink");
        vx2.m53591g(map2, "arguments");
        Pattern j = mo8528j();
        if (j != null) {
            matcher = j.matcher(uri.toString());
        } else {
            matcher = null;
        }
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.f6034d.size();
        int i = 0;
        while (i < size) {
            String str2 = this.f6034d.get(i);
            i++;
            String decode = Uri.decode(matcher.group(i));
            d44 d44 = map2.get(str2);
            try {
                vx2.m53590f(decode, "value");
                if (mo8531m(bundle, str2, decode, d44)) {
                    return null;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (this.f6038h) {
            for (String next : this.f6035e.keySet()) {
                C1123d dVar = this.f6035e.get(next);
                String queryParameter = uri2.getQueryParameter(next);
                if (this.f6039i) {
                    String uri3 = uri.toString();
                    vx2.m53590f(uri3, "deepLink.toString()");
                    String L0 = StringsKt__StringsKt.m63071L0(uri3, '?', (String) null, 2, (Object) null);
                    if (!vx2.m53586b(L0, uri3)) {
                        queryParameter = L0;
                    }
                }
                if (queryParameter != null) {
                    vx2.m53588d(dVar);
                    matcher2 = Pattern.compile(dVar.mo8543d(), 32).matcher(queryParameter);
                    if (!matcher2.matches()) {
                        return null;
                    }
                } else {
                    matcher2 = null;
                }
                Bundle bundle2 = new Bundle();
                try {
                    vx2.m53588d(dVar);
                    int f = dVar.mo8545f();
                    for (int i2 = 0; i2 < f; i2++) {
                        if (matcher2 != null) {
                            str = matcher2.group(i2 + 1);
                            if (str == null) {
                                str = "";
                            }
                        } else {
                            str = null;
                        }
                        String b = dVar.mo8541b(i2);
                        d44 d442 = map2.get(b);
                        if (str != null) {
                            if (!vx2.m53586b(str, '{' + b + '}') && mo8531m(bundle2, b, str, d442)) {
                                return null;
                            }
                        }
                    }
                    bundle.putAll(bundle2);
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
        for (Map.Entry next2 : map.entrySet()) {
            String str3 = (String) next2.getKey();
            d44 d443 = (d44) next2.getValue();
            if (d443 == null || d443.mo18511c() || d443.mo18510b()) {
                z = false;
            } else {
                z = true;
            }
            if (z && !bundle.containsKey(str3)) {
                return null;
            }
        }
        return bundle;
    }

    /* renamed from: g */
    public final String mo8524g() {
        return this.f6033c;
    }

    /* renamed from: h */
    public final int mo8525h(String str) {
        vx2.m53591g(str, "mimeType");
        if (this.f6033c != null) {
            Pattern i = mo8527i();
            vx2.m53588d(i);
            if (i.matcher(str).matches()) {
                return new C1122c(this.f6033c).compareTo(new C1122c(str));
            }
        }
        return -1;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f6031a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + 0) * 31;
        String str2 = this.f6032b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f6033c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    /* renamed from: i */
    public final Pattern mo8527i() {
        return (Pattern) this.f6041k.getValue();
    }

    /* renamed from: j */
    public final Pattern mo8528j() {
        return (Pattern) this.f6037g.getValue();
    }

    /* renamed from: k */
    public final String mo8529k() {
        return this.f6031a;
    }

    /* renamed from: l */
    public final boolean mo8530l() {
        return this.f6042l;
    }

    /* renamed from: m */
    public final boolean mo8531m(Bundle bundle, String str, String str2, d44 d44) {
        if (d44 != null) {
            d44.mo18509a().mo24335d(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }
}
