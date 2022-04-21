package org.example;

public class Cast {
//        "cast": [
//        {
//            "fullName": "Michael Sheen",
//                "role": "Aziraphale"
//        },
//        {
//            "fullName": "David Tennant",
//                "role": "Crowley"
//        }
//      ]
    private String fullName;
    private String role;

    public Cast(String fullName, String role) {
        this.fullName = fullName;
        this.role = role;
    }

    public Cast() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Cast{" +
                "fullName='" + fullName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
