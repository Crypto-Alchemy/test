package com.walletconnect.utils;

import kotlin.Metadata;
import kotlin.Pair;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002\u001a&\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n\"\b\b\u0000\u0010\u0006*\u00020\u0005*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u001a\"\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\n*\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b\"\u0015\u0010\u0012\u001a\u00020\f*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0017\u001a\u00020\u0014*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u0019\u001a\u00020\f*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u001a"}, mo44877d2 = {"", "c", "Lnx1;", "", "g", "Lpw5;", "T", "Ldx3;", "Lq83;", "value", "Ljc3;", "b", "", "key", "a", "Lkotlin/String$Companion;", "e", "(Lcb6;)Ljava/lang/String;", "Empty", "Lkotlin/Int$Companion;", "", "d", "(Liw2;)I", "DefaultId", "f", "HexPrefix", "sdk_release"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* compiled from: UtilFunctions.kt */
public final class UtilFunctionsKt {
    /* renamed from: a */
    public static final jc3<?> m43021a(dx3 dx3, String str, q83<?> q83) {
        vx2.m53591g(dx3, "<this>");
        vx2.m53591g(str, "key");
        vx2.m53591g(q83, "value");
        String a = s83.m71896a(q83);
        gb6 d = pz4.m71135d(str + "_" + a);
        UtilFunctionsKt$addDeserializerEntry$1 utilFunctionsKt$addDeserializerEntry$1 = new UtilFunctionsKt$addDeserializerEntry$1(str, q83);
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(mn5.f40974e.mo56288a(), ua5.m52727b(Pair.class), d, utilFunctionsKt$addDeserializerEntry$1, Kind.Singleton, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory);
        }
        return new jc3<>(dx3, singleInstanceFactory);
    }

    /* renamed from: b */
    public static final <T extends pw5> jc3<?> m43022b(dx3 dx3, q83<T> q83) {
        vx2.m53591g(dx3, "<this>");
        vx2.m53591g(q83, "value");
        String a = s83.m71896a(q83);
        gb6 d = pz4.m71135d("key_" + a);
        UtilFunctionsKt$addSerializerEntry$1 utilFunctionsKt$addSerializerEntry$1 = new UtilFunctionsKt$addSerializerEntry$1(q83);
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(mn5.f40974e.mo56288a(), ua5.m52727b(q83.class), d, utilFunctionsKt$addSerializerEntry$1, Kind.Singleton, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory);
        }
        return new jc3<>(dx3, singleInstanceFactory);
    }

    /* renamed from: c */
    public static final /* synthetic */ long m43023c(long j) {
        return j / ((long) 1000);
    }

    /* renamed from: g */
    public static final /* synthetic */ boolean m43027g(nx1 nx1) {
        vx2.m53591g(nx1, "<this>");
        if (nx1.mo46241a() > fq6.m44369a()) {
            return true;
        }
        return false;
    }
}
