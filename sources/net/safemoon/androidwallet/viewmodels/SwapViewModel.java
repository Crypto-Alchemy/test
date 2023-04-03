package net.safemoon.androidwallet.viewmodels;

import android.app.Application;
import android.os.CountDownTimer;
import androidx.lifecycle.LiveData;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import net.safemoon.androidwallet.ERC20;
import net.safemoon.androidwallet.R;
import net.safemoon.androidwallet.SafeswapFactory;
import net.safemoon.androidwallet.SafeswapPair;
import net.safemoon.androidwallet.SafeswapRouter;
import net.safemoon.androidwallet.SafeswapTradeRouter;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.common.Gas;
import net.safemoon.androidwallet.model.common.GasPrice;
import net.safemoon.androidwallet.model.common.LoadingState;
import net.safemoon.androidwallet.model.swap.BaseTokens;
import net.safemoon.androidwallet.model.swap.Pairs;
import net.safemoon.androidwallet.model.swap.Swap;
import net.safemoon.androidwallet.utils.PreFetchData;
import org.web3j.protocol.core.DefaultBlockParameterName;
import p000.y23;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\u0018\u0000 J2\u00020\u0001:\b÷\u0001ø\u0001[_eiB\u0012\u0012\u0007\u0010ô\u0001\u001a\u00020Z¢\u0006\u0006\bõ\u0001\u0010ö\u0001J\u0010\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0017\u001a\u00020\nH\u0002J\u001b\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002J\u0014\u0010 \u001a\u00020\n2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002J\n\u0010!\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J\u0012\u0010%\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J\u001f\u0010'\u001a\u0004\u0018\u00010&2\b\u0010#\u001a\u0004\u0018\u00010\"H@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J\u0018\u0010+\u001a\n \u0003*\u0004\u0018\u00010*0*2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010-\u001a\n \u0003*\u0004\u0018\u00010,0,2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010/\u001a\n \u0003*\u0004\u0018\u00010.0.H\u0002J\u0018\u00102\u001a\n \u0003*\u0004\u0018\u000101012\u0006\u00100\u001a\u00020\u0010H\u0002J\u000e\u00105\u001a\u00020\n2\u0006\u00104\u001a\u000203J\u000e\u00108\u001a\u00020\u00102\u0006\u00107\u001a\u000206J\u0006\u00109\u001a\u00020\nJ\u001e\u0010=\u001a\u00020\n2\u0006\u0010:\u001a\u00020\u001e2\u000e\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0;J\u0006\u0010>\u001a\u00020\nJ\u0006\u0010?\u001a\u00020\nJ\u0006\u0010@\u001a\u00020\nJ\u0006\u0010A\u001a\u00020\u000eJ\u0006\u0010B\u001a\u00020\u0010J\u0006\u0010C\u001a\u00020\nJ\u0006\u0010D\u001a\u00020\nJ\u0006\u0010E\u001a\u00020\nJ\u0016\u0010I\u001a\u00020\n2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020FJ\u0006\u0010J\u001a\u00020\u0005J\u000e\u0010L\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u0005J\u000e\u0010M\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u0005J\u0006\u0010N\u001a\u00020\nJ\u0006\u0010O\u001a\u00020\u0010J\u0006\u0010P\u001a\u00020\u0010J\u0006\u0010Q\u001a\u00020\u0010J\u0006\u0010R\u001a\u00020\u000eJ\u0006\u0010S\u001a\u00020\u0010J\u0006\u0010T\u001a\u00020\u0005J\u000e\u0010W\u001a\u00020\n2\u0006\u0010V\u001a\u00020UJ\u0006\u0010X\u001a\u00020\nJ\u0006\u0010Y\u001a\u00020\nR\u0014\u0010]\u001a\u00020Z8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001f\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0^8\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR%\u0010g\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010d0d0^8\u0006¢\u0006\f\n\u0004\be\u0010`\u001a\u0004\bf\u0010bR%\u0010k\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010h0h0^8\u0006¢\u0006\f\n\u0004\bi\u0010`\u001a\u0004\bj\u0010bR%\u0010n\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u000106060^8\u0006¢\u0006\f\n\u0004\bl\u0010`\u001a\u0004\bm\u0010bR(\u0010s\u001a\b\u0012\u0004\u0012\u00020\f0^8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bo\u0010`\u001a\u0004\bp\u0010b\"\u0004\bq\u0010rR(\u0010w\u001a\b\u0012\u0004\u0012\u00020\f0^8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bt\u0010`\u001a\u0004\bu\u0010b\"\u0004\bv\u0010rR\u001f\u0010z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0^8\u0006¢\u0006\f\n\u0004\bx\u0010`\u001a\u0004\by\u0010bR\u001f\u0010}\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0^8\u0006¢\u0006\f\n\u0004\b{\u0010`\u001a\u0004\b|\u0010bR\u001e\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020d0^8\u0006¢\u0006\f\n\u0004\b~\u0010`\u001a\u0004\b\u0010bR \u0010\u0001\u001a\b\u0012\u0004\u0012\u00020d0^8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR \u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100^8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR#\u0010\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u00010^8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR*\u0010\u0001\u001a\u0012\u0012\u000e\u0012\f \u0003*\u0005\u0018\u00010\u00010\u00010^8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR \u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0^8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR \u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001e0^8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR \u0010\u0001\u001a\b\u0012\u0004\u0012\u0002060^8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR*\u0010\u0001\u001a\u0012\u0012\u000e\u0012\f \u0003*\u0005\u0018\u00010\u00010\u00010^8\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010`\u001a\u0005\b\u0001\u0010bR\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\"\u0010£\u0001\u001a\u0004\u0018\u00010\u00108BX\u0002¢\u0006\u0010\n\u0006\b\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R!\u00100\u001a\u0004\u0018\u00010\u00108BX\u0002¢\u0006\u0010\n\u0006\b¤\u0001\u0010 \u0001\u001a\u0006\b¥\u0001\u0010¢\u0001R*\u0010ª\u0001\u001a\f \u0003*\u0005\u0018\u00010¦\u00010¦\u00018BX\u0002¢\u0006\u0010\n\u0006\b§\u0001\u0010 \u0001\u001a\u0006\b¨\u0001\u0010©\u0001R\u001f\u0010­\u0001\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00058\u0002X\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001a\u0010±\u0001\u001a\u00030®\u00018\u0002@\u0002X.¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u001a\u0010³\u0001\u001a\u00030®\u00018\u0002@\u0002X.¢\u0006\b\n\u0006\b²\u0001\u0010°\u0001R\u001c\u0010·\u0001\u001a\u0005\u0018\u00010´\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001c\u0010¹\u0001\u001a\u0005\u0018\u00010´\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¶\u0001R\u001c\u0010»\u0001\u001a\u0005\u0018\u00010´\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bº\u0001\u0010¶\u0001R\u001c\u0010½\u0001\u001a\u0005\u0018\u00010´\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010¶\u0001R\u001b\u0010¾\u0001\u001a\u0005\u0018\u00010´\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bM\u0010¶\u0001R\u001b\u0010Â\u0001\u001a\u00030¿\u00018\u0006¢\u0006\u000e\n\u0004\bL\u0010\u001a\u001a\u0006\bÀ\u0001\u0010Á\u0001R)\u0010Ä\u0001\u001a\u0012\u0012\u000e\u0012\f \u0003*\u0005\u0018\u00010¿\u00010¿\u00010^8\u0006¢\u0006\r\n\u0004\bC\u0010`\u001a\u0005\bÃ\u0001\u0010bR'\u0010Æ\u0001\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u000e0\u000e0^8\u0006¢\u0006\r\n\u0004\b@\u0010`\u001a\u0005\bÅ\u0001\u0010bR\u001b\u0010É\u0001\u001a\u0005\u0018\u00010Ç\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010È\u0001R\u001b\u0010Ê\u0001\u001a\u0005\u0018\u00010´\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u001a\u0010¶\u0001R!\u0010Ì\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100^8\u0006¢\u0006\r\n\u0004\bW\u0010`\u001a\u0005\bË\u0001\u0010bR\u001f\u0010Î\u0001\u001a\b\u0012\u0004\u0012\u00020d0^8\u0006¢\u0006\r\n\u0004\b=\u0010`\u001a\u0005\bÍ\u0001\u0010bR \u0010Ð\u0001\u001a\b\u0012\u0004\u0012\u00020d0^8\u0006¢\u0006\u000e\n\u0005\b¥\u0001\u0010`\u001a\u0005\bÏ\u0001\u0010bR \u0010Ò\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0^8\u0006¢\u0006\u000e\n\u0005\bÍ\u0001\u0010`\u001a\u0005\bÑ\u0001\u0010bR\u001c\u0010Ó\u0001\u001a\u0005\u0018\u00010´\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010¶\u0001R=\u0010Ø\u0001\u001a&\u0012\u0004\u0012\u000206\u0012\u0007\u0012\u0005\u0018\u00010Õ\u00010Ô\u0001j\u0012\u0012\u0004\u0012\u000206\u0012\u0007\u0012\u0005\u0018\u00010Õ\u0001`Ö\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b\u0001\u0010×\u0001R8\u0010Ú\u0001\u001a\"\u0012\u0004\u0012\u000206\u0012\u0005\u0012\u00030Ù\u00010Ô\u0001j\u0010\u0012\u0004\u0012\u000206\u0012\u0005\u0012\u00030Ù\u0001`Ö\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bB\u0010×\u0001R+\u0010à\u0001\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R,\u0010ç\u0001\u001a\u0005\u0018\u00010á\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\bâ\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R)\u0010é\u0001\u001a\u0012\u0012\u000e\u0012\f \u0003*\u0005\u0018\u00010\u00010\u00010^8\u0006¢\u0006\r\n\u0004\b'\u0010`\u001a\u0005\bè\u0001\u0010bR!\u0010ì\u0001\u001a\t\u0012\u0005\u0012\u00030ê\u00010^8\u0006¢\u0006\u000e\n\u0005\bÑ\u0001\u0010`\u001a\u0005\bë\u0001\u0010bR'\u0010î\u0001\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010U0U0^8\u0006¢\u0006\r\n\u0004\b\u0011\u0010`\u001a\u0005\bí\u0001\u0010bR \u0010ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\f0ï\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010ð\u0001R6\u0010ó\u0001\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\f \u0003*\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010ï\u00010ï\u00010^8\u0006¢\u0006\u000e\n\u0005\b¨\u0001\u0010`\u001a\u0005\bò\u0001\u0010b\u0002\u0004\n\u0002\b\u0019¨\u0006ù\u0001"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapViewModel;", "Lwj;", "Lvj7;", "kotlin.jvm.PlatformType", "m1", "Ljava/math/BigInteger;", "k0", "gasLimit", "Lit0;", "l0", "Lr37;", "T0", "Lnet/safemoon/androidwallet/model/swap/Swap;", "swap", "", "P0", "", "V", "U0", "D0", "R0", "S0", "e0", "f0", "transactionHash", "Lks1;", "J", "(Ljava/lang/String;Lns0;)Ljava/lang/Object;", "trxHash", "I", "Ljava/math/BigDecimal;", "requireGasFee", "g1", "O0", "Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$a;", "enterAmount", "z0", "y0", "Lkt6;", "T", "(Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$a;Lns0;)Ljava/lang/Object;", "Z0", "Lnet/safemoon/androidwallet/SafeswapRouter;", "p0", "Lnet/safemoon/androidwallet/SafeswapTradeRouter;", "I0", "Lnet/safemoon/androidwallet/SafeswapFactory;", "n0", "address", "Lnet/safemoon/androidwallet/SafeswapPair;", "o0", "Lug3;", "lifecycle", "b1", "", "resId", "E0", "W0", "amountIn", "Lj36;", "callBack", "L", "l1", "X0", "H", "Q0", "Q", "G", "i1", "j1", "Lfe7;", "bindingSource", "bindingDestination", "a1", "Y", "amountOut", "F", "E", "k1", "v0", "H0", "g0", "N0", "s0", "q0", "Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$c;", "stl", "K", "V0", "Y0", "Landroid/app/Application;", "b", "Landroid/app/Application;", "context", "Lk04;", "c", "Lk04;", "G0", "()Lk04;", "tilEnterAmount", "", "d", "x0", "slipPage", "Lnet/safemoon/androidwallet/model/common/Gas;", "e", "j0", "gas", "f", "Z", "deadTime", "g", "B0", "setSourceLiveData", "(Lk04;)V", "sourceLiveData", "h", "c0", "setDestinationLiveData", "destinationLiveData", "i", "A0", "sourceBalance", "j", "b0", "destinationBalance", "k", "C0", "sourcePrice", "l", "d0", "destinationPrice", "m", "K0", "transactionFee", "Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$d;", "n", "L0", "transactionGasLimit", "Lnet/safemoon/androidwallet/model/common/LoadingState;", "o", "h0", "findBestMaxValueProgress", "p", "i0", "findBestMaxValueSuggestion", "q", "w0", "setBestMaxValue", "r", "R", "approveSwap", "s", "P", "approvaSwapLoading", "Lnet/safemoon/androidwallet/model/common/GasPrice;", "t", "Lnet/safemoon/androidwallet/model/common/GasPrice;", "gasPrice", "u", "Lef3;", "r0", "()Ljava/lang/String;", "privateKey", "v", "M", "Lcw0;", "w", "X", "()Lcw0;", "credentails", "x", "Ljava/math/BigInteger;", "GAS_LIMIT", "Lnet/safemoon/androidwallet/ERC20;", "y", "Lnet/safemoon/androidwallet/ERC20;", "erc20Source", "z", "erc20Destination", "Ly23;", "A", "Ly23;", "sourceJobBalance", "B", "sourceJobMarket", "C", "destinationJobBalance", "D", "destinationJobMarket", "gasJob", "", "getCOUNT_DOWN_MILL_SECONDS", "()J", "COUNT_DOWN_MILL_SECONDS", "W", "countDown", "u0", "resetInputValue", "Landroid/os/CountDownTimer;", "Landroid/os/CountDownTimer;", "countDownTimer", "approveStatus", "t0", "requireGasFeeLiveData", "N", "amountDestinationMin", "O", "amountSource", "U", "bestTradeLoad", "bestAmountJob", "Ljava/util/HashMap;", "Lnet/safemoon/androidwallet/model/swap/Pairs;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "pairsAndReserveHashMap", "Lnet/safemoon/androidwallet/model/swap/BaseTokens;", "basePairsHashMap", "Lkt6;", "J0", "()Lkt6;", "setTradeStructure", "(Lkt6;)V", "tradeStructure", "Lue6;", "S", "Lue6;", "()Lue6;", "setBestTrade", "(Lue6;)V", "bestTrade", "m0", "loadingState", "Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$e;", "M0", "transactionResult", "a0", "defaultParam", "", "Ljava/util/List;", "swapTokensListData", "F0", "swapListMap", "application", "<init>", "(Landroid/app/Application;)V", "a", "ApproveStatus", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SwapViewModel.kt */
public final class SwapViewModel extends C3552wj {

    /* renamed from: Y */
    public static final C8787b f42898Y = new C8787b((DefaultConstructorMarker) null);

    /* renamed from: A */
    public y23 f42899A;

    /* renamed from: B */
    public y23 f42900B;

    /* renamed from: C */
    public y23 f42901C;

    /* renamed from: D */
    public y23 f42902D;

    /* renamed from: E */
    public y23 f42903E;

    /* renamed from: F */
    public final long f42904F;

    /* renamed from: G */
    public final k04<Long> f42905G;

    /* renamed from: H */
    public final k04<Boolean> f42906H;

    /* renamed from: I */
    public CountDownTimer f42907I;

    /* renamed from: J */
    public y23 f42908J;

    /* renamed from: K */
    public final k04<String> f42909K;

    /* renamed from: L */
    public final k04<Double> f42910L;

    /* renamed from: M */
    public final k04<Double> f42911M;

    /* renamed from: N */
    public final k04<Boolean> f42912N;

    /* renamed from: O */
    public y23 f42913O;

    /* renamed from: P */
    public HashMap<Integer, Pairs> f42914P;

    /* renamed from: Q */
    public HashMap<Integer, BaseTokens> f42915Q;

    /* renamed from: R */
    public kt6 f42916R;

    /* renamed from: S */
    public ue6 f42917S;

    /* renamed from: T */
    public final k04<LoadingState> f42918T;

    /* renamed from: U */
    public final k04<C8790e> f42919U;

    /* renamed from: V */
    public final k04<C8788c> f42920V;

    /* renamed from: W */
    public List<? extends Swap> f42921W;

    /* renamed from: X */
    public final k04<List<Swap>> f42922X;

    /* renamed from: b */
    public final Application f42923b;

    /* renamed from: c */
    public final k04<C8786a> f42924c = new k04<>();

    /* renamed from: d */
    public final k04<Double> f42925d = new k04<>(Double.valueOf(12.0d));

    /* renamed from: e */
    public final k04<Gas> f42926e = new k04<>(Gas.Standard);

    /* renamed from: f */
    public final k04<Integer> f42927f = new k04<>(20);

    /* renamed from: g */
    public k04<Swap> f42928g = new k04<>();

    /* renamed from: h */
    public k04<Swap> f42929h = new k04<>();

    /* renamed from: i */
    public final k04<BigDecimal> f42930i = new k04<>();

    /* renamed from: j */
    public final k04<BigDecimal> f42931j = new k04<>();

    /* renamed from: k */
    public final k04<Double> f42932k = new k04<>();

    /* renamed from: l */
    public final k04<Double> f42933l = new k04<>();

    /* renamed from: m */
    public final k04<String> f42934m = new k04<>("");

    /* renamed from: n */
    public final k04<C8789d> f42935n = new k04<>();

    /* renamed from: o */
    public final k04<LoadingState> f42936o;

    /* renamed from: p */
    public final k04<BigDecimal> f42937p;

    /* renamed from: q */
    public final k04<BigDecimal> f42938q;

    /* renamed from: r */
    public final k04<Integer> f42939r;

    /* renamed from: s */
    public final k04<LoadingState> f42940s;

    /* renamed from: t */
    public final GasPrice f42941t;

    /* renamed from: u */
    public final ef3 f42942u;

    /* renamed from: v */
    public final ef3 f42943v;

    /* renamed from: w */
    public final ef3 f42944w;

    /* renamed from: x */
    public final BigInteger f42945x;

    /* renamed from: y */
    public ERC20 f42946y;

    /* renamed from: z */
    public ERC20 f42947z;

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$ApproveStatus;", "", "(Ljava/lang/String;I)V", "ALLOWED", "FAILED", "CONFUSE", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: SwapViewModel.kt */
    public enum ApproveStatus {
        ALLOWED,
        FAILED,
        CONFUSE
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0014"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "b", "()Z", "isSource", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "amount", "<init>", "(ZLjava/math/BigDecimal;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapViewModel$a */
    /* compiled from: SwapViewModel.kt */
    public static final class C8786a {

        /* renamed from: a */
        public final boolean f42949a;

        /* renamed from: b */
        public final BigDecimal f42950b;

        public C8786a(boolean z, BigDecimal bigDecimal) {
            vx2.m53591g(bigDecimal, "amount");
            this.f42949a = z;
            this.f42950b = bigDecimal;
        }

        /* renamed from: a */
        public final BigDecimal mo61634a() {
            return this.f42950b;
        }

        /* renamed from: b */
        public final boolean mo61635b() {
            return this.f42949a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8786a)) {
                return false;
            }
            C8786a aVar = (C8786a) obj;
            return this.f42949a == aVar.f42949a && vx2.m53586b(this.f42950b, aVar.f42950b);
        }

        public int hashCode() {
            boolean z = this.f42949a;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f42950b.hashCode();
        }

        public String toString() {
            boolean z = this.f42949a;
            BigDecimal bigDecimal = this.f42950b;
            return "AMOUNT(isSource=" + z + ", amount=" + bigDecimal + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$b;", "", "", "FUNCTION_ERROR", "Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapViewModel$b */
    /* compiled from: SwapViewModel.kt */
    public static final class C8787b {
        public C8787b() {
        }

        public /* synthetic */ C8787b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lnet/safemoon/androidwallet/common/TokenType;", "a", "Lnet/safemoon/androidwallet/common/TokenType;", "()Lnet/safemoon/androidwallet/common/TokenType;", "b", "(Lnet/safemoon/androidwallet/common/TokenType;)V", "tokenType", "<init>", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapViewModel$c */
    /* compiled from: SwapViewModel.kt */
    public static final class C8788c {

        /* renamed from: a */
        public TokenType f42951a;

        public C8788c() {
            this((TokenType) null, 1, (DefaultConstructorMarker) null);
        }

        public C8788c(TokenType tokenType) {
            vx2.m53591g(tokenType, "tokenType");
            this.f42951a = tokenType;
        }

        /* renamed from: a */
        public final TokenType mo61639a() {
            return this.f42951a;
        }

        /* renamed from: b */
        public final void mo61640b(TokenType tokenType) {
            vx2.m53591g(tokenType, "<set-?>");
            this.f42951a = tokenType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8788c) && this.f42951a == ((C8788c) obj).f42951a;
        }

        public int hashCode() {
            return this.f42951a.hashCode();
        }

        public String toString() {
            TokenType tokenType = this.f42951a;
            return "DefaultParam(tokenType=" + tokenType + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C8788c(TokenType tokenType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? TokenType.BEP_20 : tokenType);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u001b"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$d;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/math/BigInteger;", "a", "Ljava/math/BigInteger;", "()Ljava/math/BigInteger;", "amount", "b", "d", "tradeFee", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "method", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "nativeBalance", "<init>", "(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/lang/String;Ljava/math/BigDecimal;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapViewModel$d */
    /* compiled from: SwapViewModel.kt */
    public static final class C8789d {

        /* renamed from: a */
        public final BigInteger f42952a;

        /* renamed from: b */
        public final BigInteger f42953b;

        /* renamed from: c */
        public final String f42954c;

        /* renamed from: d */
        public final BigDecimal f42955d;

        public C8789d(BigInteger bigInteger, BigInteger bigInteger2, String str, BigDecimal bigDecimal) {
            vx2.m53591g(bigInteger, "amount");
            vx2.m53591g(bigInteger2, "tradeFee");
            vx2.m53591g(str, "method");
            vx2.m53591g(bigDecimal, "nativeBalance");
            this.f42952a = bigInteger;
            this.f42953b = bigInteger2;
            this.f42954c = str;
            this.f42955d = bigDecimal;
        }

        /* renamed from: a */
        public final BigInteger mo61644a() {
            return this.f42952a;
        }

        /* renamed from: b */
        public final String mo61645b() {
            return this.f42954c;
        }

        /* renamed from: c */
        public final BigDecimal mo61646c() {
            return this.f42955d;
        }

        /* renamed from: d */
        public final BigInteger mo61647d() {
            return this.f42953b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8789d)) {
                return false;
            }
            C8789d dVar = (C8789d) obj;
            return vx2.m53586b(this.f42952a, dVar.f42952a) && vx2.m53586b(this.f42953b, dVar.f42953b) && vx2.m53586b(this.f42954c, dVar.f42954c) && vx2.m53586b(this.f42955d, dVar.f42955d);
        }

        public int hashCode() {
            return (((((this.f42952a.hashCode() * 31) + this.f42953b.hashCode()) * 31) + this.f42954c.hashCode()) * 31) + this.f42955d.hashCode();
        }

        public String toString() {
            BigInteger bigInteger = this.f42952a;
            BigInteger bigInteger2 = this.f42953b;
            String str = this.f42954c;
            BigDecimal bigDecimal = this.f42955d;
            return "GasLimit(amount=" + bigInteger + ", tradeFee=" + bigInteger2 + ", method=" + str + ", nativeBalance=" + bigDecimal + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Lnet/safemoon/androidwallet/viewmodels/SwapViewModel$e;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "b", "()Z", "isSuccess", "Ljava/lang/String;", "()Ljava/lang/String;", "message", "<init>", "(ZLjava/lang/String;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapViewModel$e */
    /* compiled from: SwapViewModel.kt */
    public static final class C8790e {

        /* renamed from: a */
        public final boolean f42956a;

        /* renamed from: b */
        public final String f42957b;

        public C8790e(boolean z, String str) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            this.f42956a = z;
            this.f42957b = str;
        }

        /* renamed from: a */
        public final String mo61651a() {
            return this.f42957b;
        }

        /* renamed from: b */
        public final boolean mo61652b() {
            return this.f42956a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8790e)) {
                return false;
            }
            C8790e eVar = (C8790e) obj;
            return this.f42956a == eVar.f42956a && vx2.m53586b(this.f42957b, eVar.f42957b);
        }

        public int hashCode() {
            boolean z = this.f42956a;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f42957b.hashCode();
        }

        public String toString() {
            boolean z = this.f42956a;
            String str = this.f42957b;
            return "TransactionResult(isSuccess=" + z + ", message=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/SwapViewModel$f", "Lue6;", "", "pair", "Lnet/safemoon/androidwallet/SafeswapPair;", "kotlin.jvm.PlatformType", "n", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapViewModel$f */
    /* compiled from: SwapViewModel.kt */
    public static final class C8791f extends ue6 {

        /* renamed from: g */
        public final /* synthetic */ SwapViewModel f42958g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8791f(SwapViewModel swapViewModel, SafeswapRouter safeswapRouter, Swap swap) {
            super(safeswapRouter, swap);
            this.f42958g = swapViewModel;
            vx2.m53590f(safeswapRouter, "getMainRouter(GAS_LIMIT)");
        }

        /* renamed from: n */
        public SafeswapPair mo61656n(String str) {
            vx2.m53591g(str, "pair");
            return this.f42958g.mo61622o0(str);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, mo44877d2 = {"net/safemoon/androidwallet/viewmodels/SwapViewModel$g", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "Lr37;", "onTick", "onFinish", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: net.safemoon.androidwallet.viewmodels.SwapViewModel$g */
    /* compiled from: SwapViewModel.kt */
    public static final class C8792g extends CountDownTimer {

        /* renamed from: a */
        public final /* synthetic */ SwapViewModel f42959a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8792g(SwapViewModel swapViewModel, long j, long j2) {
            super(j, j2);
            this.f42959a = swapViewModel;
        }

        public void onFinish() {
            if (vx2.m53586b(this.f42959a.mo61588U().getValue(), Boolean.FALSE)) {
                this.f42959a.mo61628u0().postValue(Boolean.TRUE);
            }
        }

        public void onTick(long j) {
            this.f42959a.mo61592W().postValue(Long.valueOf(j));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwapViewModel(Application application) {
        super(application);
        vx2.m53591g(application, "application");
        this.f42923b = application;
        mo61591V0();
        LoadingState loadingState = LoadingState.Normal;
        this.f42936o = new k04<>(loadingState);
        this.f42937p = new k04<>();
        this.f42938q = new k04<>();
        this.f42939r = new k04<>(0);
        this.f42940s = new k04<>(loadingState);
        this.f42941t = new GasPrice();
        this.f42942u = C6169a.m47232a(new SwapViewModel$privateKey$2(application));
        this.f42943v = C6169a.m47232a(new SwapViewModel$address$2(application));
        this.f42944w = C6169a.m47232a(new SwapViewModel$credentails$2(this));
        this.f42945x = BigInteger.valueOf(9000000);
        long millis = TimeUnit.SECONDS.toMillis(10);
        this.f42904F = millis;
        this.f42905G = new k04<>(Long.valueOf(millis));
        Boolean bool = Boolean.FALSE;
        this.f42906H = new k04<>(bool);
        this.f42909K = new k04<>(null);
        Double valueOf = Double.valueOf(Utils.DOUBLE_EPSILON);
        this.f42910L = new k04<>(valueOf);
        this.f42911M = new k04<>(valueOf);
        this.f42912N = new k04<>(bool);
        this.f42914P = new HashMap<>();
        this.f42915Q = new HashMap<>();
        this.f42918T = new k04<>(loadingState);
        this.f42919U = new k04<>();
        this.f42920V = new k04<>(new C8788c((TokenType) null, 1, (DefaultConstructorMarker) null));
        this.f42921W = ck0.m33062j();
        this.f42922X = new k04<>(ck0.m33062j());
    }

    /* renamed from: c1 */
    public static final void m68955c1(SwapViewModel swapViewModel, Swap swap) {
        vx2.m53591g(swapViewModel, "this$0");
        if (swap != null) {
            swapViewModel.mo61587T0();
            swapViewModel.mo61593W0();
        }
    }

    /* renamed from: d1 */
    public static final void m68957d1(SwapViewModel swapViewModel, Swap swap) {
        vx2.m53591g(swapViewModel, "this$0");
        if (swap != null) {
            swapViewModel.mo61583R0();
            swapViewModel.mo61593W0();
        }
    }

    /* renamed from: e1 */
    public static final void m68959e1(SwapViewModel swapViewModel, Double d) {
        vx2.m53591g(swapViewModel, "this$0");
        swapViewModel.mo61593W0();
    }

    /* renamed from: f1 */
    public static final void m68961f1(SwapViewModel swapViewModel, Gas gas) {
        vx2.m53591g(swapViewModel, "this$0");
        swapViewModel.mo61593W0();
    }

    /* renamed from: h1 */
    public static /* synthetic */ void m68964h1(SwapViewModel swapViewModel, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = null;
        }
        swapViewModel.mo61609g1(bigDecimal);
    }

    /* renamed from: A0 */
    public final k04<BigDecimal> mo61552A0() {
        return this.f42930i;
    }

    /* renamed from: B0 */
    public final k04<Swap> mo61553B0() {
        return this.f42928g;
    }

    /* renamed from: C0 */
    public final k04<Double> mo61554C0() {
        return this.f42932k;
    }

    /* renamed from: D0 */
    public final void mo61555D0(Swap swap) {
        y23 y23 = this.f42900B;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        this.f42900B = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapViewModel$getSourcePriceFromCMC$1(swap, this, (ns0<? super SwapViewModel$getSourcePriceFromCMC$1>) null), 3, (Object) null);
    }

    /* renamed from: E */
    public final BigInteger mo61556E(BigInteger bigInteger) {
        vx2.m53591g(bigInteger, "amountIn");
        Double value = this.f42925d.getValue();
        vx2.m53588d(value);
        double doubleValue = value.doubleValue();
        BigDecimal[] bigDecimalArr = {new BigDecimal(String.valueOf(1.0d)), new BigDecimal(String.valueOf(1.0d))};
        BigDecimal multiply = new BigDecimal(String.valueOf(doubleValue)).multiply(new BigDecimal(String.valueOf(100.0d)));
        vx2.m53590f(multiply, "this.multiply(other)");
        BigDecimal[] bigDecimalArr2 = {multiply, new BigDecimal(String.valueOf(10000.0d))};
        BigDecimal multiply2 = bigDecimalArr2[0].multiply(bigDecimalArr[1]);
        vx2.m53590f(multiply2, "this.multiply(other)");
        BigDecimal multiply3 = bigDecimalArr[0].multiply(bigDecimalArr2[1]);
        vx2.m53590f(multiply3, "this.multiply(other)");
        BigDecimal add = multiply2.add(multiply3);
        vx2.m53590f(add, "this.add(other)");
        BigDecimal multiply4 = bigDecimalArr[1].multiply(bigDecimalArr2[1]);
        vx2.m53590f(multiply4, "this.multiply(other)");
        BigDecimal[] bigDecimalArr3 = {add, multiply4};
        BigDecimal multiply5 = bigDecimalArr3[0].multiply(new BigDecimal(bigInteger));
        vx2.m53590f(multiply5, "outputamount[0].multiply(amountIn.toBigDecimal())");
        bigDecimalArr3[0] = multiply5;
        BigDecimal divide = multiply5.divide(bigDecimalArr3[1], RoundingMode.HALF_EVEN);
        vx2.m53590f(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        BigInteger bigInteger2 = divide.setScale(0, RoundingMode.DOWN).toBigInteger();
        vx2.m53590f(bigInteger2, "outputamount[0].div(outp…Mode.DOWN).toBigInteger()");
        return bigInteger2;
    }

    /* renamed from: E0 */
    public final String mo61557E0(int i) {
        String string = mo27549b().getString(i);
        vx2.m53590f(string, "getApplication<Application>().getString(resId)");
        return string;
    }

    /* renamed from: F */
    public final BigInteger mo61558F(BigInteger bigInteger) {
        vx2.m53591g(bigInteger, "amountOut");
        Double value = this.f42925d.getValue();
        vx2.m53588d(value);
        double doubleValue = value.doubleValue();
        BigDecimal[] bigDecimalArr = {new BigDecimal(String.valueOf(1.0d)), new BigDecimal(String.valueOf(1.0d))};
        BigDecimal multiply = new BigDecimal(String.valueOf(doubleValue)).multiply(new BigDecimal(String.valueOf(100.0d)));
        vx2.m53590f(multiply, "this.multiply(other)");
        BigDecimal[] bigDecimalArr2 = {multiply, new BigDecimal(String.valueOf(10000.0d))};
        BigDecimal multiply2 = bigDecimalArr2[0].multiply(bigDecimalArr[1]);
        vx2.m53590f(multiply2, "this.multiply(other)");
        BigDecimal multiply3 = bigDecimalArr[0].multiply(bigDecimalArr2[1]);
        vx2.m53590f(multiply3, "this.multiply(other)");
        BigDecimal add = multiply2.add(multiply3);
        vx2.m53590f(add, "this.add(other)");
        BigDecimal multiply4 = bigDecimalArr[1].multiply(bigDecimalArr2[1]);
        vx2.m53590f(multiply4, "this.multiply(other)");
        BigDecimal[] bigDecimalArr3 = {multiply4, new BigDecimal[]{add, multiply4}[0]};
        BigDecimal multiply5 = multiply4.multiply(new BigDecimal(bigInteger));
        vx2.m53590f(multiply5, "outputamount[0].multiply(amountOut.toBigDecimal())");
        bigDecimalArr3[0] = multiply5;
        BigDecimal divide = multiply5.divide(bigDecimalArr3[1], RoundingMode.HALF_EVEN);
        vx2.m53590f(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        BigInteger bigInteger2 = divide.setScale(0, RoundingMode.DOWN).toBigInteger();
        vx2.m53590f(bigInteger2, "outputamount[0].div(outp…Mode.DOWN).toBigInteger()");
        return bigInteger2;
    }

    /* renamed from: F0 */
    public final k04<List<Swap>> mo61559F0() {
        return this.f42922X;
    }

    /* renamed from: G */
    public final void mo61560G() {
        this.f42940s.postValue(LoadingState.Loading);
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapViewModel$askForApproval$1(this, (ns0<? super SwapViewModel$askForApproval$1>) null), 3, (Object) null);
    }

    /* renamed from: G0 */
    public final k04<C8786a> mo61561G0() {
        return this.f42924c;
    }

    /* renamed from: H */
    public final void mo61562H() {
        y23 y23 = this.f42900B;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        y23 y232 = this.f42899A;
        if (y232 != null) {
            y23.C9621a.m74226a(y232, (CancellationException) null, 1, (Object) null);
        }
        y23 y233 = this.f42902D;
        if (y233 != null) {
            y23.C9621a.m74226a(y233, (CancellationException) null, 1, (Object) null);
        }
        y23 y234 = this.f42901C;
        if (y234 != null) {
            y23.C9621a.m74226a(y234, (CancellationException) null, 1, (Object) null);
        }
        y23 y235 = this.f42903E;
        if (y235 != null) {
            y23.C9621a.m74226a(y235, (CancellationException) null, 1, (Object) null);
        }
        y23 y236 = this.f42913O;
        if (y236 != null) {
            y23.C9621a.m74226a(y236, (CancellationException) null, 1, (Object) null);
        }
        this.f42924c.postValue(null);
        this.f42930i.postValue(BigDecimal.ZERO);
        this.f42931j.postValue(BigDecimal.ZERO);
        k04<Swap> k04 = this.f42928g;
        k04.postValue(k04.getValue());
        k04<Swap> k042 = this.f42929h;
        k042.postValue(k042.getValue());
        this.f42940s.postValue(LoadingState.Normal);
        this.f42939r.postValue(0);
    }

    /* renamed from: H0 */
    public final String mo61563H0() {
        Integer num;
        Swap value = this.f42928g.getValue();
        if (value != null) {
            num = value.chainId;
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 56) {
            return "0x524BC73fCb4fB70E2E84dC08EFE255252A3b026E";
        }
        if (num != null && num.intValue() == 1) {
            return "0x3816016D0855A2b35b90DddcAe4A2e9Ad690947d";
        }
        return "0x0000000000000000000000000000000000000000";
    }

    /* renamed from: I */
    public final void mo61564I(String str) {
        y23 y23 = this.f42908J;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        this.f42908J = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapViewModel$checkApproveStatus$1(this, str, (ns0<? super SwapViewModel$checkApproveStatus$1>) null), 3, (Object) null);
    }

    /* renamed from: I0 */
    public final SafeswapTradeRouter mo61565I0(BigInteger bigInteger) {
        return SafeswapTradeRouter.m64708u(mo61563H0(), mo61620m1(), mo61594X(), mo61617l0(bigInteger));
    }

    /* renamed from: J */
    public final Object mo61566J(String str, ns0<? super ks1> ns0) {
        ks1 send = mo61620m1().ethGetTransactionReceipt(str).send();
        vx2.m53590f(send, "web3().ethGetTransaction…t(transactionHash).send()");
        return send;
    }

    /* renamed from: J0 */
    public final kt6 mo61567J0() {
        return this.f42916R;
    }

    /* renamed from: K */
    public final void mo61568K(C8788c cVar) {
        int i;
        vx2.m53591g(cVar, "stl");
        ArrayList arrayList = new ArrayList();
        List<? extends Swap> list = this.f42921W;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            int chainId = cVar.mo61639a().getChainId();
            Integer num = ((Swap) next).chainId;
            if (num == null || chainId != num.intValue()) {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : arrayList2) {
            if (hashSet.add(((Swap) next2).address)) {
                arrayList3.add(next2);
            }
        }
        arrayList.addAll(arrayList3);
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (vx2.m53586b(((Swap) listIterator.previous()).symbol, "SFM")) {
                    i = listIterator.nextIndex();
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (i > 2) {
            arrayList.add(1, (Swap) arrayList.remove(i));
        }
        this.f42922X.postValue(arrayList);
    }

    /* renamed from: K0 */
    public final k04<String> mo61569K0() {
        return this.f42934m;
    }

    /* renamed from: L */
    public final void mo61570L(BigDecimal bigDecimal, j36<BigDecimal> j36) {
        vx2.m53591g(bigDecimal, "amountIn");
        vx2.m53591g(j36, "callBack");
        this.f42935n.postValue(null);
        this.f42934m.setValue("");
        y23 y23 = this.f42913O;
        if (y23 != null) {
            i33.m58817e(y23, "New Job", (Throwable) null, 2, (Object) null);
        }
        mo61614j1();
        this.f42939r.postValue(0);
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapViewModel$findMaximumAmountInForNativeToken$1(this, bigDecimal, j36, (ns0<? super SwapViewModel$findMaximumAmountInForNativeToken$1>) null), 3, (Object) null);
    }

    /* renamed from: L0 */
    public final k04<C8789d> mo61571L0() {
        return this.f42935n;
    }

    /* renamed from: M */
    public final String mo61572M() {
        return (String) this.f42943v.getValue();
    }

    /* renamed from: M0 */
    public final k04<C8790e> mo61573M0() {
        return this.f42919U;
    }

    /* renamed from: N */
    public final k04<Double> mo61574N() {
        return this.f42910L;
    }

    /* renamed from: N0 */
    public final boolean mo61575N0() {
        Integer num;
        Swap value = this.f42928g.getValue();
        if (value != null) {
            num = value.chainId;
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            return true;
        }
        if (num != null && num.intValue() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public final k04<Double> mo61576O() {
        return this.f42911M;
    }

    /* renamed from: O0 */
    public final String mo61577O0() {
        String str;
        String str2;
        if (mo61575N0()) {
            str = "ETH";
        } else {
            str = "BNB";
        }
        Swap value = this.f42928g.getValue();
        if (value != null) {
            str2 = value.symbol;
        } else {
            str2 = null;
        }
        if (yb6.m74344y(str2, str, true)) {
            return str;
        }
        return null;
    }

    /* renamed from: P */
    public final k04<LoadingState> mo61578P() {
        return this.f42940s;
    }

    /* renamed from: P0 */
    public final boolean mo61579P0(Swap swap) {
        if (vx2.m53586b(swap.symbol, "BNB") || vx2.m53586b(swap.symbol, "ETH")) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public final String mo61580Q() {
        if (mo61575N0()) {
            return mo61557E0(R.string.swap_infura_approval);
        }
        return mo61557E0(R.string.swap_bsc_approval);
    }

    /* renamed from: Q0 */
    public final boolean mo61581Q0() {
        return true;
    }

    /* renamed from: R */
    public final k04<Integer> mo61582R() {
        return this.f42939r;
    }

    /* renamed from: R0 */
    public final void mo61583R0() {
        T t = null;
        this.f42931j.postValue(null);
        Swap value = this.f42929h.getValue();
        vx2.m53588d(value);
        Swap swap = value;
        Iterator<T> it = PreFetchData.f42593a.mo60932a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String a = ((w70) next).mo66642a();
            Locale locale = Locale.ROOT;
            String lowerCase = a.toLowerCase(locale);
            vx2.m53590f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            String str = swap.address;
            vx2.m53590f(str, "swap.address");
            String lowerCase2 = str.toLowerCase(locale);
            vx2.m53590f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (vx2.m53586b(lowerCase, lowerCase2)) {
                t = next;
                break;
            }
        }
        w70 w70 = (w70) t;
        if (w70 != null) {
            double g = w70.mo66649g();
            Integer num = swap.decimals;
            vx2.m53590f(num, "swap.decimals");
            this.f42931j.postValue(new BigDecimal(g, new MathContext(num.intValue())));
        }
        String D = ol0.m70324D(swap);
        vj7 m1 = mo61620m1();
        cw0 X = mo61594X();
        BigInteger bigInteger = this.f42945x;
        vx2.m53590f(bigInteger, "GAS_LIMIT");
        ERC20 r = ERC20.m64654r(D, m1, X, mo61617l0(bigInteger));
        vx2.m53590f(r, "load(swap.getWrapAddress…etGasProvider(GAS_LIMIT))");
        this.f42947z = r;
        mo61585S0();
    }

    /* renamed from: S */
    public final ue6 mo61584S() {
        return this.f42917S;
    }

    /* renamed from: S0 */
    public final void mo61585S0() {
        Swap value = this.f42929h.getValue();
        vx2.m53588d(value);
        Swap swap = value;
        y23 y23 = this.f42901C;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        this.f42901C = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapViewModel$loadDestinationBalance$1(swap, this, (ns0<? super SwapViewModel$loadDestinationBalance$1>) null), 3, (Object) null);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = swap.address;
        if (mo61579P0(swap)) {
            ref$ObjectRef.element = mo61590V();
        }
        y23 y232 = this.f42902D;
        if (y232 != null) {
            y23.C9621a.m74226a(y232, (CancellationException) null, 1, (Object) null);
        }
        this.f42902D = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapViewModel$loadDestinationBalance$2(ref$ObjectRef, this, swap, (ns0<? super SwapViewModel$loadDestinationBalance$2>) null), 3, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0247, code lost:
        if (p000.vx2.m53586b(r3, r14) != false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0249, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x020d, code lost:
        if (p000.vx2.m53586b(r3, r13) == false) goto L_0x020f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0270 A[LOOP:2: B:125:0x026a->B:127:0x0270, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010a A[SYNTHETIC, Splitter:B:42:0x010a] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61586T(net.safemoon.androidwallet.viewmodels.SwapViewModel.C8786a r20, p000.ns0<? super p000.kt6> r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof net.safemoon.androidwallet.viewmodels.SwapViewModel$getBestTradeForExact$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            net.safemoon.androidwallet.viewmodels.SwapViewModel$getBestTradeForExact$1 r2 = (net.safemoon.androidwallet.viewmodels.SwapViewModel$getBestTradeForExact$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            net.safemoon.androidwallet.viewmodels.SwapViewModel$getBestTradeForExact$1 r2 = new net.safemoon.androidwallet.viewmodels.SwapViewModel$getBestTradeForExact$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = p000.wx2.m54101d()
            int r4 = r2.label
            r5 = 2
            java.lang.String r6 = "sourceValue.chainId"
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0065
            if (r4 == r7) goto L_0x0050
            if (r4 != r5) goto L_0x0048
            java.lang.Object r3 = r2.L$4
            net.safemoon.androidwallet.model.swap.Pairs r3 = (net.safemoon.androidwallet.model.swap.Pairs) r3
            java.lang.Object r4 = r2.L$3
            net.safemoon.androidwallet.model.swap.Swap r4 = (net.safemoon.androidwallet.model.swap.Swap) r4
            java.lang.Object r5 = r2.L$2
            net.safemoon.androidwallet.model.swap.Swap r5 = (net.safemoon.androidwallet.model.swap.Swap) r5
            java.lang.Object r9 = r2.L$1
            net.safemoon.androidwallet.viewmodels.SwapViewModel$a r9 = (net.safemoon.androidwallet.viewmodels.SwapViewModel.C8786a) r9
            java.lang.Object r2 = r2.L$0
            net.safemoon.androidwallet.viewmodels.SwapViewModel r2 = (net.safemoon.androidwallet.viewmodels.SwapViewModel) r2
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x0144 }
            goto L_0x0133
        L_0x0048:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0050:
            java.lang.Object r4 = r2.L$3
            net.safemoon.androidwallet.model.swap.Swap r4 = (net.safemoon.androidwallet.model.swap.Swap) r4
            java.lang.Object r9 = r2.L$2
            net.safemoon.androidwallet.model.swap.Swap r9 = (net.safemoon.androidwallet.model.swap.Swap) r9
            java.lang.Object r10 = r2.L$1
            net.safemoon.androidwallet.viewmodels.SwapViewModel$a r10 = (net.safemoon.androidwallet.viewmodels.SwapViewModel.C8786a) r10
            java.lang.Object r11 = r2.L$0
            net.safemoon.androidwallet.viewmodels.SwapViewModel r11 = (net.safemoon.androidwallet.viewmodels.SwapViewModel) r11
            p000.hg5.m45199b(r1)     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00dc
        L_0x0065:
            p000.hg5.m45199b(r1)
            r0.f42916R = r8
            java.math.BigInteger r1 = r0.f42945x
            java.lang.String r4 = "GAS_LIMIT"
            p000.vx2.m53590f(r1, r4)
            net.safemoon.androidwallet.SafeswapRouter r1 = r0.mo61623p0(r1)
            k04<net.safemoon.androidwallet.model.swap.Swap> r4 = r0.f42928g
            java.lang.Object r4 = r4.getValue()
            p000.vx2.m53588d(r4)
            net.safemoon.androidwallet.model.swap.Swap r4 = (net.safemoon.androidwallet.model.swap.Swap) r4
            net.safemoon.androidwallet.viewmodels.SwapViewModel$f r9 = new net.safemoon.androidwallet.viewmodels.SwapViewModel$f
            r9.<init>(r0, r1, r4)
            r0.f42917S = r9
            k04<net.safemoon.androidwallet.model.swap.Swap> r1 = r0.f42928g
            java.lang.Object r1 = r1.getValue()
            p000.vx2.m53588d(r1)
            r9 = r1
            net.safemoon.androidwallet.model.swap.Swap r9 = (net.safemoon.androidwallet.model.swap.Swap) r9
            k04<net.safemoon.androidwallet.model.swap.Swap> r1 = r0.f42929h
            java.lang.Object r1 = r1.getValue()
            p000.vx2.m53588d(r1)
            r4 = r1
            net.safemoon.androidwallet.model.swap.Swap r4 = (net.safemoon.androidwallet.model.swap.Swap) r4
            java.util.HashMap<java.lang.Integer, net.safemoon.androidwallet.model.swap.Pairs> r1 = r0.f42914P
            java.lang.Integer r10 = r9.chainId
            boolean r1 = r1.containsKey(r10)
            if (r1 == 0) goto L_0x00b7
            java.util.HashMap<java.lang.Integer, net.safemoon.androidwallet.model.swap.Pairs> r1 = r0.f42914P
            java.lang.Integer r10 = r9.chainId
            java.lang.Object r1 = r1.get(r10)
            net.safemoon.androidwallet.model.swap.Pairs r1 = (net.safemoon.androidwallet.model.swap.Pairs) r1
            r10 = r20
            r11 = r0
            goto L_0x00f5
        L_0x00b7:
            ho3 r1 = p000.C9384u3.m72571l()     // Catch:{ Exception -> 0x00e5 }
            java.lang.Integer r10 = r9.chainId     // Catch:{ Exception -> 0x00e5 }
            p000.vx2.m53590f(r10, r6)     // Catch:{ Exception -> 0x00e5 }
            int r10 = r10.intValue()     // Catch:{ Exception -> 0x00e5 }
            k90 r1 = r1.mo52281j(r10)     // Catch:{ Exception -> 0x00e5 }
            r2.L$0 = r0     // Catch:{ Exception -> 0x00e5 }
            r10 = r20
            r2.L$1 = r10     // Catch:{ Exception -> 0x00e7 }
            r2.L$2 = r9     // Catch:{ Exception -> 0x00e7 }
            r2.L$3 = r4     // Catch:{ Exception -> 0x00e7 }
            r2.label = r7     // Catch:{ Exception -> 0x00e7 }
            java.lang.Object r1 = retrofit2.KotlinExtensions.m71521c(r1, r2)     // Catch:{ Exception -> 0x00e7 }
            if (r1 != r3) goto L_0x00db
            return r3
        L_0x00db:
            r11 = r0
        L_0x00dc:
            bg5 r1 = (p000.bg5) r1     // Catch:{ Exception -> 0x00e8 }
            java.lang.Object r1 = r1.mo50578a()     // Catch:{ Exception -> 0x00e8 }
            net.safemoon.androidwallet.model.swap.Pairs r1 = (net.safemoon.androidwallet.model.swap.Pairs) r1     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00e9
        L_0x00e5:
            r10 = r20
        L_0x00e7:
            r11 = r0
        L_0x00e8:
            r1 = r8
        L_0x00e9:
            if (r1 == 0) goto L_0x00f5
            java.util.HashMap<java.lang.Integer, net.safemoon.androidwallet.model.swap.Pairs> r12 = r11.f42914P
            java.lang.Integer r13 = r9.chainId
            p000.vx2.m53590f(r13, r6)
            r12.put(r13, r1)
        L_0x00f5:
            java.util.HashMap<java.lang.Integer, net.safemoon.androidwallet.model.swap.BaseTokens> r12 = r11.f42915Q
            java.lang.Integer r13 = r9.chainId
            boolean r12 = r12.containsKey(r13)
            if (r12 == 0) goto L_0x010a
            java.util.HashMap<java.lang.Integer, net.safemoon.androidwallet.model.swap.BaseTokens> r2 = r11.f42915Q
            java.lang.Integer r3 = r9.chainId
            java.lang.Object r2 = r2.get(r3)
            net.safemoon.androidwallet.model.swap.BaseTokens r2 = (net.safemoon.androidwallet.model.swap.BaseTokens) r2
            goto L_0x0155
        L_0x010a:
            ho3 r12 = p000.C9384u3.m72571l()     // Catch:{ Exception -> 0x0140 }
            java.lang.Integer r13 = r9.chainId     // Catch:{ Exception -> 0x0140 }
            p000.vx2.m53590f(r13, r6)     // Catch:{ Exception -> 0x0140 }
            int r13 = r13.intValue()     // Catch:{ Exception -> 0x0140 }
            k90 r12 = r12.mo52291t(r13)     // Catch:{ Exception -> 0x0140 }
            r2.L$0 = r11     // Catch:{ Exception -> 0x0140 }
            r2.L$1 = r10     // Catch:{ Exception -> 0x0140 }
            r2.L$2 = r9     // Catch:{ Exception -> 0x0140 }
            r2.L$3 = r4     // Catch:{ Exception -> 0x0140 }
            r2.L$4 = r1     // Catch:{ Exception -> 0x0140 }
            r2.label = r5     // Catch:{ Exception -> 0x0140 }
            java.lang.Object r2 = retrofit2.KotlinExtensions.m71521c(r12, r2)     // Catch:{ Exception -> 0x0140 }
            if (r2 != r3) goto L_0x012e
            return r3
        L_0x012e:
            r3 = r1
            r1 = r2
            r5 = r9
            r9 = r10
            r2 = r11
        L_0x0133:
            bg5 r1 = (p000.bg5) r1     // Catch:{ Exception -> 0x0144 }
            java.lang.Object r1 = r1.mo50578a()     // Catch:{ Exception -> 0x0144 }
            net.safemoon.androidwallet.model.swap.BaseTokens r1 = (net.safemoon.androidwallet.model.swap.BaseTokens) r1     // Catch:{ Exception -> 0x0144 }
            r11 = r2
            r10 = r9
            r2 = r1
            r1 = r3
            goto L_0x0148
        L_0x0140:
            r3 = r1
            r5 = r9
            r9 = r10
            r2 = r11
        L_0x0144:
            r11 = r2
            r1 = r3
            r2 = r8
            r10 = r9
        L_0x0148:
            r9 = r5
            if (r2 == 0) goto L_0x0155
            java.util.HashMap<java.lang.Integer, net.safemoon.androidwallet.model.swap.BaseTokens> r3 = r11.f42915Q
            java.lang.Integer r5 = r9.chainId
            p000.vx2.m53590f(r5, r6)
            r3.put(r5, r2)
        L_0x0155:
            if (r2 == 0) goto L_0x0172
            java.util.List r2 = r2.getData()
            if (r2 == 0) goto L_0x0172
            ue6 r3 = r11.f42917S
            if (r3 == 0) goto L_0x0172
            java.lang.String r5 = p000.ol0.m70324D(r9)
            java.lang.String r6 = p000.ol0.m70324D(r4)
            kotlin.Pair r5 = p000.wy6.m54142a(r5, r6)
            java.util.List r2 = r3.mo66254h(r2, r5)
            goto L_0x0173
        L_0x0172:
            r2 = r8
        L_0x0173:
            java.lang.String r5 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            if (r1 == 0) goto L_0x0283
            java.util.List r1 = r1.getData()
            if (r1 == 0) goto L_0x0283
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0186:
            boolean r12 = r1.hasNext()
            if (r12 == 0) goto L_0x0266
            java.lang.Object r12 = r1.next()
            r13 = r12
            net.safemoon.androidwallet.model.swap.PairsData r13 = (net.safemoon.androidwallet.model.swap.PairsData) r13
            net.safemoon.androidwallet.model.swap.Token r14 = r13.getToken0()
            if (r14 == 0) goto L_0x01a9
            java.lang.String r14 = r14.getContractAddress()
            if (r14 == 0) goto L_0x01a9
            java.util.Locale r15 = java.util.Locale.ROOT
            java.lang.String r14 = r14.toLowerCase(r15)
            p000.vx2.m53590f(r14, r5)
            goto L_0x01aa
        L_0x01a9:
            r14 = r8
        L_0x01aa:
            net.safemoon.androidwallet.model.swap.Token r13 = r13.getToken1()
            if (r13 == 0) goto L_0x01c0
            java.lang.String r13 = r13.getContractAddress()
            if (r13 == 0) goto L_0x01c0
            java.util.Locale r15 = java.util.Locale.ROOT
            java.lang.String r13 = r13.toLowerCase(r15)
            p000.vx2.m53590f(r13, r5)
            goto L_0x01c1
        L_0x01c0:
            r13 = r8
        L_0x01c1:
            if (r2 == 0) goto L_0x0257
            java.util.Iterator r15 = r2.iterator()
        L_0x01c7:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0252
            java.lang.Object r16 = r15.next()
            r17 = r16
            kotlin.Pair r17 = (kotlin.Pair) r17
            java.lang.Object r18 = r17.getFirst()
            net.safemoon.androidwallet.model.swap.Token r18 = (net.safemoon.androidwallet.model.swap.Token) r18
            java.lang.String r3 = r18.getContractAddress()
            if (r3 == 0) goto L_0x01eb
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r7)
            p000.vx2.m53590f(r3, r5)
            goto L_0x01ec
        L_0x01eb:
            r3 = r8
        L_0x01ec:
            boolean r3 = p000.vx2.m53586b(r3, r14)
            if (r3 == 0) goto L_0x020f
            java.lang.Object r3 = r17.getSecond()
            net.safemoon.androidwallet.model.swap.Token r3 = (net.safemoon.androidwallet.model.swap.Token) r3
            java.lang.String r3 = r3.getContractAddress()
            if (r3 == 0) goto L_0x0208
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r7)
            p000.vx2.m53590f(r3, r5)
            goto L_0x0209
        L_0x0208:
            r3 = r8
        L_0x0209:
            boolean r3 = p000.vx2.m53586b(r3, r13)
            if (r3 != 0) goto L_0x0249
        L_0x020f:
            java.lang.Object r3 = r17.getFirst()
            net.safemoon.androidwallet.model.swap.Token r3 = (net.safemoon.androidwallet.model.swap.Token) r3
            java.lang.String r3 = r3.getContractAddress()
            if (r3 == 0) goto L_0x0225
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r7)
            p000.vx2.m53590f(r3, r5)
            goto L_0x0226
        L_0x0225:
            r3 = r8
        L_0x0226:
            boolean r3 = p000.vx2.m53586b(r3, r13)
            if (r3 == 0) goto L_0x024b
            java.lang.Object r3 = r17.getSecond()
            net.safemoon.androidwallet.model.swap.Token r3 = (net.safemoon.androidwallet.model.swap.Token) r3
            java.lang.String r3 = r3.getContractAddress()
            if (r3 == 0) goto L_0x0242
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r7)
            p000.vx2.m53590f(r3, r5)
            goto L_0x0243
        L_0x0242:
            r3 = r8
        L_0x0243:
            boolean r3 = p000.vx2.m53586b(r3, r14)
            if (r3 == 0) goto L_0x024b
        L_0x0249:
            r3 = 1
            goto L_0x024c
        L_0x024b:
            r3 = 0
        L_0x024c:
            if (r3 == 0) goto L_0x024f
            goto L_0x0254
        L_0x024f:
            r7 = 1
            goto L_0x01c7
        L_0x0252:
            r16 = r8
        L_0x0254:
            kotlin.Pair r16 = (kotlin.Pair) r16
            goto L_0x0259
        L_0x0257:
            r16 = r8
        L_0x0259:
            if (r16 == 0) goto L_0x025d
            r3 = 1
            goto L_0x025e
        L_0x025d:
            r3 = 0
        L_0x025e:
            if (r3 == 0) goto L_0x0263
            r6.add(r12)
        L_0x0263:
            r7 = 1
            goto L_0x0186
        L_0x0266:
            java.util.Iterator r1 = r6.iterator()
        L_0x026a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0283
            java.lang.Object r2 = r1.next()
            net.safemoon.androidwallet.model.swap.PairsData r2 = (net.safemoon.androidwallet.model.swap.PairsData) r2
            ue6 r3 = r11.f42917S
            p000.vx2.m53588d(r3)
            java.util.List r3 = r3.mo66255i()
            r3.add(r2)
            goto L_0x026a
        L_0x0283:
            java.lang.Boolean r1 = p000.y40.f35761c
            java.lang.String r2 = "IS_TEST_NET"
            p000.vx2.m53590f(r1, r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x033e
            ue6 r1 = r11.f42917S
            if (r1 == 0) goto L_0x029d
            java.util.List r1 = r1.mo66255i()
            if (r1 == 0) goto L_0x029d
            r1.clear()
        L_0x029d:
            net.safemoon.androidwallet.SafeswapFactory r1 = r11.mo61621n0()
            rc5 r1 = r1.mo56497o()
            java.lang.Object r1 = r1.send()
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            int r1 = r1.intValue()
            r2 = 0
        L_0x02b0:
            if (r2 >= r1) goto L_0x035f
            net.safemoon.androidwallet.SafeswapFactory r3 = r11.mo61621n0()
            long r6 = (long) r2
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r6)
            java.lang.String r7 = "valueOf(this.toLong())"
            p000.vx2.m53590f(r6, r7)
            rc5 r3 = r3.mo56496n(r6)
            java.lang.Object r3 = r3.send()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r6 = "pairAddress"
            p000.vx2.m53590f(r3, r6)
            net.safemoon.androidwallet.SafeswapPair r6 = r11.mo61622o0(r3)
            rc5 r7 = r6.mo56498o()
            java.lang.Object r7 = r7.send()
            uy6 r7 = (p000.uy6) r7
            rc5 r8 = r6.mo56499q()
            java.lang.Object r8 = r8.send()
            java.lang.String r8 = (java.lang.String) r8
            rc5 r6 = r6.mo56500r()
            java.lang.Object r6 = r6.send()
            java.lang.String r6 = (java.lang.String) r6
            net.safemoon.androidwallet.model.swap.PairsData r12 = new net.safemoon.androidwallet.model.swap.PairsData
            r12.<init>()
            net.safemoon.androidwallet.model.swap.Token r13 = new net.safemoon.androidwallet.model.swap.Token
            r13.<init>()
            r13.setContractAddress(r8)
            r12.setToken0(r13)
            net.safemoon.androidwallet.model.swap.Token r8 = new net.safemoon.androidwallet.model.swap.Token
            r8.<init>()
            r8.setContractAddress(r6)
            r12.setToken1(r8)
            java.lang.Object r6 = r7.component1()
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            java.lang.String r6 = r6.toString()
            r12.setReserve0(r6)
            java.lang.Object r6 = r7.component2()
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            java.lang.String r6 = r6.toString()
            r12.setReserve1(r6)
            r12.setPairAddress(r3)
            ue6 r3 = r11.f42917S
            if (r3 == 0) goto L_0x033a
            java.util.List r3 = r3.mo66255i()
            if (r3 == 0) goto L_0x033a
            boolean r3 = r3.add(r12)
            p000.a40.m31670a(r3)
        L_0x033a:
            int r2 = r2 + 1
            goto L_0x02b0
        L_0x033e:
            ue6 r1 = r11.f42917S
            if (r1 == 0) goto L_0x035f
            java.util.List r1 = r1.mo66255i()
            if (r1 == 0) goto L_0x035f
            java.util.Iterator r1 = r1.iterator()
        L_0x034c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x035f
            java.lang.Object r2 = r1.next()
            net.safemoon.androidwallet.model.swap.PairsData r2 = (net.safemoon.androidwallet.model.swap.PairsData) r2
            r2.setReserve0(r8)
            r2.setReserve1(r8)
            goto L_0x034c
        L_0x035f:
            java.lang.String r1 = p000.ol0.m70324D(r9)
            java.lang.String r2 = p000.ol0.m70324D(r4)
            if (r10 == 0) goto L_0x0372
            boolean r3 = r10.mo61635b()
            r4 = 1
            if (r3 != r4) goto L_0x0372
            r7 = r4
            goto L_0x0373
        L_0x0372:
            r7 = 0
        L_0x0373:
            java.lang.String r3 = "amount"
            if (r7 == 0) goto L_0x03b2
            java.math.BigDecimal r4 = r10.mo61634a()
            k04<net.safemoon.androidwallet.model.swap.Swap> r6 = r11.f42928g
            java.lang.Object r6 = r6.getValue()
            p000.vx2.m53588d(r6)
            net.safemoon.androidwallet.model.swap.Swap r6 = (net.safemoon.androidwallet.model.swap.Swap) r6
            java.lang.Integer r6 = r6.decimals
            java.lang.String r7 = "sourceLiveData.value!!.decimals"
            p000.vx2.m53590f(r6, r7)
            int r6 = r6.intValue()
            java.math.BigInteger r4 = p000.ol0.m70362h0(r4, r6)
            ue6 r6 = r11.f42917S
            p000.vx2.m53588d(r6)
            p000.vx2.m53590f(r4, r3)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r3)
            p000.vx2.m53590f(r1, r5)
            java.lang.String r2 = r2.toLowerCase(r3)
            p000.vx2.m53590f(r2, r5)
            kt6 r1 = r6.mo66258l(r4, r1, r2)
            goto L_0x03ef
        L_0x03b2:
            p000.vx2.m53588d(r10)
            java.math.BigDecimal r4 = r10.mo61634a()
            k04<net.safemoon.androidwallet.model.swap.Swap> r6 = r11.f42929h
            java.lang.Object r6 = r6.getValue()
            p000.vx2.m53588d(r6)
            net.safemoon.androidwallet.model.swap.Swap r6 = (net.safemoon.androidwallet.model.swap.Swap) r6
            java.lang.Integer r6 = r6.decimals
            java.lang.String r7 = "destinationLiveData.value!!.decimals"
            p000.vx2.m53590f(r6, r7)
            int r6 = r6.intValue()
            java.math.BigInteger r4 = p000.ol0.m70362h0(r4, r6)
            ue6 r6 = r11.f42917S
            p000.vx2.m53588d(r6)
            p000.vx2.m53590f(r4, r3)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r3)
            p000.vx2.m53590f(r1, r5)
            java.lang.String r2 = r2.toLowerCase(r3)
            p000.vx2.m53590f(r2, r5)
            kt6 r1 = r6.mo66259m(r4, r1, r2)
        L_0x03ef:
            r11.f42916R = r1
            if (r1 == 0) goto L_0x03fe
            java.util.ArrayList r1 = r1.mo55779d()
            if (r1 == 0) goto L_0x03fe
            int r3 = r1.size()
            goto L_0x03ff
        L_0x03fe:
            r3 = 0
        L_0x03ff:
            r1 = 4
            if (r3 > r1) goto L_0x0405
            kt6 r1 = r11.f42916R
            return r1
        L_0x0405:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "Can Not Swap"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.SwapViewModel.mo61586T(net.safemoon.androidwallet.viewmodels.SwapViewModel$a, ns0):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f A[SYNTHETIC] */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61587T0() {
        /*
            r10 = this;
            k04<java.math.BigDecimal> r0 = r10.f42930i
            r1 = 0
            r0.postValue(r1)
            k04<net.safemoon.androidwallet.model.swap.Swap> r0 = r10.f42928g
            java.lang.Object r0 = r0.getValue()
            p000.vx2.m53588d(r0)
            net.safemoon.androidwallet.model.swap.Swap r0 = (net.safemoon.androidwallet.model.swap.Swap) r0
            net.safemoon.androidwallet.utils.PreFetchData r2 = net.safemoon.androidwallet.utils.PreFetchData.f42593a
            java.util.ArrayList r2 = r2.mo60932a()
            java.util.Iterator r2 = r2.iterator()
        L_0x001b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0070
            java.lang.Object r3 = r2.next()
            r4 = r3
            w70 r4 = (p000.w70) r4
            java.lang.String r5 = r4.mo66642a()
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r6)
            java.lang.String r7 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            p000.vx2.m53590f(r5, r7)
            java.lang.String r8 = r0.address
            java.lang.String r9 = "swap.address"
            p000.vx2.m53590f(r8, r9)
            java.lang.String r8 = r8.toLowerCase(r6)
            p000.vx2.m53590f(r8, r7)
            boolean r5 = p000.vx2.m53586b(r5, r8)
            if (r5 == 0) goto L_0x006c
            java.lang.String r4 = r4.mo66650h()
            java.lang.String r4 = r4.toLowerCase(r6)
            p000.vx2.m53590f(r4, r7)
            java.lang.String r5 = r0.symbol
            java.lang.String r8 = "swap.symbol"
            p000.vx2.m53590f(r5, r8)
            java.lang.String r5 = r5.toLowerCase(r6)
            p000.vx2.m53590f(r5, r7)
            boolean r4 = p000.vx2.m53586b(r4, r5)
            if (r4 == 0) goto L_0x006c
            r4 = 1
            goto L_0x006d
        L_0x006c:
            r4 = 0
        L_0x006d:
            if (r4 == 0) goto L_0x001b
            r1 = r3
        L_0x0070:
            w70 r1 = (p000.w70) r1
            if (r1 == 0) goto L_0x0092
            double r1 = r1.mo66649g()
            java.math.BigDecimal r3 = new java.math.BigDecimal
            java.math.MathContext r4 = new java.math.MathContext
            java.lang.Integer r5 = r0.decimals
            java.lang.String r6 = "swap.decimals"
            p000.vx2.m53590f(r5, r6)
            int r5 = r5.intValue()
            r4.<init>(r5)
            r3.<init>(r1, r4)
            k04<java.math.BigDecimal> r1 = r10.f42930i
            r1.postValue(r3)
        L_0x0092:
            java.lang.String r0 = p000.ol0.m70324D(r0)
            vj7 r1 = r10.mo61620m1()
            cw0 r2 = r10.mo61594X()
            java.math.BigInteger r3 = r10.f42945x
            java.lang.String r4 = "GAS_LIMIT"
            p000.vx2.m53590f(r3, r4)
            it0 r3 = r10.mo61617l0(r3)
            net.safemoon.androidwallet.ERC20 r0 = net.safemoon.androidwallet.ERC20.m64654r(r0, r1, r2, r3)
            java.lang.String r1 = "load(swap.getWrapAddress…etGasProvider(GAS_LIMIT))"
            p000.vx2.m53590f(r0, r1)
            r10.f42946y = r0
            r10.mo61589U0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.safemoon.androidwallet.viewmodels.SwapViewModel.mo61587T0():void");
    }

    /* renamed from: U */
    public final k04<Boolean> mo61588U() {
        return this.f42912N;
    }

    /* renamed from: U0 */
    public final void mo61589U0() {
        Swap value = this.f42928g.getValue();
        vx2.m53588d(value);
        Swap swap = value;
        y23 y23 = this.f42899A;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        this.f42899A = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapViewModel$loadSourceBalance$1(swap, this, (ns0<? super SwapViewModel$loadSourceBalance$1>) null), 3, (Object) null);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = swap.address;
        if (mo61579P0(swap)) {
            ref$ObjectRef.element = mo61590V();
        }
        y23 y232 = this.f42900B;
        if (y232 != null) {
            y23.C9621a.m74226a(y232, (CancellationException) null, 1, (Object) null);
        }
        this.f42900B = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapViewModel$loadSourceBalance$2(ref$ObjectRef, this, swap, (ns0<? super SwapViewModel$loadSourceBalance$2>) null), 3, (Object) null);
    }

    /* renamed from: V */
    public final String mo61590V() {
        TokenType tokenType;
        TokenType tokenType2;
        C8788c value = this.f42920V.getValue();
        T t = null;
        if (value != null) {
            tokenType = value.mo61639a();
        } else {
            tokenType = null;
        }
        if (tokenType == TokenType.BEP_20) {
            Iterator<T> it = this.f42921W.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (vx2.m53586b(((Swap) next).symbol, "WBNB")) {
                    t = next;
                    break;
                }
            }
            Swap swap = (Swap) t;
            if (swap == null) {
                return "";
            }
            String str = swap.address;
            vx2.m53590f(str, "it.address");
            return str;
        }
        C8788c value2 = this.f42920V.getValue();
        if (value2 != null) {
            tokenType2 = value2.mo61639a();
        } else {
            tokenType2 = null;
        }
        if (tokenType2 != TokenType.ERC_20) {
            return "";
        }
        Iterator<T> it2 = this.f42921W.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next2 = it2.next();
            if (vx2.m53586b(((Swap) next2).symbol, "WETH")) {
                t = next2;
                break;
            }
        }
        Swap swap2 = (Swap) t;
        if (swap2 == null) {
            return "";
        }
        String str2 = swap2.address;
        vx2.m53590f(str2, "it.address");
        return str2;
    }

    /* renamed from: V0 */
    public final void mo61591V0() {
        C9384u3.m72571l().mo52289r().mo50512X(new SwapViewModel$loadTokens$1(this));
    }

    /* renamed from: W */
    public final k04<Long> mo61592W() {
        return this.f42905G;
    }

    /* renamed from: W0 */
    public final void mo61593W0() {
        this.f42935n.postValue(null);
        this.f42934m.setValue("");
        this.f42912N.setValue(Boolean.TRUE);
        y23 y23 = this.f42913O;
        if (y23 != null) {
            i33.m58817e(y23, "New Job", (Throwable) null, 2, (Object) null);
        }
        mo61614j1();
        C8786a value = this.f42924c.getValue();
        if (value == null) {
            return;
        }
        if (value.mo61634a().compareTo(BigDecimal.ZERO) > 0) {
            this.f42939r.postValue(0);
            if (value.mo61635b()) {
                mo61633z0(this.f42924c.getValue());
            } else {
                mo61632y0(this.f42924c.getValue());
            }
        } else {
            this.f42910L.postValue(Double.valueOf(Utils.DOUBLE_EPSILON));
            this.f42911M.postValue(Double.valueOf(Utils.DOUBLE_EPSILON));
            this.f42912N.setValue(Boolean.FALSE);
        }
    }

    /* renamed from: X */
    public final cw0 mo61594X() {
        return (cw0) this.f42944w.getValue();
    }

    /* renamed from: X0 */
    public final void mo61595X0() {
        mo61589U0();
        mo61585S0();
    }

    /* renamed from: Y */
    public final BigInteger mo61596Y() {
        Integer value = this.f42927f.getValue();
        vx2.m53588d(value);
        BigInteger valueOf = BigInteger.valueOf((System.currentTimeMillis() / 1000) + ((long) (value.intValue() * 60)));
        vx2.m53590f(valueOf, "valueOf(this)");
        return valueOf;
    }

    /* renamed from: Y0 */
    public final void mo61597Y0() {
        this.f42914P.clear();
        this.f42915Q.clear();
    }

    /* renamed from: Z */
    public final k04<Integer> mo61598Z() {
        return this.f42927f;
    }

    /* renamed from: Z0 */
    public final void mo61599Z0(String str) {
        this.f42919U.setValue(new C8790e(true, str));
        k04<C8786a> k04 = this.f42924c;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        vx2.m53590f(bigDecimal, "ZERO");
        k04.setValue(new C8786a(true, bigDecimal));
    }

    /* renamed from: a0 */
    public final k04<C8788c> mo61600a0() {
        return this.f42920V;
    }

    /* renamed from: a1 */
    public final void mo61601a1(fe7 fe7, fe7 fe72) {
        vx2.m53591g(fe7, "bindingSource");
        vx2.m53591g(fe72, "bindingDestination");
        try {
            y23 y23 = this.f42903E;
            if (y23 != null) {
                y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
            }
            this.f42924c.postValue(null);
            fe7.f28840m.setText("");
            fe72.f28840m.setText("");
        } catch (Exception unused) {
        }
        k04<Swap> k04 = this.f42929h;
        Swap value = this.f42928g.getValue();
        Swap swap = value;
        this.f42928g.setValue(this.f42929h.getValue());
        k04.setValue(value);
    }

    /* renamed from: b0 */
    public final k04<BigDecimal> mo61602b0() {
        return this.f42931j;
    }

    /* renamed from: b1 */
    public final void mo61603b1(ug3 ug3) {
        vx2.m53591g(ug3, "lifecycle");
        this.f42925d.postValue(Double.valueOf(12.0d));
        this.f42926e.postValue(Gas.Standard);
        this.f42927f.postValue(20);
        this.f42928g = new k04<>();
        this.f42929h = new k04<>();
        this.f42935n.postValue(null);
        this.f42934m.setValue("");
        this.f42928g.observe(ug3, new hj6(this));
        this.f42929h.observe(ug3, new ij6(this));
        LiveData<X> a = qw6.m25941a(this.f42925d);
        vx2.m53590f(a, "Transformations.distinctUntilChanged(this)");
        a.observe(ug3, new jj6(this));
        LiveData<X> a2 = qw6.m25941a(this.f42926e);
        vx2.m53590f(a2, "Transformations.distinctUntilChanged(this)");
        a2.observe(ug3, new kj6(this));
    }

    /* renamed from: c0 */
    public final k04<Swap> mo61604c0() {
        return this.f42929h;
    }

    /* renamed from: d0 */
    public final k04<Double> mo61605d0() {
        return this.f42933l;
    }

    /* renamed from: e0 */
    public final void mo61606e0(Swap swap) {
        y23 y23 = this.f42902D;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        this.f42902D = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapViewModel$getDestinationPriceFromCMC$1(swap, this, (ns0<? super SwapViewModel$getDestinationPriceFromCMC$1>) null), 3, (Object) null);
    }

    /* renamed from: f0 */
    public final void mo61607f0() {
        y23 y23 = this.f42903E;
        if (y23 != null) {
            y23.C9621a.m74226a(y23, (CancellationException) null, 1, (Object) null);
        }
        this.f42903E = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapViewModel$getEstimateGas$1(this, (ns0<? super SwapViewModel$getEstimateGas$1>) null), 3, (Object) null);
    }

    /* renamed from: g0 */
    public final String mo61608g0() {
        Integer num;
        Swap value = this.f42928g.getValue();
        if (value != null) {
            num = value.chainId;
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 3) {
            return "0xDfD8bbA37423950bD8050C65E698610C57E55cea";
        }
        if (num != null && num.intValue() == 97) {
            return "0xa7cc5b4cb33bc630e934Be7C140A289dEd2B23e8";
        }
        if (num != null && num.intValue() == 1) {
            return "0x7f09d4be6bbf4b0ff0c97ca5c486a166198aeaee";
        }
        if (num != null && num.intValue() == 56) {
            return "0x505751023083BfC7D2AFB0588717dCC6182e54B2";
        }
        return "";
    }

    /* renamed from: g1 */
    public final void mo61609g1(BigDecimal bigDecimal) {
        String str;
        double d;
        String str2;
        if (bigDecimal != null) {
            k04<String> k04 = this.f42909K;
            String E0 = mo61557E0(R.string.swap_max_fee);
            String p = ol0.m70374p(bigDecimal.doubleValue(), 8, RoundingMode.HALF_UP, false, 4, (Object) null);
            if (mo61575N0()) {
                str2 = " ETH";
            } else {
                str2 = " BNB";
            }
            k04.postValue(E0 + " " + p + str2);
        } else {
            this.f42909K.postValue(null);
        }
        Swap value = this.f42928g.getValue();
        Swap value2 = this.f42929h.getValue();
        if (value != null) {
            try {
                C8786a value3 = this.f42924c.getValue();
                vx2.m53588d(value3);
                if (value3.mo61635b()) {
                    C8786a value4 = this.f42924c.getValue();
                    vx2.m53588d(value4);
                    d = value4.mo61634a().doubleValue();
                } else {
                    Double value5 = this.f42911M.getValue();
                    vx2.m53588d(value5);
                    vx2.m53590f(value5, "{\n                    am…value!!\n                }");
                    d = value5.doubleValue();
                }
                BigDecimal value6 = this.f42930i.getValue();
                vx2.m53588d(value6);
                if (d > value6.doubleValue()) {
                    this.f42934m.postValue(mo61557E0(R.string.swap_amount_less_available_balance));
                    return;
                }
                throw new Exception("For Throw to show bottom msg");
            } catch (Exception unused) {
                Double value7 = this.f42925d.getValue();
                if (value7 == null) {
                    value7 = Double.valueOf(Utils.DOUBLE_EPSILON);
                }
                if (value7.doubleValue() < ol0.m70322B(wy6.m54142a(value, value2))) {
                    this.f42934m.postValue(mo61557E0(R.string.swap_pls_increase_slippage));
                    return;
                }
                if (mo61575N0()) {
                    str = "ETH";
                } else {
                    str = "BNB";
                }
                if (mo61577O0() != null) {
                    k04<String> k042 = this.f42934m;
                    String E02 = mo61557E0(R.string.swap_transactionFee_insufficent1);
                    String E03 = mo61557E0(R.string.swap_transactionFee_insufficent2);
                    k042.postValue(E02 + str + E03);
                    return;
                }
                k04<String> k043 = this.f42934m;
                String E04 = mo61557E0(R.string.swap_transactionFee_not_enough1);
                String E05 = mo61557E0(R.string.swap_transactionFee_not_enough2);
                k043.postValue(E04 + str + E05);
            }
        }
    }

    /* renamed from: h0 */
    public final k04<LoadingState> mo61610h0() {
        return this.f42936o;
    }

    /* renamed from: i0 */
    public final k04<BigDecimal> mo61611i0() {
        return this.f42937p;
    }

    /* renamed from: i1 */
    public final void mo61612i1() {
        this.f42906H.postValue(Boolean.FALSE);
        CountDownTimer countDownTimer = this.f42907I;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f42905G.postValue(Long.valueOf(this.f42904F));
        C8792g gVar = new C8792g(this, this.f42904F, TimeUnit.SECONDS.toMillis(1));
        gVar.start();
        this.f42907I = gVar;
    }

    /* renamed from: j0 */
    public final k04<Gas> mo61613j0() {
        return this.f42926e;
    }

    /* renamed from: j1 */
    public final void mo61614j1() {
        CountDownTimer countDownTimer = this.f42907I;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: k0 */
    public final BigInteger mo61615k0() {
        Swap value = this.f42928g.getValue();
        if (value == null) {
            return BigInteger.ZERO;
        }
        if (mo61575N0()) {
            GasPrice gasPrice = this.f42941t;
            Gas value2 = this.f42926e.getValue();
            vx2.m53588d(value2);
            Integer num = value.chainId;
            vx2.m53590f(num, "it.chainId");
            return new BigDecimal(gasPrice.getPrice(value2, num.intValue())).multiply(BigDecimal.TEN.pow(9)).toBigInteger();
        }
        GasPrice gasPrice2 = this.f42941t;
        Gas value3 = this.f42926e.getValue();
        vx2.m53588d(value3);
        Integer num2 = value.chainId;
        vx2.m53590f(num2, "it.chainId");
        return new BigDecimal(gasPrice2.getPrice(value3, num2.intValue())).multiply(BigDecimal.TEN.pow(9)).toBigInteger();
    }

    /* renamed from: k1 */
    public final void mo61616k1() {
        y23 unused = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapViewModel$swapTokens$1(this, (ns0<? super SwapViewModel$swapTokens$1>) null), 3, (Object) null);
    }

    /* renamed from: l0 */
    public final it0 mo61617l0(BigInteger bigInteger) {
        return new h96(mo61615k0(), bigInteger);
    }

    /* renamed from: l1 */
    public final void mo61618l1() {
        k04<BigDecimal> k04 = this.f42930i;
        k04.postValue(k04.getValue());
        k04<BigDecimal> k042 = this.f42931j;
        k042.postValue(k042.getValue());
    }

    /* renamed from: m0 */
    public final k04<LoadingState> mo61619m0() {
        return this.f42918T;
    }

    /* renamed from: m1 */
    public final vj7 mo61620m1() {
        return uj7.m72805a(new hn2(mo61626s0()));
    }

    /* renamed from: n0 */
    public final SafeswapFactory mo61621n0() {
        String g0 = mo61608g0();
        vj7 m1 = mo61620m1();
        cw0 X = mo61594X();
        BigInteger bigInteger = this.f42945x;
        vx2.m53590f(bigInteger, "GAS_LIMIT");
        return SafeswapFactory.m64676p(g0, m1, X, mo61617l0(bigInteger));
    }

    /* renamed from: o0 */
    public final SafeswapPair mo61622o0(String str) {
        vj7 m1 = mo61620m1();
        cw0 X = mo61594X();
        BigInteger bigInteger = this.f42945x;
        vx2.m53590f(bigInteger, "GAS_LIMIT");
        return SafeswapPair.m64680p(str, m1, X, mo61617l0(bigInteger));
    }

    /* renamed from: p0 */
    public final SafeswapRouter mo61623p0(BigInteger bigInteger) {
        return SafeswapRouter.m64687q(mo61629v0(), mo61620m1(), mo61594X(), mo61617l0(bigInteger));
    }

    /* renamed from: q0 */
    public final BigInteger mo61624q0() {
        BigInteger transactionCount = mo61620m1().ethGetTransactionCount(mo61594X().getAddress(), DefaultBlockParameterName.PENDING).send().getTransactionCount();
        vx2.m53590f(transactionCount, "ethGetTransactionCount.transactionCount");
        return transactionCount;
    }

    /* renamed from: r0 */
    public final String mo61625r0() {
        return (String) this.f42942u.getValue();
    }

    /* renamed from: s0 */
    public final String mo61626s0() {
        Integer num;
        String z;
        Swap value = this.f42928g.getValue();
        if (value == null || (num = value.chainId) == null || (z = ol0.m70384z(num.intValue())) == null) {
            return "https://noRPC";
        }
        return z;
    }

    /* renamed from: t0 */
    public final k04<String> mo61627t0() {
        return this.f42909K;
    }

    /* renamed from: u0 */
    public final k04<Boolean> mo61628u0() {
        return this.f42906H;
    }

    /* renamed from: v0 */
    public final String mo61629v0() {
        Integer num;
        Swap value = this.f42928g.getValue();
        if (value != null) {
            num = value.chainId;
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 3) {
            return "0x713702D3fb45BC9765d3A00e0B37c33f9CE9Ec91";
        }
        if (num != null && num.intValue() == 97) {
            return "0x73422d047085CC52c79C6182c67Abb275F72B9a2";
        }
        if (num != null && num.intValue() == 1) {
            return "0x0a654cb371fbc3c49ccb176984d64e86fc931eea";
        }
        if (num != null && num.intValue() == 56) {
            return "0x6ac68913d8fccd52d196b09e6bc0205735a4be5f";
        }
        return "";
    }

    /* renamed from: w0 */
    public final k04<BigDecimal> mo61630w0() {
        return this.f42938q;
    }

    /* renamed from: x0 */
    public final k04<Double> mo61631x0() {
        return this.f42925d;
    }

    /* renamed from: y0 */
    public final void mo61632y0(C8786a aVar) {
        this.f42913O = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapViewModel$getSlippageAmountIn$1(this, aVar, (ns0<? super SwapViewModel$getSlippageAmountIn$1>) null), 3, (Object) null);
    }

    /* renamed from: z0 */
    public final void mo61633z0(C8786a aVar) {
        this.f42913O = d50.m56748b(cd7.m11843a(this), (CoroutineContext) null, (CoroutineStart) null, new SwapViewModel$getSlippageAmountOut$1(this, aVar, (ns0<? super SwapViewModel$getSlippageAmountOut$1>) null), 3, (Object) null);
    }
}
