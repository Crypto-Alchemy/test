package okhttp3;

import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 &2\u00020\u0001:\u0002%&BO\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\r\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0012J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0002J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0017J\r\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0018J\r\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001eJ\r\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0002\b\u001fJ\r\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\b J\b\u0010!\u001a\u00020\u0003H\u0016J\u0015\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\nH\u0000¢\u0006\u0002\b#J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b$R\u0013\u0010\u0007\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0013\u0010\r\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0011R\u0013\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0013\u0010\b\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000fR\u0013\u0010\f\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0011R\u0013\u0010\t\u001a\u00020\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000f¨\u0006'"}, mo44877d2 = {"Lokhttp3/Cookie;", "", "name", "", "value", "expiresAt", "", "domain", "path", "secure", "", "httpOnly", "persistent", "hostOnly", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "()Ljava/lang/String;", "()J", "()Z", "-deprecated_domain", "equals", "other", "-deprecated_expiresAt", "hashCode", "", "-deprecated_hostOnly", "-deprecated_httpOnly", "matches", "url", "Lokhttp3/HttpUrl;", "-deprecated_name", "-deprecated_path", "-deprecated_persistent", "-deprecated_secure", "toString", "forObsoleteRfc2965", "toString$okhttp", "-deprecated_value", "Builder", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: Cookie.kt */
public final class Cookie {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    /* access modifiers changed from: private */
    public static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    /* access modifiers changed from: private */
    public static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    /* access modifiers changed from: private */
    public static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;

    @Metadata(mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0018\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0000J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0000J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo44877d2 = {"Lokhttp3/Cookie$Builder;", "", "()V", "domain", "", "expiresAt", "", "hostOnly", "", "httpOnly", "name", "path", "persistent", "secure", "value", "build", "Lokhttp3/Cookie;", "hostOnlyDomain", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: Cookie.kt */
    public static final class Builder {
        private String domain;
        private long expiresAt = DatesKt.MAX_DATE;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private String path = "/";
        private boolean persistent;
        private boolean secure;
        private String value;

        public final Cookie build() {
            String str = this.name;
            if (str != null) {
                String str2 = this.value;
                if (str2 != null) {
                    long j = this.expiresAt;
                    String str3 = this.domain;
                    if (str3 != null) {
                        return new Cookie(str, str2, j, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, (DefaultConstructorMarker) null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }

        public final Builder domain(String str) {
            vx2.m53591g(str, "domain");
            return domain(str, false);
        }

        public final Builder expiresAt(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > DatesKt.MAX_DATE) {
                j = 253402300799999L;
            }
            this.expiresAt = j;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String str) {
            vx2.m53591g(str, "domain");
            return domain(str, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String str) {
            vx2.m53591g(str, PublicResolver.FUNC_NAME);
            if (vx2.m53586b(StringsKt__StringsKt.m63090V0(str).toString(), str)) {
                this.name = str;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed".toString());
        }

        public final Builder path(String str) {
            vx2.m53591g(str, "path");
            if (yb6.m74336M(str, "/", false, 2, (Object) null)) {
                this.path = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'".toString());
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String str) {
            vx2.m53591g(str, "value");
            if (vx2.m53586b(StringsKt__StringsKt.m63090V0(str).toString(), str)) {
                this.value = str;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed".toString());
        }

        private final Builder domain(String str, boolean z) {
            String canonicalHost = HostnamesKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                this.domain = canonicalHost;
                this.hostOnly = z;
                return this;
            }
            throw new IllegalArgumentException(vx2.m53598n("unexpected domain: ", str));
        }
    }

    @Metadata(mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0002J'\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0000¢\u0006\u0002\b\u001bJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0002J \u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\fH\u0002J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\fH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, mo44877d2 = {"Lokhttp3/Cookie$Companion;", "", "()V", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "dateCharacterOffset", "", "input", "", "pos", "limit", "invert", "", "domainMatch", "urlHost", "domain", "parse", "Lokhttp3/Cookie;", "currentTimeMillis", "", "url", "Lokhttp3/HttpUrl;", "setCookie", "parse$okhttp", "parseAll", "", "headers", "Lokhttp3/Headers;", "parseDomain", "s", "parseExpires", "parseMaxAge", "pathMatch", "path", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: Cookie.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x003f, code lost:
            if (r1 != ':') goto L_0x0042;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final int dateCharacterOffset(java.lang.String r6, int r7, int r8, boolean r9) {
            /*
                r5 = this;
            L_0x0000:
                if (r7 >= r8) goto L_0x0049
                int r0 = r7 + 1
                char r1 = r6.charAt(r7)
                r2 = 32
                r3 = 1
                r4 = 0
                if (r1 >= r2) goto L_0x0012
                r2 = 9
                if (r1 != r2) goto L_0x0041
            L_0x0012:
                r2 = 127(0x7f, float:1.78E-43)
                if (r1 >= r2) goto L_0x0041
                r2 = 57
                if (r1 > r2) goto L_0x0020
                r2 = 48
                if (r2 > r1) goto L_0x0020
                r2 = r3
                goto L_0x0021
            L_0x0020:
                r2 = r4
            L_0x0021:
                if (r2 != 0) goto L_0x0041
                r2 = 122(0x7a, float:1.71E-43)
                if (r1 > r2) goto L_0x002d
                r2 = 97
                if (r2 > r1) goto L_0x002d
                r2 = r3
                goto L_0x002e
            L_0x002d:
                r2 = r4
            L_0x002e:
                if (r2 != 0) goto L_0x0041
                r2 = 90
                if (r1 > r2) goto L_0x003a
                r2 = 65
                if (r2 > r1) goto L_0x003a
                r2 = r3
                goto L_0x003b
            L_0x003a:
                r2 = r4
            L_0x003b:
                if (r2 != 0) goto L_0x0041
                r2 = 58
                if (r1 != r2) goto L_0x0042
            L_0x0041:
                r4 = r3
            L_0x0042:
                r1 = r9 ^ 1
                if (r4 != r1) goto L_0x0047
                return r7
            L_0x0047:
                r7 = r0
                goto L_0x0000
            L_0x0049:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.dateCharacterOffset(java.lang.String, int, int, boolean):int");
        }

        /* access modifiers changed from: private */
        public final boolean domainMatch(String str, String str2) {
            if (vx2.m53586b(str, str2)) {
                return true;
            }
            if (!yb6.m74343x(str, str2, false, 2, (Object) null) || str.charAt((str.length() - str2.length()) - 1) != '.' || Util.canParseAsIpAddress(str)) {
                return false;
            }
            return true;
        }

        private final String parseDomain(String str) {
            if (!yb6.m74343x(str, ".", false, 2, (Object) null)) {
                String canonicalHost = HostnamesKt.toCanonicalHost(StringsKt__StringsKt.m63114s0(str, "."));
                if (canonicalHost != null) {
                    return canonicalHost;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long parseExpires(String str, int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            String str2 = str;
            int i3 = i2;
            int dateCharacterOffset = dateCharacterOffset(str2, i, i3, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(str2);
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            while (dateCharacterOffset < i3) {
                int dateCharacterOffset2 = dateCharacterOffset(str2, dateCharacterOffset + 1, i3, true);
                matcher.region(dateCharacterOffset, dateCharacterOffset2);
                if (i5 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String group = matcher.group(1);
                    vx2.m53590f(group, "matcher.group(1)");
                    i5 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    vx2.m53590f(group2, "matcher.group(2)");
                    i8 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    vx2.m53590f(group3, "matcher.group(3)");
                    i9 = Integer.parseInt(group3);
                } else if (i6 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String group4 = matcher.group(1);
                    vx2.m53590f(group4, "matcher.group(1)");
                    i6 = Integer.parseInt(group4);
                } else if (i7 == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String group5 = matcher.group(1);
                    vx2.m53590f(group5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    vx2.m53590f(locale, "US");
                    String lowerCase = group5.toLowerCase(locale);
                    vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = Cookie.MONTH_PATTERN.pattern();
                    vx2.m53590f(pattern, "MONTH_PATTERN.pattern()");
                    i7 = StringsKt__StringsKt.m63100e0(pattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i4 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String group6 = matcher.group(1);
                    vx2.m53590f(group6, "matcher.group(1)");
                    i4 = Integer.parseInt(group6);
                }
                dateCharacterOffset = dateCharacterOffset(str2, dateCharacterOffset2 + 1, i3, false);
            }
            if (70 > i4 || i4 >= 100) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i4 += 1900;
            }
            if (i4 < 0 || i4 >= 70) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                i4 += PlaybackException.ERROR_CODE_IO_UNSPECIFIED;
            }
            if (i4 >= 1601) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (i7 != -1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    if (1 > i6 || i6 >= 32) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z5) {
                        if (i5 < 0 || i5 >= 24) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (z6) {
                            if (i8 < 0 || i8 >= 60) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            if (z7) {
                                if (i9 < 0 || i9 >= 60) {
                                    z8 = false;
                                } else {
                                    z8 = true;
                                }
                                if (z8) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i4);
                                    gregorianCalendar.set(2, i7 - 1);
                                    gregorianCalendar.set(5, i6);
                                    gregorianCalendar.set(11, i5);
                                    gregorianCalendar.set(12, i8);
                                    gregorianCalendar.set(13, i9);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        private final long parseMaxAge(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e) {
                if (!new Regex("-?\\d+").matches(str)) {
                    throw e;
                } else if (yb6.m74336M(str, "-", false, 2, (Object) null)) {
                    return Long.MIN_VALUE;
                } else {
                    return Long.MAX_VALUE;
                }
            }
        }

        /* access modifiers changed from: private */
        public final boolean pathMatch(HttpUrl httpUrl, String str) {
            String encodedPath = httpUrl.encodedPath();
            if (vx2.m53586b(encodedPath, str)) {
                return true;
            }
            if (!yb6.m74336M(encodedPath, str, false, 2, (Object) null) || (!yb6.m74343x(str, "/", false, 2, (Object) null) && encodedPath.charAt(str.length()) != '/')) {
                return false;
            }
            return true;
        }

        public final Cookie parse(HttpUrl httpUrl, String str) {
            vx2.m53591g(httpUrl, "url");
            vx2.m53591g(str, "setCookie");
            return parse$okhttp(System.currentTimeMillis(), httpUrl, str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0102, code lost:
            if (r1 > okhttp3.internal.http.DatesKt.MAX_DATE) goto L_0x010a;
         */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0114  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0117  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0137 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0138  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.Cookie parse$okhttp(long r26, okhttp3.HttpUrl r28, java.lang.String r29) {
            /*
                r25 = this;
                r0 = r25
                r7 = r29
                java.lang.String r1 = "url"
                r8 = r28
                p000.vx2.m53591g(r8, r1)
                java.lang.String r1 = "setCookie"
                p000.vx2.m53591g(r7, r1)
                r2 = 59
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r29
                int r9 = okhttp3.internal.Util.delimiterOffset$default((java.lang.String) r1, (char) r2, (int) r3, (int) r4, (int) r5, (java.lang.Object) r6)
                r2 = 61
                r5 = 2
                r4 = r9
                int r1 = okhttp3.internal.Util.delimiterOffset$default((java.lang.String) r1, (char) r2, (int) r3, (int) r4, (int) r5, (java.lang.Object) r6)
                r2 = 0
                if (r1 != r9) goto L_0x0028
                return r2
            L_0x0028:
                r3 = 0
                r4 = 1
                java.lang.String r11 = okhttp3.internal.Util.trimSubstring$default(r7, r3, r1, r4, r2)
                int r5 = r11.length()
                if (r5 != 0) goto L_0x0036
                r5 = r4
                goto L_0x0037
            L_0x0036:
                r5 = r3
            L_0x0037:
                if (r5 != 0) goto L_0x016e
                int r5 = okhttp3.internal.Util.indexOfControlOrNonAscii(r11)
                r6 = -1
                if (r5 == r6) goto L_0x0042
                goto L_0x016e
            L_0x0042:
                int r1 = r1 + r4
                java.lang.String r12 = okhttp3.internal.Util.trimSubstring(r7, r1, r9)
                int r1 = okhttp3.internal.Util.indexOfControlOrNonAscii(r12)
                if (r1 == r6) goto L_0x004e
                return r2
            L_0x004e:
                int r9 = r9 + r4
                int r1 = r29.length()
                r5 = -1
                r10 = r2
                r22 = r10
                r17 = r3
                r18 = r17
                r19 = r18
                r20 = r4
                r15 = r5
                r23 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x0066:
                if (r9 >= r1) goto L_0x00d6
                r2 = 59
                int r2 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r7, (char) r2, (int) r9, (int) r1)
                r13 = 61
                int r13 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r7, (char) r13, (int) r9, (int) r2)
                java.lang.String r9 = okhttp3.internal.Util.trimSubstring(r7, r9, r13)
                if (r13 >= r2) goto L_0x0081
                int r13 = r13 + 1
                java.lang.String r13 = okhttp3.internal.Util.trimSubstring(r7, r13, r2)
                goto L_0x0083
            L_0x0081:
                java.lang.String r13 = ""
            L_0x0083:
                java.lang.String r14 = "expires"
                boolean r14 = p000.yb6.m74344y(r9, r14, r4)
                if (r14 == 0) goto L_0x0094
                int r9 = r13.length()     // Catch:{ IllegalArgumentException -> 0x00d2 }
                long r23 = r0.parseExpires(r13, r3, r9)     // Catch:{ IllegalArgumentException -> 0x00d2 }
                goto L_0x00a0
            L_0x0094:
                java.lang.String r14 = "max-age"
                boolean r14 = p000.yb6.m74344y(r9, r14, r4)
                if (r14 == 0) goto L_0x00a3
                long r15 = r0.parseMaxAge(r13)     // Catch:{  }
            L_0x00a0:
                r19 = r4
                goto L_0x00d2
            L_0x00a3:
                java.lang.String r14 = "domain"
                boolean r14 = p000.yb6.m74344y(r9, r14, r4)
                if (r14 == 0) goto L_0x00b2
                java.lang.String r10 = r0.parseDomain(r13)     // Catch:{ IllegalArgumentException -> 0x00d2 }
                r20 = r3
                goto L_0x00d2
            L_0x00b2:
                java.lang.String r14 = "path"
                boolean r14 = p000.yb6.m74344y(r9, r14, r4)
                if (r14 == 0) goto L_0x00bd
                r22 = r13
                goto L_0x00d2
            L_0x00bd:
                java.lang.String r13 = "secure"
                boolean r13 = p000.yb6.m74344y(r9, r13, r4)
                if (r13 == 0) goto L_0x00c8
                r17 = r4
                goto L_0x00d2
            L_0x00c8:
                java.lang.String r13 = "httponly"
                boolean r9 = p000.yb6.m74344y(r9, r13, r4)
                if (r9 == 0) goto L_0x00d2
                r18 = r4
            L_0x00d2:
                int r9 = r2 + 1
                r2 = 0
                goto L_0x0066
            L_0x00d6:
                r1 = -9223372036854775808
                int r4 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r4 != 0) goto L_0x00de
            L_0x00dc:
                r13 = r1
                goto L_0x010e
            L_0x00de:
                int r1 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
                if (r1 == 0) goto L_0x010c
                r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
                int r1 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
                if (r1 > 0) goto L_0x00f0
                r1 = 1000(0x3e8, float:1.401E-42)
                long r1 = (long) r1
                long r15 = r15 * r1
                goto L_0x00f5
            L_0x00f0:
                r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x00f5:
                long r1 = r26 + r15
                int r4 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
                if (r4 < 0) goto L_0x0105
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x00dc
                goto L_0x010a
            L_0x0105:
                r4 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            L_0x010a:
                r13 = r4
                goto L_0x010e
            L_0x010c:
                r13 = r23
            L_0x010e:
                java.lang.String r1 = r28.host()
                if (r10 != 0) goto L_0x0117
                r15 = r1
                r2 = 0
                goto L_0x0121
            L_0x0117:
                boolean r2 = r0.domainMatch(r1, r10)
                if (r2 != 0) goto L_0x011f
                r2 = 0
                return r2
            L_0x011f:
                r2 = 0
                r15 = r10
            L_0x0121:
                int r1 = r1.length()
                int r4 = r15.length()
                if (r1 == r4) goto L_0x0138
                okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = r1.get()
                java.lang.String r1 = r1.getEffectiveTldPlusOne(r15)
                if (r1 != 0) goto L_0x0138
                return r2
            L_0x0138:
                java.lang.String r1 = "/"
                r4 = r22
                if (r4 == 0) goto L_0x0149
                r5 = 2
                boolean r2 = p000.yb6.m74336M(r4, r1, r3, r5, r2)
                if (r2 != 0) goto L_0x0146
                goto L_0x0149
            L_0x0146:
                r16 = r4
                goto L_0x0165
            L_0x0149:
                java.lang.String r2 = r28.encodedPath()
                r6 = 47
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                r5 = r2
                int r4 = kotlin.text.StringsKt__StringsKt.m63104i0(r5, r6, r7, r8, r9, r10)
                if (r4 == 0) goto L_0x0163
                java.lang.String r1 = r2.substring(r3, r4)
                java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
                p000.vx2.m53590f(r1, r2)
            L_0x0163:
                r16 = r1
            L_0x0165:
                okhttp3.Cookie r1 = new okhttp3.Cookie
                r21 = 0
                r10 = r1
                r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20, r21)
                return r1
            L_0x016e:
                r1 = r2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.Companion.parse$okhttp(long, okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
        }

        public final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
            vx2.m53591g(httpUrl, "url");
            vx2.m53591g(headers, "headers");
            List<String> values = headers.values("Set-Cookie");
            int size = values.size();
            ArrayList arrayList = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                Cookie parse = parse(httpUrl, values.get(i));
                if (parse != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(parse);
                }
                i = i2;
            }
            if (arrayList == null) {
                return ck0.m33062j();
            }
            List<Cookie> unmodifiableList = Collections.unmodifiableList(arrayList);
            vx2.m53590f(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return unmodifiableList;
        }
    }

    private Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
    }

    public /* synthetic */ Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return Companion.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    /* renamed from: -deprecated_domain  reason: not valid java name */
    public final String m75676deprecated_domain() {
        return this.domain;
    }

    /* renamed from: -deprecated_expiresAt  reason: not valid java name */
    public final long m75677deprecated_expiresAt() {
        return this.expiresAt;
    }

    /* renamed from: -deprecated_hostOnly  reason: not valid java name */
    public final boolean m75678deprecated_hostOnly() {
        return this.hostOnly;
    }

    /* renamed from: -deprecated_httpOnly  reason: not valid java name */
    public final boolean m75679deprecated_httpOnly() {
        return this.httpOnly;
    }

    /* renamed from: -deprecated_name  reason: not valid java name */
    public final String m75680deprecated_name() {
        return this.name;
    }

    /* renamed from: -deprecated_path  reason: not valid java name */
    public final String m75681deprecated_path() {
        return this.path;
    }

    /* renamed from: -deprecated_persistent  reason: not valid java name */
    public final boolean m75682deprecated_persistent() {
        return this.persistent;
    }

    /* renamed from: -deprecated_secure  reason: not valid java name */
    public final boolean m75683deprecated_secure() {
        return this.secure;
    }

    /* renamed from: -deprecated_value  reason: not valid java name */
    public final String m75684deprecated_value() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cookie) {
            Cookie cookie = (Cookie) obj;
            if (vx2.m53586b(cookie.name, this.name) && vx2.m53586b(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && vx2.m53586b(cookie.domain, this.domain) && vx2.m53586b(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + au0.m10781a(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + ut5.m28422a(this.secure)) * 31) + ut5.m28422a(this.httpOnly)) * 31) + ut5.m28422a(this.persistent)) * 31) + ut5.m28422a(this.hostOnly);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl httpUrl) {
        boolean z;
        vx2.m53591g(httpUrl, "url");
        if (this.hostOnly) {
            z = vx2.m53586b(httpUrl.host(), this.domain);
        } else {
            z = Companion.domainMatch(httpUrl.host(), this.domain);
        }
        if (!z || !Companion.pathMatch(httpUrl, this.path)) {
            return false;
        }
        if (!this.secure || httpUrl.isHttps()) {
            return true;
        }
        return false;
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append('=');
        sb.append(value());
        if (persistent()) {
            if (expiresAt() == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DatesKt.toHttpDateString(new Date(expiresAt())));
            }
        }
        if (!hostOnly()) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(domain());
        }
        sb.append("; path=");
        sb.append(path());
        if (secure()) {
            sb.append("; secure");
        }
        if (httpOnly()) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "toString()");
        return sb2;
    }

    public final String value() {
        return this.value;
    }
}
