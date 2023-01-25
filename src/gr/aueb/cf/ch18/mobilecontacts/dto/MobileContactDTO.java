package gr.aueb.cf.ch18.mobilecontacts.dto;

public class MobileContactDTO {
    private Long mobileContactId;
    private UserDetailsDTO userDetailsDTO;
    private String phoneNumber;

    public MobileContactDTO(){}

    public Long getMobileContactId() {
        return mobileContactId;
    }

    public void setMobileContactId(Long mobileContactId) {
        this.mobileContactId = mobileContactId;
    }

    public UserDetailsDTO getUserDetailsDTO() {
        return userDetailsDTO;
    }

    public void setUserDetailsDTO(UserDetailsDTO userDetailsDTO) {
        this.userDetailsDTO = userDetailsDTO;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
