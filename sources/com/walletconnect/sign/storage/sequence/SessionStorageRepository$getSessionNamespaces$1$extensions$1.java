package com.walletconnect.sign.storage.sequence;

import com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0007"}, mo44877d2 = {"<anonymous>", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session$Extension;", "extAccounts", "", "", "extMethods", "extEvents", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SessionStorageRepository.kt */
public final class SessionStorageRepository$getSessionNamespaces$1$extensions$1 extends Lambda implements id2<List<? extends String>, List<? extends String>, List<? extends String>, NamespaceVO.Session.Extension> {
    public static final SessionStorageRepository$getSessionNamespaces$1$extensions$1 INSTANCE = new SessionStorageRepository$getSessionNamespaces$1$extensions$1();

    public SessionStorageRepository$getSessionNamespaces$1$extensions$1() {
        super(3);
    }

    public final NamespaceVO.Session.Extension invoke(List<String> list, List<String> list2, List<String> list3) {
        vx2.m53591g(list, "extAccounts");
        vx2.m53591g(list2, "extMethods");
        vx2.m53591g(list3, "extEvents");
        return new NamespaceVO.Session.Extension(list, list2, list3);
    }
}
