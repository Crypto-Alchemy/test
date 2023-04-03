package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p000.s16;

/* compiled from: predefinedEnhancementInfo.kt */
public final class PredefinedEnhancementInfoKt {

    /* renamed from: a */
    public static final j23 f39579a = new j23(NullabilityQualifier.NULLABLE, (MutabilityQualifier) null, false, false, 8, (DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final j23 f39580b;

    /* renamed from: c */
    public static final j23 f39581c;

    /* renamed from: d */
    public static final Map<String, hu4> f39582d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f39580b = new j23(nullabilityQualifier, (MutabilityQualifier) null, false, false, 8, (DefaultConstructorMarker) null);
        f39581c = new j23(nullabilityQualifier, (MutabilityQualifier) null, true, false, 8, (DefaultConstructorMarker) null);
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f39611a;
        String h = signatureBuildingComponents.mo53815h("Object");
        String g = signatureBuildingComponents.mo53814g("Predicate");
        String g2 = signatureBuildingComponents.mo53814g("Function");
        String g3 = signatureBuildingComponents.mo53814g("Consumer");
        String g4 = signatureBuildingComponents.mo53814g("BiFunction");
        String g5 = signatureBuildingComponents.mo53814g("BiConsumer");
        String g6 = signatureBuildingComponents.mo53814g("UnaryOperator");
        String i = signatureBuildingComponents.mo53816i("stream/Stream");
        String i2 = signatureBuildingComponents.mo53816i("Optional");
        s16 s16 = new s16();
        new s16.C9297a(s16, signatureBuildingComponents.mo53816i("Iterator")).mo65797a("forEachRemaining", new C7473xb250426d(g3));
        new s16.C9297a(s16, signatureBuildingComponents.mo53815h("Iterable")).mo65797a("spliterator", new C7479xb250462e(signatureBuildingComponents));
        s16.C9297a aVar = new s16.C9297a(s16, signatureBuildingComponents.mo53816i("Collection"));
        aVar.mo65797a("removeIf", new C7480xb25049ef(g));
        aVar.mo65797a("stream", new C7481xb25049f0(i));
        aVar.mo65797a("parallelStream", new C7482xb25049f1(i));
        new s16.C9297a(s16, signatureBuildingComponents.mo53816i("List")).mo65797a("replaceAll", new C7483xb2504db0(g6));
        s16.C9297a aVar2 = new s16.C9297a(s16, signatureBuildingComponents.mo53816i("Map"));
        aVar2.mo65797a("forEach", new C7484xb2505171(g5));
        aVar2.mo65797a("putIfAbsent", new C7485xb2505172(h));
        aVar2.mo65797a("replace", new C7486xb2505173(h));
        aVar2.mo65797a("replace", new C7487xb2505174(h));
        aVar2.mo65797a("replaceAll", new C7488xb2505175(g4));
        aVar2.mo65797a("compute", new C7489xb2505176(h, g4));
        aVar2.mo65797a("computeIfAbsent", new C7490xb2505177(h, g2));
        aVar2.mo65797a("computeIfPresent", new C7491xb2505178(h, g4));
        aVar2.mo65797a("merge", new C7492xb2505179(h, g4));
        s16.C9297a aVar3 = new s16.C9297a(s16, i2);
        aVar3.mo65797a("empty", new C7493xb2505532(i2));
        aVar3.mo65797a("of", new C7494xb2505533(h, i2));
        aVar3.mo65797a("ofNullable", new C7495xb2505534(h, i2));
        aVar3.mo65797a("get", new C7496xb2505535(h));
        aVar3.mo65797a("ifPresent", new C7497xb2505536(g3));
        new s16.C9297a(s16, signatureBuildingComponents.mo53815h("ref/Reference")).mo65797a("get", new C7498xb25058f3(h));
        new s16.C9297a(s16, g).mo65797a("test", new C7499xb2505cb4(h));
        new s16.C9297a(s16, signatureBuildingComponents.mo53814g("BiPredicate")).mo65797a("test", new C7500xb2506075(h));
        new s16.C9297a(s16, g3).mo65797a("accept", new C7474x97b836dd(h));
        new s16.C9297a(s16, g5).mo65797a("accept", new C7475x97b83a9e(h));
        new s16.C9297a(s16, g2).mo65797a("apply", new C7476x97b83e5f(h));
        new s16.C9297a(s16, g4).mo65797a("apply", new C7477x97b84220(h));
        new s16.C9297a(s16, signatureBuildingComponents.mo53814g("Supplier")).mo65797a("get", new C7478x97b845e1(h));
        f39582d = s16.mo65796b();
    }

    /* renamed from: d */
    public static final Map<String, hu4> m61069d() {
        return f39582d;
    }
}
