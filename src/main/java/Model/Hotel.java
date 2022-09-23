package Model;

public class Hotel {
    private String hotelId;
    private String userId;
    private String amantiesId;
    private String hotelTypeId;
    private String hotelName;

    private String backgroundImg;
    private boolean isVerified;
    private String description;
    private String country;
    private String district;
    private String city;
    private String streetName;
    private String streetNum;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAmantiesId() {
        return amantiesId;
    }

    public void setAmantiesId(String amantiesId) {
        this.amantiesId = amantiesId;
    }

    public String getHotelTypeId() {
        return hotelTypeId;
    }

    public void setHotelTypeId(String hotelTypeId) {
        this.hotelTypeId = hotelTypeId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getBackgroundImg() {
        return backgroundImg;
    }

    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId='" + hotelId + '\'' +
                ", userId='" + userId + '\'' +
                ", amantiesId='" + amantiesId + '\'' +
                ", hotelTypeId='" + hotelTypeId + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", backgroundImg='" + backgroundImg + '\'' +
                ", isVerified=" + isVerified +
                ", description='" + description + '\'' +
                ", country='" + country + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                ", streetNum='" + streetNum + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public Hotel(String hotelId, String userId, String amantiesId, String hotelTypeId, String hotelName, String backgroundImg, boolean isVerified, String description, String country, String district, String city, String streetName, String streetNum) {
        this.hotelId = hotelId;
        this.userId = userId;
        this.amantiesId = amantiesId;
        this.hotelTypeId = hotelTypeId;
        this.hotelName = hotelName;
        this.backgroundImg = backgroundImg;
        this.isVerified = isVerified;
        this.description = description;
        this.country = country;
        this.district = district;
        this.city = city;
        this.streetName = streetName;
        this.streetNum = streetNum;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }
}
