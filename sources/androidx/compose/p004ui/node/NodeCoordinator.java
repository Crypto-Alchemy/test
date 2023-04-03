package androidx.compose.p004ui.node;

import androidx.compose.p004ui.unit.LayoutDirection;
import com.github.mikephil.charting.utils.Utils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.sw3;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000e\b \u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005:\u0004ñ\u0001ò\u0001B\u0011\u0012\u0006\u0010y\u001a\u00020t¢\u0006\u0006\bï\u0001\u0010ð\u0001J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002JY\u0010\u0019\u001a\u00020\u0007\"\b\b\u0000\u0010\u0010*\u00020\u000f*\u0004\u0018\u00018\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJa\u0010\u001d\u001a\u00020\u0007\"\b\b\u0000\u0010\u0010*\u00020\u000f*\u0004\u0018\u00018\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJa\u0010\u001f\u001a\u00020\u0007\"\b\b\u0000\u0010\u0010*\u00020\u000f*\u0004\u0018\u00018\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001eJ\f\u0010 \u001a\u00020\u0000*\u00020\u0003H\u0002J%\u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J \u0010(\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\bH\u0002J\u0018\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020%2\u0006\u0010'\u001a\u00020\bH\u0002J\u001d\u0010+\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\b2\n\u0010.\u001a\u0006\u0012\u0002\b\u00030-ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100J)\u00101\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u00102J\u0006\u00103\u001a\u00020\bJ\u000f\u00104\u001a\u00020\u0007H\u0010¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\u00072\b\u00107\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\b8\u00109J\u0010\u0010<\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:H\u0004J\u0010\u0010=\u001a\u00020:2\u0006\u00107\u001a\u000206H&J\u0018\u0010A\u001a\u00020\u00072\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020>H\u0014J\u0006\u0010B\u001a\u00020\u0007J\u0006\u0010C\u001a\u00020\u0007J;\u0010I\u001a\u00020\u00072\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u001b2\u0014\u0010H\u001a\u0010\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010JJ\u000e\u0010K\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006J\u0010\u0010L\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0006\u0010M\u001a\u00020\u0007J\u0011\u0010N\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u001c\u0010O\u001a\u00020\u00072\u0014\u0010H\u001a\u0010\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005JQ\u0010P\u001a\u00020\u0007\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010QJS\u0010R\u001a\u00020\u0007\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bR\u0010QJ\u0006\u0010T\u001a\u00020SJ%\u0010W\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bW\u0010XJ\u0018\u0010Y\u001a\u00020S2\u0006\u0010U\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\bH\u0016J\u001d\u0010[\u001a\u00020\u00132\u0006\u0010Z\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b[\u0010,J\u001d\u0010\\\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\\\u0010,J\u001d\u0010]\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b]\u0010,J\u0018\u0010`\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010_\u001a\u00020^H\u0004J\b\u0010a\u001a\u00020\u0007H\u0016J\b\u0010b\u001a\u00020\u0007H\u0016J)\u0010d\u001a\u00020\u00072\u0006\u0010)\u001a\u00020%2\u0006\u0010'\u001a\u00020\b2\b\b\u0002\u0010c\u001a\u00020\bH\u0000¢\u0006\u0004\bd\u0010eJ\u001d\u0010f\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bf\u0010gJ\u001d\u0010h\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bh\u0010gJ\b\u0010i\u001a\u00020\u0007H\u0016J\b\u0010j\u001a\u00020\u0007H\u0016J\u0017\u0010l\u001a\u00020\u00002\u0006\u0010k\u001a\u00020\u0000H\u0000¢\u0006\u0004\bl\u0010mJ\u0006\u0010n\u001a\u00020\bJ\u001d\u0010q\u001a\u00020o2\u0006\u0010p\u001a\u00020oH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bq\u0010,J%\u0010r\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010p\u001a\u00020oH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\br\u0010sR\u001a\u0010y\u001a\u00020t8\u0016X\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR%\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010R(\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u000e¢\u0006\u0015\n\u0005\b\u0001\u0010{\u001a\u0005\b\u0001\u0010}\"\u0005\b\u0001\u0010R\u0019\u0010\u0001\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001RE\u0010H\u001a\u0010\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0015\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0004@BX\u000e¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b[\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010\u0001R-\u0010;\u001a\u0004\u0018\u00010:2\t\u0010\u0001\u001a\u0004\u0018\u00010:8\u0000@BX\u000e¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R)\u0010£\u0001\u001a\u0012\u0012\u0005\u0012\u00030 \u0001\u0012\u0004\u0012\u00020>\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R:\u0010E\u001a\u00020D2\u0007\u0010\u0001\u001a\u00020D8\u0016@TX\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R1\u0010F\u001a\u00020\u001b2\u0007\u0010\u0001\u001a\u00020\u001b8\u0006@DX\u000e¢\u0006\u0018\n\u0006\bª\u0001\u0010\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b­\u0001\u0010®\u0001R\u001a\u0010°\u0001\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bw\u0010¯\u0001R\u001c\u0010´\u0001\u001a\u0005\u0018\u00010±\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001e\u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070µ\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010¶\u0001R)\u0010º\u0001\u001a\u00020\b2\u0007\u0010\u0001\u001a\u00020\b8\u0000@BX\u000e¢\u0006\u000f\n\u0005\b4\u0010\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R0\u0010À\u0001\u001a\u0005\u0018\u00010»\u00012\n\u0010\u0001\u001a\u0005\u0018\u00010»\u00018\u0006@BX\u000e¢\u0006\u0010\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0018\u0010Ä\u0001\u001a\u00030Á\u00018BX\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u0017\u0010Ç\u0001\u001a\u00020\n8&X¦\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u0018\u0010Ê\u0001\u001a\u00030\u00018VX\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0017\u0010Ì\u0001\u001a\u00020\u001b8VX\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010¬\u0001R\u0017\u0010Î\u0001\u001a\u00020\u001b8VX\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010¬\u0001R\u0019\u0010Ð\u0001\u001a\u0004\u0018\u00010\u00018VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010Ï\u0001R\u0017\u0010Ó\u0001\u001a\u00020\u00038VX\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u001e\u0010Ö\u0001\u001a\u00030Ô\u00018Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\bÕ\u0001\u0010§\u0001R\u0018\u0010Ú\u0001\u001a\u00030×\u00018VX\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0019\u0010Û\u0001\u001a\u0004\u0018\u00010\u00018VX\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010Ï\u0001R\u0017\u0010Ý\u0001\u001a\u00020\b8VX\u0004¢\u0006\b\u001a\u0006\bÜ\u0001\u0010¹\u0001R\u0017\u0010ß\u0001\u001a\u00020\b8VX\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010¹\u0001R,\u0010ä\u0001\u001a\u00030\u00012\b\u0010à\u0001\u001a\u00030\u00018P@PX\u000e¢\u0006\u0010\u001a\u0006\b²\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R\u001a\u0010è\u0001\u001a\u0005\u0018\u00010å\u00018VX\u0004¢\u0006\b\u001a\u0006\bæ\u0001\u0010ç\u0001R\u0015\u0010é\u0001\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\bz\u0010Ò\u0001R\u0017\u0010ì\u0001\u001a\u00020%8DX\u0004¢\u0006\b\u001a\u0006\bê\u0001\u0010ë\u0001R\u0017\u0010í\u0001\u001a\u00020\b8VX\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010¹\u0001R\u001c\u0010p\u001a\u00020o8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\b\u001a\u0006\bî\u0001\u0010§\u0001\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006ó\u0001"}, mo44877d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Lnl3;", "Liq3;", "Lme3;", "Loj4;", "Lkotlin/Function1;", "Lxa0;", "Lr37;", "", "includeTail", "Lsw3$c;", "U0", "canvas", "D0", "x1", "Lnb1;", "T", "Landroidx/compose/ui/node/NodeCoordinator$d;", "hitTestSource", "Ltf4;", "pointerPosition", "Lem2;", "hitTestResult", "isTouchEvent", "isInLayer", "W0", "(Lnb1;Landroidx/compose/ui/node/NodeCoordinator$d;JLem2;ZZ)V", "", "distanceFromEdge", "X0", "(Lnb1;Landroidx/compose/ui/node/NodeCoordinator$d;JLem2;ZZF)V", "t1", "u1", "ancestor", "offset", "v0", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "Lo04;", "rect", "clipBounds", "u0", "bounds", "G0", "e1", "(J)J", "Lc84;", "type", "T0", "(I)Z", "V0", "(I)Ljava/lang/Object;", "d1", "e0", "()V", "Lsl3;", "scope", "z1", "(Lsl3;)V", "Lol3;", "lookaheadDelegate", "y1", "y0", "", "width", "height", "i1", "j1", "f1", "Lnw2;", "position", "zIndex", "Lnj2;", "layerBlock", "O", "(JFLrc2;)V", "B0", "l1", "k1", "b1", "g1", "Y0", "(Landroidx/compose/ui/node/NodeCoordinator$d;JLem2;ZZ)V", "Z0", "La95;", "w1", "sourceCoordinates", "relativeToSource", "m", "(Lme3;J)J", "o", "relativeToLocal", "C", "v1", "F0", "Lgl4;", "paint", "C0", "w0", "z0", "clipToMinimumTouchTargetSize", "m1", "(Lo04;ZZ)V", "A1", "(J)Z", "c1", "a1", "h1", "other", "E0", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "s1", "Lt36;", "minimumTouchTargetSize", "x0", "A0", "(JJ)F", "Landroidx/compose/ui/node/LayoutNode;", "s", "Landroidx/compose/ui/node/LayoutNode;", "X", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "x", "Landroidx/compose/ui/node/NodeCoordinator;", "Q0", "()Landroidx/compose/ui/node/NodeCoordinator;", "q1", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrapped", "y", "R0", "r1", "wrappedBy", "A", "Z", "isClipping", "<set-?>", "B", "Lrc2;", "getLayerBlock", "()Lrc2;", "Ldc1;", "Ldc1;", "layerDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "H", "Landroidx/compose/ui/unit/LayoutDirection;", "layerLayoutDirection", "I", "F", "lastLayerAlpha", "Lmq3;", "L", "Lmq3;", "_measureResult", "M", "Lol3;", "K0", "()Lol3;", "", "Lcf;", "P", "Ljava/util/Map;", "oldAlignmentLines", "Q", "J", "a0", "()J", "p1", "(J)V", "U", "S0", "()F", "setZIndex", "(F)V", "Lo04;", "_rectCache", "Lje3;", "Y", "Lje3;", "layerPositionalProperties", "Lkotlin/Function0;", "Lpc2;", "invalidateParentLayer", "I0", "()Z", "lastLayerDrawingWasSkipped", "Llj4;", "k0", "Llj4;", "J0", "()Llj4;", "layer", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "O0", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "P0", "()Lsw3$c;", "tail", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "density", "v", "fontScale", "()Lnl3;", "parent", "V", "()Lme3;", "coordinates", "Lsw2;", "g", "size", "Ldf;", "H0", "()Ldf;", "alignmentLinesOwner", "child", "W", "hasMeasureResult", "e", "isAttached", "value", "()Lmq3;", "o1", "(Lmq3;)V", "measureResult", "", "M0", "()Ljava/lang/Object;", "parentData", "parentLayoutCoordinates", "N0", "()Lo04;", "rectCache", "isValid", "L0", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "c", "d", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: androidx.compose.ui.node.NodeCoordinator */
/* compiled from: NodeCoordinator.kt */
public abstract class NodeCoordinator extends nl3 implements iq3, me3, oj4, rc2<xa0, r37> {

    /* renamed from: b1 */
    public static final rc2<NodeCoordinator, r37> f1828b1 = NodeCoordinator$Companion$onCommitAffectingLayerParams$1.INSTANCE;

    /* renamed from: e1 */
    public static final rc2<NodeCoordinator, r37> f1829e1 = NodeCoordinator$Companion$onCommitAffectingLayer$1.INSTANCE;

    /* renamed from: o1 */
    public static final ug5 f1830o1 = new ug5();

    /* renamed from: p1 */
    public static final je3 f1831p1 = new je3();

    /* renamed from: q1 */
    public static final float[] f1832q1 = fp3.m17170b((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: r1 */
    public static final C0393d<vr4> f1833r1 = new C0390a();

    /* renamed from: s1 */
    public static final C0393d<yt5> f1834s1 = new C0391b();

    /* renamed from: v0 */
    public static final C0392c f1835v0 = new C0392c((DefaultConstructorMarker) null);

    /* renamed from: A */
    public boolean f1836A;

    /* renamed from: B */
    public rc2<? super nj2, r37> f1837B;

    /* renamed from: C */
    public dc1 f1838C = mo3596X().mo3481x();

    /* renamed from: H */
    public LayoutDirection f1839H = mo3596X().getLayoutDirection();

    /* renamed from: I */
    public float f1840I = 0.8f;

    /* renamed from: L */
    public mq3 f1841L;

    /* renamed from: M */
    public ol3 f1842M;

    /* renamed from: P */
    public Map<C1677cf, Integer> f1843P;

    /* renamed from: Q */
    public long f1844Q = nw2.f15691a.mo23808a();

    /* renamed from: U */
    public float f1845U;

    /* renamed from: X */
    public o04 f1846X;

    /* renamed from: Y */
    public je3 f1847Y;

    /* renamed from: Z */
    public final pc2<r37> f1848Z = new NodeCoordinator$invalidateParentLayer$1(this);

    /* renamed from: e0 */
    public boolean f1849e0;

    /* renamed from: k0 */
    public lj4 f1850k0;

    /* renamed from: s */
    public final LayoutNode f1851s;

    /* renamed from: x */
    public NodeCoordinator f1852x;

    /* renamed from: y */
    public NodeCoordinator f1853y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016JC\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, mo44877d2 = {"androidx/compose/ui/node/NodeCoordinator$a", "Landroidx/compose/ui/node/NodeCoordinator$d;", "Lvr4;", "Lc84;", "a", "()I", "node", "", "e", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "d", "layoutNode", "Ltf4;", "pointerPosition", "Lem2;", "hitTestResult", "isTouchEvent", "isInLayer", "Lr37;", "b", "(Landroidx/compose/ui/node/LayoutNode;JLem2;ZZ)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.node.NodeCoordinator$a */
    /* compiled from: NodeCoordinator.kt */
    public static final class C0390a implements C0393d<vr4> {
        /* renamed from: a */
        public int mo3643a() {
            return g84.f12195a.mo20433i();
        }

        /* renamed from: b */
        public void mo3644b(LayoutNode layoutNode, long j, em2<vr4> em2, boolean z, boolean z2) {
            vx2.m53591g(layoutNode, "layoutNode");
            vx2.m53591g(em2, "hitTestResult");
            layoutNode.mo3446c0(j, em2, z, z2);
        }

        /* renamed from: d */
        public boolean mo3646d(LayoutNode layoutNode) {
            vx2.m53591g(layoutNode, "parentLayoutNode");
            return true;
        }

        /* renamed from: e */
        public boolean mo3645c(vr4 vr4) {
            vx2.m53591g(vr4, "node");
            return vr4.mo3369i();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016JC\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, mo44877d2 = {"androidx/compose/ui/node/NodeCoordinator$b", "Landroidx/compose/ui/node/NodeCoordinator$d;", "Lyt5;", "Lc84;", "a", "()I", "node", "", "e", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "d", "layoutNode", "Ltf4;", "pointerPosition", "Lem2;", "hitTestResult", "isTouchEvent", "isInLayer", "Lr37;", "b", "(Landroidx/compose/ui/node/LayoutNode;JLem2;ZZ)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.node.NodeCoordinator$b */
    /* compiled from: NodeCoordinator.kt */
    public static final class C0391b implements C0393d<yt5> {
        /* renamed from: a */
        public int mo3643a() {
            return g84.f12195a.mo20434j();
        }

        /* renamed from: b */
        public void mo3644b(LayoutNode layoutNode, long j, em2<yt5> em2, boolean z, boolean z2) {
            vx2.m53591g(layoutNode, "layoutNode");
            vx2.m53591g(em2, "hitTestResult");
            layoutNode.mo3448e0(j, em2, z, z2);
        }

        /* renamed from: d */
        public boolean mo3646d(LayoutNode layoutNode) {
            vt5 a;
            vx2.m53591g(layoutNode, "parentLayoutNode");
            yt5 j = au5.m10806j(layoutNode);
            boolean z = false;
            if (!(j == null || (a = zt5.m31502a(j)) == null || !a.mo27324t())) {
                z = true;
            }
            return !z;
        }

        /* renamed from: e */
        public boolean mo3645c(yt5 yt5) {
            vx2.m53591g(yt5, "node");
            return false;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010\tR#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\r8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, mo44877d2 = {"Landroidx/compose/ui/node/NodeCoordinator$c;", "", "Landroidx/compose/ui/node/NodeCoordinator$d;", "Lvr4;", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$d;", "a", "()Landroidx/compose/ui/node/NodeCoordinator$d;", "getPointerInputSource$annotations", "()V", "Lyt5;", "SemanticsSource", "b", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Lug5;", "graphicsLayerScope", "Lug5;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "Lr37;", "onCommitAffectingLayer", "Lrc2;", "onCommitAffectingLayerParams", "Lje3;", "tmpLayerPositionalProperties", "Lje3;", "Lfp3;", "tmpMatrix", "[F", "<init>", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.node.NodeCoordinator$c */
    /* compiled from: NodeCoordinator.kt */
    public static final class C0392c {
        public C0392c() {
        }

        public /* synthetic */ C0392c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C0393d<vr4> mo3649a() {
            return NodeCoordinator.f1833r1;
        }

        /* renamed from: b */
        public final C0393d<yt5> mo3650b() {
            return NodeCoordinator.f1834s1;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&JC\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH&ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0003\u0002\u0015\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, mo44877d2 = {"Landroidx/compose/ui/node/NodeCoordinator$d;", "Lnb1;", "N", "", "Lc84;", "a", "()I", "node", "", "c", "(Lnb1;)Z", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "d", "layoutNode", "Ltf4;", "pointerPosition", "Lem2;", "hitTestResult", "isTouchEvent", "isInLayer", "Lr37;", "b", "(Landroidx/compose/ui/node/LayoutNode;JLem2;ZZ)V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: androidx.compose.ui.node.NodeCoordinator$d */
    /* compiled from: NodeCoordinator.kt */
    public interface C0393d<N extends nb1> {
        /* renamed from: a */
        int mo3643a();

        /* renamed from: b */
        void mo3644b(LayoutNode layoutNode, long j, em2<N> em2, boolean z, boolean z2);

        /* renamed from: c */
        boolean mo3645c(N n);

        /* renamed from: d */
        boolean mo3646d(LayoutNode layoutNode);
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        vx2.m53591g(layoutNode, "layoutNode");
        this.f1851s = layoutNode;
    }

    /* renamed from: n1 */
    public static /* synthetic */ void m2752n1(NodeCoordinator nodeCoordinator, o04 o04, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            nodeCoordinator.mo3621m1(o04, z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
    }

    /* renamed from: A0 */
    public final float mo3568A0(long j, long j2) {
        if (((float) mo3545L()) >= t36.m27272f(j2) && ((float) mo27274J()) >= t36.m27271e(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long x0 = mo3637x0(j2);
        float f = t36.m27272f(x0);
        float e = t36.m27271e(x0);
        long e1 = mo3609e1(j);
        if ((f > Utils.FLOAT_EPSILON || e > Utils.FLOAT_EPSILON) && tf4.m27734k(e1) <= f && tf4.m27735l(e1) <= e) {
            return tf4.m27733j(e1);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* renamed from: A1 */
    public final boolean mo3569A1(long j) {
        if (!wf4.m29551b(j)) {
            return false;
        }
        lj4 lj4 = this.f1850k0;
        if (lj4 == null || !this.f1836A || lj4.mo3936f(j)) {
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    public final void mo3570B0(xa0 xa0) {
        vx2.m53591g(xa0, "canvas");
        lj4 lj4 = this.f1850k0;
        if (lj4 != null) {
            lj4.mo3937g(xa0);
            return;
        }
        float f = (float) nw2.m23481f(mo3602a0());
        float g = (float) nw2.m23482g(mo3602a0());
        xa0.mo21526b(f, g);
        mo3573D0(xa0);
        xa0.mo21526b(-f, -g);
    }

    /* renamed from: C */
    public long mo3571C(long j) {
        if (mo3607e()) {
            for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.f1853y) {
                j = nodeCoordinator.mo3633v1(j);
            }
            return j;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    /* renamed from: C0 */
    public final void mo3572C0(xa0 xa0, gl4 gl4) {
        vx2.m53591g(xa0, "canvas");
        vx2.m53591g(gl4, "paint");
        xa0.mo21529e(new a95(0.5f, 0.5f, ((float) sw2.m27143f(mo27275K())) - 0.5f, ((float) sw2.m27142e(mo27275K())) - 0.5f), gl4);
    }

    /* renamed from: D0 */
    public final void mo3573D0(xa0 xa0) {
        int b = g84.f12195a.mo20426b();
        boolean c = d84.m14846c(b);
        dj1 dj1 = null;
        sw3.C3310c P0 = mo3585P0();
        if (c || (P0 = P0.mo25989x()) != null) {
            sw3.C3310c o0 = mo3591U0(c);
            while (true) {
                if (o0 != null && (o0.mo25985t() & b) != 0) {
                    if ((o0.mo25988w() & b) == 0) {
                        if (o0 == P0) {
                            break;
                        }
                        o0 = o0.mo25986u();
                    } else {
                        if (o0 instanceof dj1) {
                            dj1 = o0;
                        }
                        dj1 = dj1;
                    }
                } else {
                    break;
                }
            }
        }
        dj1 dj12 = dj1;
        if (dj12 == null) {
            mo3619l1(xa0);
            return;
        }
        mo3596X().mo3410J().mo28054a(xa0, tw2.m27949b(mo3611g()), this, dj12);
    }

    /* renamed from: E0 */
    public final NodeCoordinator mo3574E0(NodeCoordinator nodeCoordinator) {
        vx2.m53591g(nodeCoordinator, "other");
        LayoutNode X = nodeCoordinator.mo3596X();
        LayoutNode X2 = mo3596X();
        if (X == X2) {
            sw3.C3310c P0 = nodeCoordinator.mo3585P0();
            sw3.C3310c P02 = mo3585P0();
            int e = g84.f12195a.mo20429e();
            if (P02.mo23638l().mo25990y()) {
                for (sw3.C3310c x = P02.mo23638l().mo25989x(); x != null; x = x.mo25989x()) {
                    if ((x.mo25988w() & e) != 0 && x == P0) {
                        return nodeCoordinator;
                    }
                }
                return this;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        while (X.mo3483y() > X2.mo3483y()) {
            X = X.mo3430V();
            vx2.m53588d(X);
        }
        while (X2.mo3483y() > X.mo3483y()) {
            X2 = X2.mo3430V();
            vx2.m53588d(X2);
        }
        while (X != X2) {
            X = X.mo3430V();
            X2 = X2.mo3430V();
            if (X != null) {
                if (X2 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        if (X2 == mo3596X()) {
            return this;
        }
        if (X == nodeCoordinator.mo3596X()) {
            return nodeCoordinator;
        }
        return X.mo3393A();
    }

    /* renamed from: F0 */
    public long mo3575F0(long j) {
        long b = ow2.m24293b(j, mo3602a0());
        lj4 lj4 = this.f1850k0;
        if (lj4 != null) {
            return lj4.mo3931b(b, true);
        }
        return b;
    }

    /* renamed from: G0 */
    public final void mo3576G0(o04 o04, boolean z) {
        float f = (float) nw2.m23481f(mo3602a0());
        o04.mo23883i(o04.mo23876b() - f);
        o04.mo23884j(o04.mo23877c() - f);
        float g = (float) nw2.m23482g(mo3602a0());
        o04.mo23885k(o04.mo23878d() - g);
        o04.mo23882h(o04.mo23875a() - g);
        lj4 lj4 = this.f1850k0;
        if (lj4 != null) {
            lj4.mo3930a(o04, true);
            if (this.f1836A && z) {
                o04.mo23879e(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) sw2.m27143f(mo3611g()), (float) sw2.m27142e(mo3611g()));
                o04.mo23880f();
            }
        }
    }

    /* renamed from: H0 */
    public C2164df mo3577H0() {
        return mo3596X().mo3399D().mo3504l();
    }

    /* renamed from: I0 */
    public final boolean mo3578I0() {
        return this.f1849e0;
    }

    /* renamed from: J0 */
    public final lj4 mo3579J0() {
        return this.f1850k0;
    }

    /* renamed from: K0 */
    public final ol3 mo3580K0() {
        return this.f1842M;
    }

    /* renamed from: L0 */
    public final long mo3581L0() {
        return this.f1838C.mo18678B(mo3596X().mo3436Y().mo3487a());
    }

    /* renamed from: M0 */
    public Object mo3582M0() {
        boolean z;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        sw3.C3310c P0 = mo3585P0();
        dc1 x = mo3596X().mo3481x();
        for (sw3.C3310c o = mo3596X().mo3424S().mo28352o(); o != null; o = o.mo25989x()) {
            if (o != P0) {
                if ((g84.f12195a.mo20432h() & o.mo25988w()) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (o instanceof dm4)) {
                    ref$ObjectRef.element = ((dm4) o).mo3362b(x, ref$ObjectRef.element);
                }
            }
        }
        return ref$ObjectRef.element;
    }

    /* renamed from: N0 */
    public final o04 mo3583N0() {
        o04 o04 = this.f1846X;
        if (o04 != null) {
            return o04;
        }
        o04 o042 = new o04(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        this.f1846X = o042;
        return o042;
    }

    /* renamed from: O */
    public void mo3520O(long j, float f, rc2<? super nj2, r37> rc2) {
        mo3612g1(rc2);
        if (!nw2.m23480e(mo3602a0(), j)) {
            mo3624p1(j);
            mo3596X().mo3399D().mo3516x().mo3550W();
            lj4 lj4 = this.f1850k0;
            if (lj4 != null) {
                lj4.mo3938h(j);
            } else {
                NodeCoordinator nodeCoordinator = this.f1853y;
                if (nodeCoordinator != null) {
                    nodeCoordinator.mo3603a1();
                }
            }
            mo23724b0(this);
            nj4 U = mo3596X().mo3428U();
            if (U != null) {
                U.mo3729e(mo3596X());
            }
        }
        this.f1845U = f;
    }

    /* renamed from: O0 */
    public final OwnerSnapshotObserver mo3584O0() {
        return ze3.m31152a(mo3596X()).getSnapshotObserver();
    }

    /* renamed from: P0 */
    public abstract sw3.C3310c mo3585P0();

    /* renamed from: Q0 */
    public final NodeCoordinator mo3586Q0() {
        return this.f1852x;
    }

    /* renamed from: R0 */
    public final NodeCoordinator mo3587R0() {
        return this.f1853y;
    }

    /* renamed from: S0 */
    public final float mo3588S0() {
        return this.f1845U;
    }

    /* renamed from: T0 */
    public final boolean mo3589T0(int i) {
        sw3.C3310c U0 = mo3591U0(d84.m14846c(i));
        if (U0 == null || !ob1.m23741c(U0, i)) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    public nl3 mo3590U() {
        return this.f1852x;
    }

    /* renamed from: U0 */
    public final sw3.C3310c mo3591U0(boolean z) {
        sw3.C3310c P0;
        if (mo3596X().mo3426T() == this) {
            return mo3596X().mo3424S().mo28349l();
        }
        if (z) {
            NodeCoordinator nodeCoordinator = this.f1853y;
            if (nodeCoordinator == null || (P0 = nodeCoordinator.mo3585P0()) == null) {
                return null;
            }
            return P0.mo25986u();
        }
        NodeCoordinator nodeCoordinator2 = this.f1853y;
        if (nodeCoordinator2 != null) {
            return nodeCoordinator2.mo3585P0();
        }
        return null;
    }

    /* renamed from: V */
    public me3 mo3592V() {
        return this;
    }

    /* renamed from: V0 */
    public final <T> T mo3593V0(int i) {
        boolean c = d84.m14846c(i);
        T P0 = mo3585P0();
        if (!c && (P0 = P0.mo25989x()) == null) {
            return null;
        }
        T o0 = mo3591U0(c);
        while (o0 != null && (o0.mo25985t() & i) != 0) {
            if ((o0.mo25988w() & i) != 0) {
                return o0;
            }
            if (o0 == P0) {
                return null;
            }
            o0 = o0.mo25986u();
        }
        return null;
    }

    /* renamed from: W */
    public boolean mo3594W() {
        if (this.f1841L != null) {
            return true;
        }
        return false;
    }

    /* renamed from: W0 */
    public final <T extends nb1> void mo3595W0(T t, C0393d<T> dVar, long j, em2<T> em2, boolean z, boolean z2) {
        if (t == null) {
            mo3601Z0(dVar, j, em2, z, z2);
            return;
        }
        em2.mo19333u(t, z2, new NodeCoordinator$hit$1(this, t, dVar, j, em2, z, z2));
    }

    /* renamed from: X */
    public LayoutNode mo3596X() {
        return this.f1851s;
    }

    /* renamed from: X0 */
    public final <T extends nb1> void mo3597X0(T t, C0393d<T> dVar, long j, em2<T> em2, boolean z, boolean z2, float f) {
        if (t == null) {
            mo3601Z0(dVar, j, em2, z, z2);
            return;
        }
        float f2 = f;
        em2.mo19334w(t, f2, z2, new NodeCoordinator$hitNear$1(this, t, dVar, j, em2, z, z2, f));
    }

    /* renamed from: Y */
    public mq3 mo3598Y() {
        mq3 mq3 = this.f1841L;
        if (mq3 != null) {
            return mq3;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    /* renamed from: Y0 */
    public final <T extends nb1> void mo3599Y0(C0393d<T> dVar, long j, em2<T> em2, boolean z, boolean z2) {
        float f;
        long j2 = j;
        em2<T> em22 = em2;
        C0393d<T> dVar2 = dVar;
        vx2.m53591g(dVar, "hitTestSource");
        vx2.m53591g(em22, "hitTestResult");
        nb1 nb1 = (nb1) mo3593V0(dVar.mo3643a());
        boolean z3 = true;
        if (!mo3569A1(j)) {
            if (z) {
                float A0 = mo3568A0(j, mo3581L0());
                if (Float.isInfinite(A0) || Float.isNaN(A0)) {
                    z3 = false;
                }
                if (z3 && em22.mo19300A(A0, false)) {
                    mo3597X0(nb1, dVar, j, em2, z, false, A0);
                }
            }
        } else if (nb1 == null) {
            mo3601Z0(dVar, j, em2, z, z2);
        } else if (mo3605c1(j)) {
            mo3595W0(nb1, dVar, j, em2, z, z2);
        } else {
            if (!z) {
                f = Float.POSITIVE_INFINITY;
            } else {
                f = mo3568A0(j, mo3581L0());
            }
            float f2 = f;
            if (Float.isInfinite(f2) || Float.isNaN(f2)) {
                z3 = false;
            }
            boolean z4 = z2;
            if (!z3 || !em22.mo19300A(f2, z4)) {
                mo3628t1(nb1, dVar, j, em2, z, z2, f2);
            } else {
                mo3597X0(nb1, dVar, j, em2, z, z2, f2);
            }
        }
    }

    /* renamed from: Z */
    public nl3 mo3600Z() {
        return this.f1853y;
    }

    /* renamed from: Z0 */
    public <T extends nb1> void mo3601Z0(C0393d<T> dVar, long j, em2<T> em2, boolean z, boolean z2) {
        vx2.m53591g(dVar, "hitTestSource");
        vx2.m53591g(em2, "hitTestResult");
        NodeCoordinator nodeCoordinator = this.f1852x;
        if (nodeCoordinator != null) {
            nodeCoordinator.mo3599Y0(dVar, nodeCoordinator.mo3575F0(j), em2, z, z2);
        }
    }

    /* renamed from: a0 */
    public long mo3602a0() {
        return this.f1844Q;
    }

    /* renamed from: a1 */
    public void mo3603a1() {
        lj4 lj4 = this.f1850k0;
        if (lj4 != null) {
            lj4.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.f1853y;
        if (nodeCoordinator != null) {
            nodeCoordinator.mo3603a1();
        }
    }

    /* renamed from: b1 */
    public void mo3604b1(xa0 xa0) {
        vx2.m53591g(xa0, "canvas");
        if (mo3596X().mo3440a()) {
            mo3584O0().mo3657h(this, f1829e1, new NodeCoordinator$invoke$1(this, xa0));
            this.f1849e0 = false;
            return;
        }
        this.f1849e0 = true;
    }

    /* renamed from: c1 */
    public final boolean mo3605c1(long j) {
        float k = tf4.m27734k(j);
        float l = tf4.m27735l(j);
        if (k < Utils.FLOAT_EPSILON || l < Utils.FLOAT_EPSILON || k >= ((float) mo3545L()) || l >= ((float) mo27274J())) {
            return false;
        }
        return true;
    }

    /* renamed from: d1 */
    public final boolean mo3606d1() {
        if (this.f1850k0 != null && this.f1840I <= Utils.FLOAT_EPSILON) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.f1853y;
        if (nodeCoordinator != null) {
            return nodeCoordinator.mo3606d1();
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo3607e() {
        return mo3585P0().mo25990y();
    }

    /* renamed from: e0 */
    public void mo3608e0() {
        mo3520O(mo3602a0(), this.f1845U, this.f1837B);
    }

    /* renamed from: e1 */
    public final long mo3609e1(long j) {
        float f;
        float f2;
        float k = tf4.m27734k(j);
        if (k < Utils.FLOAT_EPSILON) {
            f = -k;
        } else {
            f = k - ((float) mo3545L());
        }
        float max = Math.max(Utils.FLOAT_EPSILON, f);
        float l = tf4.m27735l(j);
        if (l < Utils.FLOAT_EPSILON) {
            f2 = -l;
        } else {
            f2 = l - ((float) mo27274J());
        }
        return wf4.m29550a(max, Math.max(Utils.FLOAT_EPSILON, f2));
    }

    /* renamed from: f1 */
    public final void mo3610f1() {
        lj4 lj4 = this.f1850k0;
        if (lj4 != null) {
            lj4.invalidate();
        }
    }

    /* renamed from: g */
    public final long mo3611g() {
        return mo27275K();
    }

    /* renamed from: g1 */
    public final void mo3612g1(rc2<? super nj2, r37> rc2) {
        boolean z;
        nj4 U;
        if (this.f1837B == rc2 && vx2.m53586b(this.f1838C, mo3596X().mo3481x()) && this.f1839H == mo3596X().getLayoutDirection()) {
            z = false;
        } else {
            z = true;
        }
        this.f1837B = rc2;
        this.f1838C = mo3596X().mo3481x();
        this.f1839H = mo3596X().getLayoutDirection();
        if (!mo3607e() || rc2 == null) {
            lj4 lj4 = this.f1850k0;
            if (lj4 != null) {
                lj4.destroy();
                mo3596X().mo3429U0(true);
                this.f1848Z.invoke();
                if (mo3607e() && (U = mo3596X().mo3428U()) != null) {
                    U.mo3729e(mo3596X());
                }
            }
            this.f1850k0 = null;
            this.f1849e0 = false;
        } else if (this.f1850k0 == null) {
            lj4 n = ze3.m31152a(mo3596X()).mo3775n(this, this.f1848Z);
            n.mo3932c(mo27275K());
            n.mo3938h(mo3602a0());
            this.f1850k0 = n;
            mo3638x1();
            mo3596X().mo3429U0(true);
            this.f1848Z.invoke();
        } else if (z) {
            mo3638x1();
        }
    }

    public float getDensity() {
        return mo3596X().mo3481x().getDensity();
    }

    public LayoutDirection getLayoutDirection() {
        return mo3596X().getLayoutDirection();
    }

    /* renamed from: h1 */
    public void mo3615h1() {
        lj4 lj4 = this.f1850k0;
        if (lj4 != null) {
            lj4.invalidate();
        }
    }

    /* renamed from: i1 */
    public void mo3616i1(int i, int i2) {
        lj4 lj4 = this.f1850k0;
        if (lj4 != null) {
            lj4.mo3932c(tw2.m27948a(i, i2));
        } else {
            NodeCoordinator nodeCoordinator = this.f1853y;
            if (nodeCoordinator != null) {
                nodeCoordinator.mo3603a1();
            }
        }
        nj4 U = mo3596X().mo3428U();
        if (U != null) {
            U.mo3729e(mo3596X());
        }
        mo27279Q(tw2.m27948a(i, i2));
        int b = g84.f12195a.mo20426b();
        boolean c = d84.m14846c(b);
        sw3.C3310c P0 = mo3585P0();
        if (c || (P0 = P0.mo25989x()) != null) {
            sw3.C3310c o0 = mo3591U0(c);
            while (o0 != null && (o0.mo25985t() & b) != 0) {
                if ((o0.mo25988w() & b) != 0 && (o0 instanceof dj1)) {
                    ((dj1) o0).mo3374o();
                }
                if (o0 != P0) {
                    o0 = o0.mo25986u();
                } else {
                    return;
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo3604b1((xa0) obj);
        return r37.f33317a;
    }

    public boolean isValid() {
        if (this.f1850k0 == null || !mo3607e()) {
            return false;
        }
        return true;
    }

    /* renamed from: j1 */
    public final void mo3617j1() {
        a56 k;
        sw3.C3310c cVar;
        g84 g84 = g84.f12195a;
        if (mo3589T0(g84.mo20430f())) {
            a56 a = a56.f41e.mo62a();
            try {
                k = a.mo48k();
                int f = g84.mo20430f();
                boolean c = d84.m14846c(f);
                if (c) {
                    cVar = mo3585P0();
                } else {
                    cVar = mo3585P0().mo25989x();
                    if (cVar == null) {
                        r37 r37 = r37.f33317a;
                        a.mo55r(k);
                        a.mo41d();
                    }
                }
                sw3.C3310c o0 = mo3591U0(c);
                while (o0 != null && (o0.mo25985t() & f) != 0) {
                    if ((o0.mo25988w() & f) != 0 && (o0 instanceof ke3)) {
                        ((ke3) o0).mo3361a(mo27275K());
                    }
                    if (o0 == cVar) {
                        break;
                    }
                    o0 = o0.mo25986u();
                }
                r37 r372 = r37.f33317a;
                a.mo55r(k);
                a.mo41d();
            } catch (Throwable th) {
                a.mo41d();
                throw th;
            }
        }
    }

    /* renamed from: k1 */
    public final void mo3618k1() {
        ol3 ol3 = this.f1842M;
        if (ol3 != null) {
            int f = g84.f12195a.mo20430f();
            boolean c = d84.m14846c(f);
            sw3.C3310c P0 = mo3585P0();
            if (c || (P0 = P0.mo25989x()) != null) {
                sw3.C3310c o0 = mo3591U0(c);
                while (o0 != null && (o0.mo25985t() & f) != 0) {
                    if ((o0.mo25988w() & f) != 0 && (o0 instanceof ke3)) {
                        ((ke3) o0).mo3375p(ol3.mo23997n0());
                    }
                    if (o0 == P0) {
                        break;
                    }
                    o0 = o0.mo25986u();
                }
            }
        }
        int f2 = g84.f12195a.mo20430f();
        boolean c2 = d84.m14846c(f2);
        sw3.C3310c P02 = mo3585P0();
        if (c2 || (P02 = P02.mo25989x()) != null) {
            sw3.C3310c o02 = mo3591U0(c2);
            while (o02 != null && (o02.mo25985t() & f2) != 0) {
                if ((o02.mo25988w() & f2) != 0 && (o02 instanceof ke3)) {
                    ((ke3) o02).mo3364d(this);
                }
                if (o02 != P02) {
                    o02 = o02.mo25986u();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: l1 */
    public void mo3619l1(xa0 xa0) {
        vx2.m53591g(xa0, "canvas");
        NodeCoordinator nodeCoordinator = this.f1852x;
        if (nodeCoordinator != null) {
            nodeCoordinator.mo3570B0(xa0);
        }
    }

    /* renamed from: m */
    public long mo3620m(me3 me3, long j) {
        vx2.m53591g(me3, "sourceCoordinates");
        NodeCoordinator u1 = mo3630u1(me3);
        NodeCoordinator E0 = mo3574E0(u1);
        while (u1 != E0) {
            j = u1.mo3633v1(j);
            u1 = u1.f1853y;
            vx2.m53588d(u1);
        }
        return mo3632v0(E0, j);
    }

    /* renamed from: m1 */
    public final void mo3621m1(o04 o04, boolean z, boolean z2) {
        vx2.m53591g(o04, "bounds");
        lj4 lj4 = this.f1850k0;
        if (lj4 != null) {
            if (this.f1836A) {
                if (z2) {
                    long L0 = mo3581L0();
                    float f = t36.m27272f(L0) / 2.0f;
                    float e = t36.m27271e(L0) / 2.0f;
                    o04.mo23879e(-f, -e, ((float) sw2.m27143f(mo3611g())) + f, ((float) sw2.m27142e(mo3611g())) + e);
                } else if (z) {
                    o04.mo23879e(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) sw2.m27143f(mo3611g()), (float) sw2.m27142e(mo3611g()));
                }
                if (o04.mo23880f()) {
                    return;
                }
            }
            lj4.mo3930a(o04, false);
        }
        float f2 = (float) nw2.m23481f(mo3602a0());
        o04.mo23883i(o04.mo23876b() + f2);
        o04.mo23884j(o04.mo23877c() + f2);
        float g = (float) nw2.m23482g(mo3602a0());
        o04.mo23885k(o04.mo23878d() + g);
        o04.mo23882h(o04.mo23875a() + g);
    }

    /* renamed from: o */
    public a95 mo3622o(me3 me3, boolean z) {
        vx2.m53591g(me3, "sourceCoordinates");
        if (!mo3607e()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        } else if (me3.mo3607e()) {
            NodeCoordinator u1 = mo3630u1(me3);
            NodeCoordinator E0 = mo3574E0(u1);
            o04 N0 = mo3583N0();
            N0.mo23883i(Utils.FLOAT_EPSILON);
            N0.mo23885k(Utils.FLOAT_EPSILON);
            N0.mo23884j((float) sw2.m27143f(me3.mo3611g()));
            N0.mo23882h((float) sw2.m27142e(me3.mo3611g()));
            while (u1 != E0) {
                m2752n1(u1, N0, z, false, 4, (Object) null);
                if (N0.mo23880f()) {
                    return a95.f70e.mo127a();
                }
                u1 = u1.f1853y;
                vx2.m53588d(u1);
            }
            mo3629u0(E0, N0, z);
            return p04.m24458a(N0);
        } else {
            throw new IllegalStateException(("LayoutCoordinates " + me3 + " is not attached!").toString());
        }
    }

    /* renamed from: o1 */
    public void mo3623o1(mq3 mq3) {
        boolean z;
        vx2.m53591g(mq3, "value");
        mq3 mq32 = this.f1841L;
        if (mq3 != mq32) {
            this.f1841L = mq3;
            if (!(mq32 != null && mq3.getWidth() == mq32.getWidth() && mq3.getHeight() == mq32.getHeight())) {
                mo3616i1(mq3.getWidth(), mq3.getHeight());
            }
            Map<C1677cf, Integer> map = this.f1843P;
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if ((!z || (!mq3.mo23300b().isEmpty())) && !vx2.m53586b(mq3.mo23300b(), this.f1843P)) {
                mo3577H0().mo3529b().mo3340m();
                Map map2 = this.f1843P;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.f1843P = map2;
                }
                map2.clear();
                map2.putAll(mq3.mo23300b());
            }
        }
    }

    /* renamed from: p1 */
    public void mo3624p1(long j) {
        this.f1844Q = j;
    }

    /* renamed from: q1 */
    public final void mo3625q1(NodeCoordinator nodeCoordinator) {
        this.f1852x = nodeCoordinator;
    }

    /* renamed from: r1 */
    public final void mo3626r1(NodeCoordinator nodeCoordinator) {
        this.f1853y = nodeCoordinator;
    }

    /* renamed from: s1 */
    public final boolean mo3627s1() {
        g84 g84 = g84.f12195a;
        sw3.C3310c U0 = mo3591U0(d84.m14846c(g84.mo20433i()));
        if (U0 == null) {
            return false;
        }
        int i = g84.mo20433i();
        if (U0.mo23638l().mo25990y()) {
            sw3.C3310c l = U0.mo23638l();
            if ((l.mo25985t() & i) != 0) {
                for (sw3.C3310c u = l.mo25986u(); u != null; u = u.mo25986u()) {
                    if ((u.mo25988w() & i) != 0 && (u instanceof vr4) && ((vr4) u).mo3376q()) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: t1 */
    public final <T extends nb1> void mo3628t1(T t, C0393d<T> dVar, long j, em2<T> em2, boolean z, boolean z2, float f) {
        if (t == null) {
            mo3601Z0(dVar, j, em2, z, z2);
            return;
        }
        C0393d<T> dVar2 = dVar;
        if (dVar.mo3645c(t)) {
            boolean z3 = z2;
            float f2 = f;
            em2.mo19302D(t, f2, z3, new NodeCoordinator$speculativeHit$1(this, t, dVar, j, em2, z, z3, f2));
            return;
        }
        em2<T> em22 = em2;
        mo3628t1((nb1) a84.m129b(t, dVar.mo3643a(), g84.f12195a.mo20429e()), dVar, j, em2, z, z2, f);
    }

    /* renamed from: u0 */
    public final void mo3629u0(NodeCoordinator nodeCoordinator, o04 o04, boolean z) {
        if (nodeCoordinator != this) {
            NodeCoordinator nodeCoordinator2 = this.f1853y;
            if (nodeCoordinator2 != null) {
                nodeCoordinator2.mo3629u0(nodeCoordinator, o04, z);
            }
            mo3576G0(o04, z);
        }
    }

    /* renamed from: u1 */
    public final NodeCoordinator mo3630u1(me3 me3) {
        ql3 ql3;
        NodeCoordinator a;
        if (me3 instanceof ql3) {
            ql3 = (ql3) me3;
        } else {
            ql3 = null;
        }
        if (ql3 != null && (a = ql3.mo25142a()) != null) {
            return a;
        }
        vx2.m53589e(me3, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) me3;
    }

    /* renamed from: v */
    public float mo3631v() {
        return mo3596X().mo3481x().mo3631v();
    }

    /* renamed from: v0 */
    public final long mo3632v0(NodeCoordinator nodeCoordinator, long j) {
        if (nodeCoordinator == this) {
            return j;
        }
        NodeCoordinator nodeCoordinator2 = this.f1853y;
        if (nodeCoordinator2 == null || vx2.m53586b(nodeCoordinator, nodeCoordinator2)) {
            return mo3575F0(j);
        }
        return mo3575F0(nodeCoordinator2.mo3632v0(nodeCoordinator, j));
    }

    /* renamed from: v1 */
    public long mo3633v1(long j) {
        lj4 lj4 = this.f1850k0;
        if (lj4 != null) {
            j = lj4.mo3931b(j, false);
        }
        return ow2.m24294c(j, mo3602a0());
    }

    /* renamed from: w0 */
    public void mo3634w0() {
        mo3612g1(this.f1837B);
    }

    /* renamed from: w1 */
    public final a95 mo3635w1() {
        if (!mo3607e()) {
            return a95.f70e.mo127a();
        }
        me3 c = ne3.m23130c(this);
        o04 N0 = mo3583N0();
        long x0 = mo3637x0(mo3581L0());
        N0.mo23883i(-t36.m27272f(x0));
        N0.mo23885k(-t36.m27271e(x0));
        N0.mo23884j(((float) mo3545L()) + t36.m27272f(x0));
        N0.mo23882h(((float) mo27274J()) + t36.m27271e(x0));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != c) {
            nodeCoordinator.mo3621m1(N0, false, true);
            if (N0.mo23880f()) {
                return a95.f70e.mo127a();
            }
            nodeCoordinator = nodeCoordinator.f1853y;
            vx2.m53588d(nodeCoordinator);
        }
        return p04.m24458a(N0);
    }

    /* renamed from: x */
    public final me3 mo3636x() {
        if (mo3607e()) {
            return mo3596X().mo3426T().f1853y;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    /* renamed from: x0 */
    public final long mo3637x0(long j) {
        return w36.m29258a(Math.max(Utils.FLOAT_EPSILON, (t36.m27272f(j) - ((float) mo3545L())) / 2.0f), Math.max(Utils.FLOAT_EPSILON, (t36.m27271e(j) - ((float) mo27274J())) / 2.0f));
    }

    /* renamed from: x1 */
    public final void mo3638x1() {
        boolean z;
        lj4 lj4 = this.f1850k0;
        if (lj4 != null) {
            rc2<? super nj2, r37> rc2 = this.f1837B;
            if (rc2 != null) {
                ug5 ug5 = f1830o1;
                ug5.mo26780m();
                ug5.mo26785t(mo3596X().mo3481x());
                mo3584O0().mo3657h(this, f1828b1, new NodeCoordinator$updateLayerParameters$1(rc2));
                je3 je3 = this.f1847Y;
                if (je3 == null) {
                    je3 = new je3();
                    this.f1847Y = je3;
                }
                je3.mo21810a(ug5);
                float q = ug5.mo23698q();
                float D = ug5.mo23693D();
                float a = ug5.mo26773a();
                float z2 = ug5.mo23700z();
                float w = ug5.mo23699w();
                float e = ug5.mo26777e();
                long b = ug5.mo26774b();
                long l = ug5.mo26779l();
                ug5 ug52 = ug5;
                ug52.mo26776d();
                lj4.mo3935e(q, D, a, z2, w, e, ug5.mo23692A(), ug5.mo23694f(), ug5.mo23695i(), ug5.mo23696j(), ug5.mo23697k(), ug5.mo26778g(), ug5.mo26775c(), (bd5) null, b, l, mo3596X().getLayoutDirection(), mo3596X().mo3481x());
                this.f1836A = ug52.mo26775c();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            if (this.f1837B == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        this.f1840I = f1830o1.mo26773a();
        nj4 U = mo3596X().mo3428U();
        if (U != null) {
            U.mo3729e(mo3596X());
        }
    }

    /* renamed from: y0 */
    public abstract ol3 mo3639y0(sl3 sl3);

    /* renamed from: y1 */
    public final void mo3640y1(ol3 ol3) {
        vx2.m53591g(ol3, "lookaheadDelegate");
        this.f1842M = ol3;
    }

    /* renamed from: z0 */
    public void mo3641z0() {
        mo3612g1(this.f1837B);
        LayoutNode V = mo3596X().mo3430V();
        if (V != null) {
            V.mo3451h0();
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [sl3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: z1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3642z1(p000.sl3 r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0019
            ol3 r1 = r2.f1842M
            if (r1 == 0) goto L_0x000b
            sl3 r0 = r1.mo23998o0()
        L_0x000b:
            boolean r0 = p000.vx2.m53586b(r3, r0)
            if (r0 != 0) goto L_0x0016
            ol3 r3 = r2.mo3639y0(r3)
            goto L_0x0018
        L_0x0016:
            ol3 r3 = r2.f1842M
        L_0x0018:
            r0 = r3
        L_0x0019:
            r2.f1842M = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.node.NodeCoordinator.mo3642z1(sl3):void");
    }
}
