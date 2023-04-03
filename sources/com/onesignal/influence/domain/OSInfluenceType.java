package com.onesignal.influence.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, mo44877d2 = {"Lcom/onesignal/influence/domain/OSInfluenceType;", "", "", "isAttributed", "isDirect", "isIndirect", "isUnattributed", "isDisabled", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "DIRECT", "INDIRECT", "UNATTRIBUTED", "DISABLED", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: OSInfluenceType.kt */
public enum OSInfluenceType {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;
    
    public static final C5263a Companion = null;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, mo44877d2 = {"Lcom/onesignal/influence/domain/OSInfluenceType$a;", "", "", "value", "Lcom/onesignal/influence/domain/OSInfluenceType;", "a", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: com.onesignal.influence.domain.OSInfluenceType$a */
    /* compiled from: OSInfluenceType.kt */
    public static final class C5263a {
        public C5263a() {
        }

        public /* synthetic */ C5263a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final OSInfluenceType mo38919a(String str) {
            OSInfluenceType oSInfluenceType;
            if (str != null) {
                OSInfluenceType[] values = OSInfluenceType.values();
                int length = values.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        oSInfluenceType = null;
                        break;
                    }
                    oSInfluenceType = values[length];
                    if (yb6.m74344y(oSInfluenceType.name(), str, true)) {
                        break;
                    }
                }
                if (oSInfluenceType != null) {
                    return oSInfluenceType;
                }
            }
            return OSInfluenceType.UNATTRIBUTED;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C5263a((DefaultConstructorMarker) null);
    }

    public static final OSInfluenceType fromString(String str) {
        return Companion.mo38919a(str);
    }

    public final boolean isAttributed() {
        if (isDirect() || isIndirect()) {
            return true;
        }
        return false;
    }

    public final boolean isDirect() {
        if (this == DIRECT) {
            return true;
        }
        return false;
    }

    public final boolean isDisabled() {
        if (this == DISABLED) {
            return true;
        }
        return false;
    }

    public final boolean isIndirect() {
        if (this == INDIRECT) {
            return true;
        }
        return false;
    }

    public final boolean isUnattributed() {
        if (this == UNATTRIBUTED) {
            return true;
        }
        return false;
    }
}
