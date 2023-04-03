package zendesk.support.request;

import android.graphics.Rect;
import java.util.Date;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

abstract class CellBase implements CellType.Base {
    public static final int GROUP_ID_END_USER = -2147483647;
    public static final int GROUP_ID_SYSTEM_MESSAGE = Integer.MIN_VALUE;
    public static final long ID_SYSTEM_MESSAGE_REQUEST_CLOSED = -9223372036854775807L;
    public static final long ID_SYSTEM_MESSAGE_REQUEST_CREATED = Long.MIN_VALUE;
    private final long groupId;

    /* renamed from: id */
    private final long f46852id;
    private Rect insets;
    private final int layoutId;
    private int positionType = 1;
    private final Date timestamp;
    public final CellBindHelper utils;

    public CellBase(CellBindHelper cellBindHelper, int i, long j, long j2, Date date) {
        this.utils = cellBindHelper;
        this.layoutId = i;
        this.f46852id = j;
        this.groupId = j2;
        this.timestamp = date;
        this.insets = new Rect(0, 0, 0, 0);
    }

    public abstract boolean areContentsTheSame(CellType.Base base);

    public abstract void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder);

    public long getGroupId() {
        return this.groupId;
    }

    public Rect getInsets() {
        return this.insets;
    }

    public int getLayoutId() {
        return this.layoutId;
    }

    public int getPositionType() {
        return this.positionType;
    }

    public Date getTimeStamp() {
        return this.timestamp;
    }

    public long getUniqueId() {
        return this.f46852id;
    }

    public void setPositionType(int i) {
        this.positionType = i | this.positionType;
    }
}
