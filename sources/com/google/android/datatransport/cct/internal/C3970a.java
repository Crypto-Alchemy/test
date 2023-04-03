package com.google.android.datatransport.cct.internal;

import java.io.IOException;

/* renamed from: com.google.android.datatransport.cct.internal.a */
/* compiled from: AutoBatchedLogRequestEncoder */
public final class C3970a implements to0 {

    /* renamed from: a */
    public static final to0 f21871a = new C3970a();

    /* renamed from: com.google.android.datatransport.cct.internal.a$a */
    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class C3971a implements ye4<C6153kh> {

        /* renamed from: a */
        public static final C3971a f21872a = new C3971a();

        /* renamed from: b */
        public static final f02 f21873b = f02.m44117d("sdkVersion");

        /* renamed from: c */
        public static final f02 f21874c = f02.m44117d("model");

        /* renamed from: d */
        public static final f02 f21875d = f02.m44117d("hardware");

        /* renamed from: e */
        public static final f02 f21876e = f02.m44117d("device");

        /* renamed from: f */
        public static final f02 f21877f = f02.m44117d("product");

        /* renamed from: g */
        public static final f02 f21878g = f02.m44117d("osBuild");

        /* renamed from: h */
        public static final f02 f21879h = f02.m44117d("manufacturer");

        /* renamed from: i */
        public static final f02 f21880i = f02.m44117d("fingerprint");

        /* renamed from: j */
        public static final f02 f21881j = f02.m44117d("locale");

        /* renamed from: k */
        public static final f02 f21882k = f02.m44117d("country");

        /* renamed from: l */
        public static final f02 f21883l = f02.m44117d("mccMnc");

        /* renamed from: m */
        public static final f02 f21884m = f02.m44117d("applicationBuild");

        /* renamed from: b */
        public void mo29899a(C6153kh khVar, ze4 ze4) throws IOException {
            ze4.mo45625a(f21873b, khVar.mo29079m());
            ze4.mo45625a(f21874c, khVar.mo29076j());
            ze4.mo45625a(f21875d, khVar.mo29071f());
            ze4.mo45625a(f21876e, khVar.mo29068d());
            ze4.mo45625a(f21877f, khVar.mo29078l());
            ze4.mo45625a(f21878g, khVar.mo29077k());
            ze4.mo45625a(f21879h, khVar.mo29073h());
            ze4.mo45625a(f21880i, khVar.mo29069e());
            ze4.mo45625a(f21881j, khVar.mo29072g());
            ze4.mo45625a(f21882k, khVar.mo29067c());
            ze4.mo45625a(f21883l, khVar.mo29075i());
            ze4.mo45625a(f21884m, khVar.mo29066b());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.a$b */
    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class C3972b implements ye4<e00> {

        /* renamed from: a */
        public static final C3972b f21885a = new C3972b();

        /* renamed from: b */
        public static final f02 f21886b = f02.m44117d("logRequest");

        /* renamed from: b */
        public void mo29899a(e00 e00, ze4 ze4) throws IOException {
            ze4.mo45625a(f21886b, e00.mo41717c());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.a$c */
    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class C3973c implements ye4<ClientInfo> {

        /* renamed from: a */
        public static final C3973c f21887a = new C3973c();

        /* renamed from: b */
        public static final f02 f21888b = f02.m44117d("clientType");

        /* renamed from: c */
        public static final f02 f21889c = f02.m44117d("androidClientInfo");

        /* renamed from: b */
        public void mo29899a(ClientInfo clientInfo, ze4 ze4) throws IOException {
            ze4.mo45625a(f21888b, clientInfo.mo30116c());
            ze4.mo45625a(f21889c, clientInfo.mo30115b());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.a$d */
    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class C3974d implements ye4<ik3> {

        /* renamed from: a */
        public static final C3974d f21890a = new C3974d();

        /* renamed from: b */
        public static final f02 f21891b = f02.m44117d("eventTimeMs");

        /* renamed from: c */
        public static final f02 f21892c = f02.m44117d("eventCode");

        /* renamed from: d */
        public static final f02 f21893d = f02.m44117d("eventUptimeMs");

        /* renamed from: e */
        public static final f02 f21894e = f02.m44117d("sourceExtension");

        /* renamed from: f */
        public static final f02 f21895f = f02.m44117d("sourceExtensionJsonProto3");

        /* renamed from: g */
        public static final f02 f21896g = f02.m44117d("timezoneOffsetSeconds");

        /* renamed from: h */
        public static final f02 f21897h = f02.m44117d("networkConnectionInfo");

        /* renamed from: b */
        public void mo29899a(ik3 ik3, ze4 ze4) throws IOException {
            ze4.mo45630f(f21891b, ik3.mo42663c());
            ze4.mo45625a(f21892c, ik3.mo42662b());
            ze4.mo45630f(f21893d, ik3.mo42664d());
            ze4.mo45625a(f21894e, ik3.mo42667f());
            ze4.mo45625a(f21895f, ik3.mo42668g());
            ze4.mo45630f(f21896g, ik3.mo42669h());
            ze4.mo45625a(f21897h, ik3.mo42665e());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.a$e */
    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class C3975e implements ye4<mk3> {

        /* renamed from: a */
        public static final C3975e f21898a = new C3975e();

        /* renamed from: b */
        public static final f02 f21899b = f02.m44117d("requestTimeMs");

        /* renamed from: c */
        public static final f02 f21900c = f02.m44117d("requestUptimeMs");

        /* renamed from: d */
        public static final f02 f21901d = f02.m44117d("clientInfo");

        /* renamed from: e */
        public static final f02 f21902e = f02.m44117d("logSource");

        /* renamed from: f */
        public static final f02 f21903f = f02.m44117d("logSourceName");

        /* renamed from: g */
        public static final f02 f21904g = f02.m44117d("logEvent");

        /* renamed from: h */
        public static final f02 f21905h = f02.m44117d("qosTier");

        /* renamed from: b */
        public void mo29899a(mk3 mk3, ze4 ze4) throws IOException {
            ze4.mo45630f(f21899b, mk3.mo43000g());
            ze4.mo45630f(f21900c, mk3.mo43001h());
            ze4.mo45625a(f21901d, mk3.mo42994b());
            ze4.mo45625a(f21902e, mk3.mo42996d());
            ze4.mo45625a(f21903f, mk3.mo42997e());
            ze4.mo45625a(f21904g, mk3.mo42995c());
            ze4.mo45625a(f21905h, mk3.mo42999f());
        }
    }

    /* renamed from: com.google.android.datatransport.cct.internal.a$f */
    /* compiled from: AutoBatchedLogRequestEncoder */
    public static final class C3976f implements ye4<NetworkConnectionInfo> {

        /* renamed from: a */
        public static final C3976f f21906a = new C3976f();

        /* renamed from: b */
        public static final f02 f21907b = f02.m44117d("networkType");

        /* renamed from: c */
        public static final f02 f21908c = f02.m44117d("mobileSubtype");

        /* renamed from: b */
        public void mo29899a(NetworkConnectionInfo networkConnectionInfo, ze4 ze4) throws IOException {
            ze4.mo45625a(f21907b, networkConnectionInfo.mo30121c());
            ze4.mo45625a(f21908c, networkConnectionInfo.mo30120b());
        }
    }

    /* renamed from: a */
    public void mo30128a(op1<?> op1) {
        C3972b bVar = C3972b.f21885a;
        op1.mo29879a(e00.class, bVar);
        op1.mo29879a(C5715cu.class, bVar);
        C3975e eVar = C3975e.f21898a;
        op1.mo29879a(mk3.class, eVar);
        op1.mo29879a(C5881gv.class, eVar);
        C3973c cVar = C3973c.f21887a;
        op1.mo29879a(ClientInfo.class, cVar);
        op1.mo29879a(C3977b.class, cVar);
        C3971a aVar = C3971a.f21872a;
        op1.mo29879a(C6153kh.class, aVar);
        op1.mo29879a(C3820au.class, aVar);
        C3974d dVar = C3974d.f21890a;
        op1.mo29879a(ik3.class, dVar);
        op1.mo29879a(C5850fv.class, dVar);
        C3976f fVar = C3976f.f21906a;
        op1.mo29879a(NetworkConnectionInfo.class, fVar);
        op1.mo29879a(C3980c.class, fVar);
    }
}
