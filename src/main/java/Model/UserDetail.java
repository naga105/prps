package Model;

public class UserDetail {
    private String user_id;
    private String username;
    private String userPassword;
    private String email;
    private String phone;
    private String name;
    private String avatar;
    private String role;
    private String ggid;
    private String whislistId;
    private String selfDescription;

    private String salt;
    private double walletAmount;

    public UserDetail(String username, String userPassword) {
        this.username = username;
        this.userPassword = userPassword;
    }

    public UserDetail(String user_id, String username, String userPassword, String email, String phone, String name, String avatar, int role, String ggid, String whislistId, String selfDescription, String salt, double amount) {
        this.user_id = user_id;
        this.username = username;
        this.userPassword = userPassword;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.avatar = avatar;
        setRole(role);
        this.ggid = ggid;
        this.whislistId = whislistId;
        this.selfDescription = selfDescription;
        this.salt=salt;
        this.walletAmount= amount;
    }

    public UserDetail() {
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGgid() {
        return ggid;
    }

    public void setGgid(String ggid) {
        this.ggid = ggid;
    }

    public String getWhislistId() {
        return whislistId;
    }

    public void setWhislistId(String whislistId) {
        this.whislistId = whislistId;
    }

    public String getSelfDescription() {
        return selfDescription;
    }

    public void setSelfDescription(String selfDescription) {
        this.selfDescription = selfDescription;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setRole(int role){
        if(role==2){
            this.role="hotel hoster";
            return;
        }
        if(role==3){
            this.role="admin";
            return;
        }else{
            this.role="guest";
            return;
        }
    }
    public String getRole(){
        return role;
    }


    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public double getWalletAmount() {
        return walletAmount;
    }

    public void setWalletAmount(double walletAmount) {
        this.walletAmount = walletAmount;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "user_id='" + user_id + '\'' +
                ", username='" + username + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", role='" + role + '\'' +
                ", ggid='" + ggid + '\'' +
                ", whislistId='" + whislistId + '\'' +
                ", selfDescription='" + selfDescription + '\'' +
                ", salt='" + salt + '\'' +
                ", walletAmount=" + walletAmount +
                '}';
    }
}
