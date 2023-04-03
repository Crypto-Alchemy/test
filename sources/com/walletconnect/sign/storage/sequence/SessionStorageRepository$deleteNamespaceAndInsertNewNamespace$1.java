package com.walletconnect.sign.storage.sequence;

import com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p000.nt6;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lcu6;", "Lr37;", "invoke", "(Lcu6;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SessionStorageRepository.kt */
public final class SessionStorageRepository$deleteNamespaceAndInsertNewNamespace$1 extends Lambda implements rc2<cu6, r37> {
    public final /* synthetic */ Map<String, NamespaceVO.Session> $namespaces;
    public final /* synthetic */ pc2<r37> $onFailure;
    public final /* synthetic */ pc2<r37> $onSuccess;
    public final /* synthetic */ long $requestID;
    public final /* synthetic */ long $sessionId;
    public final /* synthetic */ String $topic;
    public final /* synthetic */ SessionStorageRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionStorageRepository$deleteNamespaceAndInsertNewNamespace$1(SessionStorageRepository sessionStorageRepository, String str, Map<String, NamespaceVO.Session> map, pc2<r37> pc2, long j, long j2, pc2<r37> pc22) {
        super(1);
        this.this$0 = sessionStorageRepository;
        this.$topic = str;
        this.$namespaces = map;
        this.$onFailure = pc2;
        this.$sessionId = j;
        this.$requestID = j2;
        this.$onSuccess = pc22;
    }

    public static final void invoke$lambda$0(fd2 fd2, Object obj, Object obj2) {
        vx2.m53591g(fd2, "$tmp0");
        fd2.invoke(obj, obj2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((cu6) obj);
        return r37.f33317a;
    }

    public final void invoke(cu6 cu6) {
        vx2.m53591g(cu6, "$this$namespace");
        final pc2<r37> pc2 = this.$onFailure;
        cu6.mo39631b(new pc2<r37>() {
            public final void invoke() {
                pc2.invoke();
            }
        });
        this.this$0.f27830b.mo29444V(this.$topic);
        Map<String, NamespaceVO.Session> map = this.$namespaces;
        final SessionStorageRepository sessionStorageRepository = this.this$0;
        final long j = this.$sessionId;
        final long j2 = this.$requestID;
        map.forEach(new by5(new fd2<String, NamespaceVO.Session, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((String) obj, (NamespaceVO.Session) obj2);
                return r37.f33317a;
            }

            public final void invoke(String str, NamespaceVO.Session session) {
                vx2.m53591g(str, "key");
                vx2.m53591g(session, "<name for destructuring parameter 1>");
                String str2 = str;
                sessionStorageRepository.f27830b.mo29443N(j, str2, session.mo41003a(), session.mo41004b(), session.mo41005c(), j2);
            }
        }));
        c34 a = this.this$0.f27831c;
        final SessionStorageRepository sessionStorageRepository2 = this.this$0;
        final String str = this.$topic;
        final Map<String, NamespaceVO.Session> map2 = this.$namespaces;
        final long j3 = this.$sessionId;
        final pc2<r37> pc22 = this.$onSuccess;
        final cu6 cu62 = cu6;
        nt6.C6291a.m49014a(a, false, new rc2<cu6, r37>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((cu6) obj);
                return r37.f33317a;
            }

            public final void invoke(cu6 cu6) {
                vx2.m53591g(cu6, "$this$transaction");
                final cu6 cu62 = cu62;
                cu6.mo39631b(new pc2<r37>() {
                    public final void invoke() {
                        cu62.mo39632c();
                        throw new KotlinNothingValueException();
                    }
                });
                sessionStorageRepository2.f27831c.mo29864H(str);
                Map<String, NamespaceVO.Session> map = map2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(ao3.m31893e(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((NamespaceVO.Session) entry.getValue()).mo41011g());
                }
                SessionStorageRepository sessionStorageRepository = sessionStorageRepository2;
                long j = j3;
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str = (String) entry2.getKey();
                    List<NamespaceVO.Session.Extension> list = (List) entry2.getValue();
                    if (list != null) {
                        for (NamespaceVO.Session.Extension extension : list) {
                            sessionStorageRepository.f27831c.mo29866k(str, j, extension.mo41015a(), extension.mo41017c(), extension.mo41016b());
                        }
                    }
                }
                final pc2<r37> pc2 = pc22;
                cu6.mo39630a(new pc2<r37>() {
                    public final void invoke() {
                        pc2.invoke();
                    }
                });
            }
        }, 1, (Object) null);
    }
}
