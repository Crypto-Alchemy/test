package androidx.compose.runtime;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;

@Metadata(mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo44877d2 = {"Landroidx/compose/runtime/ComposeRuntimeError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Composer.kt */
public final class ComposeRuntimeError extends IllegalStateException {
    private final String message;

    public ComposeRuntimeError(String str) {
        vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
        this.message = str;
    }

    public String getMessage() {
        return this.message;
    }
}
