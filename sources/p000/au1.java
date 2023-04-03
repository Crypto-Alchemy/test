package p000;

import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* renamed from: au1 */
/* compiled from: EventMessageEncoder */
public final class au1 {

    /* renamed from: a */
    public final ByteArrayOutputStream f7761a;

    /* renamed from: b */
    public final DataOutputStream f7762b;

    public au1() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN);
        this.f7761a = byteArrayOutputStream;
        this.f7762b = new DataOutputStream(byteArrayOutputStream);
    }

    /* renamed from: b */
    public static void m10782b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public byte[] mo11145a(EventMessage eventMessage) {
        this.f7761a.reset();
        try {
            m10782b(this.f7762b, eventMessage.f5561a);
            String str = eventMessage.f5562d;
            if (str == null) {
                str = "";
            }
            m10782b(this.f7762b, str);
            this.f7762b.writeLong(eventMessage.f5563e);
            this.f7762b.writeLong(eventMessage.f5564g);
            this.f7762b.write(eventMessage.f5565k);
            this.f7762b.flush();
            return this.f7761a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
