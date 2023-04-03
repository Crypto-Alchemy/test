package p000;

import java.util.List;
import kotlin.Metadata;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\n"}, mo44877d2 = {"Lzt0;", "", "", "accountId", "", "a", "chainId", "b", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: zt0 */
/* compiled from: CoreValidator.kt */
public final class zt0 {

    /* renamed from: a */
    public static final zt0 f36235a = new zt0();

    /* renamed from: a */
    public final /* synthetic */ boolean mo49916a(String str) {
        vx2.m53591g(str, "accountId");
        List B0 = StringsKt__StringsKt.m63061B0(str, new String[]{":"}, false, 0, 6, (Object) null);
        if (B0.isEmpty() || B0.size() != 3) {
            return false;
        }
        String str2 = (String) B0.get(1);
        String str3 = (String) B0.get(2);
        if (!new Regex("^[-a-z0-9]{3,8}$").matches((String) B0.get(0)) || !new Regex("^[-a-zA-Z0-9]{1,32}$").matches(str2) || !new Regex("^[a-zA-Z0-9]{1,64}$").matches(str3)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo49917b(String str) {
        vx2.m53591g(str, "chainId");
        List B0 = StringsKt__StringsKt.m63061B0(str, new String[]{":"}, false, 0, 6, (Object) null);
        if (B0.isEmpty() || B0.size() != 2) {
            return false;
        }
        String str2 = (String) B0.get(1);
        if (!new Regex("^[-a-z0-9]{3,8}$").matches((String) B0.get(0)) || !new Regex("^[-a-zA-Z0-9]{1,32}$").matches(str2)) {
            return false;
        }
        return true;
    }
}
