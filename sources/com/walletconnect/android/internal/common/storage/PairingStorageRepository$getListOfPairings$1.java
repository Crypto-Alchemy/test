package com.walletconnect.android.internal.common.storage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: PairingStorageRepository.kt */
public /* synthetic */ class PairingStorageRepository$getListOfPairings$1 extends FunctionReferenceImpl implements tc2<String, Long, String, String, String, String, Boolean, String, String, String, List<? extends String>, String, kl4> {
    public PairingStorageRepository$getListOfPairings$1(Object obj) {
        super(12, obj, PairingStorageRepository.class, "toPairing", "toPairing(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/walletconnect/android/internal/common/model/Pairing;", 0);
    }

    public final kl4 invoke(String str, long j, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, List<String> list, String str9) {
        String str10 = str;
        vx2.m53591g(str10, "p0");
        String str11 = str2;
        vx2.m53591g(str11, "p2");
        String str12 = str4;
        vx2.m53591g(str12, "p4");
        String str13 = str5;
        vx2.m53591g(str13, "p5");
        return ((PairingStorageRepository) this.receiver).mo40449h(str10, j, str11, str3, str12, str13, z, str6, str7, str8, list, str9);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        return invoke((String) obj, ((Number) obj2).longValue(), (String) obj3, (String) obj4, (String) obj5, (String) obj6, ((Boolean) obj7).booleanValue(), (String) obj8, (String) obj9, (String) obj10, (List<String>) (List) obj11, (String) obj12);
    }
}
