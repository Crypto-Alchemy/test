package com.walletconnect.sign.p017di;

import com.walletconnect.android.p012di.AndroidCoreDITags;
import com.walletconnect.android.p012di.CoreStorageModuleKt;
import com.walletconnect.sign.storage.sequence.SessionStorageRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.scope.Scope;
import p000.mn5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Ldx3;", "Lr37;", "invoke", "(Ldx3;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.sign.di.StorageModuleKt$storageModule$1 */
/* compiled from: StorageModule.kt */
public final class StorageModuleKt$storageModule$1 extends Lambda implements rc2<dx3, r37> {
    public static final StorageModuleKt$storageModule$1 INSTANCE = new StorageModuleKt$storageModule$1();

    public StorageModuleKt$storageModule$1() {
        super(1);
    }

    public static final e16 invoke$createSignDB(Scope scope) {
        Class<hl0> cls = hl0.class;
        AndroidCoreDITags androidCoreDITags = AndroidCoreDITags.COLUMN_ADAPTER_LIST;
        a34 a34 = new a34((hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null), (hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null), (hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null));
        d34 d34 = new d34((hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null), (hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null), (hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null));
        sm6 sm6 = new sm6((hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null), (hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null), (hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null));
        vm6 vm6 = new vm6((hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null), (hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null), (hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null));
        return e16.f28363b.mo42115b((m76) scope.mo64988f(ua5.m52727b(m76.class), (oz4) null, (pc2<? extends ul4>) null), a34, d34, new qx4((hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null), (hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null), (hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null)), new tx4((hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null), (hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null), (hl0) scope.mo64988f(ua5.m52727b(cls), pz4.m71134c(androidCoreDITags), (pc2<? extends ul4>) null)), sm6, vm6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((dx3) obj);
        return r37.f33317a;
    }

    public final void invoke(dx3 dx3) {
        dx3 dx32 = dx3;
        vx2.m53591g(dx32, "$this$module");
        dx32.mo51302f(CoreStorageModuleKt.m42005j(e16.f28363b.mo42114a(), "WalletConnectV2.db"));
        C56291 r8 = C56291.INSTANCE;
        mn5.C7904a aVar = mn5.f40974e;
        gb6 a = aVar.mo56288a();
        Kind kind = Kind.Singleton;
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(a, ua5.m52727b(e16.class), (oz4) null, r8, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory);
        }
        new jc3(dx32, singleInstanceFactory);
        C56302 r13 = C56302.INSTANCE;
        SingleInstanceFactory singleInstanceFactory2 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(px5.class), (oz4) null, r13, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory2);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory2);
        }
        new jc3(dx32, singleInstanceFactory2);
        C56313 r132 = C56313.INSTANCE;
        SingleInstanceFactory singleInstanceFactory3 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(b34.class), (oz4) null, r132, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory3);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory3);
        }
        new jc3(dx32, singleInstanceFactory3);
        C56324 r133 = C56324.INSTANCE;
        SingleInstanceFactory singleInstanceFactory4 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(c34.class), (oz4) null, r133, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory4);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory4);
        }
        new jc3(dx32, singleInstanceFactory4);
        C56335 r134 = C56335.INSTANCE;
        SingleInstanceFactory singleInstanceFactory5 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(tm6.class), (oz4) null, r134, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory5);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory5);
        }
        new jc3(dx32, singleInstanceFactory5);
        C56346 r135 = C56346.INSTANCE;
        SingleInstanceFactory singleInstanceFactory6 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(um6.class), (oz4) null, r135, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory6);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory6);
        }
        new jc3(dx32, singleInstanceFactory6);
        C56357 r136 = C56357.INSTANCE;
        SingleInstanceFactory singleInstanceFactory7 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(rx4.class), (oz4) null, r136, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory7);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory7);
        }
        new jc3(dx32, singleInstanceFactory7);
        C56368 r137 = C56368.INSTANCE;
        SingleInstanceFactory singleInstanceFactory8 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(sx4.class), (oz4) null, r137, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory8);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory8);
        }
        new jc3(dx32, singleInstanceFactory8);
        C56379 r138 = C56379.INSTANCE;
        SingleInstanceFactory singleInstanceFactory9 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(SessionStorageRepository.class), (oz4) null, r138, kind, ck0.m33062j()));
        dx32.mo51303g(singleInstanceFactory9);
        if (dx3.mo51300e()) {
            dx32.mo51304h(singleInstanceFactory9);
        }
        new jc3(dx32, singleInstanceFactory9);
    }
}
