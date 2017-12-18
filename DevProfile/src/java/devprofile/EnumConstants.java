package devprofile;

public enum EnumConstants {
    
    FIRST_NAME("first"),
    DB_PASSWORD(""),
    DB_USERNAME("root"),
    DB_URL("jdbc:mysql://localhost/registration");

   private String value;

EnumConstants(String value){
 this.value = value;
}

public String getValue(){
 return value;
}
}
