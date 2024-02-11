package v1.domain;

import v1.domain.realtApiDTO.CurrencyRate;
import v1.domain.realtApiDTO.Rate;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Flat {

    private Agency agency;
    private Boolean allowEdit;
    private String objectStatus;
    private Boolean isGalleryBlocked;
    private Boolean hideContactsAndActions;
    private String notificationTextKey;
    private List<String> slides;
    private List<String> slideThumbs;
    private List<String> slidesMobile;
    private String unid;
    private Map<String, Long> priceRates;
    private Map<String, Long> priceRatesPerM2;
    private Map<String, Long> priceRatesPerPerson;
    private Map<String, Long> priceRatesPerM2Max;
    private Map<String, Long> priceRatesMin;
    private Map<String, Long> priceRatesMax;
    private Map<String, Long> priceRatesEx;
    private Map<String, Long> priceRatesPerM2Ex;
    private List<CurrencyRate> currencyRates;
    private List<Rate> normalizedPriceHistory;
    private String uuid;
    private Integer code;
    private Integer category;
    private Integer paymentStatus;
    private Date raiseDate;
    private Date createdAt;
    private Date updatedAt;
    private String prepayment;
    private String leasePeriod;
    private String termOfLease;
    private String seller;
    private String agencyUuid;
    private String stateRegionUuid;
    private String stateRegionName;
    private String stateDistrictUuid;
    private String stateDistrictName;
    private String townUuid;
    private String townName;
    private Integer townType;
    private Integer townCat;
    private String townDistrictUuid;
    private String townDistrictName;
    private String townSubDistrictUuid;
    private String townSubDistrictName;
    private String streetUuid;
    private String streetName;
    private Integer houseNumber;
    private String buildingNumber;
    private String address;
    private String metroLineUuid;
    private Integer metroLineId;
    private String metroLineName;
    private String metroStationUuid;
    private String metroStationName;
    private long metroTime;
    private int metroTimeType;
    private String metroUrl;
    private String townDistance;
    private int buildingYear;
    private int overhaulYear;
    private double areaTotal;
    private double areaLiving;
    private double areaKitchen;
    private double areaSnb;
    private double areaBalcony;
    private double areaMax;
    private double areaMin;
    private int rooms;
    private int separateRooms;
    private int storeys;
    private int storey;
    private String storeyType;
    private boolean furniture;
    private String toilet;
    private String balconyType;
    private String houseType;
    private int levels;
    private String title;
    private String headline;
    private String description;
    private String comments;
    private String contactName;
    private List<Long> contactPhones;
    private String appliances;
    private List<Double> location;
    private String statusNewYear;
    private boolean isFavorite;
    private String userUuid;
    private boolean hasObdnWithoutAgency;
    private String agencyUrl;
    private String stateRegionUrl;
    private String stateDistrictUrl;
    private String townUrl;
    private String townDistrictUrl;
    private String townSubDistrictUrl;
    private String streetUrl;
    private int status;
    private int archive;
    private boolean paid;
    private int disabled;
    private boolean priceHaggle;
    private String selsovetUuid;
    private String selsovetName;
    private String directionUuid;
    private String directionName;
    private String floorType;
    private boolean garage;
    private boolean parkingPlace;
    private String parkingPlaces;
    private List<MetroStation> nearestMetroStations;
    private String dealTypeUrl;
    private String contactEmail;
    private String layout;
    private boolean neighbors;
    private int numberOfBeds;
    private boolean housingRent;
    private String termsOfSale;
    private String owner;
    private String exchangeComments;
    private String inventoryNumber;
    private double ceilingHeight;
    private String newBuildComplexTitle;
    private String objectType;
    private String areaLand;
    private String wallMaterial;
    private String roofMaterial;
    private double buildingX;
    private double buildingY;
    private String heating;
    private boolean gas;
    private double completionPercent;
    private boolean water;
    private boolean sewerage;
    private boolean electricity;
    private boolean isAuction;
    private boolean privatization;
    private boolean isNewBuild;
    private boolean bath;
    private boolean fireplace;
    private String phone;
    private AgencyContract agencyContract;
    private boolean infrastructure;
    private int maxCapacity;
    private boolean equipment;
    private boolean daylight;
    private String legalAddress;
    private String phones;
    private boolean nds;
    private String facilities;
    private boolean portion;
    private String portionText;
    private boolean signaling;
    private boolean videoIntercom;
    private boolean fencedTerritory;
    private String buildingState;
    private String place;
    private int commercialRoomsMin;
    private int commercialRoomsMax;
    private int electricityPowerV2;
    private String terms;
    private String placeTypesComments;
    private String placeTypesOther;
    private int storeysMin;
    private int storeysMax;
    private int groundAreaMin;
    private int groundAreaMax;
    private String webSite;
    private int availableQuarter;
    private int availableAlready;
    private String availableText;
    private int availableYear;
    private Date firstPayment;
    private String estateDev;
    private String benefitCredit;
    private String extraInfo;
    private boolean isSellingCompleted;
    private String placeTypes;
    private String repairState;
    private String tour3d;
    private String tour3dPreview;

    public Flat() {
    }

    public Flat(Agency agency, Boolean allowEdit, String objectStatus, Boolean isGalleryBlocked,
                Boolean hideContactsAndActions, String notificationTextKey, List<String> slides,
                List<String> slideThumbs, List<String> slidesMobile, String unid, Map<String, Long> priceRates,
                Map<String, Long> priceRatesPerM2, Map<String, Long> priceRatesPerPerson, Map<String, Long> priceRatesPerM2Max,
                Map<String, Long> priceRatesMin, Map<String, Long> priceRatesMax, Map<String, Long> priceRatesEx,
                Map<String, Long> priceRatesPerM2Ex, List<CurrencyRate> currencyRates, List<Rate> normalizedPriceHistory,
                String uuid, Integer code, Integer category, Integer paymentStatus, Date raiseDate,
                Date createdAt, Date updatedAt, String prepayment, String leasePeriod, String termOfLease,
                String seller, String agencyUuid, String stateRegionUuid, String stateRegionName,
                String stateDistrictUuid, String stateDistrictName, String townUuid, String townName, Integer townType,
                Integer townCat, String townDistrictUuid, String townDistrictName, String townSubDistrictUuid,
                String townSubDistrictName, String streetUuid, String streetName, Integer houseNumber,
                String buildingNumber, String address, String metroLineUuid, Integer metroLineId, String metroLineName,
                String metroStationUuid, String metroStationName, long metroTime, int metroTimeType, String metroUrl,
                String townDistance, int buildingYear, int overhaulYear, double areaTotal, double areaLiving,
                double areaKitchen, double areaSnb, double areaBalcony, double areaMax, double areaMin, int rooms,
                int separateRooms, int storeys, int storey, String storeyType, boolean furniture, String toilet,
                String balconyType, String houseType, int levels, String title, String headline, String description,
                String comments, String contactName, List<Long> contactPhones, String appliances, List<Double> location,
                String statusNewYear, boolean isFavorite, String userUuid, boolean hasObdnWithoutAgency, String agencyUrl,
                String stateRegionUrl, String stateDistrictUrl, String townUrl, String townDistrictUrl,
                String townSubDistrictUrl, String streetUrl, int status, int archive, boolean paid, int disabled,
                boolean priceHaggle, String selsovetUuid, String selsovetName, String directionUuid, String directionName,
                String floorType, boolean garage, boolean parkingPlace, String parkingPlaces, List<MetroStation> nearestMetroStations, String dealTypeUrl,
                String contactEmail, String layout, boolean neighbors, int numberOfBeds, boolean housingRent,
                String termsOfSale, String owner, String exchangeComments, String inventoryNumber, double ceilingHeight,
                String newBuildComplexTitle, String objectType, String areaLand, String wallMaterial, String roofMaterial,
                double buildingX, double buildingY, String heating, boolean gas, double completionPercent, boolean water,
                boolean sewerage, boolean electricity, boolean isAuction, boolean privatization, boolean isNewBuild,
                boolean bath, boolean fireplace, String phone, AgencyContract agencyContract, boolean infrastructure,
                int maxCapacity, boolean equipment, boolean daylight, String legalAddress, String phones, boolean nds,
                String facilities, boolean portion, String portionText, boolean signaling, boolean videoIntercom,
                boolean fencedTerritory, String buildingState, String place, int commercialRoomsMin,
                int commercialRoomsMax, int electricityPowerV2, String terms, String placeTypesComments,
                String placeTypesOther, int storeysMin, int storeysMax, int groundAreaMin,
                int groundAreaMax, String webSite, int availableQuarter, int availableAlready, String availableText,
                int availableYear, Date firstPayment, String estateDev, String benefitCredit,
                String extraInfo, boolean isSellingCompleted, String placeTypes,
                String repairState, String tour3d, String tour3dPreview) {
        this.agency = agency;
        this.allowEdit = allowEdit;
        this.objectStatus = objectStatus;
        this.isGalleryBlocked = isGalleryBlocked;
        this.hideContactsAndActions = hideContactsAndActions;
        this.notificationTextKey = notificationTextKey;
        this.slides = slides;
        this.slideThumbs = slideThumbs;
        this.slidesMobile = slidesMobile;
        this.unid = unid;
        this.priceRates = priceRates;
        this.priceRatesPerM2 = priceRatesPerM2;
        this.priceRatesPerPerson = priceRatesPerPerson;
        this.priceRatesPerM2Max = priceRatesPerM2Max;
        this.priceRatesMin = priceRatesMin;
        this.priceRatesMax = priceRatesMax;
        this.priceRatesEx = priceRatesEx;
        this.priceRatesPerM2Ex = priceRatesPerM2Ex;
        this.currencyRates = currencyRates;
        this.normalizedPriceHistory = normalizedPriceHistory;
        this.uuid = uuid;
        this.code = code;
        this.category = category;
        this.paymentStatus = paymentStatus;
        this.raiseDate = raiseDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.prepayment = prepayment;
        this.leasePeriod = leasePeriod;
        this.termOfLease = termOfLease;
        this.seller = seller;
        this.agencyUuid = agencyUuid;
        this.stateRegionUuid = stateRegionUuid;
        this.stateRegionName = stateRegionName;
        this.stateDistrictUuid = stateDistrictUuid;
        this.stateDistrictName = stateDistrictName;
        this.townUuid = townUuid;
        this.townName = townName;
        this.townType = townType;
        this.townCat = townCat;
        this.townDistrictUuid = townDistrictUuid;
        this.townDistrictName = townDistrictName;
        this.townSubDistrictUuid = townSubDistrictUuid;
        this.townSubDistrictName = townSubDistrictName;
        this.streetUuid = streetUuid;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.buildingNumber = buildingNumber;
        this.address = address;
        this.metroLineUuid = metroLineUuid;
        this.metroLineId = metroLineId;
        this.metroLineName = metroLineName;
        this.metroStationUuid = metroStationUuid;
        this.metroStationName = metroStationName;
        this.metroTime = metroTime;
        this.metroTimeType = metroTimeType;
        this.metroUrl = metroUrl;
        this.townDistance = townDistance;
        this.buildingYear = buildingYear;
        this.overhaulYear = overhaulYear;
        this.areaTotal = areaTotal;
        this.areaLiving = areaLiving;
        this.areaKitchen = areaKitchen;
        this.areaSnb = areaSnb;
        this.areaBalcony = areaBalcony;
        this.areaMax = areaMax;
        this.areaMin = areaMin;
        this.rooms = rooms;
        this.separateRooms = separateRooms;
        this.storeys = storeys;
        this.storey = storey;
        this.storeyType = storeyType;
        this.furniture = furniture;
        this.toilet = toilet;
        this.balconyType = balconyType;
        this.houseType = houseType;
        this.levels = levels;
        this.title = title;
        this.headline = headline;
        this.description = description;
        this.comments = comments;
        this.contactName = contactName;
        this.contactPhones = contactPhones;
        this.appliances = appliances;
        this.location = location;
        this.statusNewYear = statusNewYear;
        this.isFavorite = isFavorite;
        this.userUuid = userUuid;
        this.hasObdnWithoutAgency = hasObdnWithoutAgency;
        this.agencyUrl = agencyUrl;
//        this.agent = agent;
        this.stateRegionUrl = stateRegionUrl;
        this.stateDistrictUrl = stateDistrictUrl;
        this.townUrl = townUrl;
        this.townDistrictUrl = townDistrictUrl;
        this.townSubDistrictUrl = townSubDistrictUrl;
        this.streetUrl = streetUrl;
        this.status = status;
        this.archive = archive;
        this.paid = paid;
        this.disabled = disabled;
        this.priceHaggle = priceHaggle;
        this.selsovetUuid = selsovetUuid;
        this.selsovetName = selsovetName;
        this.directionUuid = directionUuid;
        this.directionName = directionName;
        this.floorType = floorType;
        this.garage = garage;
        this.parkingPlace = parkingPlace;
        this.parkingPlaces = parkingPlaces;
        this.nearestMetroStations = nearestMetroStations;
        this.dealTypeUrl = dealTypeUrl;
        this.contactEmail = contactEmail;
        this.layout = layout;
        this.neighbors = neighbors;
        this.numberOfBeds = numberOfBeds;
        this.housingRent = housingRent;
        this.termsOfSale = termsOfSale;
        this.owner = owner;
        this.exchangeComments = exchangeComments;
        this.inventoryNumber = inventoryNumber;
        this.ceilingHeight = ceilingHeight;
        this.newBuildComplexTitle = newBuildComplexTitle;
        this.objectType = objectType;
        this.areaLand = areaLand;
        this.wallMaterial = wallMaterial;
        this.roofMaterial = roofMaterial;
        this.buildingX = buildingX;
        this.buildingY = buildingY;
        this.heating = heating;
        this.gas = gas;
        this.completionPercent = completionPercent;
        this.water = water;
        this.sewerage = sewerage;
        this.electricity = electricity;
        this.isAuction = isAuction;
        this.privatization = privatization;
        this.isNewBuild = isNewBuild;
        this.bath = bath;
        this.fireplace = fireplace;
        this.phone = phone;
        this.agencyContract = agencyContract;
        this.infrastructure = infrastructure;
        this.maxCapacity = maxCapacity;
        this.equipment = equipment;
        this.daylight = daylight;
        this.legalAddress = legalAddress;
        this.phones = phones;
        this.nds = nds;
        this.facilities = facilities;
        this.portion = portion;
        this.portionText = portionText;
        this.signaling = signaling;
        this.videoIntercom = videoIntercom;
        this.fencedTerritory = fencedTerritory;
        this.buildingState = buildingState;
        this.place = place;
        this.commercialRoomsMin = commercialRoomsMin;
        this.commercialRoomsMax = commercialRoomsMax;
        this.electricityPowerV2 = electricityPowerV2;
        this.terms = terms;
        this.placeTypesComments = placeTypesComments;
        this.placeTypesOther = placeTypesOther;
        this.storeysMin = storeysMin;
        this.storeysMax = storeysMax;
        this.groundAreaMin = groundAreaMin;
        this.groundAreaMax = groundAreaMax;
        this.webSite = webSite;
        this.availableQuarter = availableQuarter;
        this.availableAlready = availableAlready;
        this.availableText = availableText;
        this.availableYear = availableYear;
        this.firstPayment = firstPayment;
        this.estateDev = estateDev;
        this.benefitCredit = benefitCredit;
        this.extraInfo = extraInfo;
        this.isSellingCompleted = isSellingCompleted;
        this.placeTypes = placeTypes;
        this.repairState = repairState;
        this.tour3d = tour3d;
        this.tour3dPreview = tour3dPreview;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public Boolean getAllowEdit() {
        return allowEdit;
    }

    public void setAllowEdit(Boolean allowEdit) {
        this.allowEdit = allowEdit;
    }

    public String getObjectStatus() {
        return objectStatus;
    }

    public void setObjectStatus(String objectStatus) {
        this.objectStatus = objectStatus;
    }

    public Boolean getIsGalleryBlocked() {
        return isGalleryBlocked;
    }

    public void setIsGalleryBlocked(Boolean galleryBlocked) {
        isGalleryBlocked = galleryBlocked;
    }

    public Boolean getHideContactsAndActions() {
        return hideContactsAndActions;
    }

    public void setHideContactsAndActions(Boolean hideContactsAndActions) {
        this.hideContactsAndActions = hideContactsAndActions;
    }

    public String getNotificationTextKey() {
        return notificationTextKey;
    }

    public void setNotificationTextKey(String notificationTextKey) {
        this.notificationTextKey = notificationTextKey;
    }

    public List<String> getSlides() {
        return slides;
    }

    public void setSlides(List<String> slides) {
        this.slides = slides;
    }

    public List<String> getSlideThumbs() {
        return slideThumbs;
    }

    public void setSlideThumbs(List<String> slideThumbs) {
        this.slideThumbs = slideThumbs;
    }

    public List<String> getSlidesMobile() {
        return slidesMobile;
    }

    public void setSlidesMobile(List<String> slidesMobile) {
        this.slidesMobile = slidesMobile;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public Map<String, Long> getPriceRates() {
        return priceRates;
    }

    public void setPriceRates(Map<String, Long> priceRates) {
        this.priceRates = priceRates;
    }

    public Map<String, Long> getPriceRatesPerM2() {
        return priceRatesPerM2;
    }

    public void setPriceRatesPerM2(Map<String, Long> priceRatesPerM2) {
        this.priceRatesPerM2 = priceRatesPerM2;
    }

    public Map<String, Long> getPriceRatesPerPerson() {
        return priceRatesPerPerson;
    }

    public void setPriceRatesPerPerson(Map<String, Long> priceRatesPerPerson) {
        this.priceRatesPerPerson = priceRatesPerPerson;
    }

    public Map<String, Long> getPriceRatesPerM2Max() {
        return priceRatesPerM2Max;
    }

    public void setPriceRatesPerM2Max(Map<String, Long> priceRatesPerM2Max) {
        this.priceRatesPerM2Max = priceRatesPerM2Max;
    }

    public Map<String, Long> getPriceRatesMin() {
        return priceRatesMin;
    }

    public void setPriceRatesMin(Map<String, Long> priceRatesMin) {
        this.priceRatesMin = priceRatesMin;
    }

    public Map<String, Long> getPriceRatesMax() {
        return priceRatesMax;
    }

    public void setPriceRatesMax(Map<String, Long> priceRatesMax) {
        this.priceRatesMax = priceRatesMax;
    }

    public Map<String, Long> getPriceRatesEx() {
        return priceRatesEx;
    }

    public void setPriceRatesEx(Map<String, Long> priceRatesEx) {
        this.priceRatesEx = priceRatesEx;
    }

    public Map<String, Long> getPriceRatesPerM2Ex() {
        return priceRatesPerM2Ex;
    }

    public void setPriceRatesPerM2Ex(Map<String, Long> priceRatesPerM2Ex) {
        this.priceRatesPerM2Ex = priceRatesPerM2Ex;
    }

    public List<CurrencyRate> getCurrencyRates() {
        return currencyRates;
    }

    public void setCurrencyRates(List<CurrencyRate> currencyRates) {
        this.currencyRates = currencyRates;
    }

    public List<Rate> getNormalizedPriceHistory() {
        return normalizedPriceHistory;
    }

    public void setNormalizedPriceHistory(List<Rate> normalizedPriceHistory) {
        this.normalizedPriceHistory = normalizedPriceHistory;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getRaiseDate() {
        return raiseDate;
    }

    public void setRaiseDate(Date raiseDate) {
        this.raiseDate = raiseDate;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getPrepayment() {
        return prepayment;
    }

    public void setPrepayment(String prepayment) {
        this.prepayment = prepayment;
    }

    public String getLeasePeriod() {
        return leasePeriod;
    }

    public void setLeasePeriod(String leasePeriod) {
        this.leasePeriod = leasePeriod;
    }

    public String getTermOfLease() {
        return termOfLease;
    }

    public void setTermOfLease(String termOfLease) {
        this.termOfLease = termOfLease;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getAgencyUuid() {
        return agencyUuid;
    }

    public void setAgencyUuid(String agencyUuid) {
        this.agencyUuid = agencyUuid;
    }

    public String getStateRegionUuid() {
        return stateRegionUuid;
    }

    public void setStateRegionUuid(String stateRegionUuid) {
        this.stateRegionUuid = stateRegionUuid;
    }

    public String getStateRegionName() {
        return stateRegionName;
    }

    public void setStateRegionName(String stateRegionName) {
        this.stateRegionName = stateRegionName;
    }

    public String getStateDistrictUuid() {
        return stateDistrictUuid;
    }

    public void setStateDistrictUuid(String stateDistrictUuid) {
        this.stateDistrictUuid = stateDistrictUuid;
    }

    public String getStateDistrictName() {
        return stateDistrictName;
    }

    public void setStateDistrictName(String stateDistrictName) {
        this.stateDistrictName = stateDistrictName;
    }

    public String getTownUuid() {
        return townUuid;
    }

    public void setTownUuid(String townUuid) {
        this.townUuid = townUuid;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public Integer getTownType() {
        return townType;
    }

    public void setTownType(Integer townType) {
        this.townType = townType;
    }

    public Integer getTownCat() {
        return townCat;
    }

    public void setTownCat(Integer townCat) {
        this.townCat = townCat;
    }

    public String getTownDistrictUuid() {
        return townDistrictUuid;
    }

    public void setTownDistrictUuid(String townDistrictUuid) {
        this.townDistrictUuid = townDistrictUuid;
    }

    public String getTownDistrictName() {
        return townDistrictName;
    }

    public void setTownDistrictName(String townDistrictName) {
        this.townDistrictName = townDistrictName;
    }

    public String getTownSubDistrictUuid() {
        return townSubDistrictUuid;
    }

    public void setTownSubDistrictUuid(String townSubDistrictUuid) {
        this.townSubDistrictUuid = townSubDistrictUuid;
    }

    public String getTownSubDistrictName() {
        return townSubDistrictName;
    }

    public void setTownSubDistrictName(String townSubDistrictName) {
        this.townSubDistrictName = townSubDistrictName;
    }

    public String getStreetUuid() {
        return streetUuid;
    }

    public void setStreetUuid(String streetUuid) {
        this.streetUuid = streetUuid;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMetroLineUuid() {
        return metroLineUuid;
    }

    public void setMetroLineUuid(String metroLineUuid) {
        this.metroLineUuid = metroLineUuid;
    }

    public Integer getMetroLineId() {
        return metroLineId;
    }

    public void setMetroLineId(Integer metroLineId) {
        this.metroLineId = metroLineId;
    }

    public String getMetroLineName() {
        return metroLineName;
    }

    public void setMetroLineName(String metroLineName) {
        this.metroLineName = metroLineName;
    }

    public String getMetroStationUuid() {
        return metroStationUuid;
    }

    public void setMetroStationUuid(String metroStationUuid) {
        this.metroStationUuid = metroStationUuid;
    }

    public String getMetroStationName() {
        return metroStationName;
    }

    public void setMetroStationName(String metroStationName) {
        this.metroStationName = metroStationName;
    }

    public long getMetroTime() {
        return metroTime;
    }

    public void setMetroTime(long metroTime) {
        this.metroTime = metroTime;
    }

    public int getMetroTimeType() {
        return metroTimeType;
    }

    public void setMetroTimeType(int metroTimeType) {
        this.metroTimeType = metroTimeType;
    }

    public String getMetroUrl() {
        return metroUrl;
    }

    public void setMetroUrl(String metroUrl) {
        this.metroUrl = metroUrl;
    }

    public String getTownDistance() {
        return townDistance;
    }

    public void setTownDistance(String townDistance) {
        this.townDistance = townDistance;
    }

    public int getBuildingYear() {
        return buildingYear;
    }

    public void setBuildingYear(int buildingYear) {
        this.buildingYear = buildingYear;
    }

    public int getOverhaulYear() {
        return overhaulYear;
    }

    public void setOverhaulYear(int overhaulYear) {
        this.overhaulYear = overhaulYear;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public double getAreaLiving() {
        return areaLiving;
    }

    public void setAreaLiving(double areaLiving) {
        this.areaLiving = areaLiving;
    }

    public double getAreaKitchen() {
        return areaKitchen;
    }

    public void setAreaKitchen(double areaKitchen) {
        this.areaKitchen = areaKitchen;
    }

    public double getAreaSnb() {
        return areaSnb;
    }

    public void setAreaSnb(double areaSnb) {
        this.areaSnb = areaSnb;
    }

    public double getAreaBalcony() {
        return areaBalcony;
    }

    public void setAreaBalcony(double areaBalcony) {
        this.areaBalcony = areaBalcony;
    }

    public double getAreaMax() {
        return areaMax;
    }

    public void setAreaMax(double areaMax) {
        this.areaMax = areaMax;
    }

    public double getAreaMin() {
        return areaMin;
    }

    public void setAreaMin(double areaMin) {
        this.areaMin = areaMin;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getSeparateRooms() {
        return separateRooms;
    }

    public void setSeparateRooms(int separateRooms) {
        this.separateRooms = separateRooms;
    }

    public int getStoreys() {
        return storeys;
    }

    public void setStoreys(int storeys) {
        this.storeys = storeys;
    }

    public int getStorey() {
        return storey;
    }

    public void setStorey(int storey) {
        this.storey = storey;
    }

    public String getStoreyType() {
        return storeyType;
    }

    public void setStoreyType(String storeyType) {
        this.storeyType = storeyType;
    }

    public boolean isFurniture() {
        return furniture;
    }

    public void setFurniture(boolean furniture) {
        this.furniture = furniture;
    }

    public String getToilet() {
        return toilet;
    }

    public void setToilet(String toilet) {
        this.toilet = toilet;
    }

    public String getBalconyType() {
        return balconyType;
    }

    public void setBalconyType(String balconyType) {
        this.balconyType = balconyType;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public List<Long> getContactPhones() {
        return contactPhones;
    }

    public void setContactPhones(List<Long> contactPhones) {
        this.contactPhones = contactPhones;
    }

    public String getAppliances() {
        return appliances;
    }

    public void setAppliances(String appliances) {
        this.appliances = appliances;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public String getStatusNewYear() {
        return statusNewYear;
    }

    public void setStatusNewYear(String statusNewYear) {
        this.statusNewYear = statusNewYear;
    }

    public boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public boolean isHasObdnWithoutAgency() {
        return hasObdnWithoutAgency;
    }

    public void setHasObdnWithoutAgency(boolean hasObdnWithoutAgency) {
        this.hasObdnWithoutAgency = hasObdnWithoutAgency;
    }

    public String getAgencyUrl() {
        return agencyUrl;
    }

    public void setAgencyUrl(String agencyUrl) {
        this.agencyUrl = agencyUrl;
    }

//    public String getAgent() {
//        return agent;
//    }
//
//    public void setAgent(String agent) {
//        this.agent = agent;
//    }

    public String getStateRegionUrl() {
        return stateRegionUrl;
    }

    public void setStateRegionUrl(String stateRegionUrl) {
        this.stateRegionUrl = stateRegionUrl;
    }

    public String getStateDistrictUrl() {
        return stateDistrictUrl;
    }

    public void setStateDistrictUrl(String stateDistrictUrl) {
        this.stateDistrictUrl = stateDistrictUrl;
    }

    public String getTownUrl() {
        return townUrl;
    }

    public void setTownUrl(String townUrl) {
        this.townUrl = townUrl;
    }

    public String getTownDistrictUrl() {
        return townDistrictUrl;
    }

    public void setTownDistrictUrl(String townDistrictUrl) {
        this.townDistrictUrl = townDistrictUrl;
    }

    public String getTownSubDistrictUrl() {
        return townSubDistrictUrl;
    }

    public void setTownSubDistrictUrl(String townSubDistrictUrl) {
        this.townSubDistrictUrl = townSubDistrictUrl;
    }

    public String getStreetUrl() {
        return streetUrl;
    }

    public void setStreetUrl(String streetUrl) {
        this.streetUrl = streetUrl;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getArchive() {
        return archive;
    }

    public void setArchive(int archive) {
        this.archive = archive;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public int getDisabled() {
        return disabled;
    }

    public void setDisabled(int disabled) {
        this.disabled = disabled;
    }

    public boolean isPriceHaggle() {
        return priceHaggle;
    }

    public void setPriceHaggle(boolean priceHaggle) {
        this.priceHaggle = priceHaggle;
    }

    public String getSelsovetUuid() {
        return selsovetUuid;
    }

    public void setSelsovetUuid(String selsovetUuid) {
        this.selsovetUuid = selsovetUuid;
    }

    public String getSelsovetName() {
        return selsovetName;
    }

    public void setSelsovetName(String selsovetName) {
        this.selsovetName = selsovetName;
    }

    public String getDirectionUuid() {
        return directionUuid;
    }

    public void setDirectionUuid(String directionUuid) {
        this.directionUuid = directionUuid;
    }

    public String getDirectionName() {
        return directionName;
    }

    public void setDirectionName(String directionName) {
        this.directionName = directionName;
    }

    public String getFloorType() {
        return floorType;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public boolean isParkingPlace() {
        return parkingPlace;
    }

    public void setParkingPlace(boolean parkingPlace) {
        this.parkingPlace = parkingPlace;
    }

    public String getParkingPlaces() {
        return parkingPlaces;
    }

    public void setParkingPlaces(String parkingPlaces) {
        this.parkingPlaces = parkingPlaces;
    }

    public List<MetroStation> getNearestMetroStations() {
        return nearestMetroStations;
    }

    public void setNearestMetroStations(List<MetroStation> nearestMetroStations) {
        this.nearestMetroStations = nearestMetroStations;
    }

    public String getDealTypeUrl() {
        return dealTypeUrl;
    }

    public void setDealTypeUrl(String dealTypeUrl) {
        this.dealTypeUrl = dealTypeUrl;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public boolean isNeighbors() {
        return neighbors;
    }

    public void setNeighbors(boolean neighbors) {
        this.neighbors = neighbors;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isHousingRent() {
        return housingRent;
    }

    public void setHousingRent(boolean housingRent) {
        this.housingRent = housingRent;
    }

    public String getTermsOfSale() {
        return termsOfSale;
    }

    public void setTermsOfSale(String termsOfSale) {
        this.termsOfSale = termsOfSale;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getExchangeComments() {
        return exchangeComments;
    }

    public void setExchangeComments(String exchangeComments) {
        this.exchangeComments = exchangeComments;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public double getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(double ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    public String getNewBuildComplexTitle() {
        return newBuildComplexTitle;
    }

    public void setNewBuildComplexTitle(String newBuildComplexTitle) {
        this.newBuildComplexTitle = newBuildComplexTitle;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getAreaLand() {
        return areaLand;
    }

    public void setAreaLand(String areaLand) {
        this.areaLand = areaLand;
    }

    public String getWallMaterial() {
        return wallMaterial;
    }

    public void setWallMaterial(String wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    public String getRoofMaterial() {
        return roofMaterial;
    }

    public void setRoofMaterial(String roofMaterial) {
        this.roofMaterial = roofMaterial;
    }

    public double getBuildingX() {
        return buildingX;
    }

    public void setBuildingX(double buildingX) {
        this.buildingX = buildingX;
    }

    public double getBuildingY() {
        return buildingY;
    }

    public void setBuildingY(double buildingY) {
        this.buildingY = buildingY;
    }

    public String getHeating() {
        return heating;
    }

    public void setHeating(String heating) {
        this.heating = heating;
    }

    public boolean getGas() {
        return gas;
    }

    public void setGas(boolean gas) {
        this.gas = gas;
    }

    public double getCompletionPercent() {
        return completionPercent;
    }

    public void setCompletionPercent(double completionPercent) {
        this.completionPercent = completionPercent;
    }

    public boolean getWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean getSewerage() {
        return sewerage;
    }

    public void setSewerage(boolean sewerage) {
        this.sewerage = sewerage;
    }

    public boolean getElectricity() {
        return electricity;
    }

    public void setElectricity(boolean electricity) {
        this.electricity = electricity;
    }

    public boolean getIsAuction() {
        return isAuction;
    }

    public void setIsAuction(boolean auction) {
        isAuction = auction;
    }

    public boolean getPrivatization() {
        return privatization;
    }

    public void setPrivatization(boolean privatization) {
        this.privatization = privatization;
    }

    public boolean getIsNewBuild() {
        return isNewBuild;
    }

    public void setIsNewBuild(boolean newBuild) {
        isNewBuild = newBuild;
    }

    public boolean isBath() {
        return bath;
    }

    public void setBath(boolean bath) {
        this.bath = bath;
    }

    public boolean isFireplace() {
        return fireplace;
    }

    public void setFireplace(boolean fireplace) {
        this.fireplace = fireplace;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AgencyContract getAgencyContract() {
        return agencyContract;
    }

    public void setAgencyContract(AgencyContract agencyContract) {
        this.agencyContract = agencyContract;
    }

    public boolean isInfrastructure() {
        return infrastructure;
    }

    public void setInfrastructure(boolean infrastructure) {
        this.infrastructure = infrastructure;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean isEquipment() {
        return equipment;
    }

    public void setEquipment(boolean equipment) {
        this.equipment = equipment;
    }

    public boolean isDaylight() {
        return daylight;
    }

    public void setDaylight(boolean daylight) {
        this.daylight = daylight;
    }

    public String getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public boolean isNds() {
        return nds;
    }

    public void setNds(boolean nds) {
        this.nds = nds;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public boolean isPortion() {
        return portion;
    }

    public void setPortion(boolean portion) {
        this.portion = portion;
    }

    public String getPortionText() {
        return portionText;
    }

    public void setPortionText(String portionText) {
        this.portionText = portionText;
    }

    public boolean isSignaling() {
        return signaling;
    }

    public void setSignaling(boolean signaling) {
        this.signaling = signaling;
    }

    public boolean isVideoIntercom() {
        return videoIntercom;
    }

    public void setVideoIntercom(boolean videoIntercom) {
        this.videoIntercom = videoIntercom;
    }

    public boolean isFencedTerritory() {
        return fencedTerritory;
    }

    public void setFencedTerritory(boolean fencedTerritory) {
        this.fencedTerritory = fencedTerritory;
    }

    public String getBuildingState() {
        return buildingState;
    }

    public void setBuildingState(String buildingState) {
        this.buildingState = buildingState;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getCommercialRoomsMin() {
        return commercialRoomsMin;
    }

    public void setCommercialRoomsMin(int commercialRoomsMin) {
        this.commercialRoomsMin = commercialRoomsMin;
    }

    public int getCommercialRoomsMax() {
        return commercialRoomsMax;
    }

    public void setCommercialRoomsMax(int commercialRoomsMax) {
        this.commercialRoomsMax = commercialRoomsMax;
    }

    public int getElectricityPowerV2() {
        return electricityPowerV2;
    }

    public void setElectricityPowerV2(int electricityPowerV2) {
        this.electricityPowerV2 = electricityPowerV2;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getPlaceTypesComments() {
        return placeTypesComments;
    }

    public void setPlaceTypesComments(String placeTypesComments) {
        this.placeTypesComments = placeTypesComments;
    }

    public String getPlaceTypesOther() {
        return placeTypesOther;
    }

    public void setPlaceTypesOther(String placeTypesOther) {
        this.placeTypesOther = placeTypesOther;
    }

    public int getStoreysMin() {
        return storeysMin;
    }

    public void setStoreysMin(int storeysMin) {
        this.storeysMin = storeysMin;
    }

    public int getStoreysMax() {
        return storeysMax;
    }

    public void setStoreysMax(int storeysMax) {
        this.storeysMax = storeysMax;
    }

    public int getGroundAreaMin() {
        return groundAreaMin;
    }

    public void setGroundAreaMin(int groundAreaMin) {
        this.groundAreaMin = groundAreaMin;
    }

    public int getGroundAreaMax() {
        return groundAreaMax;
    }

    public void setGroundAreaMax(int groundAreaMax) {
        this.groundAreaMax = groundAreaMax;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public int getAvailableQuarter() {
        return availableQuarter;
    }

    public void setAvailableQuarter(int availableQuarter) {
        this.availableQuarter = availableQuarter;
    }

    public int getAvailableAlready() {
        return availableAlready;
    }

    public void setAvailableAlready(int availableAlready) {
        this.availableAlready = availableAlready;
    }

    public String getAvailableText() {
        return availableText;
    }

    public void setAvailableText(String availableText) {
        this.availableText = availableText;
    }

    public int getAvailableYear() {
        return availableYear;
    }

    public void setAvailableYear(int availableYear) {
        this.availableYear = availableYear;
    }

    public Date getFirstPayment() {
        return firstPayment;
    }

    public void setFirstPayment(Date firstPayment) {
        this.firstPayment = firstPayment;
    }

    public String getEstateDev() {
        return estateDev;
    }

    public void setEstateDev(String estateDev) {
        this.estateDev = estateDev;
    }

    public String getBenefitCredit() {
        return benefitCredit;
    }

    public void setBenefitCredit(String benefitCredit) {
        this.benefitCredit = benefitCredit;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public boolean isSellingCompleted() {
        return isSellingCompleted;
    }

    public void setSellingCompleted(boolean sellingCompleted) {
        isSellingCompleted = sellingCompleted;
    }

    public String getPlaceTypes() {
        return placeTypes;
    }

    public void setPlaceTypes(String placeTypes) {
        this.placeTypes = placeTypes;
    }

    public String getRepairState() {
        return repairState;
    }

    public void setRepairState(String repairState) {
        this.repairState = repairState;
    }

    public String getTour3d() {
        return tour3d;
    }

    public void setTour3d(String tour3d) {
        this.tour3d = tour3d;
    }

    public String getTour3dPreview() {
        return tour3dPreview;
    }

    public void setTour3dPreview(String tour3dPreview) {
        this.tour3dPreview = tour3dPreview;
    }
}
