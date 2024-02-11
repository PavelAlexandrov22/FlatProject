package v1.domain;

import java.util.Date;

public class AgencyContract {
    private String contract;
    private Date dtOpened;
    private Date dtClosed;

    public AgencyContract() {
    }

    public AgencyContract(String contract, Date dtOpened, Date dtClosed) {
        this.contract = contract;
        this.dtOpened = dtOpened;
        this.dtClosed = dtClosed;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public Date getDtOpened() {
        return dtOpened;
    }

    public void setDtOpened(Date dtOpened) {
        this.dtOpened = dtOpened;
    }

    public Date getDtClosed() {
        return dtClosed;
    }

    public void setDtClosed(Date dtClosed) {
        this.dtClosed = dtClosed;
    }
}
