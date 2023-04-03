package p000;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.scte35.PrivateCommand;
import androidx.media3.extractor.metadata.scte35.SpliceInsertCommand;
import androidx.media3.extractor.metadata.scte35.SpliceNullCommand;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import androidx.media3.extractor.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* renamed from: u66 */
/* compiled from: SpliceInfoDecoder */
public final class u66 extends q26 {

    /* renamed from: a */
    public final gm4 f18392a = new gm4();

    /* renamed from: b */
    public final fm4 f18393b = new fm4();

    /* renamed from: c */
    public sq6 f18394c;

    /* renamed from: b */
    public Metadata mo24902b(ev3 ev3, ByteBuffer byteBuffer) {
        sq6 sq6 = this.f18394c;
        if (sq6 == null || ev3.f11367y != sq6.mo25936e()) {
            sq6 sq62 = new sq6(ev3.f4594k);
            this.f18394c = sq62;
            sq62.mo25932a(ev3.f4594k - ev3.f11367y);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f18392a.mo20672N(array, limit);
        this.f18393b.mo20011o(array, limit);
        this.f18393b.mo20014r(39);
        long h = (((long) this.f18393b.mo20004h(1)) << 32) | ((long) this.f18393b.mo20004h(32));
        this.f18393b.mo20014r(20);
        int h2 = this.f18393b.mo20004h(12);
        int h3 = this.f18393b.mo20004h(8);
        Metadata.Entry entry = null;
        this.f18392a.mo20675Q(14);
        if (h3 == 0) {
            entry = new SpliceNullCommand();
        } else if (h3 == 255) {
            entry = PrivateCommand.m7697a(this.f18392a, h2, h);
        } else if (h3 == 4) {
            entry = SpliceScheduleCommand.m7710a(this.f18392a);
        } else if (h3 == 5) {
            entry = SpliceInsertCommand.m7703a(this.f18392a, h, this.f18394c);
        } else if (h3 == 6) {
            entry = TimeSignalCommand.m7723a(this.f18392a, h, this.f18394c);
        }
        if (entry == null) {
            return new Metadata(new Metadata.Entry[0]);
        }
        return new Metadata(entry);
    }
}
