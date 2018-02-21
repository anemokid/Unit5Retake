package c4q.nyc.unit5test.model;

/**
 * Created by c4q on 2/18/18.
 */

/**
 * this class is a model class for the Json data
 */
public class User {

    // fields:
    private String cellNumber;
    private String dob;
    private String email;
    private UserLocation location;
    private UserName userName;
    private Picture Picture;

    // default constructor:
    public User(){

    }

    // constructor that sets all the fields:
    public User(String cellNumber, String dob, String email, UserLocation location, UserName userName, User.Picture picture) {
        this.cellNumber = cellNumber;
        this.dob = dob;
        this.email = email;
        this.location = location;
        this.userName = userName;
        Picture = picture;
    }

    // getters + setters for cell number:
    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    // getters + setters for date of birth :
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    // getters + setters for email:
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // getters + setters for location:
    public UserLocation getLocation() {
        return location;
    }

    public void setLocation(UserLocation location) {
        this.location = location;
    }

    // getters + setters for user name:
    public UserName getUserName() {
        return userName;
    }

    public void setUserName(UserName userName) {
        this.userName = userName;
    }

    // getters + setters for picture:
    public User.Picture getPicture() {
        return Picture;
    }

    public void setPicture(User.Picture picture) {
        Picture = picture;
    }

    public class UserLocation{

        // fields for the UserLocation class:
        private String city;
        private int postCode;
        private String state;
        private String street;

        // getters + setters for city:
        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        // getters + setters for post code:
        public int getPostCode() {
            return postCode;
        }

        public void setPostCode(int postCode) {
            this.postCode = postCode;
        }

        // getters + setters for state:
        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        // getters + setters for street:
        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }
    } // ends UserLocation inner class

    public class UserName{

        // private fields:
        private String firstName;
        private String lastName;
        private String title;

        // getters + setters for first name:
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        // getters + setters for last name:
        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        // getters + setters for title:
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    } // ends UserName inner class

    public class Picture {

        // private fields:
        private String largePic;
        private String mediumPic;
        private String thumbnailPic;

        // getters + setters for large pic:
        public String getLargePic() {
            return largePic;
        }

        public void setLargePic(String largePic) {
            this.largePic = largePic;
        }

        // getters + setters for medium pic:
        public String getMediumPic() {
            return mediumPic;
        }

        public void setMediumPic(String mediumPic) {
            this.mediumPic = mediumPic;
        }

        // getters + setters for thumbnail pic:
        public String getThumbnailPic() {
            return thumbnailPic;
        }

        public void setThumbnailPic(String thumbnailPic) {
            this.thumbnailPic = thumbnailPic;
        }
    } // ends Picture inner class:
} // ends User.java
