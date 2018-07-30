package pl.application;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class Address {

    private String city;
    private String street;
    private String post_code;
    private int house_number;


    public static class Builder{
        private String city;
        private String street;
        private String post_code;
        private int house_number;

        private OwnException exce = new OwnException();

        public Builder city(String city) throws  OwnException{
            if(city.matches("[A-Z]{1}+[a-zA-Z]*")){
               this.city = city;
               return this;
            }else{
                throw new OwnException( "City name is in the incorrect format",exce);
            }

        }

        public Builder street(String street)throws  OwnException{
            if(street.length() > 0 || !street.isEmpty()){
                this.street = street;
                return this;
            }else
                 throw new OwnException("Wrong format city",exce);
        }

        public Builder post_code(String post_code)throws  OwnException{
            if(post_code.matches("\\d{2}-\\d{3}")){
               this.post_code = post_code;
               return this;
            }else{
                throw new OwnException("Post Code is in the incorrect format",exce);

            }

        }

        public Builder house_number(int house_number){
            if(house_number>0){
                this.house_number = house_number;
                return this;
            }else
                throw new ValueException("House number must be more than 0 ");
        }

        public Address build(){
            return new Address(this);
        }



    }

    private Address(Builder builder){
        this.city = builder.city;
        this.house_number = builder.house_number;
        this.post_code = builder.post_code;
        this.street =builder.street;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getPost_code() {
        return post_code;
    }

    public int getHouse_number() {
        return house_number;
    }

    @Override
    public String toString() {
        return "Adres [" +
                "Miasto ='" + city + '\'' +
                ", ulica ='" + street + '\'' +
                ", Kod pocztowy = '" + post_code + '\'' +
                ", numer domu = " + house_number +
                ']';
    }
}
