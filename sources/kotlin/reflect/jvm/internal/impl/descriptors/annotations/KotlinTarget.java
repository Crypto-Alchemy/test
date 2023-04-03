package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: KotlinTarget.kt */
public enum KotlinTarget {
    CLASS("class", false, 2, (boolean) null),
    ANNOTATION_CLASS("annotation class", false, 2, (boolean) null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, (boolean) null),
    FIELD("field", false, 2, (boolean) null),
    LOCAL_VARIABLE("local variable", false, 2, (boolean) null),
    VALUE_PARAMETER("value parameter", false, 2, (boolean) null),
    CONSTRUCTOR("constructor", false, 2, (boolean) null),
    FUNCTION("function", false, 2, (boolean) null),
    PROPERTY_GETTER("getter", false, 2, (boolean) null),
    PROPERTY_SETTER("setter", false, 2, (boolean) null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", false, 2, (boolean) null),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    

    /* renamed from: A */
    public static final List<KotlinTarget> f39272A = null;

    /* renamed from: B */
    public static final List<KotlinTarget> f39273B = null;

    /* renamed from: C */
    public static final List<KotlinTarget> f39274C = null;
    public static final C7423a Companion = null;

    /* renamed from: H */
    public static final List<KotlinTarget> f39275H = null;

    /* renamed from: I */
    public static final List<KotlinTarget> f39276I = null;

    /* renamed from: L */
    public static final List<KotlinTarget> f39277L = null;

    /* renamed from: M */
    public static final Map<AnnotationUseSiteTarget, KotlinTarget> f39278M = null;

    /* renamed from: a */
    public static final HashMap<String, KotlinTarget> f39280a = null;

    /* renamed from: d */
    public static final Set<KotlinTarget> f39281d = null;

    /* renamed from: e */
    public static final Set<KotlinTarget> f39282e = null;

    /* renamed from: g */
    public static final List<KotlinTarget> f39283g = null;

    /* renamed from: k */
    public static final List<KotlinTarget> f39284k = null;

    /* renamed from: r */
    public static final List<KotlinTarget> f39285r = null;

    /* renamed from: s */
    public static final List<KotlinTarget> f39286s = null;

    /* renamed from: x */
    public static final List<KotlinTarget> f39287x = null;

    /* renamed from: y */
    public static final List<KotlinTarget> f39288y = null;
    private final String description;
    private final boolean isDefault;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget$a */
    /* compiled from: KotlinTarget.kt */
    public static final class C7423a {
        public C7423a() {
        }

        public /* synthetic */ C7423a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C7423a((DefaultConstructorMarker) null);
        f39280a = new HashMap<>();
        for (KotlinTarget kotlinTarget : values()) {
            f39280a.put(kotlinTarget.name(), kotlinTarget);
        }
        KotlinTarget[] values = values();
        ArrayList arrayList = new ArrayList();
        for (KotlinTarget kotlinTarget2 : values) {
            if (kotlinTarget2.isDefault) {
                arrayList.add(kotlinTarget2);
            }
        }
        f39281d = CollectionsKt___CollectionsKt.m47315O0(arrayList);
        f39282e = ArraysKt___ArraysKt.m47250D0(values());
        KotlinTarget kotlinTarget3 = CLASS;
        f39283g = ck0.m33065m(ANNOTATION_CLASS, kotlinTarget3);
        f39284k = ck0.m33065m(LOCAL_CLASS, kotlinTarget3);
        f39285r = ck0.m33065m(CLASS_ONLY, kotlinTarget3);
        KotlinTarget kotlinTarget4 = OBJECT;
        f39286s = ck0.m33065m(COMPANION_OBJECT, kotlinTarget4, kotlinTarget3);
        f39287x = ck0.m33065m(kotlinTarget4, kotlinTarget3);
        f39288y = ck0.m33065m(INTERFACE, kotlinTarget3);
        f39272A = ck0.m33065m(ENUM_CLASS, kotlinTarget3);
        KotlinTarget kotlinTarget5 = PROPERTY;
        KotlinTarget kotlinTarget6 = FIELD;
        f39273B = ck0.m33065m(ENUM_ENTRY, kotlinTarget5, kotlinTarget6);
        KotlinTarget kotlinTarget7 = PROPERTY_SETTER;
        f39274C = bk0.m32598e(kotlinTarget7);
        KotlinTarget kotlinTarget8 = PROPERTY_GETTER;
        f39275H = bk0.m32598e(kotlinTarget8);
        f39276I = bk0.m32598e(FUNCTION);
        KotlinTarget kotlinTarget9 = FILE;
        f39277L = bk0.m32598e(kotlinTarget9);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        KotlinTarget kotlinTarget10 = VALUE_PARAMETER;
        f39278M = C6177b.m47364l(wy6.m54142a(annotationUseSiteTarget, kotlinTarget10), wy6.m54142a(AnnotationUseSiteTarget.FIELD, kotlinTarget6), wy6.m54142a(AnnotationUseSiteTarget.PROPERTY, kotlinTarget5), wy6.m54142a(AnnotationUseSiteTarget.FILE, kotlinTarget9), wy6.m54142a(AnnotationUseSiteTarget.PROPERTY_GETTER, kotlinTarget8), wy6.m54142a(AnnotationUseSiteTarget.PROPERTY_SETTER, kotlinTarget7), wy6.m54142a(AnnotationUseSiteTarget.RECEIVER, kotlinTarget10), wy6.m54142a(AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget10), wy6.m54142a(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget6));
    }

    /* access modifiers changed from: public */
    KotlinTarget(String str, boolean z) {
        this.description = str;
        this.isDefault = z;
    }
}
