package p000;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import p000.iu3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo44877d2 = {"Lyn6;", "Lju3;", "", "Liu3;", "message", "c", "data", "d", "<init>", "()V", "scarlet-message-adapter-builtin"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: yn6 */
/* compiled from: TextMessageAdapter.kt */
public final class yn6 implements ju3<String> {
    /* renamed from: c */
    public String mo42690b(iu3 iu3) {
        vx2.m53591g(iu3, ThrowableDeserializer.PROP_NAME_MESSAGE);
        if (iu3 instanceof iu3.C6007b) {
            return ((iu3.C6007b) iu3).mo43937a();
        }
        throw new IllegalArgumentException("This Message Adapter only supports text Messages");
    }

    /* renamed from: d */
    public iu3 mo42689a(String str) {
        vx2.m53591g(str, "data");
        return new iu3.C6007b(str);
    }
}
