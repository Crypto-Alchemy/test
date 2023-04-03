package androidx.navigation;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Ljava/util/regex/Pattern;", "invoke"}, mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
/* compiled from: NavDeepLink.kt */
public final class NavDeepLink$mimeTypePattern$2 extends Lambda implements pc2<Pattern> {
    public final /* synthetic */ NavDeepLink this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavDeepLink$mimeTypePattern$2(NavDeepLink navDeepLink) {
        super(0);
        this.this$0 = navDeepLink;
    }

    public final Pattern invoke() {
        String a = this.this$0.f6040j;
        if (a != null) {
            return Pattern.compile(a);
        }
        return null;
    }
}
