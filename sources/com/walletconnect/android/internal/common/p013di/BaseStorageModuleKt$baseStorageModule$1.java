package com.walletconnect.android.internal.common.p013di;

import com.walletconnect.android.internal.common.storage.JsonRpcHistory;
import com.walletconnect.android.p012di.AndroidCoreDITags;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.scope.Scope;
import p000.mn5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Ldx3;", "Lr37;", "invoke", "(Ldx3;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.android.internal.common.di.BaseStorageModuleKt$baseStorageModule$1 */
/* compiled from: BaseStorageModule.kt */
public final class BaseStorageModuleKt$baseStorageModule$1 extends Lambda implements rc2<dx3, r37> {
    public static final BaseStorageModuleKt$baseStorageModule$1 INSTANCE = new BaseStorageModuleKt$baseStorageModule$1();

    public BaseStorageModuleKt$baseStorageModule$1() {
        super(1);
    }

    public static final C3896bi invoke$createCoreDB(Scope scope) {
        Class<hl0> cls = hl0.class;
        return C3896bi.f21321a.mo29589b((m76) scope.mo64988f(ua5.m52727b(m76.class), pz4.m71134c(AndroidCoreDITags.ANDROID_CORE_DATABASE_DRIVER), (pc2<? extends ul4>) null), new vu3((hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(AndroidCoreDITags.COLUMN_ADAPTER_LIST), (pc2<? extends ul4>) null), (hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(AndroidCoreDITags.COLUMN_ADAPTER_APPMETADATATYPE), (pc2<? extends ul4>) null)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((dx3) obj);
        return r37.f33317a;
    }

    public final void invoke(dx3 dx3) {
        dx3 dx32 = dx3;
        Class<hl0> cls = hl0.class;
        vx2.m53591g(dx32, "$this$module");
        oz4 c = pz4.m71134c(AndroidCoreDITags.COLUMN_ADAPTER_LIST);
        C55181 r7 = C55181.INSTANCE;
        mn5.C7904a aVar = mn5.f40974e;
        gb6 a = aVar.mo56288a();
        Kind kind = Kind.Singleton;
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(a, ua5.m52727b(cls), c, r7, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory);
        }
        new jc3(dx32, singleInstanceFactory);
        oz4 c2 = pz4.m71134c(AndroidCoreDITags.COLUMN_ADAPTER_APPMETADATATYPE);
        C55202 r12 = C55202.INSTANCE;
        SingleInstanceFactory singleInstanceFactory2 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(cls), c2, r12, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory2);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory2);
        }
        new jc3(dx32, singleInstanceFactory2);
        oz4 c3 = pz4.m71134c(AndroidCoreDITags.ANDROID_CORE_DATABASE);
        C55213 r122 = C55213.INSTANCE;
        SingleInstanceFactory singleInstanceFactory3 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(C3896bi.class), c3, r122, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory3);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory3);
        }
        new jc3(dx32, singleInstanceFactory3);
        C55224 r123 = C55224.INSTANCE;
        SingleInstanceFactory singleInstanceFactory4 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(p63.class), (oz4) null, r123, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory4);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory4);
        }
        new jc3(dx32, singleInstanceFactory4);
        C55235 r124 = C55235.INSTANCE;
        SingleInstanceFactory singleInstanceFactory5 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(nl4.class), (oz4) null, r124, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory5);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory5);
        }
        new jc3(dx32, singleInstanceFactory5);
        C55246 r125 = C55246.INSTANCE;
        SingleInstanceFactory singleInstanceFactory6 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(wu3.class), (oz4) null, r125, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory6);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory6);
        }
        new jc3(dx32, singleInstanceFactory6);
        C55257 r126 = C55257.INSTANCE;
        SingleInstanceFactory singleInstanceFactory7 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(kv3.class), (oz4) null, r126, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory7);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory7);
        }
        new jc3(dx32, singleInstanceFactory7);
        C55268 r127 = C55268.INSTANCE;
        SingleInstanceFactory singleInstanceFactory8 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(ol4.class), (oz4) null, r127, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory8);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory8);
        }
        new jc3(dx32, singleInstanceFactory8);
        C55279 r128 = C55279.INSTANCE;
        SingleInstanceFactory singleInstanceFactory9 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(JsonRpcHistory.class), (oz4) null, r128, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory9);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory9);
        }
        new jc3(dx32, singleInstanceFactory9);
    }
}
