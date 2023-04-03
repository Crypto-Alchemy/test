package org.koin.core.error;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, mo44877d2 = {"Lorg/koin/core/error/InstanceCreationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "msg", "", "parent", "(Ljava/lang/String;Ljava/lang/Exception;)V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: InstanceCreationException.kt */
public final class InstanceCreationException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstanceCreationException(String str, Exception exc) {
        super(str, exc);
        vx2.m53591g(str, "msg");
        vx2.m53591g(exc, "parent");
    }
}
