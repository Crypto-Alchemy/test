package com.walletconnect.sign.storage.sequence;

import com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SessionStorageRepository.kt */
public /* synthetic */ class SessionStorageRepository$getTempNamespaces$1 extends FunctionReferenceImpl implements md2<Long, String, List<? extends String>, List<? extends String>, List<? extends String>, Pair<? extends String, ? extends NamespaceVO.Session>> {
    public SessionStorageRepository$getTempNamespaces$1(Object obj) {
        super(5, obj, SessionStorageRepository.class, "mapTempNamespaceToNamespaceVO", "mapTempNamespaceToNamespaceVO(JLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lkotlin/Pair;", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return invoke(((Number) obj).longValue(), (String) obj2, (List<String>) (List) obj3, (List<String>) (List) obj4, (List<String>) (List) obj5);
    }

    public final Pair<String, NamespaceVO.Session> invoke(long j, String str, List<String> list, List<String> list2, List<String> list3) {
        vx2.m53591g(str, "p1");
        vx2.m53591g(list, "p2");
        vx2.m53591g(list2, "p3");
        vx2.m53591g(list3, "p4");
        return ((SessionStorageRepository) this.receiver).mo41502C(j, str, list, list2, list3);
    }
}
