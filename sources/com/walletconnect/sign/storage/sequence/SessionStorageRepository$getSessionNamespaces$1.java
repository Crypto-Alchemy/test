package com.walletconnect.sign.storage.sequence;

import com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\n¢\u0006\u0002\b\t"}, mo44877d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session;", "key", "accounts", "", "methods", "events", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SessionStorageRepository.kt */
public final class SessionStorageRepository$getSessionNamespaces$1 extends Lambda implements kd2<String, List<? extends String>, List<? extends String>, List<? extends String>, Pair<? extends String, ? extends NamespaceVO.Session>> {
    public final /* synthetic */ long $id;
    public final /* synthetic */ SessionStorageRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionStorageRepository$getSessionNamespaces$1(SessionStorageRepository sessionStorageRepository, long j) {
        super(4);
        this.this$0 = sessionStorageRepository;
        this.$id = j;
    }

    public final Pair<String, NamespaceVO.Session> invoke(String str, List<String> list, List<String> list2, List<String> list3) {
        vx2.m53591g(str, "key");
        vx2.m53591g(list, "accounts");
        vx2.m53591g(list2, "methods");
        vx2.m53591g(list3, "events");
        List b = this.this$0.f27831c.mo29865a(str, this.$id, SessionStorageRepository$getSessionNamespaces$1$extensions$1.INSTANCE).mo47566b();
        if (!(!b.isEmpty())) {
            b = null;
        }
        return wy6.m54142a(str, new NamespaceVO.Session(list, list2, list3, b));
    }
}
