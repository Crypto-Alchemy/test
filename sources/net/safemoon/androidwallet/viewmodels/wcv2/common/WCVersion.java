package net.safemoon.androidwallet.viewmodels.wcv2.common;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wcv2/common/WCVersion;", "", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "Ver1", "Ver2", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: WCCommon.kt */
public enum WCVersion {
    Ver1(1),
    Ver2(2);
    
    public static final C8931a Companion = null;
    private final int value;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/wcv2/common/WCVersion$a;", "", "", "value", "Lnet/safemoon/androidwallet/viewmodels/wcv2/common/WCVersion;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.wcv2.common.WCVersion$a */
    /* compiled from: WCCommon.kt */
    public static final class C8931a {
        public C8931a() {
        }

        public /* synthetic */ C8931a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final WCVersion mo62060a(int i) {
            if (i == 1) {
                return WCVersion.Ver1;
            }
            if (i == 2) {
                return WCVersion.Ver2;
            }
            throw new IllegalArgumentException("Unsupported value=" + i);
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C8931a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    WCVersion(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
