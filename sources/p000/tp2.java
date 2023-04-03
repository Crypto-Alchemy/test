package p000;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: tp2 */
/* compiled from: IcyDecoder */
public final class tp2 extends q26 {

    /* renamed from: c */
    public static final Pattern f18206c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    public final CharsetDecoder f18207a = be0.f21263c.newDecoder();

    /* renamed from: b */
    public final CharsetDecoder f18208b = be0.f21262b.newDecoder();

    /* renamed from: b */
    public Metadata mo24902b(ev3 ev3, ByteBuffer byteBuffer) {
        String c = mo26525c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c == null) {
            return new Metadata(new IcyInfo(bArr, (String) null, (String) null));
        }
        Matcher matcher = f18206c.matcher(c);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String e = C5876gr.m44841e(group);
                e.hashCode();
                if (e.equals("streamurl")) {
                    str2 = group2;
                } else if (e.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }

    /* renamed from: c */
    public final String mo26525c(ByteBuffer byteBuffer) {
        try {
            return this.f18207a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                return this.f18208b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f18208b.reset();
                byteBuffer.rewind();
            }
        } finally {
            this.f18207a.reset();
            byteBuffer.rewind();
        }
    }
}
