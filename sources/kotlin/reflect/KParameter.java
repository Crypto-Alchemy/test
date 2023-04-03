package kotlin.reflect;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0001\u001aR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00128&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001b"}, mo44877d2 = {"Lkotlin/reflect/KParameter;", "Ln83;", "", "getIndex", "()I", "index", "", "getName", "()Ljava/lang/String;", "name", "Lm93;", "getType", "()Lm93;", "type", "Lkotlin/reflect/KParameter$Kind;", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "kind", "", "m", "()Z", "isOptional", "a", "isVararg$annotations", "()V", "isVararg", "Kind", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: KParameter.kt */
public interface KParameter extends n83 {

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo44877d2 = {"Lkotlin/reflect/KParameter$Kind;", "", "(Ljava/lang/String;I)V", "INSTANCE", "EXTENSION_RECEIVER", "VALUE", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: KParameter.kt */
    public enum Kind {
        INSTANCE,
        EXTENSION_RECEIVER,
        VALUE
    }

    /* renamed from: a */
    boolean mo45210a();

    int getIndex();

    Kind getKind();

    String getName();

    m93 getType();

    /* renamed from: m */
    boolean mo45215m();
}
