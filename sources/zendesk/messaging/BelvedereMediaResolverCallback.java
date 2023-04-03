package zendesk.messaging;

import com.zendesk.logger.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.MediaResult;

public class BelvedereMediaResolverCallback extends n90<List<MediaResult>> {
    private final EventFactory eventFactory;
    private final EventListener eventListener;

    public BelvedereMediaResolverCallback(EventListener eventListener2, EventFactory eventFactory2) {
        this.eventListener = eventListener2;
        this.eventFactory = eventFactory2;
    }

    public void success(List<MediaResult> list) {
        Logger.m43078b("BelvedereMediaResolverCallback", "Uris have been resolved, collecting files to send the event", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (MediaResult next : list) {
            File e = next.mo73696e();
            if (e == null) {
                Logger.m43087k("BelvedereMediaResolverCallback", "Unable to get file, skipping Uri: %s", next.mo73704m().toString());
            } else {
                arrayList.add(e);
            }
        }
        if (arrayList.isEmpty()) {
            Logger.m43087k("BelvedereMediaResolverCallback", "No files resolved. No event will be sent", new Object[0]);
            return;
        }
        Logger.m43078b("BelvedereMediaResolverCallback", "Sending attachment event", new Object[0]);
        this.eventListener.onEvent(this.eventFactory.sendAttachment(arrayList));
    }
}
