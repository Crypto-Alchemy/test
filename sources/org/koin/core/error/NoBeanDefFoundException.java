package org.koin.core.error;

import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo44877d2 = {"Lorg/koin/core/error/NoBeanDefFoundException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "msg", "", "(Ljava/lang/String;)V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: NoBeanDefFoundException.kt */
public final class NoBeanDefFoundException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoBeanDefFoundException(String str) {
        super(str);
        vx2.m53591g(str, "msg");
    }
}
