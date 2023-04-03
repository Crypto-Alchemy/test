package p000;

import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.io.IOException;
import org.web3j.ens.contracts.generated.ENS;
import p000.f02;

/* renamed from: h48 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class h48 implements ye4<MessagingClientEvent> {

    /* renamed from: a */
    public static final h48 f29435a = new h48();

    /* renamed from: b */
    public static final f02 f29436b;

    /* renamed from: c */
    public static final f02 f29437c;

    /* renamed from: d */
    public static final f02 f29438d;

    /* renamed from: e */
    public static final f02 f29439e;

    /* renamed from: f */
    public static final f02 f29440f;

    /* renamed from: g */
    public static final f02 f29441g;

    /* renamed from: h */
    public static final f02 f29442h;

    /* renamed from: i */
    public static final f02 f29443i;

    /* renamed from: j */
    public static final f02 f29444j;

    /* renamed from: k */
    public static final f02 f29445k;

    /* renamed from: l */
    public static final f02 f29446l;

    /* renamed from: m */
    public static final f02 f29447m;

    /* renamed from: n */
    public static final f02 f29448n;

    /* renamed from: o */
    public static final f02 f29449o;

    /* renamed from: p */
    public static final f02 f29450p;

    static {
        f02.C5823b a = f02.m44116a("projectNumber");
        hj9 hj9 = new hj9();
        hj9.mo43305a(1);
        f29436b = a.mo42467b(hj9.mo43306b()).mo42466a();
        f02.C5823b a2 = f02.m44116a("messageId");
        hj9 hj92 = new hj9();
        hj92.mo43305a(2);
        f29437c = a2.mo42467b(hj92.mo43306b()).mo42466a();
        f02.C5823b a3 = f02.m44116a("instanceId");
        hj9 hj93 = new hj9();
        hj93.mo43305a(3);
        f29438d = a3.mo42467b(hj93.mo43306b()).mo42466a();
        f02.C5823b a4 = f02.m44116a("messageType");
        hj9 hj94 = new hj9();
        hj94.mo43305a(4);
        f29439e = a4.mo42467b(hj94.mo43306b()).mo42466a();
        f02.C5823b a5 = f02.m44116a("sdkPlatform");
        hj9 hj95 = new hj9();
        hj95.mo43305a(5);
        f29440f = a5.mo42467b(hj95.mo43306b()).mo42466a();
        f02.C5823b a6 = f02.m44116a("packageName");
        hj9 hj96 = new hj9();
        hj96.mo43305a(6);
        f29441g = a6.mo42467b(hj96.mo43306b()).mo42466a();
        f02.C5823b a7 = f02.m44116a("collapseKey");
        hj9 hj97 = new hj9();
        hj97.mo43305a(7);
        f29442h = a7.mo42467b(hj97.mo43306b()).mo42466a();
        f02.C5823b a8 = f02.m44116a("priority");
        hj9 hj98 = new hj9();
        hj98.mo43305a(8);
        f29443i = a8.mo42467b(hj98.mo43306b()).mo42466a();
        f02.C5823b a9 = f02.m44116a(ENS.FUNC_TTL);
        hj9 hj99 = new hj9();
        hj99.mo43305a(9);
        f29444j = a9.mo42467b(hj99.mo43306b()).mo42466a();
        f02.C5823b a10 = f02.m44116a("topic");
        hj9 hj910 = new hj9();
        hj910.mo43305a(10);
        f29445k = a10.mo42467b(hj910.mo43306b()).mo42466a();
        f02.C5823b a11 = f02.m44116a("bulkId");
        hj9 hj911 = new hj9();
        hj911.mo43305a(11);
        f29446l = a11.mo42467b(hj911.mo43306b()).mo42466a();
        f02.C5823b a12 = f02.m44116a("event");
        hj9 hj912 = new hj9();
        hj912.mo43305a(12);
        f29447m = a12.mo42467b(hj912.mo43306b()).mo42466a();
        f02.C5823b a13 = f02.m44116a("analyticsLabel");
        hj9 hj913 = new hj9();
        hj913.mo43305a(13);
        f29448n = a13.mo42467b(hj913.mo43306b()).mo42466a();
        f02.C5823b a14 = f02.m44116a("campaignId");
        hj9 hj914 = new hj9();
        hj914.mo43305a(14);
        f29449o = a14.mo42467b(hj914.mo43306b()).mo42466a();
        f02.C5823b a15 = f02.m44116a("composerLabel");
        hj9 hj915 = new hj9();
        hj915.mo43305a(15);
        f29450p = a15.mo42467b(hj915.mo43306b()).mo42466a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo29899a(Object obj, Object obj2) throws IOException {
        MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
        ze4 ze4 = (ze4) obj2;
        ze4.mo45630f(f29436b, messagingClientEvent.mo36305l());
        ze4.mo45625a(f29437c, messagingClientEvent.mo36301h());
        ze4.mo45625a(f29438d, messagingClientEvent.mo36300g());
        ze4.mo45625a(f29439e, messagingClientEvent.mo36302i());
        ze4.mo45625a(f29440f, messagingClientEvent.mo36306m());
        ze4.mo45625a(f29441g, messagingClientEvent.mo36303j());
        ze4.mo45625a(f29442h, messagingClientEvent.mo36297d());
        ze4.mo45629e(f29443i, messagingClientEvent.mo36304k());
        ze4.mo45629e(f29444j, messagingClientEvent.mo36308o());
        ze4.mo45625a(f29445k, messagingClientEvent.mo36307n());
        ze4.mo45630f(f29446l, messagingClientEvent.mo36295b());
        ze4.mo45625a(f29447m, messagingClientEvent.mo36299f());
        ze4.mo45625a(f29448n, messagingClientEvent.mo36294a());
        ze4.mo45630f(f29449o, messagingClientEvent.mo36296c());
        ze4.mo45625a(f29450p, messagingClientEvent.mo36298e());
    }
}
