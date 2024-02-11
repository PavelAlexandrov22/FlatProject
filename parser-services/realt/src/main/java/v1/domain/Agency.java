package v1.domain;

import java.util.Date;
import java.util.List;

public class Agency {

            private int id;
            private String uuid;
            private String logoUuid;
            private String logoName;
            private String logoExt;
            private String title;
            private Long unp;
            private String license;
            private int licensor;
            private String licensorDescription;
            private Date licenseData;
            private List<String> agencyAdmins;

    public Agency() {
    }

    public Agency(int id, String uuid, String logoUuid, String logoName, String logoExt, String title, Long unp, String license, int licensor, String licensorDescription, Date licenseData, List<String> agencyAdmins) {
        this.id = id;
        this.uuid = uuid;
        this.logoUuid = logoUuid;
        this.logoName = logoName;
        this.logoExt = logoExt;
        this.title = title;
        this.unp = unp;
        this.license = license;
        this.licensor = licensor;
        this.licensorDescription = licensorDescription;
        this.licenseData = licenseData;
        this.agencyAdmins = agencyAdmins;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getLogoUuid() {
        return logoUuid;
    }

    public void setLogoUuid(String logoUuid) {
        this.logoUuid = logoUuid;
    }

    public String getLogoName() {
        return logoName;
    }

    public void setLogoName(String logoName) {
        this.logoName = logoName;
    }

    public String getLogoExt() {
        return logoExt;
    }

    public void setLogoExt(String logoExt) {
        this.logoExt = logoExt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUnp() {
        return unp;
    }

    public void setUnp(Long unp) {
        this.unp = unp;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getLicensor() {
        return licensor;
    }

    public void setLicensor(int licensor) {
        this.licensor = licensor;
    }

    public String getLicensorDescription() {
        return licensorDescription;
    }

    public void setLicensorDescription(String licensorDescription) {
        this.licensorDescription = licensorDescription;
    }

    public Date getLicenseData() {
        return licenseData;
    }

    public void setLicenseData(Date licenseData) {
        this.licenseData = licenseData;
    }

    public List<String> getAgencyAdmins() {
        return agencyAdmins;
    }

    public void setAgencyAdmins(List<String> agencyAdmins) {
        this.agencyAdmins = agencyAdmins;
    }
}
