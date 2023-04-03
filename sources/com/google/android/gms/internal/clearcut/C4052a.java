package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C4052a;
import java.io.IOException;
import p000.e98;

/* renamed from: com.google.android.gms.internal.clearcut.a */
public abstract class C4052a<MessageType extends C4052a<MessageType, BuilderType>, BuilderType extends e98<MessageType, BuilderType>> implements tj8 {
    private static boolean zzey = false;
    public int zzex = 0;

    /* renamed from: b */
    public void mo30754b(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public int mo30755c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public final zzbb mo30756i() {
        try {
            C4053b zzk = zzbb.zzk(mo30774o());
            mo30772l(zzk.mo30758b());
            return zzk.mo30757a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
