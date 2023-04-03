package androidx.compose.p004ui.node;

import androidx.compose.p004ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.github.mikephil.charting.utils.Utils;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.nj4;
import p000.sw3;
import p000.vo4;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 °\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0007¥\u0002±\u0002^²\u0002B\u001d\u0012\b\b\u0002\u0010]\u001a\u00020\u0012\u0012\b\b\u0002\u0010b\u001a\u00020\u000b¢\u0006\u0006\b®\u0002\u0010¯\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0000H\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\u000f\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u0016J\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001f\u0010\u0016J'\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0000¢\u0006\u0004\b(\u0010\u0016J\b\u0010)\u001a\u00020\rH\u0016J\u000f\u0010*\u001a\u00020\u0006H\u0000¢\u0006\u0004\b*\u0010\u0016J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000bH\u0000¢\u0006\u0004\b-\u0010\u001eJ\u000f\u0010.\u001a\u00020\u0006H\u0000¢\u0006\u0004\b.\u0010\u0016J\u000f\u0010/\u001a\u00020\u0006H\u0000¢\u0006\u0004\b/\u0010\u0016J\u0017\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103J?\u0010;\u001a\u00020\u00062\u0006\u00105\u001a\u0002042\f\u00108\u001a\b\u0012\u0004\u0012\u000207062\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u0012H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J?\u0010?\u001a\u00020\u00062\u0006\u00105\u001a\u0002042\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=062\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u0012H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010<J\u000f\u0010@\u001a\u00020\u0006H\u0000¢\u0006\u0004\b@\u0010\u0016J\u000f\u0010A\u001a\u00020\u0006H\u0000¢\u0006\u0004\bA\u0010\u0016J\u000f\u0010B\u001a\u00020\u0006H\u0000¢\u0006\u0004\bB\u0010\u0016J\u0017\u0010D\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u0000H\u0000¢\u0006\u0004\bD\u0010EJ\u0019\u0010G\u001a\u00020\u00062\b\b\u0002\u0010F\u001a\u00020\u0012H\u0000¢\u0006\u0004\bG\u0010HJ\u0019\u0010I\u001a\u00020\u00062\b\b\u0002\u0010F\u001a\u00020\u0012H\u0000¢\u0006\u0004\bI\u0010HJ\u000f\u0010J\u001a\u00020\u0006H\u0000¢\u0006\u0004\bJ\u0010\u0016J\u0019\u0010K\u001a\u00020\u00062\b\b\u0002\u0010F\u001a\u00020\u0012H\u0000¢\u0006\u0004\bK\u0010HJ\u0019\u0010L\u001a\u00020\u00062\b\b\u0002\u0010F\u001a\u00020\u0012H\u0000¢\u0006\u0004\bL\u0010HJ\u000f\u0010M\u001a\u00020\u0006H\u0000¢\u0006\u0004\bM\u0010\u0016J\u000f\u0010N\u001a\u00020\u0006H\u0000¢\u0006\u0004\bN\u0010\u0016J!\u0010Q\u001a\u00020\u00122\n\b\u0002\u0010P\u001a\u0004\u0018\u00010OH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bQ\u0010RJ!\u0010S\u001a\u00020\u00122\n\b\u0002\u0010P\u001a\u0004\u0018\u00010OH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010RJ\u000f\u0010T\u001a\u00020\u0006H\u0000¢\u0006\u0004\bT\u0010\u0016J\u000f\u0010U\u001a\u00020\u0006H\u0000¢\u0006\u0004\bU\u0010\u0016J\u000f\u0010V\u001a\u00020\u0006H\u0000¢\u0006\u0004\bV\u0010\u0016J\u000f\u0010W\u001a\u00020\u0006H\u0000¢\u0006\u0004\bW\u0010\u0016J\b\u0010X\u001a\u00020\u0006H\u0016J\u000f\u0010Y\u001a\u00020\u0006H\u0000¢\u0006\u0004\bY\u0010\u0016J\u000f\u0010Z\u001a\u00020\u0006H\u0000¢\u0006\u0004\bZ\u0010\u0016R\u0014\u0010]\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001a\u0010b\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010_R\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001e\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010i8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010jR\u0016\u0010l\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u0010\\R\u0018\u0010o\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bm\u0010nR(\u0010%\u001a\u0004\u0018\u00010$2\b\u0010p\u001a\u0004\u0018\u00010$8\u0000@BX\u000e¢\u0006\f\n\u0004\b+\u0010q\u001a\u0004\br\u0010sR\"\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b,\u0010_\u001a\u0004\b,\u0010a\"\u0004\bt\u0010uR\u0016\u0010w\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bv\u0010\\R\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00000i8\u0002X\u0004¢\u0006\u0006\n\u0004\bx\u0010jR\u0016\u0010{\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bz\u0010\\R/\u0010\u0001\u001a\u00020|2\u0006\u0010}\u001a\u00020|8\u0016@VX\u000e¢\u0006\u0016\n\u0004\b~\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00030\u00018\u0000X\u0004¢\u0006\u000f\n\u0005\b_\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R2\u0010\u0001\u001a\u00030\u00012\u0007\u0010}\u001a\u00030\u00018\u0016@VX\u000e¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b+\u0010\u0001\"\u0006\b\u0001\u0010\u0001R8\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0000@BX\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R3\u0010¡\u0001\u001a\u00030\u00012\u0007\u0010}\u001a\u00030\u00018\u0016@VX\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010 \u0001R*\u0010©\u0001\u001a\u00030¢\u00018\u0016@\u0016X\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R&\u0010«\u0001\u001a\u00020\u00122\u0006\u0010p\u001a\u00020\u00128\u0016@RX\u000e¢\u0006\r\n\u0004\br\u0010\\\u001a\u0005\b[\u0010ª\u0001R&\u0010­\u0001\u001a\u00020\u000b2\u0006\u0010p\u001a\u00020\u000b8\u0000@BX\u000e¢\u0006\r\n\u0004\b`\u0010_\u001a\u0005\b¬\u0001\u0010aR'\u0010¯\u0001\u001a\u00020\u000b2\u0006\u0010p\u001a\u00020\u000b8\u0000@BX\u000e¢\u0006\u000e\n\u0005\b¥\u0001\u0010_\u001a\u0005\b®\u0001\u0010aR\u0017\u0010°\u0001\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010_R)\u0010·\u0001\u001a\u00030±\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b?\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R)\u0010¹\u0001\u001a\u00030±\u00018\u0000@\u0000X\u000e¢\u0006\u0017\n\u0005\b\b\u0010²\u0001\u001a\u0006\b\u0001\u0010´\u0001\"\u0006\b¸\u0001\u0010¶\u0001R(\u0010»\u0001\u001a\u00030±\u00018\u0000@\u0000X\u000e¢\u0006\u0016\n\u0005\b\u0011\u0010²\u0001\u001a\u0005\bz\u0010´\u0001\"\u0006\bº\u0001\u0010¶\u0001R\u0019\u0010¼\u0001\u001a\u00030±\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0013\u0010²\u0001R.\u0010Á\u0001\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\u001d\n\u0005\b½\u0001\u0010\\\u0012\u0005\bÀ\u0001\u0010\u0016\u001a\u0006\b¾\u0001\u0010ª\u0001\"\u0005\b¿\u0001\u0010HR/\u0010Ã\u0001\u001a\u00020\u00122\u0006\u0010}\u001a\u00020\u00128\u0006@FX\u000e¢\u0006\u0016\n\u0005\bÂ\u0001\u0010\\\u001a\u0006\bÃ\u0001\u0010ª\u0001\"\u0005\bÄ\u0001\u0010HR \u0010Ê\u0001\u001a\u00030Å\u00018\u0000X\u0004¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R \u0010Ð\u0001\u001a\u00030Ë\u00018\u0000X\u0004¢\u0006\u0010\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u001a\u0010Ô\u0001\u001a\u00030Ñ\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u001c\u0010Ø\u0001\u001a\u0005\u0018\u00010Õ\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R'\u0010Ü\u0001\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\u0016\n\u0005\bÙ\u0001\u0010\\\u001a\u0006\bÚ\u0001\u0010ª\u0001\"\u0005\bÛ\u0001\u0010HR3\u0010ã\u0001\u001a\u00030Ý\u00012\u0007\u0010}\u001a\u00030Ý\u00018\u0016@VX\u000e¢\u0006\u0018\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\b£\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001R8\u0010ë\u0001\u001a\u0011\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0006\u0018\u00010ä\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\bå\u0001\u0010æ\u0001\u001a\u0006\bç\u0001\u0010è\u0001\"\u0006\bé\u0001\u0010ê\u0001R8\u0010ï\u0001\u001a\u0011\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0006\u0018\u00010ä\u00018\u0000@\u0000X\u000e¢\u0006\u0018\n\u0006\bì\u0001\u0010æ\u0001\u001a\u0006\bí\u0001\u0010è\u0001\"\u0006\bî\u0001\u0010ê\u0001R'\u0010ó\u0001\u001a\u00020\u00128\u0000@\u0000X\u000e¢\u0006\u0016\n\u0005\bð\u0001\u0010\\\u001a\u0006\bñ\u0001\u0010ª\u0001\"\u0005\bò\u0001\u0010HR\u0018\u0010õ\u0001\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bô\u0001\u0010\\R\u001e\u0010ø\u0001\u001a\n\u0018\u00010ö\u0001R\u00030Ë\u00018BX\u0004¢\u0006\u0007\u001a\u0005\b_\u0010÷\u0001R\u001d\u0010û\u0001\u001a\b0ù\u0001R\u00030Ë\u00018BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010ú\u0001R\u0019\u0010ý\u0001\u001a\u0005\u0018\u00010Õ\u00018BX\u0004¢\u0006\u0007\u001a\u0005\bx\u0010ü\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00128F¢\u0006\b\u001a\u0006\bþ\u0001\u0010ÿ\u0001R\u001f\u0010\u0002\u001a\n\u0012\u0005\u0012\u00030\u00020\u00028@X\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u001f\u0010\u0002\u001a\n\u0012\u0005\u0012\u00030\u00020\u00028@X\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000i8@X\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u001e\u0010\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u00028@X\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00008@X\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0017\u0010\u0002\u001a\u00020\u00128VX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010ª\u0001R\u0018\u0010\u0002\u001a\u00030\u00028@X\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010\u0002R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000i8@X\u0004¢\u0006\u000f\u0012\u0005\b\u0002\u0010\u0016\u001a\u0006\b\u0002\u0010\u0002R\u0017\u0010\u0002\u001a\u00020\u00128VX\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010ª\u0001R\u0015\u0010\u0002\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010aR\u0016\u0010\u0002\u001a\u00020\u000b8VX\u0004¢\u0006\u0007\u001a\u0005\b\u0002\u0010aR\u0016\u0010\u0002\u001a\u00020\u00128@X\u0004¢\u0006\u0007\u001a\u0005\bm\u0010ª\u0001R\u0018\u0010 \u0002\u001a\u00030\u00028@X\u0004¢\u0006\b\u001a\u0006\b\u0002\u0010\u0002R\u0017\u0010¡\u0002\u001a\u00030Õ\u00018@X\u0004¢\u0006\u0007\u001a\u0005\bv\u0010ü\u0001R\u0018\u0010£\u0002\u001a\u00030Õ\u00018@X\u0004¢\u0006\b\u001a\u0006\b¢\u0002\u0010ü\u0001R\u0018\u0010§\u0002\u001a\u00030¤\u00028VX\u0004¢\u0006\b\u001a\u0006\b¥\u0002\u0010¦\u0002R\u0017\u0010¨\u0002\u001a\u00020\u00128@X\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010ª\u0001R\u0017\u0010ª\u0002\u001a\u00020\u00128@X\u0004¢\u0006\b\u001a\u0006\b©\u0002\u0010ª\u0001R\u0016\u0010«\u0002\u001a\u00020\u00128@X\u0004¢\u0006\u0007\u001a\u0005\b~\u0010ª\u0001R\u0017\u0010­\u0002\u001a\u00020\u00128@X\u0004¢\u0006\b\u001a\u0006\b¬\u0002\u0010ª\u0001\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006³\u0002"}, mo44877d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lkc5;", "Loj4;", "Lqe3;", "", "Lnj4$b;", "Lr37;", "C0", "k0", "child", "x0", "", "depth", "", "n", "y0", "u0", "v0", "", "b1", "m", "c1", "()V", "index", "instance", "g0", "(ILandroidx/compose/ui/node/LayoutNode;)V", "A0", "count", "G0", "(II)V", "F0", "from", "to", "w0", "(III)V", "Lnj4;", "owner", "i", "(Lnj4;)V", "p", "toString", "h0", "x", "y", "B0", "H0", "p0", "Lxa0;", "canvas", "r", "(Lxa0;)V", "Ltf4;", "pointerPosition", "Lem2;", "Lvr4;", "hitTestResult", "isTouchEvent", "isInLayer", "c0", "(JLem2;ZZ)V", "Lyt5;", "hitSemanticsEntities", "e0", "z0", "k", "j", "it", "Q0", "(Landroidx/compose/ui/node/LayoutNode;)V", "forceRequest", "O0", "(Z)V", "K0", "j0", "M0", "I0", "q", "i0", "Lmq0;", "constraints", "n0", "(Lmq0;)Z", "D0", "q0", "t0", "r0", "s0", "b", "l", "R0", "a", "Z", "isVirtual", "d", "I", "X", "()I", "semanticsId", "e", "virtualChildrenCount", "Lx04;", "g", "Lx04;", "_foldedChildren", "Lv04;", "Lv04;", "_unfoldedChildren", "unfoldedVirtualChildrenListDirty", "s", "Landroidx/compose/ui/node/LayoutNode;", "_foldedParent", "<set-?>", "Lnj4;", "U", "()Lnj4;", "setDepth$ui_release", "(I)V", "A", "ignoreRemeasureRequests", "B", "_zSortedChildren", "C", "zSortedChildrenInvalidated", "Llq3;", "value", "H", "Llq3;", "N", "()Llq3;", "W0", "(Llq3;)V", "measurePolicy", "Lxx2;", "Lxx2;", "getIntrinsicsPolicy$ui_release", "()Lxx2;", "intrinsicsPolicy", "Ldc1;", "L", "Ldc1;", "()Ldc1;", "T0", "(Ldc1;)V", "density", "Lsl3;", "newScope", "M", "Lsl3;", "K", "()Lsl3;", "V0", "(Lsl3;)V", "mLookaheadScope", "Landroidx/compose/ui/unit/LayoutDirection;", "P", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Ltb7;", "Q", "Ltb7;", "Y", "()Ltb7;", "setViewConfiguration", "(Ltb7;)V", "viewConfiguration", "()Z", "isPlaced", "W", "placeOrder", "getPreviousPlaceOrder$ui_release", "previousPlaceOrder", "nextChildPlaceOrder", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "O", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "X0", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "measuredByParent", "Y0", "measuredByParentInLookahead", "setIntrinsicsUsageByParent$ui_release", "intrinsicsUsageByParent", "previousIntrinsicsUsageByParent", "e1", "t", "S0", "getCanMultiMeasure$ui_release$annotations", "canMultiMeasure", "o1", "isLookaheadRoot", "setLookaheadRoot", "Lz74;", "p1", "Lz74;", "S", "()Lz74;", "nodes", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "q1", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "D", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutDelegate", "", "r1", "F", "zIndex", "Landroidx/compose/ui/node/NodeCoordinator;", "s1", "Landroidx/compose/ui/node/NodeCoordinator;", "_innerLayerCoordinator", "t1", "getInnerLayerCoordinatorIsDirty$ui_release", "U0", "innerLayerCoordinatorIsDirty", "Lsw3;", "u1", "Lsw3;", "()Lsw3;", "Z0", "(Lsw3;)V", "modifier", "Lkotlin/Function1;", "v1", "Lrc2;", "getOnAttach$ui_release", "()Lrc2;", "setOnAttach$ui_release", "(Lrc2;)V", "onAttach", "w1", "getOnDetach$ui_release", "setOnDetach$ui_release", "onDetach", "x1", "R", "a1", "needsOnPositionedDispatch", "y1", "relayoutWithoutParentInProgress", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerLayerCoordinator", "m0", "()Ljava/lang/Boolean;", "isPlacedInLookahead", "", "Liq3;", "v", "()Ljava/util/List;", "childMeasurables", "u", "childLookaheadMeasurables", "b0", "()Lv04;", "_children", "w", "children", "V", "()Landroidx/compose/ui/node/LayoutNode;", "parent", "l0", "isAttached", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "a0", "getZSortedChildren$annotations", "zSortedChildren", "isValid", "width", "z", "height", "alignmentLinesRequired", "Lye3;", "J", "()Lye3;", "mDrawScope", "innerCoordinator", "T", "outerCoordinator", "Lme3;", "c", "()Lme3;", "coordinates", "measurePending", "E", "layoutPending", "lookaheadMeasurePending", "G", "lookaheadLayoutPending", "<init>", "(ZI)V", "z1", "LayoutState", "UsageByParent", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.LayoutNode */
/* compiled from: LayoutNode.kt */
public final class LayoutNode implements kc5, oj4, qe3, nj4.C2902b {

    /* renamed from: A1 */
    public static final C0379d f1740A1 = new C0377b();

    /* renamed from: B1 */
    public static final pc2<LayoutNode> f1741B1 = LayoutNode$Companion$Constructor$1.INSTANCE;

    /* renamed from: C1 */
    public static final tb7 f1742C1 = new C0376a();

    /* renamed from: D1 */
    public static final Comparator<LayoutNode> f1743D1 = new we3();

    /* renamed from: z1 */
    public static final C0378c f1744z1 = new C0378c((DefaultConstructorMarker) null);

    /* renamed from: A */
    public boolean f1745A;

    /* renamed from: B */
    public final v04<LayoutNode> f1746B;

    /* renamed from: C */
    public boolean f1747C;

    /* renamed from: H */
    public lq3 f1748H;

    /* renamed from: I */
    public final xx2 f1749I;

    /* renamed from: L */
    public dc1 f1750L;

    /* renamed from: M */
    public sl3 f1751M;

    /* renamed from: P */
    public LayoutDirection f1752P;

    /* renamed from: Q */
    public tb7 f1753Q;

    /* renamed from: U */
    public boolean f1754U;

    /* renamed from: X */
    public int f1755X;

    /* renamed from: Y */
    public int f1756Y;

    /* renamed from: Z */
    public int f1757Z;

    /* renamed from: a */
    public final boolean f1758a;

    /* renamed from: b1 */
    public UsageByParent f1759b1;

    /* renamed from: d */
    public final int f1760d;

    /* renamed from: e */
    public int f1761e;

    /* renamed from: e0 */
    public UsageByParent f1762e0;

    /* renamed from: e1 */
    public boolean f1763e1;

    /* renamed from: g */
    public final x04<LayoutNode> f1764g;

    /* renamed from: k */
    public v04<LayoutNode> f1765k;

    /* renamed from: k0 */
    public UsageByParent f1766k0;

    /* renamed from: o1 */
    public boolean f1767o1;

    /* renamed from: p1 */
    public final z74 f1768p1;

    /* renamed from: q1 */
    public final LayoutNodeLayoutDelegate f1769q1;

    /* renamed from: r */
    public boolean f1770r;

    /* renamed from: r1 */
    public float f1771r1;

    /* renamed from: s */
    public LayoutNode f1772s;

    /* renamed from: s1 */
    public NodeCoordinator f1773s1;

    /* renamed from: t1 */
    public boolean f1774t1;

    /* renamed from: u1 */
    public sw3 f1775u1;

    /* renamed from: v0 */
    public UsageByParent f1776v0;

    /* renamed from: v1 */
    public rc2<? super nj4, r37> f1777v1;

    /* renamed from: w1 */
    public rc2<? super nj4, r37> f1778w1;

    /* renamed from: x */
    public nj4 f1779x;

    /* renamed from: x1 */
    public boolean f1780x1;

    /* renamed from: y */
    public int f1781y;

    /* renamed from: y1 */
    public boolean f1782y1;

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo44877d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.node.LayoutNode$LayoutState */
    /* compiled from: LayoutNode.kt */
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo44877d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.node.LayoutNode$UsageByParent */
    /* compiled from: LayoutNode.kt */
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001d\u0010\u0005\u001a\u00020\u00028VX\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0006"}, mo44877d2 = {"androidx/compose/ui/node/LayoutNode$a", "Ltb7;", "Lxi1;", "a", "()J", "minimumTouchTargetSize", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.node.LayoutNode$a */
    /* compiled from: LayoutNode.kt */
    public static final class C0376a implements tb7 {
        /* renamed from: a */
        public long mo3487a() {
            return xi1.f19843a.mo27747b();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, mo44877d2 = {"androidx/compose/ui/node/LayoutNode$b", "Landroidx/compose/ui/node/LayoutNode$d;", "Loq3;", "", "Liq3;", "measurables", "Lmq0;", "constraints", "", "b", "(Loq3;Ljava/util/List;J)Ljava/lang/Void;", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.node.LayoutNode$b */
    /* compiled from: LayoutNode.kt */
    public static final class C0377b extends C0379d {
        public C0377b() {
            super("Undefined intrinsics block and it is required");
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ mq3 mo3320a(oq3 oq3, List list, long j) {
            return (mq3) mo3488b(oq3, list, j);
        }

        /* renamed from: b */
        public Void mo3488b(oq3 oq3, List<? extends iq3> list, long j) {
            vx2.m53591g(oq3, "$this$measure");
            vx2.m53591g(list, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0000XT¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo44877d2 = {"Landroidx/compose/ui/node/LayoutNode$c;", "", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "ZComparator", "Ljava/util/Comparator;", "a", "()Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode$d;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$d;", "", "NotPlacedPlaceOrder", "I", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.node.LayoutNode$c */
    /* compiled from: LayoutNode.kt */
    public static final class C0378c {
        public C0378c() {
        }

        public /* synthetic */ C0378c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Comparator<LayoutNode> mo3489a() {
            return LayoutNode.f1743D1;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, mo44877d2 = {"Landroidx/compose/ui/node/LayoutNode$d;", "Llq3;", "", "a", "Ljava/lang/String;", "error", "<init>", "(Ljava/lang/String;)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.node.LayoutNode$d */
    /* compiled from: LayoutNode.kt */
    public static abstract class C0379d implements lq3 {

        /* renamed from: a */
        public final String f1785a;

        public C0379d(String str) {
            vx2.m53591g(str, "error");
            this.f1785a = str;
        }
    }

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: androidx.compose.ui.node.LayoutNode$e */
    /* compiled from: LayoutNode.kt */
    public /* synthetic */ class C0380e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1786a;

        static {
            int[] iArr = new int[LayoutState.values().length];
            iArr[LayoutState.Idle.ordinal()] = 1;
            f1786a = iArr;
        }
    }

    public LayoutNode() {
        this(false, 0, 3, (DefaultConstructorMarker) null);
    }

    public LayoutNode(boolean z, int i) {
        this.f1758a = z;
        this.f1760d = i;
        this.f1764g = new x04<>(new v04(new LayoutNode[16], 0), new LayoutNode$_foldedChildren$1(this));
        this.f1746B = new v04<>(new LayoutNode[16], 0);
        this.f1747C = true;
        this.f1748H = f1740A1;
        this.f1749I = new xx2(this);
        this.f1750L = fc1.m16897b(1.0f, Utils.FLOAT_EPSILON, 2, (Object) null);
        this.f1752P = LayoutDirection.Ltr;
        this.f1753Q = f1742C1;
        this.f1755X = Integer.MAX_VALUE;
        this.f1756Y = Integer.MAX_VALUE;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.f1762e0 = usageByParent;
        this.f1766k0 = usageByParent;
        this.f1776v0 = usageByParent;
        this.f1759b1 = usageByParent;
        this.f1768p1 = new z74(this);
        this.f1769q1 = new LayoutNodeLayoutDelegate(this);
        this.f1774t1 = true;
        this.f1775u1 = sw3.f17820m;
    }

    /* renamed from: E0 */
    public static /* synthetic */ boolean m2538E0(LayoutNode layoutNode, mq0 mq0, int i, Object obj) {
        if ((i & 1) != 0) {
            mq0 = layoutNode.f1769q1.mo3508p();
        }
        return layoutNode.mo3400D0(mq0);
    }

    /* renamed from: J0 */
    public static /* synthetic */ void m2539J0(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.mo3409I0(z);
    }

    /* renamed from: L0 */
    public static /* synthetic */ void m2540L0(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.mo3412K0(z);
    }

    /* renamed from: N0 */
    public static /* synthetic */ void m2541N0(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.mo3415M0(z);
    }

    /* renamed from: P0 */
    public static /* synthetic */ void m2542P0(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.mo3418O0(z);
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m2544d0(LayoutNode layoutNode, long j, em2 em2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        layoutNode.mo3446c0(j, em2, z3, z2);
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m2545f0(LayoutNode layoutNode, long j, em2 em2, boolean z, boolean z2, int i, Object obj) {
        boolean z3;
        boolean z4;
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i & 8) != 0) {
            z4 = true;
        } else {
            z4 = z2;
        }
        layoutNode.mo3448e0(j, em2, z3, z4);
    }

    /* renamed from: g */
    public static final int m2546g(LayoutNode layoutNode, LayoutNode layoutNode2) {
        boolean z;
        float f = layoutNode.f1771r1;
        float f2 = layoutNode2.f1771r1;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return vx2.m53593i(layoutNode.f1755X, layoutNode2.f1755X);
        }
        return Float.compare(f, f2);
    }

    /* renamed from: o */
    public static /* synthetic */ String m2548o(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.mo3462n(i);
    }

    /* renamed from: o0 */
    public static /* synthetic */ boolean m2549o0(LayoutNode layoutNode, mq0 mq0, int i, Object obj) {
        if ((i & 1) != 0) {
            mq0 = layoutNode.f1769q1.mo3509q();
        }
        return layoutNode.mo3463n0(mq0);
    }

    /* renamed from: A */
    public final NodeCoordinator mo3393A() {
        return this.f1768p1.mo28350m();
    }

    /* renamed from: A0 */
    public final void mo3394A0() {
        if (this.f1758a) {
            LayoutNode V = mo3430V();
            if (V != null) {
                V.mo3394A0();
                return;
            }
            return;
        }
        this.f1747C = true;
    }

    /* renamed from: B */
    public final NodeCoordinator mo3395B() {
        lj4 lj4;
        if (this.f1774t1) {
            NodeCoordinator A = mo3393A();
            NodeCoordinator R0 = mo3426T().mo3587R0();
            this.f1773s1 = null;
            while (true) {
                if (vx2.m53586b(A, R0)) {
                    break;
                }
                if (A != null) {
                    lj4 = A.mo3579J0();
                } else {
                    lj4 = null;
                }
                if (lj4 != null) {
                    this.f1773s1 = A;
                    break;
                } else if (A != null) {
                    A = A.mo3587R0();
                } else {
                    A = null;
                }
            }
        }
        NodeCoordinator nodeCoordinator = this.f1773s1;
        if (nodeCoordinator == null || nodeCoordinator.mo3579J0() != null) {
            return nodeCoordinator;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: B0 */
    public final void mo3396B0(int i, int i2) {
        NodeCoordinator nodeCoordinator;
        if (this.f1776v0 == UsageByParent.NotUsed) {
            mo3460m();
        }
        LayoutNodeLayoutDelegate.MeasurePassDelegate L = mo3413L();
        vo4.C3501a.C3502a aVar = vo4.C3501a.f18872a;
        int L2 = L.mo3545L();
        LayoutDirection layoutDirection = getLayoutDirection();
        LayoutNode V = mo3430V();
        if (V != null) {
            nodeCoordinator = V.mo3393A();
        } else {
            nodeCoordinator = null;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator;
        me3 f = vo4.C3501a.f18875d;
        int x = aVar.mo27282l();
        LayoutDirection w = aVar.mo27281k();
        LayoutNodeLayoutDelegate a = vo4.C3501a.f18876e;
        vo4.C3501a.f18874c = L2;
        vo4.C3501a.f18873b = layoutDirection;
        boolean v = aVar.mo27288y(nodeCoordinator2);
        vo4.C3501a.m29013r(aVar, L, i, i2, Utils.FLOAT_EPSILON, 4, (Object) null);
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.mo23727f0(v);
        }
        vo4.C3501a.f18874c = x;
        vo4.C3501a.f18873b = w;
        vo4.C3501a.f18875d = f;
        vo4.C3501a.f18876e = a;
    }

    /* renamed from: C */
    public final UsageByParent mo3397C() {
        return this.f1776v0;
    }

    /* renamed from: C0 */
    public final void mo3398C0() {
        if (this.f1770r) {
            int i = 0;
            this.f1770r = false;
            v04<LayoutNode> v04 = this.f1765k;
            if (v04 == null) {
                v04<LayoutNode> v042 = new v04<>(new LayoutNode[16], 0);
                this.f1765k = v042;
                v04 = v042;
            }
            v04.mo26958i();
            v04<LayoutNode> e = this.f1764g.mo27638e();
            int n = e.mo26963n();
            if (n > 0) {
                Object[] m = e.mo26962m();
                vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    LayoutNode layoutNode = (LayoutNode) m[i];
                    if (layoutNode.f1758a) {
                        v04.mo26954e(v04.mo26963n(), layoutNode.mo3443b0());
                    } else {
                        v04.mo26953c(layoutNode);
                    }
                    i++;
                } while (i < n);
            }
            this.f1769q1.mo3492C();
        }
    }

    /* renamed from: D */
    public final LayoutNodeLayoutDelegate mo3399D() {
        return this.f1769q1;
    }

    /* renamed from: D0 */
    public final boolean mo3400D0(mq0 mq0) {
        if (mq0 == null) {
            return false;
        }
        if (this.f1776v0 == UsageByParent.NotUsed) {
            mo3458l();
        }
        return mo3413L().mo3553Z(mq0.mo23282m());
    }

    /* renamed from: E */
    public final boolean mo3401E() {
        return this.f1769q1.mo3510r();
    }

    /* renamed from: F */
    public final LayoutState mo3402F() {
        return this.f1769q1.mo3511s();
    }

    /* renamed from: F0 */
    public final void mo3403F0() {
        int d = this.f1764g.mo27637d();
        while (true) {
            d--;
            if (-1 < d) {
                mo3482x0(this.f1764g.mo27636c(d));
            } else {
                this.f1764g.mo27635b();
                return;
            }
        }
    }

    /* renamed from: G */
    public final boolean mo3404G() {
        return this.f1769q1.mo3513u();
    }

    /* renamed from: G0 */
    public final void mo3405G0(int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i3 = (i2 + i) - 1;
            if (i <= i3) {
                while (true) {
                    mo3482x0(this.f1764g.mo27639f(i3));
                    if (i3 != i) {
                        i3--;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException(("count (" + i2 + ") must be greater than 0").toString());
        }
    }

    /* renamed from: H */
    public final boolean mo3406H() {
        return this.f1769q1.mo3514v();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: H0 */
    public final void mo3407H0() {
        if (this.f1776v0 == UsageByParent.NotUsed) {
            mo3460m();
        }
        try {
            this.f1782y1 = true;
            mo3413L().mo3554a0();
            this.f1782y1 = false;
        } catch (Throwable th) {
            this.f1782y1 = false;
            throw th;
        }
    }

    /* renamed from: I */
    public final LayoutNodeLayoutDelegate.LookaheadPassDelegate mo3408I() {
        return this.f1769q1.mo3515w();
    }

    /* renamed from: I0 */
    public final void mo3409I0(boolean z) {
        nj4 nj4;
        if (!this.f1758a && (nj4 = this.f1779x) != null) {
            nj4.mo3718c(this, true, z);
        }
    }

    /* renamed from: J */
    public final ye3 mo3410J() {
        return ze3.m31152a(this).getSharedDrawScope();
    }

    /* renamed from: K */
    public final sl3 mo3411K() {
        return this.f1751M;
    }

    /* renamed from: K0 */
    public final void mo3412K0(boolean z) {
        boolean z2;
        if (this.f1751M != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            nj4 nj4 = this.f1779x;
            if (nj4 != null && !this.f1745A && !this.f1758a) {
                nj4.mo3716b(this, true, z);
                LayoutNodeLayoutDelegate.LookaheadPassDelegate I = mo3408I();
                vx2.m53588d(I);
                I.mo3524X(z);
                return;
            }
            return;
        }
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
    }

    /* renamed from: L */
    public final LayoutNodeLayoutDelegate.MeasurePassDelegate mo3413L() {
        return this.f1769q1.mo3516x();
    }

    /* renamed from: M */
    public final boolean mo3414M() {
        return this.f1769q1.mo3517y();
    }

    /* renamed from: M0 */
    public final void mo3415M0(boolean z) {
        nj4 nj4;
        if (!this.f1758a && (nj4 = this.f1779x) != null) {
            mj4.m22326c(nj4, this, false, z, 2, (Object) null);
        }
    }

    /* renamed from: N */
    public lq3 mo3416N() {
        return this.f1748H;
    }

    /* renamed from: O */
    public final UsageByParent mo3417O() {
        return this.f1762e0;
    }

    /* renamed from: O0 */
    public final void mo3418O0(boolean z) {
        nj4 nj4;
        if (!this.f1745A && !this.f1758a && (nj4 = this.f1779x) != null) {
            mj4.m22325b(nj4, this, false, z, 2, (Object) null);
            mo3413L().mo3549V(z);
        }
    }

    /* renamed from: P */
    public final UsageByParent mo3419P() {
        return this.f1766k0;
    }

    /* renamed from: Q */
    public sw3 mo3420Q() {
        return this.f1775u1;
    }

    /* renamed from: Q0 */
    public final void mo3421Q0(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "it");
        if (C0380e.f1786a[layoutNode.mo3402F().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNode.mo3402F());
        } else if (layoutNode.mo3414M()) {
            layoutNode.mo3418O0(true);
        } else if (layoutNode.mo3401E()) {
            layoutNode.mo3415M0(true);
        } else if (layoutNode.mo3406H()) {
            layoutNode.mo3412K0(true);
        } else if (layoutNode.mo3404G()) {
            layoutNode.mo3409I0(true);
        }
    }

    /* renamed from: R */
    public final boolean mo3422R() {
        return this.f1780x1;
    }

    /* renamed from: R0 */
    public final void mo3423R0() {
        v04<LayoutNode> b0 = mo3443b0();
        int n = b0.mo26963n();
        if (n > 0) {
            int i = 0;
            Object[] m = b0.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode = (LayoutNode) m[i];
                UsageByParent usageByParent = layoutNode.f1759b1;
                layoutNode.f1776v0 = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.mo3423R0();
                }
                i++;
            } while (i < n);
        }
    }

    /* renamed from: S */
    public final z74 mo3424S() {
        return this.f1768p1;
    }

    /* renamed from: S0 */
    public final void mo3425S0(boolean z) {
        this.f1763e1 = z;
    }

    /* renamed from: T */
    public final NodeCoordinator mo3426T() {
        return this.f1768p1.mo28351n();
    }

    /* renamed from: T0 */
    public void mo3427T0(dc1 dc1) {
        vx2.m53591g(dc1, "value");
        if (!vx2.m53586b(this.f1750L, dc1)) {
            this.f1750L = dc1;
            mo3484y0();
        }
    }

    /* renamed from: U */
    public final nj4 mo3428U() {
        return this.f1779x;
    }

    /* renamed from: U0 */
    public final void mo3429U0(boolean z) {
        this.f1774t1 = z;
    }

    /* renamed from: V */
    public final LayoutNode mo3430V() {
        LayoutNode layoutNode = this.f1772s;
        boolean z = true;
        if (layoutNode == null || !layoutNode.f1758a) {
            z = false;
        }
        if (!z) {
            return layoutNode;
        }
        if (layoutNode != null) {
            return layoutNode.mo3430V();
        }
        return null;
    }

    /* renamed from: V0 */
    public final void mo3431V0(sl3 sl3) {
        if (!vx2.m53586b(sl3, this.f1751M)) {
            this.f1751M = sl3;
            this.f1769q1.mo3497H(sl3);
            NodeCoordinator T = mo3426T();
            NodeCoordinator Q0 = mo3393A().mo3586Q0();
            while (!vx2.m53586b(T, Q0) && T != null) {
                T.mo3642z1(sl3);
                T = T.mo3586Q0();
            }
        }
    }

    /* renamed from: W */
    public final int mo3432W() {
        return this.f1755X;
    }

    /* renamed from: W0 */
    public void mo3433W0(lq3 lq3) {
        vx2.m53591g(lq3, "value");
        if (!vx2.m53586b(this.f1748H, lq3)) {
            this.f1748H = lq3;
            this.f1749I.mo27889b(mo3416N());
            mo3455j0();
        }
    }

    /* renamed from: X */
    public int mo3434X() {
        return this.f1760d;
    }

    /* renamed from: X0 */
    public final void mo3435X0(UsageByParent usageByParent) {
        vx2.m53591g(usageByParent, "<set-?>");
        this.f1762e0 = usageByParent;
    }

    /* renamed from: Y */
    public tb7 mo3436Y() {
        return this.f1753Q;
    }

    /* renamed from: Y0 */
    public final void mo3437Y0(UsageByParent usageByParent) {
        vx2.m53591g(usageByParent, "<set-?>");
        this.f1766k0 = usageByParent;
    }

    /* renamed from: Z */
    public int mo3438Z() {
        return this.f1769q1.mo3490A();
    }

    /* renamed from: Z0 */
    public void mo3439Z0(sw3 sw3) {
        boolean z;
        LayoutNode V;
        vx2.m53591g(sw3, "value");
        if (!vx2.m53586b(sw3, this.f1775u1)) {
            if (!this.f1758a || mo3420Q() == sw3.f17820m) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f1775u1 = sw3;
                boolean b1 = mo3444b1();
                NodeCoordinator T = mo3426T();
                this.f1768p1.mo28362x(sw3);
                NodeCoordinator T2 = mo3426T();
                NodeCoordinator Q0 = mo3393A().mo3586Q0();
                while (!vx2.m53586b(T2, Q0) && T2 != null) {
                    T2.mo3610f1();
                    T2.mo3642z1(this.f1751M);
                    T2 = T2.mo3586Q0();
                }
                this.f1769q1.mo3503N();
                if ((b1 || mo3444b1()) && (V = mo3430V()) != null) {
                    V.mo3451h0();
                }
                if (!vx2.m53586b(T, mo3393A()) || !vx2.m53586b(mo3426T(), mo3393A())) {
                    mo3455j0();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
    }

    /* renamed from: a */
    public boolean mo3440a() {
        return this.f1754U;
    }

    /* renamed from: a0 */
    public final v04<LayoutNode> mo3441a0() {
        if (this.f1747C) {
            this.f1746B.mo26958i();
            v04<LayoutNode> v04 = this.f1746B;
            v04.mo26954e(v04.mo26963n(), mo3443b0());
            this.f1746B.mo26951E(f1743D1);
            this.f1747C = false;
        }
        return this.f1746B;
    }

    /* renamed from: a1 */
    public final void mo3442a1(boolean z) {
        this.f1780x1 = z;
    }

    /* renamed from: b */
    public void mo3379b() {
        NodeCoordinator A = mo3393A();
        int f = g84.f12195a.mo20430f();
        boolean c = d84.m14846c(f);
        sw3.C3310c P0 = A.mo3585P0();
        if (c || (P0 = P0.mo25989x()) != null) {
            sw3.C3310c o0 = A.mo3591U0(c);
            while (o0 != null && (o0.mo25985t() & f) != 0) {
                if ((o0.mo25988w() & f) != 0 && (o0 instanceof ke3)) {
                    ((ke3) o0).mo3364d(mo3393A());
                }
                if (o0 != P0) {
                    o0 = o0.mo25986u();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b0 */
    public final v04<LayoutNode> mo3443b0() {
        mo3447c1();
        if (this.f1761e == 0) {
            return this.f1764g.mo27638e();
        }
        v04<LayoutNode> v04 = this.f1765k;
        vx2.m53588d(v04);
        return v04;
    }

    /* renamed from: b1 */
    public final boolean mo3444b1() {
        boolean z;
        z74 z74 = this.f1768p1;
        g84 g84 = g84.f12195a;
        if (z74.mo28353p(g84.mo20426b()) && !this.f1768p1.mo28353p(g84.mo20429e())) {
            return true;
        }
        for (sw3.C3310c l = this.f1768p1.mo28349l(); l != null; l = l.mo25986u()) {
            g84 g842 = g84.f12195a;
            boolean z2 = false;
            if ((g842.mo20429e() & l.mo25988w()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (l instanceof se3) && ob1.m23743e(l, g842.mo20429e()).mo3579J0() != null) {
                return false;
            }
            if ((g842.mo20426b() & l.mo25988w()) != 0) {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: c */
    public me3 mo3445c() {
        return mo3393A();
    }

    /* renamed from: c0 */
    public final void mo3446c0(long j, em2<vr4> em2, boolean z, boolean z2) {
        vx2.m53591g(em2, "hitTestResult");
        mo3426T().mo3599Y0(NodeCoordinator.f1835v0.mo3649a(), mo3426T().mo3575F0(j), em2, z, z2);
    }

    /* renamed from: c1 */
    public final void mo3447c1() {
        if (this.f1761e > 0) {
            mo3398C0();
        }
    }

    /* renamed from: e0 */
    public final void mo3448e0(long j, em2<yt5> em2, boolean z, boolean z2) {
        vx2.m53591g(em2, "hitSemanticsEntities");
        mo3426T().mo3599Y0(NodeCoordinator.f1835v0.mo3650b(), mo3426T().mo3575F0(j), em2, true, z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [androidx.compose.ui.node.NodeCoordinator] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3449g0(int r7, androidx.compose.p004ui.node.LayoutNode r8) {
        /*
            r6 = this;
            java.lang.String r0 = "instance"
            p000.vx2.m53591g(r8, r0)
            androidx.compose.ui.node.LayoutNode r0 = r8.f1772s
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000d
            r0 = r2
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            java.lang.String r3 = " Other tree: "
            java.lang.String r4 = "Cannot insert "
            r5 = 0
            if (r0 != 0) goto L_0x0048
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r8)
            java.lang.String r0 = " because it already has a parent. This tree: "
            r7.append(r0)
            java.lang.String r0 = m2548o(r6, r1, r2, r5)
            r7.append(r0)
            r7.append(r3)
            androidx.compose.ui.node.LayoutNode r8 = r8.f1772s
            if (r8 == 0) goto L_0x0037
            java.lang.String r5 = m2548o(r8, r1, r2, r5)
        L_0x0037:
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L_0x0048:
            nj4 r0 = r8.f1779x
            if (r0 != 0) goto L_0x004e
            r0 = r2
            goto L_0x004f
        L_0x004e:
            r0 = r1
        L_0x004f:
            if (r0 == 0) goto L_0x00d6
            r8.f1772s = r6
            x04<androidx.compose.ui.node.LayoutNode> r0 = r6.f1764g
            r0.mo27634a(r7, r8)
            r6.mo3394A0()
            boolean r7 = r8.f1758a
            if (r7 == 0) goto L_0x0076
            boolean r7 = r6.f1758a
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x006a
            int r7 = r6.f1761e
            int r7 = r7 + r2
            r6.f1761e = r7
            goto L_0x0076
        L_0x006a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Virtual LayoutNode can't be added into a virtual parent"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0076:
            r6.mo3457k0()
            androidx.compose.ui.node.NodeCoordinator r7 = r8.mo3426T()
            boolean r0 = r6.f1758a
            if (r0 == 0) goto L_0x008a
            androidx.compose.ui.node.LayoutNode r0 = r6.f1772s
            if (r0 == 0) goto L_0x008e
            androidx.compose.ui.node.NodeCoordinator r5 = r0.mo3393A()
            goto L_0x008e
        L_0x008a:
            androidx.compose.ui.node.NodeCoordinator r5 = r6.mo3393A()
        L_0x008e:
            r7.mo3626r1(r5)
            boolean r7 = r8.f1758a
            if (r7 == 0) goto L_0x00bc
            x04<androidx.compose.ui.node.LayoutNode> r7 = r8.f1764g
            v04 r7 = r7.mo27638e()
            int r0 = r7.mo26963n()
            if (r0 <= 0) goto L_0x00bc
            java.lang.Object[] r7 = r7.mo26962m()
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>"
            p000.vx2.m53589e(r7, r3)
        L_0x00aa:
            r3 = r7[r1]
            androidx.compose.ui.node.LayoutNode r3 = (androidx.compose.p004ui.node.LayoutNode) r3
            androidx.compose.ui.node.NodeCoordinator r3 = r3.mo3426T()
            androidx.compose.ui.node.NodeCoordinator r4 = r6.mo3393A()
            r3.mo3626r1(r4)
            int r1 = r1 + r2
            if (r1 < r0) goto L_0x00aa
        L_0x00bc:
            nj4 r7 = r6.f1779x
            if (r7 == 0) goto L_0x00c3
            r8.mo3452i(r7)
        L_0x00c3:
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r7 = r8.f1769q1
            int r7 = r7.mo3505m()
            if (r7 <= 0) goto L_0x00d5
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r7 = r6.f1769q1
            int r8 = r7.mo3505m()
            int r8 = r8 + r2
            r7.mo3501L(r8)
        L_0x00d5:
            return
        L_0x00d6:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r8)
            java.lang.String r0 = " because it already has an owner. This tree: "
            r7.append(r0)
            java.lang.String r0 = m2548o(r6, r1, r2, r5)
            r7.append(r0)
            r7.append(r3)
            java.lang.String r8 = m2548o(r8, r1, r2, r5)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.node.LayoutNode.mo3449g0(int, androidx.compose.ui.node.LayoutNode):void");
    }

    public LayoutDirection getLayoutDirection() {
        return this.f1752P;
    }

    /* renamed from: h0 */
    public final void mo3451h0() {
        NodeCoordinator B = mo3395B();
        if (B != null) {
            B.mo3603a1();
            return;
        }
        LayoutNode V = mo3430V();
        if (V != null) {
            V.mo3451h0();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: sl3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3452i(p000.nj4 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "owner"
            p000.vx2.m53591g(r7, r0)
            nj4 r0 = r6.f1779x
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000d
            r0 = r2
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            r3 = 0
            if (r0 == 0) goto L_0x00f4
            androidx.compose.ui.node.LayoutNode r0 = r6.f1772s
            if (r0 == 0) goto L_0x0024
            if (r0 == 0) goto L_0x001a
            nj4 r0 = r0.f1779x
            goto L_0x001b
        L_0x001a:
            r0 = r3
        L_0x001b:
            boolean r0 = p000.vx2.m53586b(r0, r7)
            if (r0 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r0 = r1
            goto L_0x0025
        L_0x0024:
            r0 = r2
        L_0x0025:
            if (r0 != 0) goto L_0x0070
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Attaching to a different owner("
            r0.append(r4)
            r0.append(r7)
            java.lang.String r7 = ") than the parent's owner("
            r0.append(r7)
            androidx.compose.ui.node.LayoutNode r7 = r6.mo3430V()
            if (r7 == 0) goto L_0x0042
            nj4 r7 = r7.f1779x
            goto L_0x0043
        L_0x0042:
            r7 = r3
        L_0x0043:
            r0.append(r7)
            java.lang.String r7 = "). This tree: "
            r0.append(r7)
            java.lang.String r7 = m2548o(r6, r1, r2, r3)
            r0.append(r7)
            java.lang.String r7 = " Parent tree: "
            r0.append(r7)
            androidx.compose.ui.node.LayoutNode r7 = r6.f1772s
            if (r7 == 0) goto L_0x005f
            java.lang.String r3 = m2548o(r7, r1, r2, r3)
        L_0x005f:
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x0070:
            androidx.compose.ui.node.LayoutNode r0 = r6.mo3430V()
            if (r0 != 0) goto L_0x0078
            r6.f1754U = r2
        L_0x0078:
            r6.f1779x = r7
            if (r0 == 0) goto L_0x007f
            int r4 = r0.f1781y
            goto L_0x0080
        L_0x007f:
            r4 = -1
        L_0x0080:
            int r4 = r4 + r2
            r6.f1781y = r4
            yt5 r4 = p000.au5.m10806j(r6)
            if (r4 == 0) goto L_0x008c
            r7.mo3802u()
        L_0x008c:
            r7.mo3773m(r6)
            if (r0 == 0) goto L_0x0098
            sl3 r4 = r0.f1751M
            if (r4 != 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r3 = r4
            goto L_0x00a1
        L_0x0098:
            boolean r4 = r6.f1767o1
            if (r4 == 0) goto L_0x00a1
            sl3 r3 = new sl3
            r3.<init>(r6)
        L_0x00a1:
            r6.mo3431V0(r3)
            z74 r3 = r6.f1768p1
            r3.mo28343f()
            x04<androidx.compose.ui.node.LayoutNode> r3 = r6.f1764g
            v04 r3 = r3.mo27638e()
            int r4 = r3.mo26963n()
            if (r4 <= 0) goto L_0x00c8
            java.lang.Object[] r3 = r3.mo26962m()
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>"
            p000.vx2.m53589e(r3, r5)
        L_0x00be:
            r5 = r3[r1]
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.p004ui.node.LayoutNode) r5
            r5.mo3452i(r7)
            int r1 = r1 + r2
            if (r1 < r4) goto L_0x00be
        L_0x00c8:
            r6.mo3455j0()
            if (r0 == 0) goto L_0x00d0
            r0.mo3455j0()
        L_0x00d0:
            androidx.compose.ui.node.NodeCoordinator r0 = r6.mo3426T()
            androidx.compose.ui.node.NodeCoordinator r1 = r6.mo3393A()
            androidx.compose.ui.node.NodeCoordinator r1 = r1.mo3586Q0()
        L_0x00dc:
            boolean r2 = p000.vx2.m53586b(r0, r1)
            if (r2 != 0) goto L_0x00ec
            if (r0 == 0) goto L_0x00ec
            r0.mo3634w0()
            androidx.compose.ui.node.NodeCoordinator r0 = r0.mo3586Q0()
            goto L_0x00dc
        L_0x00ec:
            rc2<? super nj4, r37> r0 = r6.f1777v1
            if (r0 == 0) goto L_0x00f3
            r0.invoke(r7)
        L_0x00f3:
            return
        L_0x00f4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Cannot attach "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = " as it already is attached.  Tree: "
            r7.append(r0)
            java.lang.String r0 = m2548o(r6, r1, r2, r3)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.node.LayoutNode.mo3452i(nj4):void");
    }

    /* renamed from: i0 */
    public final void mo3453i0() {
        NodeCoordinator T = mo3426T();
        NodeCoordinator A = mo3393A();
        while (T != A) {
            vx2.m53589e(T, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            te3 te3 = (te3) T;
            lj4 J0 = te3.mo3579J0();
            if (J0 != null) {
                J0.invalidate();
            }
            T = te3.mo3586Q0();
        }
        lj4 J02 = mo3393A().mo3579J0();
        if (J02 != null) {
            J02.invalidate();
        }
    }

    public boolean isValid() {
        return mo3459l0();
    }

    /* renamed from: j */
    public final void mo3454j() {
        v04<LayoutNode> b0 = mo3443b0();
        int n = b0.mo26963n();
        if (n > 0) {
            int i = 0;
            Object[] m = b0.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode = (LayoutNode) m[i];
                if (layoutNode.f1756Y != layoutNode.f1755X) {
                    mo3394A0();
                    mo3451h0();
                    if (layoutNode.f1755X == Integer.MAX_VALUE) {
                        layoutNode.mo3478v0();
                    }
                }
                i++;
            } while (i < n);
        }
    }

    /* renamed from: j0 */
    public final void mo3455j0() {
        if (this.f1751M != null) {
            m2540L0(this, false, 1, (Object) null);
        } else {
            m2542P0(this, false, 1, (Object) null);
        }
    }

    /* renamed from: k */
    public final void mo3456k() {
        int i = 0;
        this.f1757Z = 0;
        v04<LayoutNode> b0 = mo3443b0();
        int n = b0.mo26963n();
        if (n > 0) {
            Object[] m = b0.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode = (LayoutNode) m[i];
                layoutNode.f1756Y = layoutNode.f1755X;
                layoutNode.f1755X = Integer.MAX_VALUE;
                if (layoutNode.f1762e0 == UsageByParent.InLayoutBlock) {
                    layoutNode.f1762e0 = UsageByParent.NotUsed;
                }
                i++;
            } while (i < n);
        }
    }

    /* renamed from: k0 */
    public final void mo3457k0() {
        LayoutNode V;
        if (this.f1761e > 0) {
            this.f1770r = true;
        }
        if (this.f1758a && (V = mo3430V()) != null) {
            V.f1770r = true;
        }
    }

    /* renamed from: l */
    public final void mo3458l() {
        this.f1759b1 = this.f1776v0;
        this.f1776v0 = UsageByParent.NotUsed;
        v04<LayoutNode> b0 = mo3443b0();
        int n = b0.mo26963n();
        if (n > 0) {
            int i = 0;
            Object[] m = b0.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode = (LayoutNode) m[i];
                if (layoutNode.f1776v0 != UsageByParent.NotUsed) {
                    layoutNode.mo3458l();
                }
                i++;
            } while (i < n);
        }
    }

    /* renamed from: l0 */
    public boolean mo3459l0() {
        if (this.f1779x != null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void mo3460m() {
        this.f1759b1 = this.f1776v0;
        this.f1776v0 = UsageByParent.NotUsed;
        v04<LayoutNode> b0 = mo3443b0();
        int n = b0.mo26963n();
        if (n > 0) {
            int i = 0;
            Object[] m = b0.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode = (LayoutNode) m[i];
                if (layoutNode.f1776v0 == UsageByParent.InLayoutBlock) {
                    layoutNode.mo3460m();
                }
                i++;
            } while (i < n);
        }
    }

    /* renamed from: m0 */
    public final Boolean mo3461m0() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate I = mo3408I();
        if (I != null) {
            return Boolean.valueOf(I.mo3527a());
        }
        return null;
    }

    /* renamed from: n */
    public final String mo3462n(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append(10);
        v04<LayoutNode> b0 = mo3443b0();
        int n = b0.mo26963n();
        if (n > 0) {
            Object[] m = b0.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i3 = 0;
            do {
                sb.append(((LayoutNode) m[i3]).mo3462n(i + 1));
                i3++;
            } while (i3 < n);
        }
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "tree.toString()");
        if (i != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        vx2.m53590f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: n0 */
    public final boolean mo3463n0(mq0 mq0) {
        if (mq0 == null || this.f1751M == null) {
            return false;
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate I = mo3408I();
        vx2.m53588d(I);
        return I.mo3532c0(mq0.mo23282m());
    }

    /* renamed from: p */
    public final void mo3464p() {
        nj4 nj4 = this.f1779x;
        String str = null;
        if (nj4 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode V = mo3430V();
            if (V != null) {
                str = m2548o(V, 0, 1, (Object) null);
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString().toString());
        }
        LayoutNode V2 = mo3430V();
        if (V2 != null) {
            V2.mo3451h0();
            V2.mo3455j0();
            this.f1762e0 = UsageByParent.NotUsed;
        }
        this.f1769q1.mo3500K();
        rc2<? super nj4, r37> rc2 = this.f1778w1;
        if (rc2 != null) {
            rc2.invoke(nj4);
        }
        NodeCoordinator T = mo3426T();
        NodeCoordinator Q0 = mo3393A().mo3586Q0();
        while (!vx2.m53586b(T, Q0) && T != null) {
            T.mo3641z0();
            T = T.mo3586Q0();
        }
        if (au5.m10806j(this) != null) {
            nj4.mo3802u();
        }
        this.f1768p1.mo28345h();
        nj4.mo3792q(this);
        this.f1779x = null;
        this.f1781y = 0;
        v04<LayoutNode> e = this.f1764g.mo27638e();
        int n = e.mo26963n();
        if (n > 0) {
            Object[] m = e.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i = 0;
            do {
                ((LayoutNode) m[i]).mo3464p();
                i++;
            } while (i < n);
        }
        this.f1755X = Integer.MAX_VALUE;
        this.f1756Y = Integer.MAX_VALUE;
        this.f1754U = false;
    }

    /* renamed from: p0 */
    public final void mo3465p0() {
        if (this.f1776v0 == UsageByParent.NotUsed) {
            mo3460m();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate I = mo3408I();
        vx2.m53588d(I);
        I.mo3534d0();
    }

    /* renamed from: q */
    public final void mo3466q() {
        if (mo3402F() == LayoutState.Idle && !mo3401E() && !mo3414M() && mo3440a()) {
            z74 z74 = this.f1768p1;
            int c = g84.f12195a.mo20427c();
            if ((z74.mo28347j() & c) != 0) {
                sw3.C3310c l = z74.mo28349l();
                while (l != null) {
                    if ((l.mo25988w() & c) != 0 && (l instanceof gh2)) {
                        gh2 gh2 = (gh2) l;
                        gh2.mo3363c(ob1.m23743e(gh2, g84.f12195a.mo20427c()));
                    }
                    if ((l.mo25985t() & c) != 0) {
                        l = l.mo25986u();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: q0 */
    public final void mo3467q0() {
        this.f1769q1.mo3493D();
    }

    /* renamed from: r */
    public final void mo3468r(xa0 xa0) {
        vx2.m53591g(xa0, "canvas");
        mo3426T().mo3570B0(xa0);
    }

    /* renamed from: r0 */
    public final void mo3469r0() {
        this.f1769q1.mo3494E();
    }

    /* renamed from: s */
    public final boolean mo3470s() {
        boolean z;
        AlignmentLines b;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f1769q1;
        if (!layoutNodeLayoutDelegate.mo3504l().mo3529b().mo3338k()) {
            C2164df t = layoutNodeLayoutDelegate.mo3512t();
            if (t == null || (b = t.mo3529b()) == null || !b.mo3338k()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s0 */
    public final void mo3471s0() {
        this.f1769q1.mo3495F();
    }

    /* renamed from: t */
    public final boolean mo3472t() {
        return this.f1763e1;
    }

    /* renamed from: t0 */
    public final void mo3473t0() {
        this.f1769q1.mo3496G();
    }

    public String toString() {
        return s73.m26717a(this, (String) null) + " children: " + mo3479w().size() + " measurePolicy: " + mo3416N();
    }

    /* renamed from: u */
    public final List<iq3> mo3475u() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate I = mo3408I();
        vx2.m53588d(I);
        return I.mo3521U();
    }

    /* renamed from: u0 */
    public final void mo3476u0() {
        boolean a = mo3440a();
        this.f1754U = true;
        if (!a) {
            if (mo3414M()) {
                mo3418O0(true);
            } else if (mo3406H()) {
                mo3412K0(true);
            }
        }
        NodeCoordinator T = mo3426T();
        NodeCoordinator Q0 = mo3393A().mo3586Q0();
        while (!vx2.m53586b(T, Q0) && T != null) {
            if (T.mo3578I0()) {
                T.mo3603a1();
            }
            T = T.mo3586Q0();
        }
        v04<LayoutNode> b0 = mo3443b0();
        int n = b0.mo26963n();
        if (n > 0) {
            int i = 0;
            Object[] m = b0.mo26962m();
            vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LayoutNode layoutNode = (LayoutNode) m[i];
                if (layoutNode.f1755X != Integer.MAX_VALUE) {
                    layoutNode.mo3476u0();
                    mo3421Q0(layoutNode);
                }
                i++;
            } while (i < n);
        }
    }

    /* renamed from: v */
    public final List<iq3> mo3477v() {
        return mo3413L().mo3546S();
    }

    /* renamed from: v0 */
    public final void mo3478v0() {
        if (mo3440a()) {
            int i = 0;
            this.f1754U = false;
            v04<LayoutNode> b0 = mo3443b0();
            int n = b0.mo26963n();
            if (n > 0) {
                Object[] m = b0.mo26962m();
                vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((LayoutNode) m[i]).mo3478v0();
                    i++;
                } while (i < n);
            }
        }
    }

    /* renamed from: w */
    public final List<LayoutNode> mo3479w() {
        return mo3443b0().mo26957h();
    }

    /* renamed from: w0 */
    public final void mo3480w0(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i != i2) {
            for (int i6 = 0; i6 < i3; i6++) {
                if (i > i2) {
                    i4 = i + i6;
                } else {
                    i4 = i;
                }
                if (i > i2) {
                    i5 = i2 + i6;
                } else {
                    i5 = (i2 + i3) - 2;
                }
                this.f1764g.mo27634a(i5, this.f1764g.mo27639f(i4));
            }
            mo3394A0();
            mo3457k0();
            mo3455j0();
        }
    }

    /* renamed from: x */
    public dc1 mo3481x() {
        return this.f1750L;
    }

    /* renamed from: x0 */
    public final void mo3482x0(LayoutNode layoutNode) {
        if (layoutNode.f1769q1.mo3505m() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f1769q1;
            layoutNodeLayoutDelegate.mo3501L(layoutNodeLayoutDelegate.mo3505m() - 1);
        }
        if (this.f1779x != null) {
            layoutNode.mo3464p();
        }
        layoutNode.f1772s = null;
        layoutNode.mo3426T().mo3626r1((NodeCoordinator) null);
        if (layoutNode.f1758a) {
            this.f1761e--;
            v04<LayoutNode> e = layoutNode.f1764g.mo27638e();
            int n = e.mo26963n();
            if (n > 0) {
                int i = 0;
                Object[] m = e.mo26962m();
                vx2.m53589e(m, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                do {
                    ((LayoutNode) m[i]).mo3426T().mo3626r1((NodeCoordinator) null);
                    i++;
                } while (i < n);
            }
        }
        mo3457k0();
        mo3394A0();
    }

    /* renamed from: y */
    public final int mo3483y() {
        return this.f1781y;
    }

    /* renamed from: y0 */
    public final void mo3484y0() {
        mo3455j0();
        LayoutNode V = mo3430V();
        if (V != null) {
            V.mo3451h0();
        }
        mo3453i0();
    }

    /* renamed from: z */
    public int mo3485z() {
        return this.f1769q1.mo3507o();
    }

    /* renamed from: z0 */
    public final void mo3486z0() {
        boolean z;
        LayoutNode V = mo3430V();
        float S0 = mo3393A().mo3588S0();
        NodeCoordinator T = mo3426T();
        NodeCoordinator A = mo3393A();
        while (T != A) {
            vx2.m53589e(T, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            te3 te3 = (te3) T;
            S0 += te3.mo3588S0();
            T = te3.mo3586Q0();
        }
        boolean z2 = false;
        if (S0 == this.f1771r1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f1771r1 = S0;
            if (V != null) {
                V.mo3394A0();
            }
            if (V != null) {
                V.mo3451h0();
            }
        }
        if (!mo3440a()) {
            if (V != null) {
                V.mo3451h0();
            }
            mo3476u0();
        }
        if (V == null) {
            this.f1755X = 0;
        } else if (!this.f1782y1 && V.mo3402F() == LayoutState.LayingOut) {
            if (this.f1755X == Integer.MAX_VALUE) {
                z2 = true;
            }
            if (z2) {
                int i = V.f1757Z;
                this.f1755X = i;
                V.f1757Z = i + 1;
            } else {
                throw new IllegalStateException("Place was called on a node which was placed already".toString());
            }
        }
        this.f1769q1.mo3504l().mo3540l();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LayoutNode(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? xt5.f19976e.mo27883a() : i);
    }
}
