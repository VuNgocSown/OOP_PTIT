import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class KTL2 {
    public static class PhoneNumber {
        private String areaCode;
        private String localNumber;
    
        public PhoneNumber(String areaCode, String localNumber) {
            this.areaCode = areaCode;
            this.localNumber = localNumber;
        }
    
        public String getAreaCode() {
            return areaCode;
        }
    
        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }
    
        public String getLocalNumber() {
            return localNumber;
        }
    
        public void setLocalNumber(String localNumber) {
            this.localNumber = localNumber;
        }
    
        @Override
        public String toString() {
            return areaCode + "-" + localNumber;
        }
    }

    public static class IntlPhoneNumber extends PhoneNumber {
        private String countryCode;
    
        public IntlPhoneNumber(String countryCode, String areaCode, String localNumber) {
            super(areaCode, localNumber);
            this.countryCode = countryCode;
        }
    
        public String getCountryCode() {
            return countryCode;
        }
    
        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }
    
        @Override
        public String toString() {
            return String.format("%s-%s-%s", countryCode, getAreaCode(), getLocalNumber());
        }
    }

    public static class PhoneBook {
        private List<IntlPhoneNumber> phoneNumbers;
    
        public PhoneBook() {
            phoneNumbers = new ArrayList<>();
        }
    
        public void addPhoneNumber(IntlPhoneNumber phoneNumber) {
            phoneNumbers.add(phoneNumber);
        }
        
    
        public List<IntlPhoneNumber> listAllPhoneNumbers() {
            return new ArrayList<>(phoneNumbers);
        }
        // Additional methods for other functionalities can be added here
    }
    
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String interArea = sc.next();
            String localArea = null;
            while(true){
                localArea = sc.next();
                if(Pattern.matches("\\d{3,4}", localArea)){
                    break;
                }
                else{
                    System.out.println("Please type again");
                }
            }
            String phone = sc.next();
            phoneBook.addPhoneNumber(new IntlPhoneNumber(interArea,localArea, phone));
        }
        for(IntlPhoneNumber pb: phoneBook.listAllPhoneNumbers()){
            System.out.println(pb);
        }
        String localArea = sc.next();
        for(IntlPhoneNumber pb:phoneBook.listAllPhoneNumbers()){
            if(pb.getAreaCode().compareTo(localArea)==0){
                System.out.println(pb);
            }
        }
    }
}