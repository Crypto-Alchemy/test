package p000;

import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;

/* renamed from: z26 */
/* compiled from: SimpleSubtitleDecoder */
public abstract class z26 extends f26<bd6, cd6, SubtitleDecoderException> implements yc6 {

    /* renamed from: n */
    public final String f20446n;

    /* renamed from: z26$a */
    /* compiled from: SimpleSubtitleDecoder */
    public class C3712a extends cd6 {
        public C3712a() {
        }

        /* renamed from: v */
        public void mo19507v() {
            z26.this.mo19606s(this);
        }
    }

    public z26(String str) {
        super(new bd6[2], new cd6[2]);
        this.f20446n = str;
        mo19609v(RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE);
    }

    /* renamed from: A */
    public abstract xc6 mo11312A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException;

    /* renamed from: B */
    public final SubtitleDecoderException mo19598k(bd6 bd6, cd6 cd6, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C2725kr.m20985e(bd6.f4592e);
            cd6 cd62 = cd6;
            cd62.mo12039w(bd6.f4594k, mo11312A(byteBuffer.array(), byteBuffer.limit(), z), bd6.f8069y);
            cd6.mo23889i(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    /* renamed from: b */
    public void mo18655b(long j) {
    }

    /* renamed from: x */
    public final bd6 mo19595h() {
        return new bd6();
    }

    /* renamed from: y */
    public final cd6 mo19596i() {
        return new C3712a();
    }

    /* renamed from: z */
    public final SubtitleDecoderException mo19597j(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }
}
