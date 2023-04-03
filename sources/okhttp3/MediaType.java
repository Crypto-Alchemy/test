package okhttp3;

import com.fasterxml.jackson.core.JsonFactory;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0019"}, mo44877d2 = {"Lokhttp3/MediaType;", "", "mediaType", "", "type", "subtype", "parameterNamesAndValues", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "[Ljava/lang/String;", "()Ljava/lang/String;", "charset", "Ljava/nio/charset/Charset;", "defaultValue", "equals", "", "other", "hashCode", "", "parameter", "name", "-deprecated_subtype", "toString", "-deprecated_type", "Companion", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: MediaType.kt */
public final class MediaType {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    /* access modifiers changed from: private */
    public static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;

    @Metadata(mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u000fJ\u0011\u0010\u0010\u001a\u00020\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\nJ\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\u000eR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo44877d2 = {"Lokhttp3/MediaType$Companion;", "", "()V", "PARAMETER", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "QUOTED", "", "TOKEN", "TYPE_SUBTYPE", "get", "Lokhttp3/MediaType;", "mediaType", "-deprecated_get", "parse", "-deprecated_parse", "toMediaType", "toMediaTypeOrNull", "okhttp"}, mo44878k = 1, mo44879mv = {1, 6, 0}, mo44881xi = 48)
    /* compiled from: MediaType.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final MediaType m75722deprecated_get(String str) {
            vx2.m53591g(str, "mediaType");
            return get(str);
        }

        /* renamed from: -deprecated_parse  reason: not valid java name */
        public final MediaType m75723deprecated_parse(String str) {
            vx2.m53591g(str, "mediaType");
            return parse(str);
        }

        public final MediaType get(String str) {
            vx2.m53591g(str, "<this>");
            Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                vx2.m53590f(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                vx2.m53590f(locale, "US");
                String lowerCase = group.toLowerCase(locale);
                vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                vx2.m53590f(group2, "typeSubtype.group(2)");
                vx2.m53590f(locale, "US");
                String lowerCase2 = group2.toLowerCase(locale);
                vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = MediaType.PARAMETER.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (yb6.m74336M(group4, "'", false, 2, (Object) null) && yb6.m74343x(group4, "'", false, 2, (Object) null) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                vx2.m53590f(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
                        sb.append(substring);
                        sb.append("\" for: \"");
                        sb.append(str);
                        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    return new MediaType(str, lowerCase, lowerCase2, (String[]) array, (DefaultConstructorMarker) null);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + JsonFactory.DEFAULT_QUOTE_CHAR).toString());
        }

        public final MediaType parse(String str) {
            vx2.m53591g(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType2, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType2.charset(charset);
    }

    public static final MediaType get(String str) {
        return Companion.get(str);
    }

    public static final MediaType parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_subtype  reason: not valid java name */
    public final String m75720deprecated_subtype() {
        return this.subtype;
    }

    /* renamed from: -deprecated_type  reason: not valid java name */
    public final String m75721deprecated_type() {
        return this.type;
    }

    public final Charset charset() {
        return charset$default(this, (Charset) null, 1, (Object) null);
    }

    public final Charset charset(Charset charset) {
        String parameter = parameter("charset");
        if (parameter == null) {
            return charset;
        }
        try {
            return Charset.forName(parameter);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaType) || !vx2.m53586b(((MediaType) obj).mediaType, this.mediaType)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String parameter(String str) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        int i = 0;
        int b = pw4.m50172b(0, this.parameterNamesAndValues.length - 1, 2);
        if (b < 0) {
            return null;
        }
        while (true) {
            int i2 = i + 2;
            if (yb6.m74344y(this.parameterNamesAndValues[i], str, true)) {
                return this.parameterNamesAndValues[i + 1];
            }
            if (i == b) {
                return null;
            }
            i = i2;
        }
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }
}
