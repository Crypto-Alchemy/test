package com.walletconnect.sign.storage.sequence;

import com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"", "key", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session;", "<name for destructuring parameter 1>", "Lr37;", "invoke", "(Ljava/lang/String;Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SessionStorageRepository.kt */
public final class SessionStorageRepository$insertNamespace$1 extends Lambda implements fd2<String, NamespaceVO.Session, r37> {
    public final /* synthetic */ long $requestId;
    public final /* synthetic */ long $sessionId;
    public final /* synthetic */ SessionStorageRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionStorageRepository$insertNamespace$1(SessionStorageRepository sessionStorageRepository, long j, long j2) {
        super(2);
        this.this$0 = sessionStorageRepository;
        this.$sessionId = j;
        this.$requestId = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((String) obj, (NamespaceVO.Session) obj2);
        return r37.f33317a;
    }

    public final void invoke(String str, NamespaceVO.Session session) {
        vx2.m53591g(str, "key");
        vx2.m53591g(session, "<name for destructuring parameter 1>");
        List<String> a = session.mo41003a();
        List<String> b = session.mo41004b();
        List<String> c = session.mo41005c();
        List<NamespaceVO.Session.Extension> d = session.mo41007d();
        this.this$0.f27830b.mo29443N(this.$sessionId, str, a, b, c, this.$requestId);
        if (d != null) {
            SessionStorageRepository sessionStorageRepository = this.this$0;
            long j = this.$sessionId;
            for (NamespaceVO.Session.Extension extension : d) {
                sessionStorageRepository.f27831c.mo29866k(str, j, extension.mo41015a(), extension.mo41017c(), extension.mo41016b());
            }
        }
    }
}
