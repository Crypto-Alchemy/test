package zendesk.support.request;

import android.widget.TextView;
import java.util.Date;
import zendesk.support.RequestStatus;
import zendesk.support.request.CellType;
import zendesk.support.request.ComponentRequestAdapter;

class CellSystemMessages {

    public static class CellDateMessage extends CellBase {
        public CellDateMessage(CellBindHelper cellBindHelper, long j, Date date) {
            super(cellBindHelper, g45.zs_request_date_message, j, -2147483648L, date);
        }

        public boolean areContentsTheSame(CellType.Base base) {
            return getTimeStamp().equals(base.getTimeStamp());
        }

        public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
            this.utils.bindDate((TextView) requestViewHolder.findCachedView(l35.request_date_message_text), getTimeStamp());
        }
    }

    public static class CellRequestStatus extends CellBase {
        private final RequestStatus requestStatus;

        public CellRequestStatus(CellBindHelper cellBindHelper, RequestStatus requestStatus2) {
            super(cellBindHelper, g45.zs_request_system_message, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, -2147483648L, new Date());
            this.requestStatus = requestStatus2;
        }

        public boolean areContentsTheSame(CellType.Base base) {
            return base instanceof CellRequestStatus;
        }

        public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
            TextView textView = (TextView) requestViewHolder.findCachedView(l35.request_system_message_text);
            if (this.requestStatus == RequestStatus.Closed) {
                textView.setText(o45.request_system_message_closed_ticket);
            }
        }
    }

    public static class CellSystemMessage extends CellBase {
        private final String message;

        public CellSystemMessage(Date date, String str) {
            super((CellBindHelper) null, g45.zs_request_system_message, Long.MIN_VALUE, -2147483648L, date);
            this.message = str;
        }

        public boolean areContentsTheSame(CellType.Base base) {
            return base instanceof CellSystemMessage;
        }

        public void bind(ComponentRequestAdapter.RequestViewHolder requestViewHolder) {
            ((TextView) requestViewHolder.findCachedView(l35.request_system_message_text)).setText(this.message);
        }
    }
}
