package com.walletconnect.foundation.crypto.data.repository;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H&¨\u0006\b"}, mo44877d2 = {"Lcom/walletconnect/foundation/crypto/data/repository/JwtRepository;", "", "", "serverUrl", "Lkotlin/Function1;", "Lr37;", "getIssuer", "a", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: JwtRepository.kt */
public interface JwtRepository {

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: JwtRepository.kt */
    public static final class DefaultImpls {
        /* renamed from: a */
        public static /* synthetic */ String m42468a(JwtRepository jwtRepository, String str, rc2 rc2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    rc2 = JwtRepository$generateJWT$1.INSTANCE;
                }
                return jwtRepository.mo40703a(str, rc2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateJWT");
        }
    }

    /* renamed from: a */
    String mo40703a(String str, rc2<? super String, r37> rc2);
}
