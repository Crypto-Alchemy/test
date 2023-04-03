package com.walletconnect.sign.storage.sequence;

import com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: com.walletconnect.sign.storage.sequence.SessionStorageRepository$mapTempNamespaceToNamespaceVO$extensions$1 */
/* compiled from: SessionStorageRepository.kt */
public /* synthetic */ class C5706x4505e24c extends FunctionReferenceImpl implements id2<List<? extends String>, List<? extends String>, List<? extends String>, NamespaceVO.Session.Extension> {
    public C5706x4505e24c(Object obj) {
        super(3, obj, SessionStorageRepository.class, "mapTempNamespaceExtensionToNamespaceExtensionVO", "mapTempNamespaceExtensionToNamespaceExtensionVO(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session$Extension;", 0);
    }

    public final NamespaceVO.Session.Extension invoke(List<String> list, List<String> list2, List<String> list3) {
        vx2.m53591g(list, "p0");
        vx2.m53591g(list2, "p1");
        vx2.m53591g(list3, "p2");
        return ((SessionStorageRepository) this.receiver).mo41501B(list, list2, list3);
    }
}
