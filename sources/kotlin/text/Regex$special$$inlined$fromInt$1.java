package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo44877d2 = {"Lz32;", "", "T", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Enum;)Ljava/lang/Boolean;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Regex.kt */
public final class Regex$special$$inlined$fromInt$1 extends Lambda implements rc2<RegexOption, Boolean> {
    public final /* synthetic */ int $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Regex$special$$inlined$fromInt$1(int i) {
        super(1);
        this.$value = i;
    }

    public final Boolean invoke(RegexOption regexOption) {
        z32 z32 = regexOption;
        return Boolean.valueOf((this.$value & z32.getMask()) == z32.getValue());
    }
}
