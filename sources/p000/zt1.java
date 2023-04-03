package p000;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: zt1 */
/* compiled from: EventMessageDecoder */
public final class zt1 extends q26 {
    /* renamed from: b */
    public Metadata mo24902b(ev3 ev3, ByteBuffer byteBuffer) {
        return new Metadata(mo28571c(new gm4(byteBuffer.array(), byteBuffer.limit())));
    }

    /* renamed from: c */
    public EventMessage mo28571c(gm4 gm4) {
        return new EventMessage((String) C2725kr.m20985e(gm4.mo20699x()), (String) C2725kr.m20985e(gm4.mo20699x()), gm4.mo20698w(), gm4.mo20698w(), Arrays.copyOfRange(gm4.mo20679d(), gm4.mo20680e(), gm4.mo20681f()));
    }
}
