package com.walletconnect.sign.storage.sequence;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: SessionStorageRepository.kt */
public /* synthetic */ class SessionStorageRepository$getSessionWithoutMetadataByTopic$1 extends FunctionReferenceImpl implements rd2<Long, String, Long, String, String, String, String, String, Boolean, cy5> {
    public SessionStorageRepository$getSessionWithoutMetadataByTopic$1(Object obj) {
        super(9, obj, SessionStorageRepository.class, "mapSessionDaoToSessionVO", "mapSessionDaoToSessionVO(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/walletconnect/sign/common/model/vo/sequence/SessionVO;", 0);
    }

    public final cy5 invoke(long j, String str, long j2, String str2, String str3, String str4, String str5, String str6, boolean z) {
        String str7 = str;
        vx2.m53591g(str7, "p1");
        String str8 = str2;
        vx2.m53591g(str8, "p3");
        String str9 = str5;
        vx2.m53591g(str9, "p6");
        return ((SessionStorageRepository) this.receiver).mo41500A(j, str7, j2, str8, str3, str4, str9, str6, z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return invoke(((Number) obj).longValue(), (String) obj2, ((Number) obj3).longValue(), (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj8, ((Boolean) obj9).booleanValue());
    }
}
