package com.onesignal.influence.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, mo44877d2 = {"Lcom/onesignal/influence/domain/OSInfluenceChannel;", "", "", "otherName", "", "equalsName", "toString", "nameValue", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "IAM", "NOTIFICATION", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
/* compiled from: OSInfluenceChannel.kt */
public enum OSInfluenceChannel {
    IAM("iam"),
    NOTIFICATION("notification");
    
    public static final C5262a Companion = null;
    private final String nameValue;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\b"}, mo44877d2 = {"Lcom/onesignal/influence/domain/OSInfluenceChannel$a;", "", "", "value", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "a", "<init>", "()V", "onesignal_release"}, mo44878k = 1, mo44879mv = {1, 4, 2})
    /* renamed from: com.onesignal.influence.domain.OSInfluenceChannel$a */
    /* compiled from: OSInfluenceChannel.kt */
    public static final class C5262a {
        public C5262a() {
        }

        public /* synthetic */ C5262a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final OSInfluenceChannel mo38913a(String str) {
            OSInfluenceChannel oSInfluenceChannel;
            if (str != null) {
                OSInfluenceChannel[] values = OSInfluenceChannel.values();
                int length = values.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        oSInfluenceChannel = null;
                        break;
                    }
                    oSInfluenceChannel = values[length];
                    if (oSInfluenceChannel.equalsName(str)) {
                        break;
                    }
                }
                if (oSInfluenceChannel != null) {
                    return oSInfluenceChannel;
                }
            }
            return OSInfluenceChannel.NOTIFICATION;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C5262a((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    OSInfluenceChannel(String str) {
        this.nameValue = str;
    }

    public static final OSInfluenceChannel fromString(String str) {
        return Companion.mo38913a(str);
    }

    public final boolean equalsName(String str) {
        vx2.m53591g(str, "otherName");
        return vx2.m53586b(this.nameValue, str);
    }

    public String toString() {
        return this.nameValue;
    }
}
