package com.walletconnect.android.internal.common.p013di;

import android.os.Build;
import com.walletconnect.android.internal.common.connection.ManualConnectionLifecycle;
import com.walletconnect.android.relay.ConnectionType;
import com.walletconnect.foundation.network.data.adapter.FlowStreamAdapter;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.scope.Scope;
import p000.fy3;
import p000.hm5;
import p000.ja6;
import p000.ju3;
import p000.mn5;
import p000.op0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Ldx3;", "Lr37;", "invoke", "(Ldx3;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.android.internal.common.di.CoreNetworkModuleKt$coreAndroidNetworkModule$1 */
/* compiled from: CoreNetworkModule.kt */
public final class CoreNetworkModuleKt$coreAndroidNetworkModule$1 extends Lambda implements rc2<dx3, r37> {
    public final /* synthetic */ ConnectionType $connectionType;
    public final /* synthetic */ String $jwt;
    public final /* synthetic */ String $sdkVersion;
    public final /* synthetic */ String $serverUrl;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreNetworkModuleKt$coreAndroidNetworkModule$1(String str, ConnectionType connectionType, String str2, String str3) {
        super(1);
        this.$sdkVersion = str;
        this.$connectionType = connectionType;
        this.$serverUrl = str2;
        this.$jwt = str3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((dx3) obj);
        return r37.f33317a;
    }

    public final void invoke(dx3 dx3) {
        vx2.m53591g(dx3, "$this$module");
        oz4 c = pz4.m71134c(AndroidCommonDITags.INTERCEPTOR);
        final String str = this.$sdkVersion;
        C55391 r5 = new fd2<Scope, ul4, Interceptor>() {
            public static final Response invoke$lambda$0(String str, Interceptor.Chain chain) {
                vx2.m53591g(str, "$sdkVersion");
                vx2.m53591g(chain, "chain");
                Request.Builder newBuilder = chain.request().newBuilder();
                String str2 = Build.VERSION.RELEASE;
                return chain.proceed(newBuilder.addHeader(Constants.USER_AGENT_HEADER_KEY, "wc-2/kotlin-" + str + "/android-" + str2).build());
            }

            public final Interceptor invoke(Scope scope, ul4 ul4) {
                vx2.m53591g(scope, "$this$single");
                vx2.m53591g(ul4, "it");
                return new xt0(str);
            }
        };
        mn5.C7904a aVar = mn5.f40974e;
        gb6 a = aVar.mo56288a();
        Kind kind = Kind.Singleton;
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(a, ua5.m52727b(Interceptor.class), c, r5, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory);
        }
        new jc3(dx3, singleInstanceFactory);
        oz4 c2 = pz4.m71134c(AndroidCommonDITags.OK_HTTP);
        C55422 r10 = new fd2<Scope, ul4, OkHttpClient>(5000) {
            public final OkHttpClient invoke(Scope scope, ul4 ul4) {
                vx2.m53591g(scope, "$this$single");
                vx2.m53591g(ul4, "it");
                OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor((Interceptor) scope.mo64988f(ua5.m52727b(Interceptor.class), pz4.m71134c(AndroidCommonDITags.INTERCEPTOR), (pc2<? extends ul4>) null));
                long j = 5000;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                return addInterceptor.writeTimeout(j, timeUnit).readTimeout(5000, timeUnit).callTimeout(5000, timeUnit).connectTimeout(5000, timeUnit).build();
            }
        };
        SingleInstanceFactory singleInstanceFactory2 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(OkHttpClient.class), c2, r10, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory2);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory2);
        }
        new jc3(dx3, singleInstanceFactory2);
        oz4 c3 = pz4.m71134c(AndroidCommonDITags.MSG_ADAPTER);
        C55433 r102 = C55433.INSTANCE;
        SingleInstanceFactory singleInstanceFactory3 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(fy3.C5855b.class), c3, r102, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory3);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory3);
        }
        new jc3(dx3, singleInstanceFactory3);
        oz4 c4 = pz4.m71134c(AndroidCommonDITags.CONNECTION_CONTROLLER);
        final ConnectionType connectionType = this.$connectionType;
        C55444 r103 = new fd2<Scope, ul4, op0>() {
            public final op0 invoke(Scope scope, ul4 ul4) {
                vx2.m53591g(scope, "$this$single");
                vx2.m53591g(ul4, "it");
                if (connectionType == ConnectionType.MANUAL) {
                    return new op0.C6322b();
                }
                return op0.C6321a.f32417a;
            }
        };
        SingleInstanceFactory singleInstanceFactory4 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(op0.class), c4, r103, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory4);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory4);
        }
        new jc3(dx3, singleInstanceFactory4);
        oz4 c5 = pz4.m71134c(AndroidCommonDITags.LIFECYCLE);
        final ConnectionType connectionType2 = this.$connectionType;
        C55455 r104 = new fd2<Scope, ul4, kg3>() {
            public final kg3 invoke(Scope scope, ul4 ul4) {
                vx2.m53591g(scope, "$this$single");
                vx2.m53591g(ul4, "it");
                if (connectionType2 != ConnectionType.MANUAL) {
                    return C6532ti.m52299b(nx3.m70098a(scope), 0, 2, (Object) null);
                }
                return new ManualConnectionLifecycle((op0) scope.mo64988f(ua5.m52727b(op0.class), pz4.m71134c(AndroidCommonDITags.CONNECTION_CONTROLLER), (pc2<? extends ul4>) null), new yg3(0, 1, (DefaultConstructorMarker) null));
            }
        };
        SingleInstanceFactory singleInstanceFactory5 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(kg3.class), c5, r104, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory5);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory5);
        }
        new jc3(dx3, singleInstanceFactory5);
        C55466 r105 = new fd2<Scope, ul4, jh3>(5) {
            public final jh3 invoke(Scope scope, ul4 ul4) {
                vx2.m53591g(scope, "$this$single");
                vx2.m53591g(ul4, "it");
                return new jh3(TimeUnit.SECONDS.toMillis(5));
            }
        };
        SingleInstanceFactory singleInstanceFactory6 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(jh3.class), (oz4) null, r105, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory6);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory6);
        }
        new jc3(dx3, singleInstanceFactory6);
        C55477 r106 = C55477.INSTANCE;
        SingleInstanceFactory singleInstanceFactory7 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(FlowStreamAdapter.C5615a.class), (oz4) null, r106, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory7);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory7);
        }
        new jc3(dx3, singleInstanceFactory7);
        oz4 c6 = pz4.m71134c(AndroidCommonDITags.SCARLET);
        final String str2 = this.$serverUrl;
        final String str3 = this.$jwt;
        C55488 r107 = new fd2<Scope, ul4, hm5>() {
            public final hm5 invoke(Scope scope, ul4 ul4) {
                vx2.m53591g(scope, "$this$single");
                vx2.m53591g(ul4, "it");
                hm5.C5925a c = new hm5.C5925a().mo43325c((C6779zw) scope.mo64988f(ua5.m52727b(jh3.class), (oz4) null, (pc2<? extends ul4>) null));
                oz4 c2 = pz4.m71134c(AndroidCommonDITags.OK_HTTP);
                String str = str2;
                String str2 = str3;
                return c.mo43333k(kg4.m47065b((OkHttpClient) scope.mo64988f(ua5.m52727b(OkHttpClient.class), c2, (pc2<? extends ul4>) null), str + "&auth=" + str2)).mo43332j((kg3) scope.mo64988f(ua5.m52727b(kg3.class), pz4.m71134c(AndroidCommonDITags.LIFECYCLE), (pc2<? extends ul4>) null)).mo43323a((ju3.C6128a) scope.mo64988f(ua5.m52727b(fy3.C5855b.class), pz4.m71134c(AndroidCommonDITags.MSG_ADAPTER), (pc2<? extends ul4>) null)).mo43324b((ja6.C6024a) scope.mo64988f(ua5.m52727b(FlowStreamAdapter.C5615a.class), (oz4) null, (pc2<? extends ul4>) null)).mo43326d();
            }
        };
        SingleInstanceFactory singleInstanceFactory8 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(hm5.class), c6, r107, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory8);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory8);
        }
        new jc3(dx3, singleInstanceFactory8);
        oz4 c7 = pz4.m71134c(AndroidCommonDITags.RELAY_SERVICE);
        C55499 r108 = C55499.INSTANCE;
        SingleInstanceFactory singleInstanceFactory9 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(ic5.class), c7, r108, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory9);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory9);
        }
        new jc3(dx3, singleInstanceFactory9);
        oz4 c8 = pz4.m71134c(AndroidCommonDITags.CONNECTIVITY_STATE);
        C554010 r109 = C554010.INSTANCE;
        SingleInstanceFactory singleInstanceFactory10 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(yp0.class), c8, r109, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory10);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory10);
        }
        new jc3(dx3, singleInstanceFactory10);
        oz4 c9 = pz4.m71134c(AndroidCommonDITags.ECHO_RETROFIT);
        C554111 r1010 = C554111.INSTANCE;
        SingleInstanceFactory singleInstanceFactory11 = new SingleInstanceFactory(new BeanDefinition(aVar.mo56288a(), ua5.m52727b(og5.class), c9, r1010, kind, ck0.m33062j()));
        dx3.mo51303g(singleInstanceFactory11);
        if (dx3.mo51300e()) {
            dx3.mo51304h(singleInstanceFactory11);
        }
        new jc3(dx3, singleInstanceFactory11);
    }
}
