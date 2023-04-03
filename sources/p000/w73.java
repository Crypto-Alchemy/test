package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* renamed from: w73 */
/* compiled from: JvmBuiltInsSignatures.kt */
public final class w73 {

    /* renamed from: a */
    public static final w73 f45458a;

    /* renamed from: b */
    public static final Set<String> f45459b;

    /* renamed from: c */
    public static final Set<String> f45460c;

    /* renamed from: d */
    public static final Set<String> f45461d;

    /* renamed from: e */
    public static final Set<String> f45462e;

    /* renamed from: f */
    public static final Set<String> f45463f;

    /* renamed from: g */
    public static final Set<String> f45464g;

    static {
        w73 w73 = new w73();
        f45458a = w73;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f39611a;
        f45459b = oy5.m49612l(signatureBuildingComponents.mo53813f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f45460c = oy5.m49611k(oy5.m49611k(oy5.m49611k(oy5.m49611k(oy5.m49611k(oy5.m49611k(w73.mo66655b(), signatureBuildingComponents.mo53813f("List", "sort(Ljava/util/Comparator;)V")), signatureBuildingComponents.mo53812e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), signatureBuildingComponents.mo53812e("Double", "isInfinite()Z", "isNaN()Z")), signatureBuildingComponents.mo53812e("Float", "isInfinite()Z", "isNaN()Z")), signatureBuildingComponents.mo53812e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), signatureBuildingComponents.mo53812e("CharSequence", "isEmpty()Z"));
        f45461d = oy5.m49611k(oy5.m49611k(oy5.m49611k(oy5.m49611k(oy5.m49611k(oy5.m49611k(signatureBuildingComponents.mo53812e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), signatureBuildingComponents.mo53813f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), signatureBuildingComponents.mo53812e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), signatureBuildingComponents.mo53812e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), signatureBuildingComponents.mo53813f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), signatureBuildingComponents.mo53813f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), signatureBuildingComponents.mo53813f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f45462e = oy5.m49611k(oy5.m49611k(signatureBuildingComponents.mo53813f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), signatureBuildingComponents.mo53813f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), signatureBuildingComponents.mo53813f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set<String> a = w73.mo66654a();
        String[] b = signatureBuildingComponents.mo53809b("D");
        Set<T> k = oy5.m49611k(a, signatureBuildingComponents.mo53812e("Float", (String[]) Arrays.copyOf(b, b.length)));
        String[] b2 = signatureBuildingComponents.mo53809b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f45463f = oy5.m49611k(k, signatureBuildingComponents.mo53812e("String", (String[]) Arrays.copyOf(b2, b2.length)));
        String[] b3 = signatureBuildingComponents.mo53809b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f45464g = signatureBuildingComponents.mo53812e("Throwable", (String[]) Arrays.copyOf(b3, b3.length));
    }

    /* renamed from: a */
    public final Set<String> mo66654a() {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f39611a;
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BYTE;
        List<JvmPrimitiveType> m = ck0.m33065m(JvmPrimitiveType.BOOLEAN, jvmPrimitiveType, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType wrapperFqName : m) {
            String d = wrapperFqName.getWrapperFqName().mo66201g().mo65594d();
            vx2.m53590f(d, "it.wrapperFqName.shortName().asString()");
            String[] b = signatureBuildingComponents.mo53809b("Ljava/lang/String;");
            hk0.m45275z(linkedHashSet, signatureBuildingComponents.mo53812e(d, (String[]) Arrays.copyOf(b, b.length)));
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public final Set<String> mo66655b() {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f39611a;
        List<JvmPrimitiveType> m = ck0.m33065m(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : m) {
            String d = jvmPrimitiveType.getWrapperFqName().mo66201g().mo65594d();
            vx2.m53590f(d, "it.wrapperFqName.shortName().asString()");
            hk0.m45275z(linkedHashSet, signatureBuildingComponents.mo53812e(d, jvmPrimitiveType.getJavaKeywordName() + "Value()" + jvmPrimitiveType.getDesc()));
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public final Set<String> mo66656c() {
        return f45459b;
    }

    /* renamed from: d */
    public final Set<String> mo66657d() {
        return f45463f;
    }

    /* renamed from: e */
    public final Set<String> mo66658e() {
        return f45460c;
    }

    /* renamed from: f */
    public final Set<String> mo66659f() {
        return f45462e;
    }

    /* renamed from: g */
    public final Set<String> mo66660g() {
        return f45464g;
    }

    /* renamed from: h */
    public final Set<String> mo66661h() {
        return f45461d;
    }

    /* renamed from: i */
    public final boolean mo66662i(v82 v82) {
        vx2.m53591g(v82, "fqName");
        if (vx2.m53586b(v82, C7395c.C7396a.f39172i) || C7395c.m60204e(v82)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo66663j(v82 v82) {
        vx2.m53591g(v82, "fqName");
        if (mo66662i(v82)) {
            return true;
        }
        nf0 n = c23.f37039a.mo50793n(v82);
        if (n == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(n.mo62673b().mo66195b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
