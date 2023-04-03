package zendesk.support;

import java.util.List;

public class TicketForm {

    /* renamed from: id */
    private long f46840id;
    private String name;
    private List<TicketField> ticketFields;

    public TicketForm(long j, String str, List<TicketField> list) {
        this.f46840id = j;
        this.name = str;
        this.ticketFields = kj0.m47112c(list);
    }

    public long getId() {
        return this.f46840id;
    }

    public String getName() {
        return this.name;
    }

    public List<TicketField> getTicketFields() {
        return kj0.m47112c(this.ticketFields);
    }
}
